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
import simcore.diagnosis.TestResult;
import java.util.ArrayList;
import simcore.basicStructures.Board;
import simcore.Signals.DirectSignal;

public class LabTech extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Behaviour behaviourBuilder;

  public LabTech(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 1;
  }

  public LabTech(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "RequestPCR":
        behaviourBuilder = new Behaviour("RequestPCR");
        this.InitStartPCR(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }

  public class MoveAction_a0a_23 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_23(Behaviour behaviour) {
      target = behaviour.getSignalTrigger().GetData("replyTo");
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
  public class MoveAction_b0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_b0a_3(Behaviour behaviour) {
      target = ReadMap().FindPlace("Lab");
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
  public class OccupyAction_c0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_c0a_3(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != LabTech.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (ImAt(concreteTarget)) {
        concreteTarget.setOccupier(LabTech.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class TestAction_d0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int testingTime = LabSymptomaticPCR.getInstance().getProcessingTime();
    /*package*/ int timeExecuted = 0;
    /*package*/ TestResult testResult;
    public TestAction_d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (timeExecuted == 0) {
        testResult = LabSymptomaticPCR.getInstance().TestPatient(behaviour.getPatient());
      }

      timeExecuted++;

      if (timeExecuted == testingTime) {
        if (testResult.isInfected()) {
          ArrayList<BehaviourStep> plstSteps = new ArrayList();
          plstSteps.add(new MoveAction_a0d0a(behaviour));
          behaviour.injectSteps(plstSteps);
        } else {
          ArrayList<BehaviourStep> plstSteps = new ArrayList();
          plstSteps.add(new SendSignalAction_a0d0a(behaviour));
          behaviour.injectSteps(plstSteps);
        }
      }
    }

    public boolean finishCondition() {
      return timeExecuted == testingTime;
    }
  }
  public class MoveAction_a0a_25 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_25(Behaviour behaviour) {
      target = behaviour.getSignalTrigger().GetData("replyTo");
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
  public class MoveAction_b0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_b0a_5(Behaviour behaviour) {
      target = ReadMap().FindPlace("Lab");
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
  public class OccupyAction_c0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_c0a_5(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != LabTech.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (ImAt(concreteTarget)) {
        concreteTarget.setOccupier(LabTech.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class TestAction_d0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int testingTime = LabSymptomaticPCR.getInstance().getProcessingTime();
    /*package*/ int timeExecuted = 0;
    /*package*/ TestResult testResult;
    public TestAction_d0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (timeExecuted == 0) {
        testResult = LabSymptomaticPCR.getInstance().TestPatient(behaviour.getPatient());
      }

      timeExecuted++;

      if (timeExecuted == testingTime) {
        if (testResult.isInfected()) {
          ArrayList<BehaviourStep> plstSteps = new ArrayList();
          plstSteps.add(new MoveAction_a0d0a(behaviour));
          behaviour.injectSteps(plstSteps);
        } else {
          ArrayList<BehaviourStep> plstSteps = new ArrayList();
          plstSteps.add(new SendSignalAction_a0d0a(behaviour));
          behaviour.injectSteps(plstSteps);
        }
      }
    }

    public boolean finishCondition() {
      return timeExecuted == testingTime;
    }
  }
  public class MoveAction_a0d0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0d0a(Behaviour behaviour) {
      target = ReadMap().FindPlace("AmberBay");
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
  public class MoveAction_a0d0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0d0a_1(Behaviour behaviour) {
      target = ReadMap().FindPlace("AmberBay");
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
  public class SendSignalAction_a0d0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0d0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new PCRCompleteTwoSignal();
      ((DirectSignal) sendSignalTemp).setTarget(behaviour.getSignalTrigger().GetData("replyTo"));
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0d0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0d0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new PCRCompleteTwoSignal();
      ((DirectSignal) sendSignalTemp).setTarget(behaviour.getSignalTrigger().GetData("replyTo"));
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }


  public void InitStartPCR(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_23(behaviourBuilder));
    plstSteps.add(new MoveAction_b0a_3(behaviourBuilder));
    plstSteps.add(new OccupyAction_c0a_3(behaviourBuilder));
    plstSteps.add(new TestAction_d0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}
