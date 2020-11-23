package simcore.agents;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.engine.watcher.Watch;
import repast.simphony.engine.watcher.WatcherTriggerSchedule;
import repast.simphony.query.space.grid.GridCell;
import repast.simphony.query.space.grid.GridCellNgh;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.SpatialMath;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.continuous.NdPoint;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.util.ContextUtils;
import repast.simphony.util.SimUtilities;
import simcore.Signals.Signal;
import simcore.Signals.Orders.FollowOrder;
import simcore.Signals.Orders.MoveToOrder;
import simcore.Signals.Orders.Order;
import simcore.Signals.Orders.StopOrder;
import simcore.action.basicAction.MoveAction;
import simcore.basicStructures.Board;
import simcore.basicStructures.Location;
import simcore.basicStructures.ToolBox;
import simcore.utilities.AStar;

public class Patient extends Agent{

	private static Integer staticID = 0;
	private int mintMyID;
	private Order curOrder;
	private boolean hasBeenDealtWith;
	private int totalWaitTime;
	protected List<GridPoint> curPath;

	
	public Patient(ContinuousSpace<Object> space, Grid<Object> grid) {
		super(space, grid);
		// TODO Auto-generated constructor stub
		curOrder = null;
		hasBeenDealtWith = false;
		totalWaitTime = 0;
		staticID++;
		mintMyID = staticID;
	}
	
	@ScheduledMethod(start = 1, interval = 1)
	public void step() {
		Perceive();
	}
	
	public void Perceive() {
		ExecOrder(curOrder);
	}
	
	public void TakeOrder(Order o) {
		curOrder = o;
	}
	
	private void ExecOrder(Order order) {
		// TODO Auto-generated method stub
		if(!hasBeenDealtWith) {
			totalWaitTime++;
		}
		
		if(order == null) {
			return;
		}
		
		// 第一次接受Order: hasBeenDealtWith为false且 curOrder不为空
		// 将hasBeenDealtWith设为true(今后不再进入此判断分支),写入log
		if(hasBeenDealtWith == false && order != null) {
			hasBeenDealtWith = true;
			//将total wait time写入log
			ToolBox toolBox = ToolBox();
			String content = this + " | total wait time: " + totalWaitTime + " | dealt at time point: " + toolBox.getTime();
			toolBox.GetLog().WriteLog("patientLog", content);
		}
				
		if(order instanceof MoveToOrder) {
    		Object destination = ((MoveToOrder) order).getTarget();
    		
    		// Already located in some room now but got a new Move Order
    		if(curInside != null) {
    			if(!curInside.equals(destination)) {
    				curInside.LetOutPerson(this);
    			}
    		}
    		
    		MoveTowards(destination);
    		
    		if (destination instanceof Location) {
				Location targetLocation = (Location) destination;
				
				// if this agent already in room, set free
				if (targetLocation.WithInside(this)) {
					curOrder = null;
					return;
				} else {
					// not insideroom but already in queue, do nothing and waiting for calling
					if (targetLocation.WithInQueue(this)) {
						return;
					} else {
						// not inside the queue or room but had already arrived entrance,
						// ask Location to put self in
						
//						if (SpaceAt(targetLocation.getEntryPoint())) {
						if (SpaceAt(targetLocation)) {
							targetLocation.TakePerson(this);
						}
					}
				}

			} else {

				if (SpaceAt(destination)) {
					curOrder = null;
					return;
				} else {// 当前仍未到达目的地，继续行动
//					System.out.println("patient not arrived: keep going");
					return;
				}
			}

		}else if(order instanceof FollowOrder) {
			System.out.println(this + "following " + ((FollowOrder) order).getFollowTarget());
			// Already located in some room now but got a new Follow Order
			// go out of the room first
    		if(curInside != null) {
    		    curInside.LetOutPerson(this);
    		}
			
			//follow the target
            Object target = ((FollowOrder) order).getFollowTarget();
    		MoveTowards(target);
		}else if(order instanceof StopOrder) {
			curOrder = null;
		}
		
	}
	
	//待完成
    //从当前任何位置朝目标位置移动
    public void MoveTowards(Object o) {
		GridPoint pointOfTarget = grid.getLocation(o);
		
		// If my target is a location, move towards it's entrance
		if (o instanceof Location) {			
			pointOfTarget = ((Location) o).getEntryPoint();
		}

		if (pointOfTarget != null) {
			MoveTowards(pointOfTarget);
		} else {
			System.out.println("Target does not exist");
		}

	}
    
    public void MoveTowards(GridPoint pt) {
    	System.out.println(this + " currently at: " + space.getLocation(this));
		System.out.println(this + " move to:" + pt);

		NdPoint myPoint = space.getLocation(this);

		if (!SpaceAt(pt)) {
			if (curPath == null || curPath.isEmpty()) {
				System.out.println(this + " No path assigned, getting new one");
				curPath = new ArrayList<>();
				curPath.addAll(AStar.getRoute(grid, grid.getLocation(this), pt));

			} else {
				System.out.println(this + " Have path already");
				GridPoint pathGridPoint = curPath.get(curPath.size() - 1);
				if (pathGridPoint.getX() != pt.getX() || pathGridPoint.getY() != pt.getY()) {
					System.out.println(this + " But path is to wrong place");
					curPath = new ArrayList<>();
					curPath.addAll(AStar.getRoute(grid, grid.getLocation(this), pt));
					System.out.println(this + " new target:" + curPath.get(0));

				}
			}
			
			if(!curPath.isEmpty()) {
				GridPoint GridStep = curPath.get(0);
				curPath.remove(0);
				NdPoint otherPoint = new NdPoint(GridStep.getX(), GridStep.getY());
				space.moveTo(this, otherPoint.getX(), otherPoint.getY());
				myPoint = space.getLocation(this);
				grid.moveTo(this, (int) myPoint.getX(), (int) myPoint.getY());
			} else {
				System.out.println(this + " Could not find a path");
			}
		} else {
			System.out.println(this + " Already here tho");
		}
    	
    	
    	
		// only move if we are not already in this grid location
//		System.out.println("moveTowards called: " + this);
//		if (!grid.getLocation(this).equals(pt)) {
////			System.out.println("move successfully: " + this);
//			NdPoint myPoint = space.getLocation(this);
//			NdPoint otherPoint = new NdPoint(pt.getX(), pt.getY());
//			double angle = SpatialMath.calcAngleFor2DMovement(space, myPoint, otherPoint);
//			space.moveByVector(this, 1.4, angle, 0);
//			myPoint = space.getLocation(this);
//			grid.moveTo(this, (int) myPoint.getX(), (int) myPoint.getY());
//		}
	}
    
//    public boolean SpaceAt(Object o) {
//    	//计算网格点间距离，小于1则判断位于目标处
//    	GridPoint curPoint = grid.getLocation(this);
//    	GridPoint pointOfTarget = grid.getLocation(o);
//    	
//    	return (CalcDistance(curPoint, pointOfTarget) < 2);
//    }
	
	public double CalcDistance(GridPoint a, GridPoint b) {
		
		double x = a.getX() - b.getX();
		double y = a.getY() - b.getY();
		
		x = (x < 0) ? -x : x;
		y = (y < 0) ? -y : y;
		
		return Math.pow((x * x + y * y), 0.5);
	}
	
	@Override
	public String toString() {
		return "Patient " + mintMyID;
	}

}
