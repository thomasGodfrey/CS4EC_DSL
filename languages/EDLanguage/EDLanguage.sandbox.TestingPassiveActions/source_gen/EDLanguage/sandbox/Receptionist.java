package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.action.Behaviour;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.BehaviourStep;
import simcore.basicStructures.RoomType;
import simcore.basicStructures.Room;
import simcore.basicStructures.Occupiable;
import simcore.basicStructures.Desk;
import simcore.agents.Patient;
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.PassiveBehaviourStep;
import simcore.action.InstantBehaviourStep;
import java.util.ArrayList;
import simcore.diagnosis.InfectionStatus;
import java.util.function.Predicate;
import simcore.diagnosis.TestResult;
import simcore.basicStructures.Test;

public class Receptionist extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Behaviour behaviourBuilder;

  public Receptionist(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public Receptionist(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "NewPatientArrive":
        behaviourBuilder = new Behaviour("NewPatientArrive");
        this.InitInspect(s);
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
      target = ReadMap().FindPlace("Triage");
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
  public class OccupyAction_b0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_b0a(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != Receptionist.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (ImAt(concreteTarget)) {
        concreteTarget.setOccupier(Receptionist.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class OrderAction_c0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(DoctorOffice.getInstance()));
    }
  }
  public class StayAction_d0a extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 3;
    }
  }
  public class Choice_e0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (EvaluateSuitableForSideRoomCondition(behaviour.getPatient(), AmberAdmissionBay.getInstance())) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new OrderAction_a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class MoveAction_a0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_1(Behaviour behaviour) {
      target = ReadMap().FindPlace("Triage");
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
  public class OccupyAction_b0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_b0a_1(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != Receptionist.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (ImAt(concreteTarget)) {
        concreteTarget.setOccupier(Receptionist.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class OrderAction_c0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(DoctorOffice.getInstance()));
    }
  }
  public class StayAction_d0a_1 extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 3;
    }
  }
  public class Choice_e0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_e0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (EvaluateSuitableForSideRoomCondition(behaviour.getPatient(), AmberAdmissionBay.getInstance())) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new OrderAction_a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class OrderAction_a0e0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_a0e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("AmberBay")));
    }
  }
  public class OrderAction_a0e0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_a0e0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("AmberBay")));
    }
  }
  public class Choice_a0e0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (EvaluateInfectionCondition(InfectionStatus.Asymptomatic, behaviour.getPatient())) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0e0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0e0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (EvaluateInfectionCondition(InfectionStatus.Asymptomatic, behaviour.getPatient())) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0a0e0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a0e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (behaviour.getPatient().getTestResults().stream().filter(new Predicate<TestResult>() {
        public boolean test(TestResult t) {
          return t.getTestType() == Test.getInstance();
        }
      }).findFirst().get().isInfected() == true) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new MoveAction_a0a0a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0a0e0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a0e0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (behaviour.getPatient().getTestResults().stream().filter(new Predicate<TestResult>() {
        public boolean test(TestResult t) {
          return t.getTestType() == Test.getInstance();
        }
      }).findFirst().get().isInfected() == true) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new MoveAction_a0a0a0e0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class MoveAction_a0a0a0e0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a0a0e0a(Behaviour behaviour) {
      target = ReadMap().FindPlace("DoctorOffice1");
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
  public class MoveAction_a0a0a0e0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a0a0e0a_1(Behaviour behaviour) {
      target = ReadMap().FindPlace("DoctorOffice1");
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


  public void InitInspect(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a(behaviourBuilder));
    plstSteps.add(new OccupyAction_b0a(behaviourBuilder));
    plstSteps.add(new OrderAction_c0a(behaviourBuilder));
    plstSteps.add(new StayAction_d0a(behaviourBuilder));
    plstSteps.add(new Choice_e0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}
