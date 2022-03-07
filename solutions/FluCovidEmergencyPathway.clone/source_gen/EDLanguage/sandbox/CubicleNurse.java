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
import simcore.action.InstantBehaviourStep;
import java.util.ArrayList;

public class CubicleNurse extends Actor {

  public Behaviour behaviourBuilder;

  public CubicleNurse(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 1;
  }

  public CubicleNurse(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  protected Signal selectSignal(List<Signal> plstSignals) {
    if (!(plstSignals.isEmpty())) {
      if (plstSignals.stream().filter(new Predicate<Signal>() {
        public boolean test(Signal s) {
          return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(CubicleNurse.this, s.GetData("patient")) != null;
        }
      }).findFirst().orElse(null) != null) {
        return plstSignals.stream().filter(new Predicate<Signal>() {
          public boolean test(Signal s) {
            return ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(CubicleNurse.this, s.GetData("patient")) != null;
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
      case "onTrigger_e":
        behaviourBuilder = new Behaviour("onTrigger_e");
        this.Initon_e(s);
        break;
      case "ewTrigger_f":
        behaviourBuilder = new Behaviour("ewTrigger_f");
        this.Initew_f(s);
        break;
      case "deTrigger_g":
        behaviourBuilder = new Behaviour("deTrigger_g");
        this.Initde_g(s);
        break;
      case "rfqTrigger_a":
        behaviourBuilder = new Behaviour("rfqTrigger_a");
        this.Initrfq_a(s);
        break;
      case "ESaaTrigger_a":
        behaviourBuilder = new Behaviour("ESaaTrigger_a");
        this.InitESaa_b(s);
        break;
      case "PatientArrivesTrigger_h":
        behaviourBuilder = new Behaviour("PatientArrivesTrigger_h");
        this.InitPatientArrives_h(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }



  public class StayAction_a0a_3 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0a_3(Behaviour behaviour) {
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
  public class SendSignalAction_b0a_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new fewfvTrigger_iSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0a extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0a(Behaviour behaviour) {
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
  public class StayAction_a0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0a_5(Behaviour behaviour) {
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
  public class SendSignalAction_b0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0a_5(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new fewfvTrigger_iSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0a_5 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0a_5(Behaviour behaviour) {
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
  public class StayAction_a0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 4;
    }
  }
  public class SendSignalAction_b0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new deTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_c0b extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_c0b(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new fweTrigger_hSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_d0b extends BehaviourStep {
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
      return timeExecuted == 1;
    }
  }
  public class StayAction_a0b_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0b_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 4;
    }
  }
  public class SendSignalAction_b0b_7 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0b_7(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new deTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_c0b_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_c0b_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new fweTrigger_hSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_d0b_1 extends BehaviourStep {
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
      return timeExecuted == 1;
    }
  }
  public class StayAction_a0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0c(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 4;
    }
  }
  public class StayAction_b0c extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0c(Behaviour behaviour) {
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
  public class StayAction_a0c_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0c_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 4;
    }
  }
  public class StayAction_b0c_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0c_1(Behaviour behaviour) {
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
  public class StayAction_a0d extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0d(Behaviour behaviour) {
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
  public class SendSignalAction_b0d extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0d(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new TakeabedTrigger_aSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0d extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0d(Behaviour behaviour) {
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
  public class StayAction_a0d_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0d_1(Behaviour behaviour) {
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
  public class SendSignalAction_b0d_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0d_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new TakeabedTrigger_aSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_c0d_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_c0d_1(Behaviour behaviour) {
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
  public class StayAction_a0e extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0e(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 21;
    }
  }
  public class SendSignalAction_b0e extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0e(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new wevweTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_c0e extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_c0e(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new wefvvescTrigger_fSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_d0e extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0e(Behaviour behaviour) {
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
  public class StayAction_a0e_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_a0e_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      // Do nothing 
      timeExecuted++;
    }

    public boolean finishCondition() {
      return timeExecuted == 21;
    }
  }
  public class SendSignalAction_b0e_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_b0e_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new wevweTrigger_gSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_c0e_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_c0e_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new wefvvescTrigger_fSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_d0e_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_d0e_1(Behaviour behaviour) {
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
  public class Choice_a0f extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0f(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (((patient) behaviour.getSignalTrigger().GetData("patient")).RecentCovidContact == "Yes") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a0f(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class StayAction_b0f extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0f(Behaviour behaviour) {
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
  public class Choice_a0f_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0f_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (((patient) behaviour.getSignalTrigger().GetData("patient")).RecentCovidContact == "Yes") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new SendSignalAction_a0a0f(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class SendSignalAction_a0a0f extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a0f(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ESaaTrigger_aSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class SendSignalAction_a0a0f_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;

    public SendSignalAction_a0a0f_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      Board b = ReadBoard();
      Signal sendSignalTemp = new Signal();
      sendSignalTemp = new ESaaTrigger_aSignal();
      sendSignalTemp.AddData("patient", behaviour.getSignalTrigger().GetData("patient"));

      b.PushMission(sendSignalTemp);
    }
  }
  public class StayAction_b0f_1 extends BehaviourStep {
    /*package*/ Behaviour behaviour;
    /*package*/ int timeExecuted = 0;
    public StayAction_b0f_1(Behaviour behaviour) {
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


  public void Initon_e(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0a_3(behaviourBuilder));
    plstSteps.add(new SendSignalAction_b0a_1(behaviourBuilder));
    plstSteps.add(new StayAction_c0a(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void Initew_f(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0b(behaviourBuilder));
    plstSteps.add(new SendSignalAction_b0b(behaviourBuilder));
    plstSteps.add(new SendSignalAction_c0b(behaviourBuilder));
    plstSteps.add(new StayAction_d0b(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void Initde_g(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0c(behaviourBuilder));
    plstSteps.add(new StayAction_b0c(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void Initrfq_a(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0d(behaviourBuilder));
    plstSteps.add(new SendSignalAction_b0d(behaviourBuilder));
    plstSteps.add(new StayAction_c0d(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitESaa_b(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new StayAction_a0e(behaviourBuilder));
    plstSteps.add(new SendSignalAction_b0e(behaviourBuilder));
    plstSteps.add(new SendSignalAction_c0e(behaviourBuilder));
    plstSteps.add(new StayAction_d0e(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }
  public void InitPatientArrives_h(Signal s) {
    behaviourBuilder.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new Choice_a0f(behaviourBuilder));
    plstSteps.add(new StayAction_b0f(behaviourBuilder));
    behaviourBuilder.setSteps(plstSteps);

    Signal sendSignalTemp = new Signal();

  }

}
