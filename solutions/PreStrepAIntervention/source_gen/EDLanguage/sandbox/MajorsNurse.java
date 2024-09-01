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
import repast.simphony.random.RandomHelper;
import simcore.Signals.Orders.MoveToOrder;
import simcore.basicStructures.TimeKeeper;

public class MajorsNurse extends Actor {

  public Behaviour behaviourBuilder;

  public MajorsNurse(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 5;
  }

  protected Signal searchForSignals(Board board) {
    // Read the board for signals, and find ones for me - filter out any signals that I don't meet the pre-condition for
    List<Signal> plstDirectSignals = board.GetDirectSignalsForMe(this).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, MajorsNurse.this);
      }
    }).collect(Collectors.toList());



    List<Signal> plstSignals = board.GetSignalListBySubject(this.getClass()).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, MajorsNurse.this);
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
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MajorsNurse.this, s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MajorsNurse.this, s.GetData("patient")) != null;
          }
        }).findFirst().orElse(null);
      }
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
            public boolean test(RepastEdge<Object> e) {
              return e.getSource().getClass() == MajorsNurse.class;
            }
          }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(MajorsNurse.this) < mintMyMaxPatients;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
              public boolean test(RepastEdge<Object> e) {
                return e.getSource().getClass() == MajorsNurse.class;
              }
            }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(MajorsNurse.this) < mintMyMaxPatients;
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

  public Behaviour isIdleAction(Signal s) {
    behaviourBuilder = new Behaviour("isIdleAction", this);
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_4(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

    return behaviourBuilder;
  }




  public Behaviour BuildActionFromSignal(Signal s) {
    if (s.GetData("patient") != null) {
      ((Network) context.getProjection("CurrentPatientAllocations")).addEdge(this, s.GetData("patient"));
    }
    switch (s.getName()) {
      case "":
        break;
      case "WaitTrigger_b":
        behaviourBuilder = new Behaviour("WaitTrigger_b", this);
        this.InitWait_b(s);
        break;
      case "ObsReviewTrigger_e":
        behaviourBuilder = new Behaviour("ObsReviewTrigger_e", this);
        this.InitObsReview_e(s);
        break;
      case "ObsReviewTrigger_f":
        behaviourBuilder = new Behaviour("ObsReviewTrigger_f", this);
        this.InitObsReview_f(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }




  public class MoveAction_a0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_3(Behaviour behaviour) {
      target = MajorsBay.getInstance();
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
  public class StayAction_b0a extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int testingTime = TimeDistributionTable_a1.getInstance().getProcessingTime();
    /*package*/ int timeExecuted = 0;
    public StayAction_b0a(Behaviour behaviour) {
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
  public class SendSignalAction_a0a2a0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a2a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ObsReviewTrigger_fSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0b2a0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0b2a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new AdditionalAssessmentTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class ProbabilityDistribution_c0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public ProbabilityDistribution_c0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      double rndDouble = RandomHelper.nextDouble();
      double d = Double.valueOf(50);
      if (rndDouble < (d / 100)) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a2a0(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (rndDouble < ((50 + 50.0) / 100)) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0b2a0(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class MoveAction_a0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_1(Behaviour behaviour) {
      target = MajorsBay.getInstance();
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
  public class OrderAction_b0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MajorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(MajorsNurse.this.curInside.getAllOcupiablesOfType(Bed.class).get(0))));
    }
  }
  public class StayForConditionAction_c0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0b_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0b_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (600 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class SendSignalAction_e0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new WaitTrigger_bSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class MoveAction_a0c_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0c_0(Behaviour behaviour) {
      target = MajorsBay.getInstance();
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
  public class OrderAction_b0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MajorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(MajorsNurse.this.curInside.getAllOcupiablesOfType(Bed.class).get(0))));
    }
  }
  public class StayForConditionAction_c0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (600 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class SendSignalAction_a0a4a2 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a4a2(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new DischargeTrigger_dSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0b4a2 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0b4a2(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new SeniorDocReviewTrigger_iSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class ProbabilityDistribution_e0c extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public ProbabilityDistribution_e0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      double rndDouble = RandomHelper.nextDouble();
      double d = Double.valueOf(90);
      if (rndDouble < (d / 100)) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a4a2(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (rndDouble < ((10 + 90.0) / 100)) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0b4a2(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class MoveAction_a0a_4 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_4(Behaviour behaviour) {
      target = WaitingRoom.getInstance();
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


  public void InitWait_b(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_3(behaviourBuilder));
    plstSteps.add(new StayAction_b0a(behaviourBuilder));
    plstSteps.add(new ProbabilityDistribution_c0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitObsReview_e(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0b_1(behaviourBuilder));
    plstSteps.add(new OrderAction_b0b_1(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0b_1(behaviourBuilder));
    plstSteps.add(new StayAction_d0b_0(behaviourBuilder));
    plstSteps.add(new SendSignalAction_e0b(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitObsReview_f(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0c_0(behaviourBuilder));
    plstSteps.add(new OrderAction_b0c(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0c(behaviourBuilder));
    plstSteps.add(new StayAction_d0c(behaviourBuilder));
    plstSteps.add(new ProbabilityDistribution_e0c(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

  public int MajorsNursegetAliveTime() {
    if (deSpawnTime == null) {
      return 0;
    }
    return Math.abs((int) TimeKeeper.compareSeconds(deSpawnTime, spawnTime));
  }
}
