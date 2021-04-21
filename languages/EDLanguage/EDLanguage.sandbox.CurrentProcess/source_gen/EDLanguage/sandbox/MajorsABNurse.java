package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.action.Action;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
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
import simcore.action.basicAction.StayForConditionAction;
import simcore.action.basicAction.conditions.BedAvailableCondition;
import simcore.basicStructures.Room;
import simcore.Signals.Orders.MoveToOrder;
import simcore.basicStructures.Bed;
import simcore.action.basicAction.AdmitAction;
import simcore.action.basicAction.DischargeAction;

public class MajorsABNurse extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Action actionBuilder;

  public MajorsABNurse(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 1;
  }

  public MajorsABNurse(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Action BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForMajorsAB":
        actionBuilder = new Action("EscortPatientToMajorsAB");
        this.InitEscortPatientToMajorsAB(s);
        break;
      case "AdmitPatient":
        actionBuilder = new Action("AdmitPatient");
        this.InitAdmitPatient(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return actionBuilder;
    }
    return actionBuilder;
  }

  public void InitEscortPatientToMajorsAB(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("TriageWaitingRoom"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new FollowOrder().WithTarget(this))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(MajorsABBay.getInstance())));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new StopOrder())));
    sendSignalTemp = new PatientWaitingForMajorsABDoctorSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitAdmitPatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    StayForConditionAction sa = new StayForConditionAction();
    sa.WithCondition(new BedAvailableCondition().WithPatient((Patient) s.GetData("patient")).WithTargetWard((Room) s.GetData("targetWard")));
    actionBuilder.WithStep(new ActionStep().WithName("Wait until a bed is available").WithAction(sa));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(s.GetData("targetWard")).WithOccupiable(Bed.class))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new AdmitAction().WithPatient(((Patient) s.GetData("patient"))).WithAdmissionBay((Room) s.GetData("targetWard"))));

  }
  public void InitDischargePatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }

}
