package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.agents.Actor;
import simcore.action.Behaviour;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import repast.simphony.context.Context;
import simcore.Signals.Signal;
import simcore.basicStructures.Board;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import simcore.basicStructures.Room;
import simcore.basicStructures.RoomType;
import java.util.ArrayList;
import java.util.Comparator;
import simcore.agents.Agent;
import repast.simphony.space.graph.Network;
import simcore.action.InstantBehaviourStep;
import simcore.action.BehaviourStep;
import repast.simphony.engine.schedule.ScheduledMethod;
import simcore.action.BackgroundBehaviour;

public class patient extends Actor {

  public String placeholder = "PlaceholderAttribute";
  public String admittedTo = "NA";
  public String admissionRoute = "UnConfigured";
  public String Immunocompromised = "NotConfigured";
  public Behaviour behaviourBuilder;

  public patient(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 1;
  }

  protected Signal searchForSignals(Board board) {
    // Read the board for signals, and find ones for me - filter out any signals that I don't meet the pre-condition for 
    List<Signal> plstDirectSignals = board.GetDirectSignalsForMe(this).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, patient.this);
      }
    }).collect(Collectors.toList());
    List<Signal> plstSignals = board.GetSignalListBySubject(this.getClass()).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, patient.this);
      }
    }).collect(Collectors.toList());

    if (plstDirectSignals.isEmpty() && plstSignals.isEmpty()) {
      return null;
    }
    // First see if there are any direct messages for me and prioritise those 
    Signal s = selectSignal(plstDirectSignals);
    if (s == null) {
      // If none, select a message for my class type 
      s = selectSignal(plstSignals);
    }
    return s;
  }


  protected Signal selectSignal(List<Signal> plstSignals) {
    if (plstSignals.isEmpty()) {
      return null;
    }
    return null;
  }

  protected Room SelectLocation(RoomType pRoomType, Behaviour behaviour) {
    ArrayList<Room> pRooms = (ArrayList<Room>) ReadMap().FindInstancesOfRoomType(pRoomType);
    // First, select the room that contains my patient (if my current action involves the patient) 
    for (Room pRoom : pRooms) {
      if (behaviour.getSignalTrigger() != null && behaviour.getSignalTrigger().GetData("patient") != null && pRoom.getOccupiers().contains(behaviour.getSignalTrigger().GetData("patient"))) {
        return pRoom;
      }
    }
    // If my patient isn't currently in that room, then consider other options 
    Room selectedRoom = pRooms.stream().sorted(new Comparator<Room>() {
      public int compare(Room r1, Room r2) {
        return Double.compare(EvaluateRoomChoice(r1), EvaluateRoomChoice(r2));
      }
    }).filter(new Predicate<Room>() {
      public boolean test(Room r) {
        return EvaluateRoomChoice(r) != Double.MAX_VALUE;
      }
    }).findFirst().orElse(null);
    return selectedRoom;
  }


  protected double EvaluateRoomChoice(Room pRoom) {
    ArrayList<Agent> occupiers = new ArrayList<Agent>(pRoom.getOccupiers());

    if (pRoom == null) {
      return 0;
    }
    return 0;

  }





  public Behaviour BuildActionFromSignal(Signal s) {
    if (s.GetData("patient") != null) {
      ((Network) context.getProjection("CurrentPatientAllocations")).addEdge(this, s.GetData("patient"));
    }
    switch (s.getName()) {
      case "":
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }


  public int getImmunocompromisedisYes() {
    if (this.Immunocompromised == "Yes") {
      return 1;
    }
    return 0;
  }
  public int getImmunocompromisedisNo() {
    if (this.Immunocompromised == "No") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisCOVIDPositiveCohort() {
    if (this.admittedTo == "COVIDPositiveCohort") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisCOVIDPositiveCohortgetImmunocompromisedisYes() {
    if (this.admittedTo == "COVIDPositiveCohort" && this.Immunocompromised == "Yes") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisCOVIDPositiveCohortgetImmunocompromisedisNo() {
    if (this.admittedTo == "COVIDPositiveCohort" && this.Immunocompromised == "No") {
      return 1;
    }
    return 0;
  }

  public class Consequence_a0a0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).placeholder = "HELLO";

    }
  }
  public class Consequence_a0a0a_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).placeholder = "HELLO";

    }
  }
  public class Choice_a0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 10 && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 10 && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class MoveAction_a0a_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_13(Behaviour behaviour) {
      target = patient.this;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target), behaviour);
        } else {
          concreteTarget = target;
        }
      }

      if (concreteTarget != null) {
        if (target instanceof RoomType) {
          if (EvaluateRoomChoice(((Room) concreteTarget)) == Double.MAX_VALUE) {
            concreteTarget = SelectLocation(((RoomType) target), behaviour);
          }
        }
        MoveTowards(concreteTarget);

      }
    }

    public boolean finishCondition() {
      return concreteTarget != null && ImAt(concreteTarget);
    }
  }
  public class MoveAction_a0a_15 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_15(Behaviour behaviour) {
      target = patient.this;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target), behaviour);
        } else {
          concreteTarget = target;
        }
      }

      if (concreteTarget != null) {
        if (target instanceof RoomType) {
          if (EvaluateRoomChoice(((Room) concreteTarget)) == Double.MAX_VALUE) {
            concreteTarget = SelectLocation(((RoomType) target), behaviour);
          }
        }
        MoveTowards(concreteTarget);

      }
    }

    public boolean finishCondition() {
      return concreteTarget != null && ImAt(concreteTarget);
    }
  }
  @ScheduledMethod(start = 1, interval = 1)
  public void InfectionSpread() {
    for (Object object : context.getObjects(patient.class)) {
      patient a = (patient) object;
      Signal s = new Signal();
      s.setName("patient" + a.agentName());
      s.setDescription("infectTrigger");
      s.AddActor("patient");
      s.AddData("patient", a);
      infect(s);
    }
  }
  public void infect(Signal s) {
    BackgroundBehaviour backgroundBehaviour = new BackgroundBehaviour("infect", this);

    backgroundBehaviour.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_13(backgroundBehaviour));
    backgroundBehaviour.setSteps(plstSteps);

    myBackgroundBehaviours.add(backgroundBehaviour);
  }



  public int patientgetAliveTime() {
    if (deSpawnTime == 0) {
      deSpawnTime = ToolBox().getTime();
    }
    return (int) (deSpawnTime - spawnTime);
  }
}
