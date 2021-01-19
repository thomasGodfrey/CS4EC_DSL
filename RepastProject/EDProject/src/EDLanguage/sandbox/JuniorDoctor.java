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
import simcore.action.basicAction.conditions.InfectionCondition;
import simcore.diagnosis.InfectionStatus;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.ConsequenceStep;
import simcore.action.Consequence;
import simcore.action.basicAction.DischargeAction;
import simcore.action.basicAction.conditions.PossibilityCondition;

public class JuniorDoctor extends Doctor {

  public double stress = Double.parseDouble("" + "1");
  public double mistakes = Double.parseDouble("" + "0");
  public double positivePatientsSeen = Double.parseDouble("" + "0");
  public double NegativePatientsSeen = Double.parseDouble("" + "0");
  public double groupStress = Double.parseDouble("" + "0");

  public JuniorDoctor(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
    mintMyMaxPatients = 0;
  }

  public JuniorDoctor(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  public void SetMission(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      case "PatientWaitingForDoctor":
        curMission = new Action("CallPatientOver");
        this.InitCallPatientOver(s);
        break;
      case "PatientTestPositive":
        curMission = new Action("TreatPositivePatient");
        this.InitTreatPositivePatient(s);
        break;
      case "PatientTestNegative":
        curMission = new Action("TreatNegativePatient");
        this.InitTreatNegativePatient(s);
        break;
      case "PatientNeedsFinalConsultation":
        curMission = new Action("GiveFinalConsultation");
        this.InitGiveFinalConsultation(s);
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return;
    }
    curActionStep = 0;
  }

  public void InitDoSomething(Signal s) {
    System.out.println("DoSomething" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(this)));

  }
  public void InitDoOtherThings(Signal s) {
    System.out.println("DoOtherThings" + " function called");

    Signal sendSignalTemp = new Signal();

    this.InitDoSomething(s);

  }
  public void InitCallPatientOver(Signal s) {
    System.out.println("CallPatientOver" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(DoctorOffice.getInstance())));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    curMission.WithStep(new ActionStep().WithName("Inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Asymptomatic))) {
      curMission.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(120)));
      sendSignalTemp = new StartPatientTestSignal();
      sendSignalTemp.AddData("patient", s.GetData("patient"));
      curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    } else {
      if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Symptomatic))) {
        curMission.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(120)));
        sendSignalTemp = new StartPatientTestSignal();
        sendSignalTemp.AddData("patient", s.GetData("patient"));
        curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
      } else {
        if (CheckCondition(new InfectionCondition().WithPatient((Patient) s.GetData("patient")).WithTest(InfectionStatus.Susceptible))) {
          curMission.WithStep(new ActionStep().WithName("Administer the test").WithAction(new StayForTimeAction().WithTimeSpan(120)));
          sendSignalTemp = new StartPatientTestSignal();
          sendSignalTemp.AddData("patient", s.GetData("patient"));
          curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
        } else {
        }
      }
    }

  }
  public void InitDiagnose(Signal s) {
    System.out.println("Diagnose" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("move to diagnostic room").WithAction(new MoveAction().WithTarget(DoctorOffice.getInstance())));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    sendSignalTemp = new StartPatientTestSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));
    curMission.WithStep(new ActionStep().WithName("inspect the patient").WithAction(new StayForTimeAction().WithTimeSpan(600)));

  }
  public void InitTreatPositivePatient(Signal s) {
    System.out.println("TreatPositivePatient" + " function called");

    Signal sendSignalTemp = new Signal();

    this.InitDecideOnPatientPathway(s);

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("positivePatientsSeen", "+=", 1)));
  }
  public void InitTreatNegativePatient(Signal s) {
    System.out.println("TreatNegativePatient" + " function called");

    Signal sendSignalTemp = new Signal();

    this.InitDecideOnPatientPathway(s);

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("NegativePatientsSeen", "+=", 1)));
  }
  public void InitXRay(Signal s) {
    System.out.println("XRay" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")))));
    sendSignalTemp = new XRaySignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitTakeMedicine(Signal s) {
    System.out.println("TakeMedicine" + " function called");

    Signal sendSignalTemp = new Signal();

    sendSignalTemp = new NewPatientNeedMedicineSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    curMission.WithStep(new ActionStep().WithName("tell nurse to take medicine for patient").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitLetPatientGo(Signal s) {
    System.out.println("LetPatientGo" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new DischargeAction().WithPatient(((Patient) s.GetData("patient")))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }
  public void InitDecideOnPatientPathway(Signal s) {
    System.out.println("DecideOnPatientPathway" + " function called");

    Signal sendSignalTemp = new Signal();

    if (CheckCondition(new PossibilityCondition().WithPossibility(70))) {
      if (CheckCondition(new PossibilityCondition().WithPossibility(50))) {
        this.InitOrderBloodTest(s);
      } else {
        this.InitLetPatientGo(s);
      }
    } else {
      this.InitXRay(s);
    }

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("positivePatientsSeen", "+=", 1)));
    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("stress", "+=", 1)));
  }
  public void InitOrderBloodTest(Signal s) {
    System.out.println("OrderBloodTest" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")))));
    sendSignalTemp = new PatientNeedsBloodTestSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitGiveFinalConsultation(Signal s) {
    System.out.println("GiveFinalConsultation" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(DoctorOffice.getInstance())));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OccupyAction().WithTarget(Desk.class)));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(this))));
    curMission.WithStep(new ActionStep().WithName("The Doctor gives a final consultation with the Patient for 5 minutes").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    this.InitLetPatientGo(s);

  }

}
