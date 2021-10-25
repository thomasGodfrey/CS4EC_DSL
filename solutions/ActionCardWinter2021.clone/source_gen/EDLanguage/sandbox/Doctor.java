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
import simcore.action.BehaviourStep;
import simcore.basicStructures.RoomType;
import simcore.basicStructures.Room;
import simcore.Signals.Orders.MoveToOrder;
import java.util.ArrayList;

public class Doctor extends Actor {

  public Behaviour behaviourBuilder;

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 1;
  }

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
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
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdges(s.GetData("patient")) != null;
          }
        }).findFirst().orElse(null);
      }
    }
    return null;
  }



  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "CohortwithCOVID19patientsTrigger_a1":
        behaviourBuilder = new Behaviour("CohortwithCOVID19patientsTrigger_a1");
        this.InitAdmitActionCohortwithCOVID19patients_c(s);
        break;
      case "CohortwithamberpatientsTrigger_a4":
        behaviourBuilder = new Behaviour("CohortwithamberpatientsTrigger_a4");
        this.InitAdmitActionCohortwithamberpatients_f(s);
        break;
      case "AdmittosideroomTrigger_a3":
        behaviourBuilder = new Behaviour("AdmittosideroomTrigger_a3");
        this.InitAdmitActionAdmittosideroom_g(s);
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
      target = COVIDPositiveCohort.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target));
        } else {
          concreteTarget = target;
        }
      }

      if (target instanceof RoomType) {
        if (EvaluateRoomChoice(((Room) concreteTarget)) == 0) {
          concreteTarget = SelectLocation(((RoomType) target));
        }
      }

      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      return ImAt(concreteTarget);
    }
  }
  public class OrderAction_b0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class RemoveRelationshipAction_c0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_c0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      network.removeEdge(network.getEdge(this, behaviour.getSignalTrigger().GetData("patient")));
    }
  }
  public class MoveAction_a0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_1(Behaviour behaviour) {
      target = COVIDPositiveCohort.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target));
        } else {
          concreteTarget = target;
        }
      }

      if (target instanceof RoomType) {
        if (EvaluateRoomChoice(((Room) concreteTarget)) == 0) {
          concreteTarget = SelectLocation(((RoomType) target));
        }
      }

      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      return ImAt(concreteTarget);
    }
  }
  public class OrderAction_b0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class RemoveRelationshipAction_c0a_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_c0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      network.removeEdge(network.getEdge(this, behaviour.getSignalTrigger().GetData("patient")));
    }
  }
  public class MoveAction_a0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b(Behaviour behaviour) {
      target = AmberBay.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target));
        } else {
          concreteTarget = target;
        }
      }

      if (target instanceof RoomType) {
        if (EvaluateRoomChoice(((Room) concreteTarget)) == 0) {
          concreteTarget = SelectLocation(((RoomType) target));
        }
      }

      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      return ImAt(concreteTarget);
    }
  }
  public class OrderAction_b0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class RemoveRelationshipAction_c0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_c0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      network.removeEdge(network.getEdge(this, behaviour.getSignalTrigger().GetData("patient")));
    }
  }
  public class MoveAction_a0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_1(Behaviour behaviour) {
      target = AmberBay.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target));
        } else {
          concreteTarget = target;
        }
      }

      if (target instanceof RoomType) {
        if (EvaluateRoomChoice(((Room) concreteTarget)) == 0) {
          concreteTarget = SelectLocation(((RoomType) target));
        }
      }

      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      return ImAt(concreteTarget);
    }
  }
  public class OrderAction_b0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class RemoveRelationshipAction_c0b_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_c0b_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      network.removeEdge(network.getEdge(this, behaviour.getSignalTrigger().GetData("patient")));
    }
  }
  public class MoveAction_a0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0c(Behaviour behaviour) {
      target = SideRoom.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target));
        } else {
          concreteTarget = target;
        }
      }

      if (target instanceof RoomType) {
        if (EvaluateRoomChoice(((Room) concreteTarget)) == 0) {
          concreteTarget = SelectLocation(((RoomType) target));
        }
      }

      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      return ImAt(concreteTarget);
    }
  }
  public class OrderAction_b0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class RemoveRelationshipAction_c0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_c0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      network.removeEdge(network.getEdge(this, behaviour.getSignalTrigger().GetData("patient")));
    }
  }
  public class MoveAction_a0c_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0c_1(Behaviour behaviour) {
      target = SideRoom.getInstance();
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        if (target instanceof RoomType) {
          concreteTarget = SelectLocation(((RoomType) target));
        } else {
          concreteTarget = target;
        }
      }

      if (target instanceof RoomType) {
        if (EvaluateRoomChoice(((Room) concreteTarget)) == 0) {
          concreteTarget = SelectLocation(((RoomType) target));
        }
      }

      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      return ImAt(concreteTarget);
    }
  }
  public class OrderAction_b0c_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0c_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Actor a = (Actor) behaviour.getSignalTrigger().GetData("patient");

      a.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class RemoveRelationshipAction_c0c_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public RemoveRelationshipAction_c0c_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Network network = ((Network) context.getProjection("CurrentPatientAllocations"));
      network.removeEdge(network.getEdge(this, behaviour.getSignalTrigger().GetData("patient")));
    }
  }


  public void InitAdmitActionCohortwithCOVID19patients_c(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a(behaviourBuilder));
    plstSteps.add(new OrderAction_b0a(behaviourBuilder));
    plstSteps.add(new RemoveRelationshipAction_c0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitAdmitActionCohortwithamberpatients_f(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0b(behaviourBuilder));
    plstSteps.add(new OrderAction_b0b(behaviourBuilder));
    plstSteps.add(new RemoveRelationshipAction_c0b(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitAdmitActionAdmittosideroom_g(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0c(behaviourBuilder));
    plstSteps.add(new OrderAction_b0c(behaviourBuilder));
    plstSteps.add(new RemoveRelationshipAction_c0c(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}