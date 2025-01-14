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

    sendSignalTemp.setName("PatientArrivesTrigger_m");
    sendSignalTemp.AddData("patient", a);
    sendSignalTemp.AddActor("TriageNurse");


    // For each agent attribute
    // For each attribute value option
    // Assign the value based on probability function
    double rndDouble = RandomHelper.nextDouble();

    this.generateAttribute_a(a);

    b.PushMission(sendSignalTemp);

    return a;
  }

  public void generateAttribute_a(patient agent) {
    double rndDouble = RandomHelper.nextDouble();

    double runningTotal = 0;

    runningTotal = (RunEnvironment.getInstance().getParameters().getDouble("TypicalPatientscohortTypicalPatients"));
    if (rndDouble < (runningTotal / 100)) {
      agent.cohort = "TypicalPatients";
      return;
    }

  }

  public void initialiseArrivalMap() {
    ArrivalPerHour = new HashMap<Integer, Integer>();
    ArrivalPerHour.put(1, 2);
    ArrivalPerHour.put(2, 2);
    ArrivalPerHour.put(3, 2);
    ArrivalPerHour.put(4, 3);
    ArrivalPerHour.put(5, 2);
    ArrivalPerHour.put(6, 2);
    ArrivalPerHour.put(7, 6);
    ArrivalPerHour.put(8, 6);
    ArrivalPerHour.put(9, 6);
    ArrivalPerHour.put(10, 6);
    ArrivalPerHour.put(11, 6);
    ArrivalPerHour.put(12, 6);
    ArrivalPerHour.put(13, 9);
    ArrivalPerHour.put(14, 9);
    ArrivalPerHour.put(15, 9);
    ArrivalPerHour.put(16, 9);
    ArrivalPerHour.put(17, 9);
    ArrivalPerHour.put(18, 9);
    ArrivalPerHour.put(19, 4);
    ArrivalPerHour.put(20, 5);
    ArrivalPerHour.put(21, 4);
    ArrivalPerHour.put(22, 5);
    ArrivalPerHour.put(23, 4);
    ArrivalPerHour.put(24, 5);



  }
}
