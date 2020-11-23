package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.Action;
import simcore.action.ActionStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.OrderAction;
import simcore.agents.Patient;
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.SendSignalAction;

public class MajorsTriageNurse extends Staff {

  public double groupStress = Double.parseDouble("" + "0");

  public MajorsTriageNurse(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
  }

  public MajorsTriageNurse(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForMajors":
        curMission = new Action("TriagePatient");
        this.InitTriagePatient(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitTriagePatient(Signal s) {
    System.out.println("TriagePatient" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsTriage"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    curMission.WithStep(new ActionStep().WithName("Triage the patient").WithAction(new StayForTimeAction().WithTimeSpan(180)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")))));
    sendSignalTemp = new PatientWaitingForDoctorSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }

}
