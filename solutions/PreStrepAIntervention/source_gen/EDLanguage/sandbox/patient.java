package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.agents.Actor;
import simcore.action.Behaviour;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import repast.simphony.context.Context;
import simcore.Signals.Signal;
import simcore.basicStructures.Board;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import simcore.basicStructures.Room;
import simcore.basicStructures.RoomType;
import java.util.ArrayList;
import java.util.Comparator;
import simcore.agents.Agent;
import repast.simphony.space.graph.Network;
import simcore.basicStructures.TimeKeeper;

public class patient extends Actor {

  public String placeholder = "PlaceholderAttribute";
  public String admittedTo = "NA";
  public String Severity = "NotConfigured";
  public String StrepAInfectionStatus = "NotConfigured";
  public String cohort = "CohortOne";
  public Behaviour behaviourBuilder;

  public patient(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 1;
  }

  protected Signal searchForSignals(Board board) {
    // Read the board for signals, and find ones for me - filter out any signals that I don't meet the pre-condition for
    List<Signal> plstDirectSignals = board.GetDirectSignalsForMe(this).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, patient.this);
      }
    }).collect(Collectors.toList());



    List<Signal> plstSignals = board.GetSignalListBySubject(this.getClass()).stream().filter(new Predicate<Signal>() {
      public boolean test(Signal s) {
        return s.checkPreCondition(context, patient.this);
      }
    }).collect(Collectors.toList());

    if (plstDirectSignals.isEmpty() && plstSignals.isEmpty()) {
      return null;
    }
    // First see if there are any direct messages for me and prioritise those
    Signal s = selectSignal(plstDirectSignals);
    if (s == null) {
      // If none, select a message for my class type
      s = selectSignal(plstSignals);
    }
    return s;
  }


  protected Signal selectSignal(List<Signal> plstSignals) {
    if (plstSignals.isEmpty()) {
      return null;
    }
    return null;
  }

  protected Room SelectLocation(RoomType pRoomType, final Behaviour behaviour) {
    if (curInside != null && curInside.getRoomType() == pRoomType && EvaluateRoomChoice(curInside, behaviour) != Double.MAX_VALUE) {
      return curInside;
    }
    ArrayList<Room> pRooms = (ArrayList<Room>) ReadMap().FindInstancesOfRoomType(pRoomType);
    // First, select the room that contains my patient (if my current action involves the patient)
    for (Room pRoom : pRooms) {
      if (behaviour.getSignalTrigger() != null && behaviour.getSignalTrigger().GetData("patient") != null && pRoom.getOccupiers().contains(behaviour.getSignalTrigger().GetData("patient"))) {
        return pRoom;
      }
    }
    // If my patient isn't currently in that room, then consider other options
    Room selectedRoom = pRooms.stream().sorted(new Comparator<Room>() {
      public int compare(Room r1, Room r2) {
        return Double.compare(EvaluateRoomChoice(r1, behaviour), EvaluateRoomChoice(r2, behaviour));
      }
    }).filter(new Predicate<Room>() {
      public boolean test(Room r) {
        return EvaluateRoomChoice(r, behaviour) != Double.MAX_VALUE;
      }
    }).findFirst().orElse(null);
    return selectedRoom;
  }


  protected double EvaluateRoomChoice(Room pRoom, Behaviour behaviour) {
    ArrayList<Agent> occupiers = new ArrayList<Agent>(pRoom.getOccupiers());

    if (pRoom == null) {
      return 0;
    }
    return 0;

  }





  public Behaviour BuildActionFromSignal(Signal s) {
    if (s.GetData("patient") != null) {
      ((Network) context.getProjection("CurrentPatientAllocations")).addEdge(this, s.GetData("patient"));
    }
    switch (s.getName()) {
      case "":
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }


  public int getSeverityissevere() {
    if (this.Severity == "severe") {
      return 1;
    }
    return 0;
  }
  public int getSeverityismoderate() {
    if (this.Severity == "moderate") {
      return 1;
    }
    return 0;
  }
  public int getSeverityislow() {
    if (this.Severity == "low") {
      return 1;
    }
    return 0;
  }
  public int getStrepAInfectionStatusisSusceptible() {
    if (this.StrepAInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getStrepAInfectionStatusisAsymptomatic() {
    if (this.StrepAInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getStrepAInfectionStatusisSymptomatic() {
    if (this.StrepAInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBay() {
    if (this.admittedTo == "GreenBay") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetSeverityissevere() {
    if (this.admittedTo == "GreenBay" && this.Severity == "severe") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetSeverityismoderate() {
    if (this.admittedTo == "GreenBay" && this.Severity == "moderate") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetSeverityislow() {
    if (this.admittedTo == "GreenBay" && this.Severity == "low") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetStrepAInfectionStatusisSusceptible() {
    if (this.admittedTo == "GreenBay" && this.StrepAInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetStrepAInfectionStatusisAsymptomatic() {
    if (this.admittedTo == "GreenBay" && this.StrepAInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetStrepAInfectionStatusisSymptomatic() {
    if (this.admittedTo == "GreenBay" && this.StrepAInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }





  public int patientgetAliveTime() {
    if (deSpawnTime == null) {
      return 0;
    }
    return Math.abs((int) TimeKeeper.compareSeconds(deSpawnTime, spawnTime));
  }
}
