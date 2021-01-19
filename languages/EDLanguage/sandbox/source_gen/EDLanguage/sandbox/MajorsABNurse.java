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
import simcore.Signals.Orders.FollowOrder;
import simcore.action.basicAction.OccupyAction;
import simcore.basicStructures.Desk;
import simcore.action.basicAction.StayForTimeAction;
import simcore.Signals.Orders.StopOrder;
import simcore.action.basicAction.SendSignalAction;

public class MajorsABNurse extends Staff {

  public double groupStress = Double.parseDouble("" + "0");

  public MajorsABNurse(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public MajorsABNurse(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForMajorsAB":
        curMission = new Action("EscortPatientToMajorsAB");
        this.InitEscortPatientToMajorsAB(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitEscortPatientToMajorsAB(Signal s) {
    System.out.println("EscortPatientToMajorsAB" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("TriageWaitingRoom"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new FollowOrder().WithTarget(this))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(MajorsABBay.getInstance())));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(120)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new StopOrder())));
    sendSignalTemp = new PatientWaitingForMajorsABDoctorSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }

}
