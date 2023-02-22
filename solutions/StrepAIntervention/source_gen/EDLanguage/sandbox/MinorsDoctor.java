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
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.InstantBehaviourStep;
import repast.simphony.random.RandomHelper;
import simcore.basicStructures.TimeKeeper;
import java.util.Iterator;

public class MinorsDoctor extends Actor {

  public Behaviour behaviourBuilder;

  public MinorsDoctor(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 5;
  }

  protected Signal searchForSignals(Board board) {
    // Read the board for signals, and find ones for me - filter out any signals that I don't meet the pre-condition for
    List<Signal> plstDirectSignals = board.GetDirectSignalsForMe(this).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, MinorsDoctor.this);
      }
    }).collect(Collectors.toList());



    List<Signal> plstSignals = board.GetSignalListBySubject(this.getClass()).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, MinorsDoctor.this);
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
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MinorsDoctor.this, s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(MinorsDoctor.this, s.GetData("patient")) != null;
          }
        }).findFirst().orElse(null);
      }
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
            public boolean test(RepastEdge<Object> e) {
              return e.getSource().getClass() == MinorsDoctor.class;
            }
          }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(MinorsDoctor.this) < mintMyMaxPatients;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
              public boolean test(RepastEdge<Object> e) {
                return e.getSource().getClass() == MinorsDoctor.class;
              }
            }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(MinorsDoctor.this) < mintMyMaxPatients;
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
      if (pRoom.getOccupiers().stream().anyMatch(new Predicate<Agent>() {
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
    plstSteps.add(new MoveAction_a0a_31(behaviourBuilder));
    plstSteps.add(new StayAction_b0a_15(behaviourBuilder));
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
      case "AssessmentTrigger_a_0":
        behaviourBuilder = new Behaviour("AssessmentTrigger_a_0", this);
        this.InitAssessment_a_0(s);
        break;
      case "DischargeTrigger_d_1":
        behaviourBuilder = new Behaviour("DischargeTrigger_d_1", this);
        this.InitDischargeActionDischarge_d_0(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }



  public class MoveAction_a0a_27 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_27(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0a_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_11(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsDoctor.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0a_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0a_19 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_19(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (1800 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

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
  public class SendSignalAction_a0a6a0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a6a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ObsReviewTrigger_e_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0a6a0_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a6a0_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ObsReviewTrigger_e_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0b6a0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0b6a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new AdditionalAssessmentTrigger_c_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0b6a0_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0b6a0_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new AdditionalAssessmentTrigger_c_0Signal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class ProbabilityDistribution_g0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public ProbabilityDistribution_g0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      double rndDouble = RandomHelper.nextDouble();

      if (rndDouble < ((80) / 100)) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a6a0(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (rndDouble < ((20 + 80.0) / 100)) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0b6a0(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class StayAction_h0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_h0a(Behaviour behaviour) {
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
  public class MoveAction_a0a_29 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_29(Behaviour behaviour) {
      target = MinorsBay.getInstance();
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
  public class OrderAction_b0a_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_13(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsDoctor.this.curInside).andThen(new MoveToOrder().WithDestination(Bed.class)));
    }
  }
  public class StayForConditionAction_c0a_6 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0a_6(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
    }

    public boolean finishCondition() {
      return curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom();
    }
  }
  public class StayAction_d0a_21 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_21(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
      timeExecuted++;
    }

    public boolean finishCondition() {
      return (timeExecuted == (1800 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick")));

    }
  }
  public class OrderAction_e0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_e0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(WaitingRoom.getInstance()));
    }
  }
  public class OrderAction_f0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_f0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Seat.class));
    }
  }
  public class ProbabilityDistribution_g0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public ProbabilityDistribution_g0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      double rndDouble = RandomHelper.nextDouble();

      if (rndDouble < ((80) / 100)) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a6a0(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (rndDouble < ((20 + 80.0) / 100)) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0b6a0(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class StayAction_h0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_h0a_1(Behaviour behaviour) {
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
  public class MoveAction_a0b_15 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_15(Behaviour behaviour) {
      target = MainEntrance.getInstance();
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
  public class OrderAction_b0b_15 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b_15(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsDoctor.this));
    }
  }
  public class StayForConditionAction_c0b_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0b_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
    }

    public boolean finishCondition() {
      return ImAt(behaviour.getSignalTrigger().GetData("patient"));
    }
  }
  public class Consequence_d0b_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_d0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo = "MainEntrance";

    }
  }
  public class DespawnAction_e0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public DespawnAction_e0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((Actor) behaviour.getSignalTrigger().GetData("patient")).deSpawnTime = TimeKeeper.getInstance().getTime();
    }
  }
  public class RemoveRelationshipAction_f0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_f0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      Iterator<RepastEdge<Agent>> patientStaffAllocations = network.getEdges(behaviour.getSignalTrigger().GetData("patient")).iterator();
      while (patientStaffAllocations.hasNext()) {
        network.removeEdge(patientStaffAllocations.next());
      }
    }
  }
  public class MoveAction_a0b_17 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_17(Behaviour behaviour) {
      target = MainEntrance.getInstance();
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
  public class OrderAction_b0b_17 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b_17(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(MinorsDoctor.this));
    }
  }
  public class StayForConditionAction_c0b_8 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_c0b_8(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing
    }

    public boolean finishCondition() {
      return ImAt(behaviour.getSignalTrigger().GetData("patient"));
    }
  }
  public class Consequence_d0b_2 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_d0b_2(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo = "MainEntrance";

    }
  }
  public class DespawnAction_e0b_2 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public DespawnAction_e0b_2(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((Actor) behaviour.getSignalTrigger().GetData("patient")).deSpawnTime = TimeKeeper.getInstance().getTime();
    }
  }
  public class RemoveRelationshipAction_f0b_2 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_f0b_2(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      Iterator<RepastEdge<Agent>> patientStaffAllocations = network.getEdges(behaviour.getSignalTrigger().GetData("patient")).iterator();
      while (patientStaffAllocations.hasNext()) {
        network.removeEdge(patientStaffAllocations.next());
      }
    }
  }
  public class MoveAction_a0a_31 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_31(Behaviour behaviour) {
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
  public class StayAction_b0a_15 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0a_15(Behaviour behaviour) {
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


  public void InitAssessment_a_0(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_27(behaviourBuilder));
    plstSteps.add(new OrderAction_b0a_11(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0a_5(behaviourBuilder));
    plstSteps.add(new StayAction_d0a_19(behaviourBuilder));
    plstSteps.add(new OrderAction_e0a(behaviourBuilder));
    plstSteps.add(new OrderAction_f0a(behaviourBuilder));
    plstSteps.add(new ProbabilityDistribution_g0a(behaviourBuilder));
    plstSteps.add(new StayAction_h0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitDischargeActionDischarge_d_0(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0b_15(behaviourBuilder));
    plstSteps.add(new OrderAction_b0b_15(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_c0b_7(behaviourBuilder));
    plstSteps.add(new Consequence_d0b_1(behaviourBuilder));
    plstSteps.add(new DespawnAction_e0b_1(behaviourBuilder));
    plstSteps.add(new RemoveRelationshipAction_f0b_1(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

  public int MinorsDoctorgetAliveTime() {
    if (deSpawnTime == null) {
      return 0;
    }
    return Math.abs((int) TimeKeeper.compareSeconds(deSpawnTime, spawnTime));
  }
}
