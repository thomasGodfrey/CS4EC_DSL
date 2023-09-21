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

public class patientGenerator_0 extends AgentGenerator {
  public patientGenerator_0(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
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

    sendSignalTemp.setName("PatientArrivesTrigger_e");
    sendSignalTemp.AddData("patient", a);
    sendSignalTemp.AddActor("Nurse");


    // For each agent attribute
    // For each attribute value option
    // Assign the value based on probability function
    double rndDouble = RandomHelper.nextDouble();

    this.generateAttribute_a(a);
    this.generateAttribute_b(a);

    b.PushMission(sendSignalTemp);

    return a;
  }

  public void generateAttribute_a(patient agent) {
    double rndDouble = RandomHelper.nextDouble();

    double runningTotal = 0;

    runningTotal = (RunEnvironment.getInstance().getParameters().getDouble("patientCohortcohortpatientCohort"));
    if (rndDouble < (runningTotal / 100)) {
      agent.cohort = "patientCohort";
      return;
    }

  }
  public void generateAttribute_b(patient agent) {
    double rndDouble = RandomHelper.nextDouble();

    double runningTotal = 0;

    runningTotal = (RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusAsymptomatic"));
    if (rndDouble < (runningTotal / 100)) {
      agent.COVIDInfectionStatus = "Asymptomatic";
      return;
    }
    if (rndDouble < ((RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusSymptomatic") + runningTotal) / 100)) {
      agent.COVIDInfectionStatus = "Symptomatic";
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusSymptomatic");
      return;
    } else {
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusSymptomatic");
    }
    if (rndDouble < ((RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusSusceptible") + runningTotal) / 100)) {
      agent.COVIDInfectionStatus = "Susceptible";
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusSusceptible");
      return;
    } else {
      runningTotal += RunEnvironment.getInstance().getParameters().getDouble("patientCohortCOVIDInfectionStatusSusceptible");
    }

  }

  public void initialiseArrivalMap() {
    ArrivalPerHour = new HashMap<Integer, Integer>();
    ArrivalPerHour.put(1, 5);
    ArrivalPerHour.put(2, 8);
    ArrivalPerHour.put(3, 8);
    ArrivalPerHour.put(4, 4);
    ArrivalPerHour.put(5, 4);
    ArrivalPerHour.put(6, 9);
    ArrivalPerHour.put(7, 3);
    ArrivalPerHour.put(8, 3);
    ArrivalPerHour.put(9, 6);
    ArrivalPerHour.put(10, 13);
    ArrivalPerHour.put(11, 13);
    ArrivalPerHour.put(12, 16);
    ArrivalPerHour.put(13, 16);
    ArrivalPerHour.put(14, 18);
    ArrivalPerHour.put(15, 19);
    ArrivalPerHour.put(16, 20);
    ArrivalPerHour.put(17, 18);
    ArrivalPerHour.put(18, 16);
    ArrivalPerHour.put(19, 11);
    ArrivalPerHour.put(20, 9);
    ArrivalPerHour.put(21, 10);
    ArrivalPerHour.put(22, 9);
    ArrivalPerHour.put(23, 13);
    ArrivalPerHour.put(24, 4);



  }
}