package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.agents.Actor;
import simcore.action.Behaviour;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import repast.simphony.context.Context;
import simcore.Signals.Signal;
import java.util.List;
import java.util.function.Predicate;
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
import simcore.action.InstantBehaviourStep;
import java.util.Iterator;

public class Doctor extends Actor {

  public Behaviour behaviourBuilder;

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 1;
  }

  protected Signal selectSignal(List<Signal> plstSignals) {
    if (!(plstSignals.isEmpty())) {
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(Doctor.this, s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(Doctor.this, s.GetData("patient")) != null;
          }
        }).findFirst().orElse(null);
      }
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
            public boolean test(RepastEdge<Object> e) {
              return e.getSource().getClass() == Doctor.class;
            }
          }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(Doctor.this) < mintMyMaxPatients;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return StreamSupport.stream(((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")).spliterator(), false).filter(new Predicate<RepastEdge<Object>>() {
              public boolean test(RepastEdge<Object> e) {
                return e.getSource().getClass() == Doctor.class;
              }
            }).count() < 1 && ((Network) context.getProjection("CurrentPatientAllocations")).getDegree(Doctor.this) < mintMyMaxPatients;
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
          return a.getClass() == patient.class && ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(Doctor.this, a) != null;
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





  public Behaviour BuildActionFromSignal(Signal s) {
    if (s.GetData("patient") != null) {
      ((Network) context.getProjection("CurrentPatientAllocations")).addEdge(this, s.GetData("patient"));
    }
    switch (s.getName()) {
      case "":
        break;
      case "AmberBayTrigger_c":
        behaviourBuilder = new Behaviour("AmberBayTrigger_c");
        this.InitAdmitActionAmberBay_c(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }



  public class MoveAction_a0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a(Behaviour behaviour) {
      target = behaviour.getSignalTrigger().GetData("patient");
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
  public class MoveAction_b0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_b0a(Behaviour behaviour) {
      target = AmberBay.getInstance();
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
  public class OrderAction_c0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class StayForConditionAction_d0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return ImAt(behaviour.getSignalTrigger().GetData("patient"));
    }
  }
  public class Consequence_e0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo = "AmberBay";

    }
  }
  public class RemoveRelationshipAction_f0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_f0a(Behaviour behaviour) {
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
  public class MoveAction_a0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_3(Behaviour behaviour) {
      target = behaviour.getSignalTrigger().GetData("patient");
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
  public class MoveAction_b0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_b0a_1(Behaviour behaviour) {
      target = AmberBay.getInstance();
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
  public class OrderAction_c0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class StayForConditionAction_d0a_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public StayForConditionAction_d0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
    }

    public boolean finishCondition() {
      return ImAt(behaviour.getSignalTrigger().GetData("patient"));
    }
  }
  public class Consequence_e0a_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_e0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo = "AmberBay";

    }
  }
  public class RemoveRelationshipAction_f0a_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_f0a_0(Behaviour behaviour) {
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


  public void InitAdmitActionAmberBay_c(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a(behaviourBuilder));
    plstSteps.add(new MoveAction_b0a(behaviourBuilder));
    plstSteps.add(new OrderAction_c0a(behaviourBuilder));
    plstSteps.add(new StayForConditionAction_d0a(behaviourBuilder));
    plstSteps.add(new Consequence_e0a(behaviourBuilder));
    plstSteps.add(new RemoveRelationshipAction_f0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}
