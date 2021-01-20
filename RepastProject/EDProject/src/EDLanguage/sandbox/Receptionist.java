package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import simcore.Signals.Signal;
import simcore.action.Action;
import simcore.action.ActionStep;
import simcore.action.basicAction.MoveAction;
import simcore.action.basicAction.OccupyAction;
import simcore.basicStructures.Desk;
import simcore.action.basicAction.OrderAction;
import simcore.agents.Patient;
import simcore.Signals.Orders.MoveToOrder;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.conditions.SeverityCondition;
import simcore.diagnosis.SeverityScore;
import simcore.action.ConsequenceStep;
import simcore.action.Consequence;
import simcore.Signals.DirectSignal;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.DischargeAction;

public class Receptionist extends Staff {

  public double PatientsSeen = Double.parseDouble("" + "0");
  public double groupStress = Double.parseDouble("" + "0");

  public Receptionist(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public Receptionist(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "NewPatientArrive":
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

    curMission.WithStep(new ActionStep().WithName("move to pre-diagnostic area").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("Triage"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    curMission.WithStep(new ActionStep().WithName("inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(180)));
    if (CheckCondition(new SeverityCondition().WithPatient((Patient) s.GetData("patient")).WithSeverityScore(SeverityScore.SEVERE))) {
      this.InitLogPatientForMajorsAB(s);
    } else {
      if (CheckCondition(new SeverityCondition().WithPatient((Patient) s.GetData("patient")).WithSeverityScore(SeverityScore.MODERATE))) {
        this.InitSendPatientToWaitingRoom(s);
      } else {
        this.InitLetPatientLeave(s);
      }
    }

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("PatientsSeen", "+=", 1)));
  }
  public void InitSendPatientToWaitingRoom(Signal s) {
    System.out.println("SendPatientToWaitingRoom" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("TriageWaitingRoom")))));
    sendSignalTemp = new PatientWaitingForMajorsSignal();
    if (sendSignalTemp instanceof DirectSignal) {
      ((DirectSignal) sendSignalTemp).setTarget();
    }
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitLogPatientForMajorsAB(Signal s) {
    System.out.println("LogPatientForMajorsAB" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("TriageWaitingRoom")))));
    sendSignalTemp = new PatientWaitingForMajorsABSignal();
    if (sendSignalTemp instanceof DirectSignal) {
      ((DirectSignal) sendSignalTemp).setTarget();
    }
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitLetPatientLeave(Signal s) {
    System.out.println("LetPatientLeave" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    curMission.WithStep(new ActionStep().WithName("let patient leave").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }

}
