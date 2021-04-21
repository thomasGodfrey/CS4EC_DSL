package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.action.Action;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.ActionStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.conditions.PossibilityCondition;
import simcore.action.basicAction.conditions.InfectionCondition;
import simcore.agents.Patient;
import simcore.diagnosis.InfectionStatus;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.OccupyAction;
import simcore.basicStructures.Desk;
import simcore.action.basicAction.conditions.ResultCondition;
import simcore.action.basicAction.conditions.SuitableForSideRoomCondition;
import simcore.basicStructures.Room;
import simcore.action.basicAction.DischargeAction;
import simcore.action.basicAction.OrderAction;
import simcore.Signals.Orders.MoveToOrder;

public class MajorsABDoctor extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Action actionBuilder;

  public MajorsABDoctor(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 2;
  }

  public MajorsABDoctor(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Action BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForMajorsABDoctor":
        actionBuilder = new Action("SeePatient");
        this.InitSeePatient(s);
        break;
      case "LFDComplete":
        actionBuilder = new Action("LFDCompleted");
        this.InitLFDCompleted(s);
        break;
      case "LIATComplete":
        actionBuilder = new Action("LIATResult");
        this.InitLIATResult(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return actionBuilder;
    }
    return actionBuilder;
  }

  public void InitSeePatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    actionBuilder.WithStep(new ActionStep().WithName("Inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    actionBuilder.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(120)));
    if (CheckCondition(new PossibilityCondition().WithPossibility(50))) {
      if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Symptomatic))) {
        sendSignalTemp = new ConductLIATSignal();
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        sendSignalTemp.AddData("replyTo", this);
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        sendSignalTemp = new ConductLFDSignal();
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        sendSignalTemp.AddData("replyTo", this);
        actionBuilder.WithStep(new ActionStep().WithName("50% chance of patient in MajorsC being admitted. If COVID suspected, then LIAT, else LFD").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      }
    } else {
      this.InitDischargePatient(s);
    }
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitLFDCompleted(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    actionBuilder.WithStep(new ActionStep().WithName("Consult with patient on LFT result").WithAction(new StayForTimeAction().WithTimeSpan(180)));
    if (CheckCondition(new ResultCondition().WithPatient((Patient) s.GetData("patient")).WithTest(SURESCREEN.getInstance()).WithResult(true))) {
      actionBuilder.WithStep(new ActionStep().WithName("Take a LIAT swab").WithAction(new StayForTimeAction().WithTimeSpan(120)));
      actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(LIATBooth.getInstance())));
      sendSignalTemp = new ConductLIATSignal();
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      sendSignalTemp.AddData("replyTo", this);
      actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    } else {
      sendSignalTemp = new AdmitPatientSignal();
      sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("AmberBay"));
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    }
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitLIATResult(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(LIATBooth.getInstance())));
    actionBuilder.WithStep(new ActionStep().WithName("Collect the sample").WithAction(new StayForTimeAction().WithTimeSpan(60)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    if (CheckCondition(new ResultCondition().WithPatient((Patient) s.GetData("patient")).WithTest(LIAT.getInstance()).WithResult(true))) {
      if (CheckCondition(new SuitableForSideRoomCondition().WithPatient((Patient) s.GetData("patient")).WithAlternativeBay((Room) ReadMap().FindPlace("RedBay")))) {
        sendSignalTemp = new AdmitPatientSignal();
        sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("SideRoom"));
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        sendSignalTemp = new AdmitPatientSignal();
        sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("RedBay"));
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      }
    } else {
      if (CheckCondition(new SuitableForSideRoomCondition().WithPatient((Patient) s.GetData("patient")).WithAlternativeBay((Room) ReadMap().FindPlace("AmberBay")))) {
        sendSignalTemp = new AdmitPatientSignal();
        sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("SideRoom"));
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        sendSignalTemp = new AdmitPatientSignal();
        sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("AmberBay"));
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      }
    }
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitDischargePatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }

}
