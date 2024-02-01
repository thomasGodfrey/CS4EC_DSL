package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.AgentGenerator;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import repast.simphony.context.Context;
import repast.simphony.engine.schedule.ScheduledMethod;
import simcore.basicStructures.Board;
import simcore.basicStructures.ToolBox;
import simcore.Signals.Signal;
import simcore.Signals.ActorTypeSignal;
import repast.simphony.random.RandomHelper;
import repast.simphony.engine.environment.RunEnvironment;
import java.util.HashMap;

public class patientGenerator_1 extends AgentGenerator {
  public patientGenerator_1(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    spawnRoomType = MainEntrance.getInstance();
    initialiseArrivalMap();
  }

  @ScheduledMethod(start = 1, interval = 1)
  public void step() {
    tick();
  }

  public Object onGenerate() {
    patient a = new patient(space, grid, context);
    Board b = new ToolBox(this).ReadBoard();

    Signal sendSignalTemp = new ActorTypeSignal();

    sendSignalTemp.setName("PatientArrivesTrigger_m");
    sendSignalTemp.AddData("patient", a);
    sendSignalTemp.AddActor("TriageNurse");


    // For each agent attribute
    // For each attribute value option
    // Assign the value based on probability function
    double rndDouble = RandomHelper.nextDouble();

    this.generateAttribute_a_0(a);
    this.generateAttribute_b_0(a);
    this.generateAttribute_c_0(a);

    b.PushMission(sendSignalTemp);

    return a;
  }

  public void generateAttribute_a_0(patient agent) {
    double rndDouble = RandomHelper.nextDouble();

    double runningTotal = 0;

    runningTotal = (RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientscohortStrepAPatients"));
    if (rndDouble < (runningTotal / 100)) {
      agent.cohort = "StrepAPatients";
      return;
    }

  }
  public void generateAttribute_b_0(patient agent) {
    double rndDouble = RandomHelper.nextDouble();

    double runningTotal = 0;

    runningTotal = (RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusSusceptible"));
    if (rndDouble < (runningTotal / 100)) {
      agent.StrepAInfectionStatus = "Susceptible";
      return;
    }
    if (rndDouble < ((RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusAsymptomatic") + runningTotal) / 100)) {
      agent.StrepAInfectionStatus = "Asymptomatic";
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusAsymptomatic");
      return;
    } else {
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusAsymptomatic");
    }
    if (rndDouble < ((RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusSymptomatic") + runningTotal) / 100)) {
      agent.StrepAInfectionStatus = "Symptomatic";
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusSymptomatic");
      return;
    } else {
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsStrepAInfectionStatusSymptomatic");
    }

  }
  public void generateAttribute_c_0(patient agent) {
    double rndDouble = RandomHelper.nextDouble();

    double runningTotal = 0;

    runningTotal = (RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritymoderate"));
    if (rndDouble < (runningTotal / 100)) {
      agent.Severity = "moderate";
      return;
    }
    if (rndDouble < ((RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritysevere") + runningTotal) / 100)) {
      agent.Severity = "severe";
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritysevere");
      return;
    } else {
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritysevere");
    }
    if (rndDouble < ((RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritylow") + runningTotal) / 100)) {
      agent.Severity = "low";
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritylow");
      return;
    } else {
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("StrepAPatientsSeveritylow");
    }

  }

  public void initialiseArrivalMap() {
    ArrivalPerHour = new HashMap<Integer, Integer>();
    ArrivalPerHour.put(1, 0);
    ArrivalPerHour.put(2, 0);
    ArrivalPerHour.put(3, 0);
    ArrivalPerHour.put(4, 0);
    ArrivalPerHour.put(5, 0);
    ArrivalPerHour.put(6, 0);
    ArrivalPerHour.put(7, 3);
    ArrivalPerHour.put(8, 3);
    ArrivalPerHour.put(9, 3);
    ArrivalPerHour.put(10, 3);
    ArrivalPerHour.put(11, 3);
    ArrivalPerHour.put(12, 3);
    ArrivalPerHour.put(13, 4);
    ArrivalPerHour.put(14, 4);
    ArrivalPerHour.put(15, 5);
    ArrivalPerHour.put(16, 4);
    ArrivalPerHour.put(17, 5);
    ArrivalPerHour.put(18, 4);
    ArrivalPerHour.put(19, 0);
    ArrivalPerHour.put(20, 0);
    ArrivalPerHour.put(21, 0);
    ArrivalPerHour.put(22, 0);
    ArrivalPerHour.put(23, 0);
    ArrivalPerHour.put(24, 0);



  }
}
