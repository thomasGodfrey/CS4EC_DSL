package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.Action;
import simcore.action.ActionStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.conditions.InfectionCondition;
import simcore.agents.Patient;
import simcore.diagnosis.InfectionStatus;
import simcore.Signals.DirectSignal;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.OccupyAction;
import simcore.basicStructures.Desk;
import simcore.action.basicAction.conditions.PossibilityCondition;
import simcore.action.basicAction.AdmitAction;
import simcore.basicStructures.AdmissionBays;
import simcore.action.basicAction.OrderAction;
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.basicAction.DischargeAction;

public class MajorsABDoctor extends Staff {

  public double groupStress = Double.parseDouble("" + "0");

  public MajorsABDoctor(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 2;
  }

  public MajorsABDoctor(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForMajorsABDoctor":
        curMission = new Action("SeePatient");
        this.InitSeePatient(s);
        break;
      case "LFDPositive":
        curMission = new Action("PatientPositive");
        this.InitPatientPositive(s);
        break;
      case "LFDNegative":
        curMission = new Action("PatientNegative");
        this.InitPatientNegative(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitSeePatient(Signal s) {
    System.out.println("SeePatient" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    curMission.WithStep(new ActionStep().WithName("Inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(120)));
    if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Asymptomatic))) {
      curMission.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(60)));
      sendSignalTemp = new ConductLFDSignal();
      if (sendSignalTemp instanceof DirectSignal) {
        ((DirectSignal) sendSignalTemp).setTarget();
      }
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      sendSignalTemp.AddData("replyTo", this);
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    } else {
      if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Symptomatic))) {
        curMission.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(60)));
        sendSignalTemp = new ConductLFDSignal();
        if (sendSignalTemp instanceof DirectSignal) {
          ((DirectSignal) sendSignalTemp).setTarget();
        }
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        sendSignalTemp.AddData("replyTo", this);
        curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Susceptible))) {
          curMission.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(60)));
          sendSignalTemp = new ConductLFDSignal();
          if (sendSignalTemp instanceof DirectSignal) {
            ((DirectSignal) sendSignalTemp).setTarget();
          }
          sendSignalTemp.AddData("patient", s.GetData("patient"));
          sendSignalTemp.AddData("replyTo", this);
          curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
        } else {
        }
      }
    }
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitPatientPositive(Signal s) {
    System.out.println("PatientPositive" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    if (CheckCondition(new PossibilityCondition().WithPossibility(50))) {
      this.InitDischargePatient(s);
    } else {
      curMission.WithStep(new ActionStep().WithName("").WithAction(new AdmitAction().WithPatient(((Patient) s.GetData("patient"))).WithAdmissionBay(AdmissionBays.RED)));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Exit")))));
    }
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitPatientNegative(Signal s) {
    System.out.println("PatientNegative" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    if (CheckCondition(new PossibilityCondition().WithPossibility(50))) {
      this.InitDischargePatient(s);
    } else {
      curMission.WithStep(new ActionStep().WithName("").WithAction(new AdmitAction().WithPatient(((Patient) s.GetData("patient"))).WithAdmissionBay(AdmissionBays.AMBER)));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Exit")))));
    }
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsABReception"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));

  }
  public void InitDischargePatient(Signal s) {
    System.out.println("DischargePatient" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }

}
