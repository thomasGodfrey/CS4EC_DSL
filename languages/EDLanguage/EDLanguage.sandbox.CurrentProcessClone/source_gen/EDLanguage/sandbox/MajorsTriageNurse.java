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
import simcore.basicStructures.Board;
import java.util.ArrayList;

public class MajorsTriageNurse extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Behaviour behaviourBuilder;

  public MajorsTriageNurse(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public MajorsTriageNurse(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForMajors":
        behaviourBuilder = new Behaviour("PatientWaitingForMajors");
        this.InitTriagePatient(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }

  public class MoveAction_a0a_11 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_11(Behaviour behaviour) {
      target = ReadMap().FindPlace("MajorsTriage");
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
  public class OccupyAction_b0a_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_b0a_7(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != MajorsTriageNurse.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (ImAt(concreteTarget)) {
        concreteTarget.setOccupier(MajorsTriageNurse.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class OrderAction_c0a_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0a_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(MajorsTriageNurse.this));
    }
  }
  public class StayAction_d0a_7 extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 5;
    }
  }
  public class OrderAction_e0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_e0a_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")));
    }
  }
  public class SendSignalAction_f0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_f0a_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new PatientWaitingForDoctorSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class MoveAction_a0a_13 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_13(Behaviour behaviour) {
      target = ReadMap().FindPlace("MajorsTriage");
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
  public class OccupyAction_b0a_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_b0a_9(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != MajorsTriageNurse.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (ImAt(concreteTarget)) {
        concreteTarget.setOccupier(MajorsTriageNurse.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class OrderAction_c0a_9 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0a_9(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(MajorsTriageNurse.this));
    }
  }
  public class StayAction_d0a_9 extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0a_9(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 5;
    }
  }
  public class OrderAction_e0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_e0a_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")));
    }
  }
  public class SendSignalAction_f0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_f0a_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new PatientWaitingForDoctorSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }


  public void InitTriagePatient(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a_11(behaviourBuilder));
    plstSteps.add(new OccupyAction_b0a_7(behaviourBuilder));
    plstSteps.add(new OrderAction_c0a_7(behaviourBuilder));
    plstSteps.add(new StayAction_d0a_7(behaviourBuilder));
    plstSteps.add(new OrderAction_e0a_3(behaviourBuilder));
    plstSteps.add(new SendSignalAction_f0a_3(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}