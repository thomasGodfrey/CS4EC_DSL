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
import simcore.action.basicAction.SendSignalAction;

public class testingDevice extends Staff {

  public double groupStress = Double.parseDouble("" + "0");

  public testingDevice(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public testingDevice(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "StartPatientTest":
        curMission = new Action("TestPatient");
        this.InitTestPatient(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitTestPatient(Signal s) {
    System.out.println("TestPatient" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(600)));
    if (CheckCondition(new TestResultCondition().WithTest(INOVA.getInstance()).WithPatient((Patient) s.GetData("patient")))) {
      sendSignalTemp = new PatientTestPositiveSignal();
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    } else {
      sendSignalTemp = new PatientTestNegativeSignal();
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    }

  }

}