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
import repast.simphony.space.graph.Network;
import java.util.stream.StreamSupport;
import repast.simphony.space.graph.RepastEdge;
import simcore.basicStructures.Room;
import simcore.basicStructures.RoomType;
import java.util.ArrayList;
import java.util.Comparator;
import simcore.agents.Agent;
import simcore.action.BehaviourStep;
import repast.simphony.engine.environment.RunEnvironment;
import simcore.action.PassiveBehaviourStep;
import simcore.action.InstantBehaviourStep;
import simcore.Signals.Orders.MoveToOrder;
import simcore.basicStructures.TimeKeeper;

public class TriageNurse extends Actor {

  public Behaviour behaviourBuilder;

  public TriageNurse(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 2147483647;
  }

  protected Signal searchForSignals(Board board) {
    // Read the board for signals, and find ones for me - filter out any signals that I don't meet the pre-condition for
    List<Signal> plstDirectSignals = board.GetDirectSignalsForMe(this).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, TriageNurse.this);
      }
    }).collect(Collectors.toList());



    List<Signal> plstSignals = board.GetSignalListBySubject(this.getClass()).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, TriageNurse.this);
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
    if (!(plstSignals.isEmpty())) {
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(TriageNurse.this, s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(TriageNurse.this, s.GetData("patient")) != null;
          }
        }).findFirst().orElse(null);
      }
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
            public boolean test(RepastEdge<Object> e) {
              return e.getSource().getClass() == TriageNurse.class;
            }
          }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(TriageNurse.this) < mintMyMaxPatients;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
              public boolean test(RepastEdge<Object> e) {
                return e.getSource().getClass() == TriageNurse.class;
              }
            }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(TriageNurse.this) < mintMyMaxPatients;
          }
        }).findFirst().orElse(null);
      }
    }
    return null;
  }

  protected Room SelectLocation(RoomType pRoomType, final Behaviour behaviour) {
    if (curInside != null && curInside.getRoomType() == pRoomType && EvaluateRoomChoice(curInside, behaviour) != Double.MAX_VALUE) {
      return curInside;
    }
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
        return Double.compare(EvaluateRoomChoice(r1, behaviour), EvaluateRoomChoice(r2, behaviour));
      }
    }).filter(new Predicate<Room>() {
      public boolean test(Room r) {
        return EvaluateRoomChoice(r, behaviour) != Double.MAX_VALUE;
      }
    }).findFirst().orElse(null);
    return selectedRoom;
  }


  protected double EvaluateRoomChoice(Room pRoom, final Behaviour behaviour) {
    ArrayList<Agent> occupiers = new ArrayList<Agent>(pRoom.getOccupiers());

    if (true) {
      if (behaviour.getSignalTrigger() != null && pRoom.getOccupiers().stream().anyMatch(new Predicate<Agent>() {
        public boolean test(Agent a) {
          return a == behaviour.getSignalTrigger().GetData("patient");
        }
      })) {
        return Double.MIN_VALUE;
      }
    }
    if (true) {
      if (!(pRoom.hasCapacity(this))) {
        return Double.MAX_VALUE;
      }
    }
    if (true) {
      return (CalcDistance(grid.getLocation(this), grid.getLocation(pRoom)));
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
      case "CheckSymptomaticTrigger_b":
        behaviourBuilder = new Behaviour("CheckSymptomaticTrigger_b", this);
        this.InitCheckSymptomatic_a(s);
        break;
      case "PatientArrivesTrigger_k":
        behaviourBuilder = new Behaviour("PatientArrivesTrigger_k", this);
        this.InitPatientArrives_k(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }




  public class MoveAction_a0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_1(Behaviour behaviour) {
      target = TriageDesk.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      int count = 0;

      while (count < RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")) {
        count++;
        if (finishCondition()) {
          return;
        }
        if (concreteTarget == null) {
          if (target instanceof RoomType) {
            concreteTarget = SelectLocation(((RoomType) target), behaviour);
          } else {
            concreteTarget = target;
          }
        }

        if (concreteTarget != null) {
          if (target instanceof RoomType) {
            if (EvaluateRoomChoice(((Room) concreteTarget), behaviour) == Double.MAX_VALUE) {
              concreteTarget = SelectLocation(((RoomType) target), behaviour);
            }
          }

          MoveTowards(concreteTarget);

        }
      }
    }

    public boolean finishCondition() {
      return concreteTarget != null && ImAt(concreteTarget);
    }
  }
  public class StayAction_b0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (180 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class StayAction_c0a extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int testingTime = PHEThreeExecutionTimeMap.getInstance().getProcessingTime();
    /*package*/ int timeExecuted = 0;
    public StayAction_c0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == testingTime;
    }
  }
  public class Consequence_a0a0d0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).PHEThreeCOVIDResult = "Positive";

    }
  }
  public class Consequence_a0a0d0a_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0d0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).PHEThreeCOVIDResult = "Negative";

    }
  }
  public class Choice_a0d0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (Dice(RunEnvironment.getInstance().getParameters().getDouble("PHEThreeCOVIDSensitivity"))) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0d0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0d0a_0(behaviour));
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Consequence_a0a0d0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0d0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).PHEThreeCOVIDResult = "Negative";

    }
  }
  public class Consequence_a0a0d0a_2 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0d0a_2(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).PHEThreeCOVIDResult = "Positive";

    }
  }
  public class Choice_a0d0a_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0d0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (Dice(RunEnvironment.getInstance().getParameters().getDouble("PHEThreeCOVIDSpecificity"))) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0d0a_1(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0d0a_2(behaviour));
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_d0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if ((((patient) behaviour.getSignalTrigger().GetData("patient")).COVIDInfectionStatus == "Symptomatic") || (((patient) behaviour.getSignalTrigger().GetData("patient")).COVIDInfectionStatus == "Asymptomatic")) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0d0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0d0a_0(behaviour));
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class OrderAction_e0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(WaitingRoom.getInstance()));
    }
  }
  public class OrderAction_f0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_f0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Seat.class));
    }
  }
  public class SendSignalAction_a0g0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0g0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new PerformLFTTrigger_bSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class Choice_g0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_g0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (((patient) behaviour.getSignalTrigger().GetData("patient")).PHEThreeCOVIDResult == "Positive") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0g0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class SendSignalAction_a0h0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0h0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new IspatientbeingadmittedtovulnerableareaTrigger_eSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class Choice_h0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_h0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (((patient) behaviour.getSignalTrigger().GetData("patient")).PHEThreeCOVIDResult == "Negative") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0h0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class SendSignalAction_a0a0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new CheckSymptomaticTrigger_bSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class Choice_a0b extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (((patient) behaviour.getSignalTrigger().GetData("patient")).cohort == "Emergency") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a0b(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }


  public void InitCheckSymptomatic_a(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_1(behaviourBuilder));
    plstSteps.add(new StayAction_b0a(behaviourBuilder));
    plstSteps.add(new StayAction_c0a(behaviourBuilder));
    plstSteps.add(new Choice_d0a(behaviourBuilder));
    plstSteps.add(new OrderAction_e0a(behaviourBuilder));
    plstSteps.add(new OrderAction_f0a(behaviourBuilder));
    plstSteps.add(new Choice_g0a(behaviourBuilder));
    plstSteps.add(new Choice_h0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitPatientArrives_k(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new Choice_a0b(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

  public int TriageNursegetAliveTime() {
    if (deSpawnTime == null) {
      return 0;
    }
    return Math.abs((int) TimeKeeper.compareSeconds(deSpawnTime, spawnTime));
  }
}
