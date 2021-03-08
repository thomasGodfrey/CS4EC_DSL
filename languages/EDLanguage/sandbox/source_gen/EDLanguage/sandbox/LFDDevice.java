package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.Action;
import simcore.action.ActionStep;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.conditions.TestResultCondition;
import simcore.agents.Patient;
import simcore.Signals.DirectSignal;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.DischargeAction;
import simcore.action.basicAction.OrderAction;
import simcore.Signals.Orders.MoveToOrder;

public class LFDDevice extends Staff {

  public double groupStress = Double.parseDouble("" + "0");

  public LFDDevice(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public LFDDevice(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "ConductLFD":
        curMission = new Action("TestPatient");
        this.InitTestPatient(s);
        break;
      case "ConductTrackAndTraceLFD":
        curMission = new Action("TestPatientTrackAndTrace");
        this.InitTestPatientTrackAndTrace(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitTestPatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(1800)));
    if (CheckCondition(new TestResultCondition().WithTest(INOVA.getInstance()).WithPatient((Patient) s.GetData("patient")))) {
      sendSignalTemp = new LFDPositiveSignal();
      ((DirectSignal) sendSignalTemp).setTarget(s.GetData("replyTo"));
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    } else {
      sendSignalTemp = new LFDNegativeSignal();
      ((DirectSignal) sendSignalTemp).setTarget(s.GetData("replyTo"));
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    }

  }
  public void InitTestPatientTrackAndTrace(Signal s) {

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(1800)));
    if (CheckCondition(new TestResultCondition().WithTest(INOVA.getInstance()).WithPatient((Patient) s.GetData("patient")))) {
      sendSignalTemp = new LFDTrackAndTraceSignal();
      ((DirectSignal) sendSignalTemp).setTarget(s.GetData("replyTo"));
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    } else {
      sendSignalTemp = new LFDTrackAndTraceSignal();
      ((DirectSignal) sendSignalTemp).setTarget(s.GetData("replyTo"));
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    }

  }
  public void InitDischargePatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }

}
