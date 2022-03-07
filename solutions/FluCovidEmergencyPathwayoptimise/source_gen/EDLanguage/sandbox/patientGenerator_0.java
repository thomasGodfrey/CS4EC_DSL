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
    spawnRoomType = ElectiveAttendanceArea.getInstance();
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

    sendSignalTemp.setName("PatientArrivesTrigger_g");
    sendSignalTemp.AddData("patient", a);
    sendSignalTemp.AddActor("WardStaff");


    // For each agent attribute 
    // For each attribute value option 
    // Assign the value based on probability function 
    double rndDouble = RandomHelper.nextDouble();
    if (rndDouble < RunEnvironment.getInstance().getParameters().getDouble("ImmunocompromisedNo")) {
      a.Immunocompromised = "No";
    }
    if (rndDouble < RunEnvironment.getInstance().getParameters().getDouble("ImmunocompromisedYes")) {
      a.Immunocompromised = "Yes";
    }
    if (rndDouble < RunEnvironment.getInstance().getParameters().getDouble("admissionRouteElectiveattendance")) {
      a.admissionRoute = "Electiveattendance";
    }

    b.PushMission(sendSignalTemp);

    return a;
  }

  public void initialiseArrivalMap() {
    ArrivalPerHour = new HashMap<Integer, Integer>();
    ArrivalPerHour.put(1, 2);
    ArrivalPerHour.put(2, 3);
    ArrivalPerHour.put(3, 4);
    ArrivalPerHour.put(4, 5);
    ArrivalPerHour.put(5, 6);
    ArrivalPerHour.put(6, 3);
    ArrivalPerHour.put(7, 4);
    ArrivalPerHour.put(8, 3);
    ArrivalPerHour.put(9, 5);
    ArrivalPerHour.put(10, 6);
    ArrivalPerHour.put(11, 5);
    ArrivalPerHour.put(12, 3);
    ArrivalPerHour.put(13, 4);
    ArrivalPerHour.put(14, 3);
    ArrivalPerHour.put(15, 4);
    ArrivalPerHour.put(16, 3);
    ArrivalPerHour.put(17, 4);
    ArrivalPerHour.put(18, 3);
    ArrivalPerHour.put(19, 4);
    ArrivalPerHour.put(20, 3);
    ArrivalPerHour.put(21, 4);
    ArrivalPerHour.put(22, 3);
    ArrivalPerHour.put(23, 4);
    ArrivalPerHour.put(24, 3);



  }
}
