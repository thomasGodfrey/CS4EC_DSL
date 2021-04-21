package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.action.Action;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.ActionStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.OccupyAction;
import simcore.basicStructures.Desk;
import simcore.action.basicAction.OrderAction;
import simcore.agents.Patient;
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.conditions.PossibilityCondition;
import simcore.action.basicAction.conditions.InfectionCondition;
import simcore.diagnosis.InfectionStatus;
import simcore.action.basicAction.conditions.ResultCondition;
import simcore.action.basicAction.conditions.SuitableForSideRoomCondition;
import simcore.basicStructures.Room;
import simcore.action.basicAction.DischargeAction;

public class Doctor extends Staff {

  public double groupStress = Double.parseDouble("" + "0");
  public Action actionBuilder;

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 3;
  }

  public Doctor(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public Action BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForDoctor":
        actionBuilder = new Action("InitialObsevations");
        this.InitInitialObsevations(s);
        break;
      case "PatientNeedsFinalConsutlation":
        actionBuilder = new Action("GiveConsultation");
        this.InitGiveConsultation(s);
        break;
      case "LIATComplete":
        actionBuilder = new Action("LIATResult");
        this.InitLIATResult(s);
        break;
      case "PCRComplete":
        actionBuilder = new Action("PCRResult");
        this.InitPCRResult(s);
        break;
      case "LIATCompleteTrackAndTrace":
        actionBuilder = new Action("LIATTrackAndTrace");
        this.InitLIATTrackAndTrace(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return actionBuilder;
    }
    return actionBuilder;
  }

  public void InitInitialObsevations(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(DoctorOffice.getInstance())));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    actionBuilder.WithStep(new ActionStep().WithName("Inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    this.InitDecideOnPatientPathway(s);

  }
  public void InitOrderXRay(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")))));
    sendSignalTemp = new XRaySignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitDecideOnPatientPathway(Signal s) {

    Signal sendSignalTemp = new Signal();

    if (CheckCondition(new PossibilityCondition().WithPossibility(70))) {
      this.InitOrderBloodTest(s);
    } else {
      this.InitOrderXRay(s);
    }

  }
  public void InitOrderBloodTest(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")))));
    sendSignalTemp = new PatientNeedsBloodTestSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitGiveConsultation(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(DoctorOffice.getInstance())));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    actionBuilder.WithStep(new ActionStep().WithName("The Doctor gives a final consultation with the Patient for 5 minutes").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    if (CheckCondition(new PossibilityCondition().WithPossibility(18))) {
      if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Symptomatic))) {
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(LIATBooth.getInstance())));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(60)));
        sendSignalTemp = new ConductLIATSignal();
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        sendSignalTemp.AddData("replyTo", this);
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        sendSignalTemp = new AdmitPatientSignal();
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("AmberBay"));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      }
    } else {
      if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Symptomatic))) {
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(LIATBooth.getInstance())));
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(60)));
        sendSignalTemp = new ConductLIATTrackAndTraceSignal();
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        sendSignalTemp.AddData("replyTo", this);
        actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        this.InitDischargePatient(s);
      }
    }

  }
  public void InitLIATResult(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(LIATBooth.getInstance())));
    actionBuilder.WithStep(new ActionStep().WithName("Collect the sample").WithAction(new StayForTimeAction().WithTimeSpan(60)));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    if (CheckCondition(new ResultCondition().WithPatient((Patient) s.GetData("patient")).WithTest(LIAT.getInstance()).WithResult(true))) {
      sendSignalTemp = new AdmitPatientSignal();
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      sendSignalTemp.AddData("targetWard", ReadMap().FindPlace("SideRoom"));
      actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
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

  }
  public void InitPCRResult(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(60)));

  }
  public void InitLIATTrackAndTrace(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(120)));
    this.InitDischargePatient(s);

  }
  public void InitDischargePatient(Signal s) {

    Signal sendSignalTemp = new Signal();

    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    actionBuilder.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }

}
