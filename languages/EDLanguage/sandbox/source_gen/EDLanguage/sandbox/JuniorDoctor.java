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
import simcore.action.basicAction.StayForConditionAction;
import simcore.action.basicAction.conditions.SpaceatCondition;
import simcore.action.basicAction.StayForTimeAction;
import simcore.action.basicAction.SendSignalAction;
import simcore.action.basicAction.conditions.PossibilityCondition;
import simcore.action.ConsequenceStep;
import simcore.action.Consequence;
import simcore.action.basicAction.conditions.StateCondition;

public class JuniorDoctor extends Doctor {

  public double stress = Double.parseDouble("" + "1");
  public double mistakes = Double.parseDouble("" + "0");
  public double correctWork = Double.parseDouble("" + "0");
  public double groupStress = Double.parseDouble("" + "0");

  public JuniorDoctor(ContinuousSpace<Object> space, Grid<Object> grid) {
    super(space, grid);
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

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsConsutltationRooms")))));
    this.InitDiagnose(s);

  }
  public void InitDiagnose(Signal s) {
    System.out.println("Diagnose" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("move to diagnostic room").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsConsutltationRooms"))));
    StayForConditionAction sa = new StayForConditionAction();
    sa.WithCondition(new SpaceatCondition().WithSubject(s.GetData("patient")).WithTarget(ReadMap().FindPlace("MajorsConsutltationRooms")));
    curMission.WithStep(new ActionStep().WithName("wait until patient arrive").WithAction(sa));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    curMission.WithStep(new ActionStep().WithName("inspect the patientmake").WithAction(new StayForTimeAction().WithTimeSpan(600)));
    this.InitDecideOnPatientPathway(s);
    curMission.WithStep(new ActionStep().WithName("go back to office in MajorsC").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsConsutltationRooms"))));

  }
  public void InitXRay(Signal s) {
    System.out.println("XRay" + " function called");

    Signal sendSignalTemp = new Signal();

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

    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("Entrance")))));

  }
  public void InitMakeMistake(Signal s) {
    System.out.println("MakeMistake" + " function called");

    Signal sendSignalTemp = new Signal();

    if (CheckCondition(new PossibilityCondition().WithPossibility(70))) {
      if (CheckCondition(new PossibilityCondition().WithPossibility(50))) {
        curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsWaitingRoom")))));
        this.InitOrderBloodTest(s);
      } else {
        this.InitLetPatientGo(s);
      }
    } else {
      this.InitXRay(s);
    }

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("mistakes", "+=", 1)));
    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("stress", "+=", 8)));
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

    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("correctWork", "+=", 1)));
    curMission.WithStep(new ConsequenceStep().WithOrder(new Consequence().WithContent("stress", "+=", 1)));
  }
  public void InitRest(Signal s) {
    System.out.println("Rest" + " function called");

    Signal sendSignalTemp = new Signal();

    if (CheckCondition(new StateCondition().WithContent("stress", ">=", 90))) {
      curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsWaitingRoom"))));
      StayForConditionAction sa = new StayForConditionAction();
      sa.WithCondition(new StateCondition().WithContent("stress", "<=", 10));
      sa.WithConsequence(new Consequence().WithContent("stress", "-=", 10));
      curMission.WithStep(new ActionStep().WithName("").WithAction(sa));
    } else {
    }

  }
  public void InitOrderBloodTest(Signal s) {
    System.out.println("OrderBloodTest" + " function called");

    Signal sendSignalTemp = new Signal();

    sendSignalTemp = new PatientNeedsBloodTestSignal();
    sendSignalTemp.AddData("patient", s.GetData("patient"));
    sendSignalTemp.AddData("returnTo", ReadMap().FindPlace("MajorsWaitingRoom"));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new SendSignalAction().WithSignal(sendSignalTemp)));

  }
  public void InitGiveFinalConsultation(Signal s) {
    System.out.println("GiveFinalConsultation" + " function called");

    Signal sendSignalTemp = new Signal();

    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(ReadMap().FindPlace("MajorsConsutltationRooms"))));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new OrderAction().WithPatient(((Patient) s.GetData("patient"))).WithOrder(new MoveToOrder().WithDestination(ReadMap().FindPlace("MajorsConsutltationRooms")))));
    StayForConditionAction sa = new StayForConditionAction();
    sa.WithCondition(new SpaceatCondition().WithSubject(s.GetData("patient")).WithTarget(ReadMap().FindPlace("MajorsConsutltationRooms")));
    curMission.WithStep(new ActionStep().WithName("").WithAction(sa));
    curMission.WithStep(new ActionStep().WithName("").WithAction(new MoveAction().WithTarget(s.GetData("patient"))));
    curMission.WithStep(new ActionStep().WithName("The Doctor gives a final consultation with the Patient for 5 minutes").WithAction(new StayForTimeAction().WithTimeSpan(300)));
    this.InitLetPatientGo(s);

  }

}
