package simcore.agents;

import java.lang.reflect.Field;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import EDLanguage.sandbox.DoctorOffice;
import EDLanguage.sandbox.Nurse;
import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.parameter.Parameters;
import repast.simphony.query.space.grid.GridCell;
import repast.simphony.query.space.grid.GridCellNgh;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.SpatialMath;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.continuous.NdPoint;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;
import simcore.Signals.Signal;
import simcore.Signals.Orders.Order;
import simcore.action.Action;
import simcore.action.ActionFragment;
import simcore.action.ActionStep;
import simcore.action.Consequence;
import simcore.action.ConsequenceStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.OccupyAction;
import simcore.action.basicAction.OrderAction;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.StayAction;
import simcore.action.basicAction.StayForConditionAction;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.conditions.SuitableForSideRoomCondition;
import simcore.action.basicAction.conditions.Condition;
import simcore.action.basicAction.conditions.InfectionCondition;
import simcore.action.basicAction.conditions.IsAvailableCondition;
import simcore.action.basicAction.conditions.PatientAdmissionStatusCondition;
import simcore.action.basicAction.conditions.PatientOutcomes;
import simcore.action.basicAction.conditions.PossibilityCondition;
import simcore.action.basicAction.conditions.ResultCondition;
import simcore.action.basicAction.conditions.SeverityCondition;
import simcore.action.basicAction.conditions.SpaceatCondition;
import simcore.action.basicAction.conditions.StateCondition;
import simcore.action.basicAction.conditions.TestResultCondition;
import simcore.basicStructures.Bed;
import simcore.basicStructures.Board;
import simcore.basicStructures.Desk;
import simcore.basicStructures.EDMap;
import simcore.basicStructures.Occupiable;
import simcore.basicStructures.Room;
import simcore.basicStructures.RoomType;
import simcore.basicStructures.Seat;
import simcore.basicStructures.Test;
import simcore.basicStructures.TimeKeeper;
import simcore.basicStructures.ToolBox;
import simcore.diagnosis.InfectionStatus;
import simcore.diagnosis.SeverityScore;
import simcore.diagnosis.TestResult;
import simcore.utilities.AStar;
import simcore.utilities.ModelParameterStore;
import simcore.utilities.Tuple;

public class Agent {
	// Record the building that the agent is currently inside
	protected Room curInside;
	protected Occupiable curOccupying;
	protected Action curMission;
	protected int curActionStep;
	protected int curTimeCount;
	protected Condition curCondition;
	protected List<GridPoint> curPath;
	protected boolean isIdle;
	protected List<Field> fields;
	protected ContinuousSpace<Object> space;
	protected Grid<Object> grid;

	public Agent(ContinuousSpace<Object> space, Grid<Object> grid) {
		this.space = space;
		this.grid = grid;
		curInside = null;
	}

	public Agent(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
		this.space = space;
		this.grid = grid;
		curInside = null;
	}

	public void InitMission() {
		ActionFragment firstStep = curMission.getSteps().get(0).getStepLogic();
		if ((firstStep) instanceof StayForTimeAction) {
			curTimeCount = ((StayForTimeAction) firstStep).getTimeSpan();
		}

		if ((firstStep) instanceof StayForConditionAction) {
			curCondition = ((StayForConditionAction) firstStep).getStayCondition();
		}

		ExecMission();
	}

	public void InitActionFragment(ActionFragment curActionFragment) {
		if (curActionFragment instanceof OccupyAction) {
			InitOccpuyAction((OccupyAction) curActionFragment);
		}
		if (curActionFragment instanceof MoveAction) {
			InitMoveAction((MoveAction) curActionFragment);
		}
	}

	/**
	 * If the current Agent action is to move to an occupiable, then process what
	 * instance of that occupiable I am targeting
	 * 
	 * @param stepLogic The current step of the Agent's Mission
	 */
	private void InitOccpuyAction(OccupyAction stepLogic) {
		Class target = stepLogic.getDestinationOccupiable();

		// If already occupying the target, then move on
		if (curOccupying != null && curOccupying.getClass() == target) {
			return;
		}

		Occupiable targetOccupiable = stepLogic.getConcreteDestination();
		// Otherwise, find an instance of the target occupiable type to head towards
		if (targetOccupiable == null) {
			stepLogic.setConcreteDestination(SelectOccupiable(curInside,target));
		} else if (targetOccupiable.getOccupier() != null && targetOccupiable.getOccupier() != this) {
			if (targetOccupiable instanceof Seat) {
				FindASeat();
			}
		}
	}

	private void InitMoveAction(MoveAction stepLogic) {
		// If this is a movement to a room type rather than a specific instance of a
		// room, then we must select a room instance as our concrete target
		if (stepLogic.getDestinationObject() == null) {
			stepLogic.setDestination(SelectLocation((RoomType) stepLogic.getTargetDestinationType()));
		} 
		else if(stepLogic.getTargetDestinationType() instanceof RoomType) {
			Room pCurrentTarget = (Room) stepLogic.getDestinationObject();
			if(EvaluateRoomChoice(pCurrentTarget) == 0.0){
				stepLogic.setDestination(SelectLocation((RoomType) stepLogic.getTargetDestinationType()));
			}
		}
		
		stepLogic.setTargetGridPoints(grid.getLocation(stepLogic.getDestinationObject()));
	}

	public void ExecMission() {
//		System.out.println("-----------------------------------------");
//		LogMission();
		ActionStep curStep = curMission.getSteps().get(curActionStep);

		if (curStep instanceof ConsequenceStep) {
			UpdateState(((ConsequenceStep) curStep).getConsequence());
			NextStep();
//			ExecMission();   //Removed because not sure why this is here - I think because we call next step() we should be able to carry on here. Maybe if there are multiple consequences this wouldnt work
		}

		// Get the current logic step and initialise it
		ActionFragment stepLogic = curStep.getStepLogic();
		InitActionFragment(stepLogic);

		// Move action
		if (stepLogic instanceof MoveAction) {
			MoveTo(((MoveAction) stepLogic).getDestinationObject());
		}

		if (stepLogic instanceof OccupyAction) {
			// If there is an occupiable free, move towards it
			if (((OccupyAction) stepLogic).getConcreteDestination() != null) {
				MoveTo(((OccupyAction) stepLogic).getConcreteDestination());
			} else { // Otherwise, ToDO: Add behaviour here
				NextStep();
			}
		}
//		System.out.println("-----------------------------------------");
	}

	/**
	 * Print out the status of the Agent's current mission
	 */
	protected void LogMission() {
		System.out.println(this);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		System.out.println("Time: " + TimeKeeper.getInstance().getTime().format(formatter));
		System.out.println("current mission: " + curMission + ": " + curMission.getName());
		System.out.println(
				"cur action step: " + curActionStep + ": " + curMission.getSteps().get(curActionStep).getName());
	}
	
	/**
	 * If the current Agent action is to move somewhere, then process that here
	 * 
	 * @param stepLogic The current step of the Agent's Mission
	 */
	protected void MoveTo(Object target) {
		// If I am already here, dont do anything
		if (ImAt(target)) {
			NextStep();
			return;
		} 

		// Move in the physical space
		MoveTowards(target);

		// If the agent is moving towards an occupiable (bed, seat etc)
		if (target instanceof Occupiable) {
			Occupiable targetOccupiable = (Occupiable) target;
			// if this agent is already there, continue
			if (targetOccupiable.getOccupier() == this) {
				NextStep();
			} else { 
				if (ImAt(targetOccupiable)) {
					targetOccupiable.setOccupier(this);
				}
			}
		}
		// Else moving towards the room
		else if (target instanceof Room) {
			Room targetLocation = (Room) target;
			// if this agent already in room, execute next step
			if (targetLocation.WithInside(this)) {
				NextStep();
			}
		}
	}

	// Given a RoomType, select a Location of that RoomType
	private Room SelectLocation(RoomType pRoomType) {
		ArrayList<Room> pRooms = (ArrayList<Room>) ReadMap().FindInstancesOfRoomType(pRoomType);
		// find an instance of the room we want
		// By default select the one that is most empty
		try {
			return pRooms.stream().sorted((r1,r2) -> Double.compare(EvaluateRoomChoice(r1), EvaluateRoomChoice(r2))).findFirst().get();
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	private double EvaluateRoomChoice(Room pRoom) {
		int pRoomCapacity = pRoom.getCurrentCapacity();
		if(pRoom.getOccupiers().contains(this)) {
			pRoomCapacity--;
		}
		if(pRoomCapacity > 0) {
			return Double.MAX_VALUE;
		} else {
			return CalcDistance(grid.getLocation(this), grid.getLocation(pRoom));
//			return 1.0;
		}
	}

	// Agent has entered the room and now will find a seat to take and move towards
	// it
	protected void FindASeat() {
		curMission = new Action("TakeSeat").WithStep(
				new ActionStep().WithName("move to seat").WithAction(new OccupyAction().WithTarget(Seat.class)));
		curActionStep = 0;
	}
	
	// Agent has entered the room and now will find a seat to take and move towards
	// it
	protected void FindAnOccupiable(Class occupiableType) {
		curMission = new Action("TakeOccupiable").WithStep(
				new ActionStep().WithName("move to an occupiable").WithAction(new OccupyAction().WithTarget(occupiableType)));
		curActionStep = 0;
	}
	
	protected Occupiable SelectOccupiable(Room destination, Class occupiableType) {
		ArrayList<Occupiable> plstEmptyOccupiables = (ArrayList<Occupiable>) destination.getAllEmptyOcupiablesOfType(occupiableType);
		if (!plstEmptyOccupiables.isEmpty()) {
			ArrayList<Occupiable> emptyOccupiables = (ArrayList<Occupiable>) plstEmptyOccupiables;
			int pNumOccupiables = emptyOccupiables.size();
			return emptyOccupiables.get(RandomHelper.nextIntFromTo(0, pNumOccupiables-1));// <------ ToDo: change to have more complex seat selection
		}
		return null;
	}
	/*
	 * MovaTowards function is called by all the agents to decide and execute one's
	 * next Move Step by is target object. If a target is of class Location, set the
	 * destination to location's entrance point.
	 * 
	 * TODO: Update Movetowards function to set and execute a next movepoint by
	 * Searching method
	 * 
	 */
	public void MoveTowards(Object o) {
		GridPoint pointOfTarget = grid.getLocation(o);

		if (o instanceof Room) {
			pointOfTarget = ((Room) o).getEntryPoint();
		}

		if (pointOfTarget != null) {
			MoveTowards(pointOfTarget);
		}
	}
	
	public void MoveTowards(GridPoint pt) {
		if(ModelParameterStore.UsePathFinding) {
			PathFinding(pt);
		} else {
			CrowFlyMovement(pt);
		}
	}
	
	public void PathFinding(GridPoint pt) {
		NdPoint myPoint = space.getLocation(this);

		// If I am not yet at the destination
		if (!ImAt(pt)) {
			// And I dont have a path, then get a new one
			if (curPath == null || curPath.isEmpty()) {
				curPath = new ArrayList<>();
				curPath.addAll(AStar.getRoute(grid, grid.getLocation(this), pt));
			} else {
				// Else, I do have a path but do the wrong destination, then get a new one
				GridPoint pathGridPoint = curPath.get(curPath.size() - 1);
				if (pathGridPoint.getX() != pt.getX() || pathGridPoint.getY() != pt.getY()) {
					curPath = new ArrayList<>();
					curPath.addAll(AStar.getRoute(grid, grid.getLocation(this), pt));
				}
			}

			// If I have a path, follow it one step
			if (!curPath.isEmpty()) {
				GridPoint GridStep = curPath.get(0);
				curPath.remove(0);
				NdPoint otherPoint = new NdPoint(GridStep.getX(), GridStep.getY());
				space.moveTo(this, otherPoint.getX(), otherPoint.getY());
				myPoint = space.getLocation(this);
				grid.moveTo(this, (int) myPoint.getX(), (int) myPoint.getY());
			}
		}
	}
	
	/*
	 * An alternative movement implementation that ignores any pathfinding or obstacles, heads straight line to target
	 */
	public void CrowFlyMovement(GridPoint pt) {
		NdPoint myPoint = space.getLocation(this);

		if (!ImAt(pt)) {
			NdPoint otherPoint = new NdPoint(pt.getX(), pt.getY());
			double angle = SpatialMath.calcAngleFor2DMovement(space, myPoint, otherPoint);
			space.moveByVector(this, 1, angle, 0);
			myPoint = space.getLocation(this);
			grid.moveTo(this, (int) myPoint.getX(), (int) myPoint.getY());
		}
	}
	
	// A simplified move action where if I am following another agent, I will not use full pathfinding but instead 
	// copy the path of the agent I am following
	public void Follow(Agent target) {
		NdPoint myPoint = space.getLocation(this);
		GridPoint targetPoint = grid.getLocation(target);
		
		NdPoint otherPoint = new NdPoint(targetPoint.getX(), targetPoint.getY());
		space.moveTo(this, otherPoint.getX(), otherPoint.getY());
		myPoint = space.getLocation(this);
		grid.moveTo(this, (int) myPoint.getX(), (int) myPoint.getY());
	}

	// 判断当前位置是否在目标处
	public boolean SpaceAtByGrid(Object o) {

		// 以当前位置构造长度为1的网格，如果网格中包含目标对象，则表示当前已位于目标处
		GridPoint pt = grid.getLocation(this);

		GridCellNgh<Object> nghCreator = new GridCellNgh<Object>(grid, pt, Object.class, 1, 1);
		List<GridCell<Object>> gridCells = nghCreator.getNeighborhood(true);

		for (GridCell<Object> cell : gridCells) {
			List<Object> list = (List<Object>) cell.items();
			for (int i = 0; i < list.size(); i++) {
				if (o.equals(list.get(i))) {
					return true;
				}
			}
		}

		return false;
	}

	public boolean SpaceAtByGrid(GridPoint o) {

		// 以当前位置构造长度为1的网格，如果网格中包含目标对象，则表示当前已位于目标处
		GridPoint pt = grid.getLocation(this);

		GridCellNgh<Object> nghCreator = new GridCellNgh<Object>(grid, pt, Object.class, 1, 1);
		List<GridCell<Object>> gridCells = nghCreator.getNeighborhood(true);

		for (GridCell<Object> cell : gridCells) {
			List<Object> list = (List<Object>) cell.items();
			for (int i = 0; i < list.size(); i++) {
				if (o.equals(list.get(i))) {
					return true;
				}
			}
		}

		return false;
	}

	// Consequence of this Action
	public void UpdateState(Consequence c) {
		if (c == null) {
			return;
		}

		Field targetField = null;
		for (int i = 0; i < fields.size(); i++) {
			if (fields.get(i).getName().equals(((Consequence) c).getAttribute())) {
				targetField = fields.get(i);
			}
		}

		try {
			double base = targetField.getDouble(this);
			double value = ((Consequence) c).getValue();

			switch (((Consequence) c).getOperator()) {
			case "":
				break;

			case "+=":
				base += value;
				break;

			case "-=":
				base -= value;
				break;

			case "*=":
				base *= value;
				break;

			case "/=":
				base /= value;
				break;

			default:
				break;
			}

			targetField.setDouble(this, base);

			ToolBox toolBox = ToolBox();
			String content = "Time point: " + toolBox.getTime() + " | " + targetField.getName() + ": " + base;
			toolBox.GetLog().WriteLog(this + "", content);

		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public boolean CheckCondition(Condition c) {

		if (c instanceof PossibilityCondition) {
			return Dice(((PossibilityCondition) c).getPossibility());
		}

		if (c instanceof SpaceatCondition) {
			return ImAt(((SpaceatCondition) c).getSubject(), ((SpaceatCondition) c).getTarget());
		}
		
		if(c instanceof TestResultCondition) {
			TestResult ptestResult = ((TestResultCondition) c).getTestType().TestPatient(((TestResultCondition) c).getPatient(), 0.0);
			return ptestResult.isInfected();
		}
		
		if(c instanceof PatientAdmissionStatusCondition) {
			return ((PatientAdmissionStatusCondition) c).getOutcome() == ((PatientAdmissionStatusCondition) c).getPatient().getOutcome();
		}
		
		if(c instanceof ResultCondition) {
			Test pTest = ((ResultCondition)c).getTest();
			Patient pPatient = ((ResultCondition)c).getPatient();
			ArrayList<TestResult> plstTestResults = (ArrayList<TestResult>) pPatient.getTestResults();
			for (TestResult testResult : plstTestResults) {
				if(testResult.getTestType() == pTest) {
					return testResult.isInfected() == ((ResultCondition)c).getResult();
				}
			}
			return false;
		}
		if(c instanceof InfectionCondition) {
			
			// Introduce stochasticity in whether patient is correctly identified as symptomatic 
		    Parameters params = RunEnvironment.getInstance().getParameters();
		    Double pdblFalsePositiveSymptomatic = params.getDouble("FalsePositiveSymptomatic");
		    
		    InfectionStatus testingStatus = ((InfectionCondition) c).getInfectionStatus();
		    InfectionStatus patientActualStatus = ((InfectionCondition) c).getPatient().getActualInfectionState().stateType.getInfectionStatus();
			
		    // margin of error comes when patient is susceptible, but doc thinks they are actually symptomatic
			// so when deciding if a patient is symptomatic, there is a 7% chance that the doc says YES, but patient actual infection status is susc
		    if(testingStatus == InfectionStatus.Symptomatic && patientActualStatus == InfectionStatus.Susceptible) {
		    	if (RandomHelper.nextDouble() < pdblFalsePositiveSymptomatic) {
		    		return true;
		    	} else {
		    		return false;
		    	}
		    } else {
				return ((InfectionCondition) c).getInfectionStatus() == ((InfectionCondition) c).getPatient().getActualInfectionState().stateType.getInfectionStatus();
		    }
		}
		
		if(c instanceof SeverityCondition) {
			return ((SeverityCondition) c).getSeverityScore() == ((SeverityCondition) c).getPatient().getSeverityScore();
		}
		
		if(c instanceof SuitableForSideRoomCondition) {
			Patient pPatient = ((SuitableForSideRoomCondition) c).getPatient();
			Room pAlternativeBay = ((SuitableForSideRoomCondition) c).getAlternativeBay();
			InfectionStatus pPatientStatus = pPatient.getActualInfectionState().stateType.getInfectionStatus();
			
			if(pAlternativeBay.getRoomType() == EDLanguage.sandbox.RedAdmissionBay.getInstance()) {
				if(pPatientStatus == InfectionStatus.Symptomatic) {
					return false; // Patient not suitable for SR, should go to Red bay
				} else {
					return true; // Patient can go to a SR
				}
			} else {
				if(pPatientStatus == InfectionStatus.Symptomatic) {
					return true; // Patient can go to a SR
				} else {
					return false; // Patient not suitable for SR, should go to Green/Amber bay
				}
			}
		}
		
//		if(c instanceof SuitableForSideRoomCondition) {
//			Patient pPatient = ((SuitableForSideRoomCondition) c).getPatient();
//			AdmissionBay pAlternativeBay = ((SuitableForSideRoomCondition) c).getAlternativeBay();
//			double pPHEScore = pPatient.getPHEScore();
//
//			// Depending on the alternative admission bay, the COVID suspicion level of a patient is either weighted positive or negative
//			// E.g. if admitting to red bay, a high suspicion is good, but for amber you want a low suspicion as amber should contain negative cases
//			if(pAlternativeBay == Red_AdmissionBay.getInstance()) {
//				
//			} else if(pAlternativeBay == Amber_AdmissionBay.getInstance()) {
//				pPHEScore = 1- pPHEScore;
//			}
//			double currOcc = SideRoom_AdmissionBay.getInstance().getCurrentOccupancy();
//			double maxCap = SideRoom_AdmissionBay.getInstance().getCapacity();
//			double pSideRoomCapacity = (currOcc / maxCap);
//			if(currOcc >= maxCap) {
//				pSideRoomCapacity = 1;
//			}
//			double pdblChances = 1- ((pPHEScore + pSideRoomCapacity) / 2);
//			
//			double rnd = RandomHelper.nextDouble();
//			if(rnd < pdblChances) {
//				return true;
//			}
//			return false;
//		}

		if (c instanceof StateCondition) {
			Field targetField = null;
			for (int i = 0; i < fields.size(); i++) {
				if (fields.get(i).getName().equals(((StateCondition) c).getAttribute())) {
					targetField = fields.get(i);
				}
			}

			try {
				return Compare(targetField.getDouble(this), ((StateCondition) c).getOperator(),
						((StateCondition) c).getValue());
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;
	}

	public boolean Dice(double possibility) {
		double dice = 100 * RandomHelper.nextDouble();
		return dice < possibility;
	}

	public boolean Compare(double v1, String operator, double v2) {
		switch (operator) {
		case "":
			break;

		case ">":
			return v1 > v2;

		case ">=":
			return v1 >= v2;

		case "<":
			return v1 < v2;

		case "<=":
			return v1 <= v2;

		case "=":
			return v1 == v2;

		default:
			break;
		}

		return false;
	}

	public void NextStep() {
		curActionStep++;
		
		// If the mission is complete, update my status accordingly
		if (curActionStep == curMission.getSteps().size()) {
			isIdle = true;
			curActionStep = 0;
			curMission = null;
			return;
		}

		ActionFragment stepLogic = curMission.getSteps().get(curActionStep).getStepLogic();
		if (stepLogic instanceof StayForTimeAction) {
			curTimeCount = ((StayForTimeAction) stepLogic).getTimeSpan();
		}

		if (stepLogic instanceof StayForConditionAction) {
			curCondition = ((StayForConditionAction) stepLogic).getStayCondition();
		}
	}

	public EDMap ReadMap() {
		return ToolBox().ReadMap(grid);
	}

	public ToolBox ToolBox() {
		return new ToolBox(this);
	}

	public void SetInside(Room l) {
		curInside = l;
	}

	public void SetOccupying(Occupiable o) {
		curOccupying = o;
	}

	public boolean ImAt(Room pLoc) {
		GridPoint curPoint = grid.getLocation(this);
//		System.out.println(this + " CurrPoint = " + curPoint);

		Tuple<Integer, Integer> pdblBottomLeft = new Tuple<Integer, Integer>(pLoc.getX(), pLoc.getY());
		Tuple<Integer, Integer> pdblBottomRight = new Tuple<Integer, Integer>(pLoc.getX() + pLoc.getW(), pLoc.getY());
		Tuple<Integer, Integer> pdblTopLeft = new Tuple<Integer, Integer>(pLoc.getX(), pLoc.getY() + pLoc.getH());
		Tuple<Integer, Integer> pdblTopRight = new Tuple<Integer, Integer>(pLoc.getX() + pLoc.getW(),
				pLoc.getY() + pLoc.getH());

		if (curPoint.getX() > pdblBottomLeft.x && curPoint.getX() < pdblBottomRight.x) {
			if (curPoint.getY() > pdblBottomLeft.y && curPoint.getY() < pdblTopLeft.y) {
//				System.out.println(this + " I am in " + pLoc);
				return true;
			}
		}

//		System.out.println(this + " I am not in " + pLoc);
		return false;
	}

	public boolean ImAt(GridPoint p) {
		GridPoint curPoint = grid.getLocation(this);
		return (CalcDistance(curPoint, p) < 2);
	}

	public boolean ImAt(Object o) {
		return ImAt(this, o);
	}

	public boolean ImAt(Object subject, Object o) {
		if (o instanceof Room) {
			return ((Room) o).WithInside(subject);
		}

		GridPoint curPoint = grid.getLocation(subject);
		GridPoint pointOfTarget = grid.getLocation(o);

		return (CalcDistance(curPoint, pointOfTarget) < 2);
	}

	public Board ReadBoard() {
		return ToolBox().ReadBoard();
	}

	public double CalcDistance(GridPoint a, GridPoint b) {
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		x = (x < 0) ? -x : x;
		y = (y < 0) ? -y : y;
		return Math.pow((x * x + y * y), 0.5);
	}
}
