package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.Action;
import simcore.action.ActionStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.StayForConditionAction;
import simcore.action.basicAction.conditions.SpaceatCondition;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.conditions.PossibilityCondition;
import simcore.action.ConsequenceStep;
import simcore.action.Consequence;
import simcore.action.basicAction.OrderAction;
import simcore.agents.Patient;
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.basicAction.SendSignalAction;

public class ENP extends Staff {

  public double Happiness = Double.parseDouble("" + "0");
  public double groupStress = Double.parseDouble("" + "0");

  public ENP(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
  }


  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "NewPatientGotoENPSignal":
        curMission = new Action("Inspect");
        this.InitInspect(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitInspect(Signal s) {
    System.out.println("Inspect" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("move to pre-diagnostic area").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("preDiagnosticArea"))));
    StayForConditionAction sa = new StayForConditionAction();
    sa.WithCondition(new SpaceatCondition().WithSubject(s.GetData("patient")).WithTarget(ReadMap().FindPlace("preDiagnosticArea")));
    curMission.WithStep(new ActionStep().WithName("wait until patient arrive").WithAction(sa));
    curMission.WithStep(new ActionStep().WithName("inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(10)));
    if (CheckCondition(new PossibilityCondition().WithPossibility(30))) {
      this.InitLetPatientLeave(s);
    } else {
      if (CheckCondition(new PossibilityCondition().WithPossibility(30))) {
        this.InitTakeMedicineForPatient(s);
      } else {
        this.InitSendPatientToDoctor(s);
      }
    }

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("Happiness", "+=", 1)));
  }
  public void InitSendPatientToDoctor(Signal s) {
    System.out.println("SendPatientToDoctor" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("let patient go to diagnostic room").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("diagnostic room 1")))));
    sendSignalTemp = new NewPatientGotoOfficeSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    sendSignalTemp.AddData("destination", ReadMap().FindPlace("diagnostic room 1"));
    curMission.WithStep(new ActionStep().WithName("tell doctor patient will arrive").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitTakeMedicineForPatient(Signal s) {
    System.out.println("TakeMedicineForPatient" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("waitingArea")))));
    sendSignalTemp = new NewPatientNeedMedicineSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("tell nurse patient need medicine").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitLetPatientLeave(Signal s) {
    System.out.println("LetPatientLeave" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("let patient leave").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("exit")))));

  }

}
