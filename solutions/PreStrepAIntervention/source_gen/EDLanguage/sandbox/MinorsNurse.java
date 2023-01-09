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
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.PassiveBehaviourStep;
import repast.simphony.engine.environment.RunEnvironment;
import simcore.action.InstantBehaviourStep;
import repast.simphony.random.RandomHelper;

public class MinorsNurse extends Actor {

  public Behaviour behaviourBuilder;

  public MinorsNurse(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 5;
  }

  protected Signal searchForSignals(Board board) {
    // Read the board for signals, and find ones for me - filter out any signals that I don't meet the pre-condition for 
    List<Signal> plstDirectSignals = board.GetDirectSignalsForMe(this).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, MinorsNurse.this);
      }
    }).collect(Collectors.toList());
    List<Signal> plstSignals = board.GetSignalListBySubject(this.getClass()).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, MinorsNurse.this);
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
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MinorsNurse.this, s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MinorsNurse.this, s.GetData("patient")) != null;
          }
        }).findFirst().orElse(null);
      }
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
            public boolean test(RepastEdge<Object> e) {
              return e.getSource().getClass() == MinorsNurse.class;
            }
          }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(MinorsNurse.this) < mintMyMaxPatients;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
              public boolean test(RepastEdge<Object> e) {
                return e.getSource().getClass() == MinorsNurse.class;
              }
            }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(MinorsNurse.this) < mintMyMaxPatients;
          }
        }).findFirst().orElse(null);
      }
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

    if (true) {
      if (pRoom.getOccupiers().stream().anyMatch(new Predicate<Agent>() {
        public boolean test(Agent a) {
          return a.getClass() == patient.class && ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MinorsNurse.this, a) != null;
        }
      })) {
        return Double.MIN_VALUE;
      }
    }
    if (true) {
      if (pRoom.hasCapacity()) {
        return Double.MIN_VALUE;
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
    plstSteps.add(new MoveAction_a0a_25(behaviourBuilder));
    plstSteps.add(new StayAction_b0a_5(behaviourBuilder));
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
      case "WaitTrigger_b_0":
        behaviourBuilder = new Behaviour("WaitTrigger_b_0", this);
        this.InitWait_b_0(s);
        break;
      case "ObsReviewTrigger_e_0":
        behaviourBuilder = new Behaviour("ObsReviewTrigger_e_0", this);
        this.InitObsReview_e_0(s);
        break;
      case "ObsReviewTrigger_f_0":
        behaviourBuilder = new Behaviour("ObsReviewTrigger_f_0", this);
        this.InitObsReview_f_0(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }



  public class MoveAction_a0a_21 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_21(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0a_15 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_15(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0a_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0a_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0a_15 extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int testingTime = TimeDistributionTable_a1_0.getInstance().getProcessingTime();
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_15(Behaviour behaviour) {
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
  public class SendSignalAction_e0a_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0a_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ObsReviewTrigger_f_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_f0a_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_f0a_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class MoveAction_a0a_23 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_23(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0a_17 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_17(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0a_8 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0a_8(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0a_17 extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int testingTime = TimeDistributionTable_a1_0.getInstance().getProcessingTime();
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_17(Behaviour behaviour) {
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
  public class SendSignalAction_e0a_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0a_9(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ObsReviewTrigger_f_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_f0a_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_f0a_9(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class MoveAction_a0b_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_11(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0b_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b_11(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0b_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0b_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0b_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0b_7(Behaviour behaviour) {
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
  public class SendSignalAction_e0b_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0b_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new WaitTrigger_b_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_f0b_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_f0b_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class MoveAction_a0b_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_13(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0b_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b_13(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0b_6 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0b_6(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0b_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0b_9(Behaviour behaviour) {
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
  public class SendSignalAction_e0b_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0b_9(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new WaitTrigger_b_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_f0b_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_f0b_9(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class MoveAction_a0c_15 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0c_15(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0c_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0c_11(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0c_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0c_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0c_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0c_9(Behaviour behaviour) {
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
  public class SendSignalAction_a0a4a2_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a4a2_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new DischargeTrigger_d_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0a4a2_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a4a2_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new DischargeTrigger_d_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0b4a2_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0b4a2_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new SeniorReviewTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0b4a2_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0b4a2_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new SeniorReviewTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class ProbabilityDistribution_e0c_3 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public ProbabilityDistribution_e0c_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      double rndDouble = RandomHelper.nextDouble();

      if (rndDouble < ((80) / 100)) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a4a2_3(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (rndDouble < ((20 + 80.0) / 100)) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0b4a2_3(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class StayAction_f0c_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_f0c_11(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class MoveAction_a0c_17 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0c_17(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0c_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0c_13(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsNurse.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0c_6 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0c_6(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0c_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0c_11(Behaviour behaviour) {
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
  public class ProbabilityDistribution_e0c_5 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public ProbabilityDistribution_e0c_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      double rndDouble = RandomHelper.nextDouble();

      if (rndDouble < ((80) / 100)) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a4a2_3(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (rndDouble < ((20 + 80.0) / 100)) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0b4a2_3(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class StayAction_f0c_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_f0c_13(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class MoveAction_a0a_25 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_25(Behaviour behaviour) {
      target = WaitingRoom.getInstance();
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
  public class StayAction_b0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0a_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (60 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }


  public void InitWait_b_0(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_21(behaviourBuilder));
    plstSteps.add(new OrderAction_b0a_15(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0a_7(behaviourBuilder));
    plstSteps.add(new StayAction_d0a_15(behaviourBuilder));
    plstSteps.add(new SendSignalAction_e0a_7(behaviourBuilder));
    plstSteps.add(new StayAction_f0a_7(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitObsReview_e_0(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0b_11(behaviourBuilder));
    plstSteps.add(new OrderAction_b0b_11(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0b_5(behaviourBuilder));
    plstSteps.add(new StayAction_d0b_7(behaviourBuilder));
    plstSteps.add(new SendSignalAction_e0b_7(behaviourBuilder));
    plstSteps.add(new StayAction_f0b_7(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitObsReview_f_0(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0c_15(behaviourBuilder));
    plstSteps.add(new OrderAction_b0c_11(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0c_5(behaviourBuilder));
    plstSteps.add(new StayAction_d0c_9(behaviourBuilder));
    plstSteps.add(new ProbabilityDistribution_e0c_3(behaviourBuilder));
    plstSteps.add(new StayAction_f0c_11(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

  public int MinorsNursegetAliveTime() {
    if (deSpawnTime == 0) {
      deSpawnTime = ToolBox().getTime();
    }
    return (int) (deSpawnTime - spawnTime);
  }
}
