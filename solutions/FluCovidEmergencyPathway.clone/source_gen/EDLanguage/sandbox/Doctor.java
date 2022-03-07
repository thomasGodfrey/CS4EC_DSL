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
import simcore.basicStructures.Board;
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
      case "wefvvescTrigger_f":
        behaviourBuilder = new Behaviour("wefvvescTrigger_f");
        this.Initwefvvesc_f(s);
        break;
      case "wevweTrigger_g":
        behaviourBuilder = new Behaviour("wevweTrigger_g");
        this.Initwevwe_g(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }



  public class StayAction_a0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0a(Behaviour behaviour) {
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
  public class SendSignalAction_b0a_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new wveaeTrigger_cSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 1;
    }
  }
  public class StayAction_a0a_8 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0a_8(Behaviour behaviour) {
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
  public class SendSignalAction_b0a_6 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0a_6(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new wveaeTrigger_cSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0a_6 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0a_6(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 1;
    }
  }
  public class StayAction_a0b_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0b_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 2;
    }
  }
  public class SendSignalAction_b0b_0 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0b_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new avsvewcwTrigger_eSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 1;
    }
  }
  public class StayAction_a0b_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0b_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 2;
    }
  }
  public class SendSignalAction_b0b_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0b_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new avsvewcwTrigger_eSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0b_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0b_3(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 1;
    }
  }


  public void Initwefvvesc_f(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0a(behaviourBuilder));
    plstSteps.add(new SendSignalAction_b0a_0(behaviourBuilder));
    plstSteps.add(new StayAction_c0a_1(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void Initwevwe_g(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0b_0(behaviourBuilder));
    plstSteps.add(new SendSignalAction_b0b_0(behaviourBuilder));
    plstSteps.add(new StayAction_c0b(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}