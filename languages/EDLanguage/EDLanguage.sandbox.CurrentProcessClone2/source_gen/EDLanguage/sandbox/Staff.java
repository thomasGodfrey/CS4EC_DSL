package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.agents.Actor;
import simcore.action.Behaviour;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.BehaviourStep;
import simcore.agents.Patient;
import java.util.ArrayList;
import simcore.Signals.Orders.MoveToOrder;

public class Staff extends Actor {

  public double groupStress = Double.parseDouble("" + "0");
  public Behaviour behaviourBuilder;

  public Staff(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public Staff(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }

  public class DischargeAction_a0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public DischargeAction_a0a(Behaviour behaviour) {
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
  public class OrderAction_b0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")));
    }
  }
  public class DischargeAction_a0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public DischargeAction_a0a_1(Behaviour behaviour) {
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
  public class OrderAction_b0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    public OrderAction_b0a_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Patient p = behaviour.getPatient();

      p.TakeOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")));
    }
  }



}
