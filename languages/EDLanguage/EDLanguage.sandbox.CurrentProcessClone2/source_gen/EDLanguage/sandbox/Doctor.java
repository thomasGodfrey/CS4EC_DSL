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
import simcore.agents.Actor;

public class Doctor extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Behaviour behaviourBuilder;

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 1;
  }

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "NewPatientNeedMedicine":
        behaviourBuilder = new Behaviour("NewPatientNeedMedicine");
        this.InitInitialObsevations(s);
        break;
      case "PatientNeedsFinalConsutlation":
        behaviourBuilder = new Behaviour("PatientNeedsFinalConsutlation");
        this.InitGiveConsultation(s);
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
      target = DoctorOffice.getInstance();
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
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != Doctor.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (concreteTarget != null && ImAt(concreteTarget)) {
        concreteTarget.setOccupier(Doctor.this);
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

      p.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
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
      return timeExecuted == 300;
    }
  }
  public class SendSignalAction_e0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new XRaySignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));
      sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class MoveAction_a0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0a_1(Behaviour behaviour) {
      target = DoctorOffice.getInstance();
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
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != Doctor.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (concreteTarget != null && ImAt(concreteTarget)) {
        concreteTarget.setOccupier(Doctor.this);
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

      p.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
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
      return timeExecuted == 300;
    }
  }
  public class SendSignalAction_e0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_e0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new XRaySignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));
      sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class MoveAction_a0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b(Behaviour behaviour) {
      target = DoctorOffice.getInstance();
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
  public class OccupyAction_b0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_b0b(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != Doctor.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (concreteTarget != null && ImAt(concreteTarget)) {
        concreteTarget.setOccupier(Doctor.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class OrderAction_c0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class StayAction_d0b extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 1200;
    }
  }
  public class DischargeAction_e0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public DischargeAction_e0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      ArrayList<Actor> plstAssignedStaff = (ArrayList) p.getMyAssignedStaff();
      for (Actor actor : plstAssignedStaff) {
        ((Actor) actor).deAssignPatient(p);
      }

      p.setDischarged();
    }
  }
  public class OrderAction_f0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_f0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")));
    }
  }
  public class MoveAction_a0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Object target;
    /*package*/ Object concreteTarget;
    public MoveAction_a0b_1(Behaviour behaviour) {
      target = DoctorOffice.getInstance();
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
  public class OccupyAction_b0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ Class target;
    /*package*/ Occupiable concreteTarget;
    public OccupyAction_b0b_1(Behaviour behaviour) {
      target = Desk.class;
      this.behaviour = behaviour;
    }

    public void execute() {
      if (concreteTarget == null) {
        concreteTarget = SelectOccupiable(curInside, target);
      } else if (concreteTarget.getOccupier() != null && concreteTarget.getOccupier() != Doctor.this) {
        FindAnOccupiable(target);
      }


      MoveTowards(concreteTarget);
    }

    public boolean finishCondition() {
      if (concreteTarget != null && ImAt(concreteTarget)) {
        concreteTarget.setOccupier(Doctor.this);
        return true;
      } else {
        return false;
      }
    }
  }
  public class OrderAction_c0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_c0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(Doctor.this));
    }
  }
  public class StayAction_d0b_1 extends PassiveBehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 1200;
    }
  }
  public class DischargeAction_e0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public DischargeAction_e0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      ArrayList<Actor> plstAssignedStaff = (ArrayList) p.getMyAssignedStaff();
      for (Actor actor : plstAssignedStaff) {
        ((Actor) actor).deAssignPatient(p);
      }

      p.setDischarged();
    }
  }
  public class OrderAction_f0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_f0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")));
    }
  }


  public void InitInitialObsevations(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0a(behaviourBuilder));
    plstSteps.add(new OccupyAction_b0a(behaviourBuilder));
    plstSteps.add(new OrderAction_c0a(behaviourBuilder));
    plstSteps.add(new StayAction_d0a(behaviourBuilder));
    plstSteps.add(new SendSignalAction_e0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitGiveConsultation(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new MoveAction_a0b(behaviourBuilder));
    plstSteps.add(new OccupyAction_b0b(behaviourBuilder));
    plstSteps.add(new OrderAction_c0b(behaviourBuilder));
    plstSteps.add(new StayAction_d0b(behaviourBuilder));
    plstSteps.add(new DischargeAction_e0b(behaviourBuilder));
    plstSteps.add(new OrderAction_f0b(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}