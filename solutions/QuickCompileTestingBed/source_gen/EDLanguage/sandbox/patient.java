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
import simcore.action.InstantBehaviourStep;
import simcore.action.BehaviourStep;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ScheduledMethod;
import simcore.action.BackgroundBehaviour;
import simcore.basicStructures.TimeKeeper;

public class patient extends Actor {

  public String placeholder = "PlaceholderAttribute";
  public String admittedTo = "NA";
  public String admissionRoute = "UnConfigured";
  public String COVIDInfectionStatus = "NotConfigured";
  public String FluAInfectionStatus = "NotConfigured";
  public String FluBInfectionStatus = "NotConfigured";
  public String Severity = "NotConfigured";
  public String Immunocompromised = "NotConfigured";
  public String LateralFlowCOVIDResult = "Incomplete";
  public String LateralFlowFluAResult = "Incomplete";
  public String LateralFlowFluBResult = "Incomplete";
  public String LIATCOVIDResult = "Incomplete";
  public String LIATFluAResult = "Incomplete";
  public String LIATFluBResult = "Incomplete";
  public String LabPCRCOVIDResult = "Incomplete";
  public String LabPCRFluAResult = "Incomplete";
  public String LabPCRFluBResult = "Incomplete";
  public String PHEThreeCOVIDResult = "Incomplete";
  public String PHEThreeFluAResult = "Incomplete";
  public String PHEThreeFluBResult = "Incomplete";
  public String CepheidCOVIDResult = "Incomplete";
  public String CepheidFluAResult = "Incomplete";
  public String CepheidFluBResult = "Incomplete";
  public String LiatOrCepheidCOVIDResult = "Incomplete";
  public String LiatOrCepheidFluAResult = "Incomplete";
  public String LiatOrCepheidFluBResult = "Incomplete";
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


  public int getCOVIDInfectionStatusisSymptomatic() {
    if (this.COVIDInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getCOVIDInfectionStatusisAsymptomatic() {
    if (this.COVIDInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getCOVIDInfectionStatusisSusceptible() {
    if (this.COVIDInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getCOVIDInfectionStatusisExposed() {
    if (this.COVIDInfectionStatus == "Exposed") {
      return 1;
    }
    return 0;
  }
  public int getFluAInfectionStatusisSymptomatic() {
    if (this.FluAInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getFluAInfectionStatusisAsymptomatic() {
    if (this.FluAInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getFluAInfectionStatusisSusceptible() {
    if (this.FluAInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getFluAInfectionStatusisExposed() {
    if (this.FluAInfectionStatus == "Exposed") {
      return 1;
    }
    return 0;
  }
  public int getFluBInfectionStatusisSymptomatic() {
    if (this.FluBInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getFluBInfectionStatusisAsymptomatic() {
    if (this.FluBInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getFluBInfectionStatusisSusceptible() {
    if (this.FluBInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getFluBInfectionStatusisExposed() {
    if (this.FluBInfectionStatus == "Exposed") {
      return 1;
    }
    return 0;
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
  public int getImmunocompromisedisYes() {
    if (this.Immunocompromised == "Yes") {
      return 1;
    }
    return 0;
  }
  public int getImmunocompromisedisNo() {
    if (this.Immunocompromised == "No") {
      return 1;
    }
    return 0;
  }
  public int getLateralFlowCOVIDResultisPositive() {
    if (this.LateralFlowCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLateralFlowCOVIDResultisNegative() {
    if (this.LateralFlowCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLateralFlowFluAResultisPositive() {
    if (this.LateralFlowFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLateralFlowFluAResultisNegative() {
    if (this.LateralFlowFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLateralFlowFluBResultisPositive() {
    if (this.LateralFlowFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLateralFlowFluBResultisNegative() {
    if (this.LateralFlowFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLIATCOVIDResultisPositive() {
    if (this.LIATCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLIATCOVIDResultisNegative() {
    if (this.LIATCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLIATFluAResultisPositive() {
    if (this.LIATFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLIATFluAResultisNegative() {
    if (this.LIATFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLIATFluBResultisPositive() {
    if (this.LIATFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLIATFluBResultisNegative() {
    if (this.LIATFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLabPCRCOVIDResultisPositive() {
    if (this.LabPCRCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLabPCRCOVIDResultisNegative() {
    if (this.LabPCRCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLabPCRFluAResultisPositive() {
    if (this.LabPCRFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLabPCRFluAResultisNegative() {
    if (this.LabPCRFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLabPCRFluBResultisPositive() {
    if (this.LabPCRFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLabPCRFluBResultisNegative() {
    if (this.LabPCRFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getPHEThreeCOVIDResultisPositive() {
    if (this.PHEThreeCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getPHEThreeCOVIDResultisNegative() {
    if (this.PHEThreeCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getPHEThreeFluAResultisPositive() {
    if (this.PHEThreeFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getPHEThreeFluAResultisNegative() {
    if (this.PHEThreeFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getPHEThreeFluBResultisPositive() {
    if (this.PHEThreeFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getPHEThreeFluBResultisNegative() {
    if (this.PHEThreeFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getCepheidCOVIDResultisPositive() {
    if (this.CepheidCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getCepheidCOVIDResultisNegative() {
    if (this.CepheidCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getCepheidFluAResultisPositive() {
    if (this.CepheidFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getCepheidFluAResultisNegative() {
    if (this.CepheidFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getCepheidFluBResultisPositive() {
    if (this.CepheidFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getCepheidFluBResultisNegative() {
    if (this.CepheidFluBResult == "Negative") {
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
  public int getadmittedToisGreenBaygetCOVIDInfectionStatusisSymptomatic() {
    if (this.admittedTo == "GreenBay" && this.COVIDInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCOVIDInfectionStatusisAsymptomatic() {
    if (this.admittedTo == "GreenBay" && this.COVIDInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCOVIDInfectionStatusisSusceptible() {
    if (this.admittedTo == "GreenBay" && this.COVIDInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCOVIDInfectionStatusisExposed() {
    if (this.admittedTo == "GreenBay" && this.COVIDInfectionStatus == "Exposed") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluAInfectionStatusisSymptomatic() {
    if (this.admittedTo == "GreenBay" && this.FluAInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluAInfectionStatusisAsymptomatic() {
    if (this.admittedTo == "GreenBay" && this.FluAInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluAInfectionStatusisSusceptible() {
    if (this.admittedTo == "GreenBay" && this.FluAInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluAInfectionStatusisExposed() {
    if (this.admittedTo == "GreenBay" && this.FluAInfectionStatus == "Exposed") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluBInfectionStatusisSymptomatic() {
    if (this.admittedTo == "GreenBay" && this.FluBInfectionStatus == "Symptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluBInfectionStatusisAsymptomatic() {
    if (this.admittedTo == "GreenBay" && this.FluBInfectionStatus == "Asymptomatic") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluBInfectionStatusisSusceptible() {
    if (this.admittedTo == "GreenBay" && this.FluBInfectionStatus == "Susceptible") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetFluBInfectionStatusisExposed() {
    if (this.admittedTo == "GreenBay" && this.FluBInfectionStatus == "Exposed") {
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
  public int getadmittedToisGreenBaygetImmunocompromisedisYes() {
    if (this.admittedTo == "GreenBay" && this.Immunocompromised == "Yes") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetImmunocompromisedisNo() {
    if (this.admittedTo == "GreenBay" && this.Immunocompromised == "No") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLateralFlowCOVIDResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LateralFlowCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLateralFlowCOVIDResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LateralFlowCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLateralFlowFluAResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LateralFlowFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLateralFlowFluAResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LateralFlowFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLateralFlowFluBResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LateralFlowFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLateralFlowFluBResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LateralFlowFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLIATCOVIDResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LIATCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLIATCOVIDResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LIATCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLIATFluAResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LIATFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLIATFluAResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LIATFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLIATFluBResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LIATFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLIATFluBResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LIATFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLabPCRCOVIDResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LabPCRCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLabPCRCOVIDResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LabPCRCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLabPCRFluAResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LabPCRFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLabPCRFluAResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LabPCRFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLabPCRFluBResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.LabPCRFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetLabPCRFluBResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.LabPCRFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetPHEThreeCOVIDResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.PHEThreeCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetPHEThreeCOVIDResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.PHEThreeCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetPHEThreeFluAResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.PHEThreeFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetPHEThreeFluAResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.PHEThreeFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetPHEThreeFluBResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.PHEThreeFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetPHEThreeFluBResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.PHEThreeFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCepheidCOVIDResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.CepheidCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCepheidCOVIDResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.CepheidCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCepheidFluAResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.CepheidFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCepheidFluAResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.CepheidFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCepheidFluBResultisPositive() {
    if (this.admittedTo == "GreenBay" && this.CepheidFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getadmittedToisGreenBaygetCepheidFluBResultisNegative() {
    if (this.admittedTo == "GreenBay" && this.CepheidFluBResult == "Negative") {
      return 1;
    }
    return 0;
  }

  public class Consequence_a0a0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).placeholder = "HELLO";

    }
  }
  public class Consequence_a0a0a_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0a_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).placeholder = "HELLO";

    }
  }
  public class Choice_a0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 10 && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 10 && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA") {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0a(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Consequence_a0a0a0a0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0a0a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).FluBInfectionStatus = "Exposed";

    }
  }
  public class Consequence_a0a0a0a0_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0a0a0_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).FluBInfectionStatus = "Exposed";

    }
  }
  public class Choice_a0a0a0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a0a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (Dice(RunEnvironment.getInstance().getParameters().getDouble("InfectionSpreadChance:FluBSymptomatic-0.4_a0"))) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0a0a0(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0a0a0_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0a0a0_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (Dice(RunEnvironment.getInstance().getParameters().getDouble("InfectionSpreadChance:FluBSymptomatic-0.4_a0"))) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0a0a0(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Consequence_a0a0b0a0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0b0a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).FluBInfectionStatus = "Exposed";

    }
  }
  public class Consequence_a0a0b0a0_0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Consequence_a0a0b0a0_0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      ((patient) behaviour.getSignalTrigger().GetData("patient")).FluBInfectionStatus = "Exposed";

    }
  }
  public class Choice_a0b0a0 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0b0a0(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (Dice(RunEnvironment.getInstance().getParameters().getDouble("InfectionSpreadChance:FluBSymptomatic-1.2_b0"))) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0b0a0(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class Choice_a0b0a0_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public Choice_a0b0a0_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {
      if (Dice(RunEnvironment.getInstance().getParameters().getDouble("InfectionSpreadChance:FluBSymptomatic-1.2_b0"))) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Consequence_a0a0b0a0(behaviour));
        behaviour.injectSteps(plstSteps);
      } else {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        behaviour.injectSteps(plstSteps);
      }
    }
  }
  public class DecisionTree_a0a extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public DecisionTree_a0a(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {



      if (patient.this.FluBInfectionStatus == "Symptomatic" && curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom() && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA" && distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 0.4) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0a0a0(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (patient.this.FluBInfectionStatus == "Symptomatic" && curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom() && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA" && distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 1.2) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0b0a0(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  public class DecisionTree_a0a_1 extends InstantBehaviourStep {
    /*package*/ Behaviour behaviour;
    public DecisionTree_a0a_1(Behaviour behaviour) {
      this.behaviour = behaviour;
    }

    public void execute() {



      if (patient.this.FluBInfectionStatus == "Symptomatic" && curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom() && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA" && distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 0.4) {

        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0a0a0(behaviour));
        behaviour.injectSteps(plstSteps);

      } else if (patient.this.FluBInfectionStatus == "Symptomatic" && curInside != null && curInside == ((Actor) behaviour.getSignalTrigger().GetData("patient")).getRoom() && ((patient) behaviour.getSignalTrigger().GetData("patient")).admittedTo == "NA" && distanceTo(((patient) behaviour.getSignalTrigger().GetData("patient"))) < 1.2) {
        ArrayList<BehaviourStep> plstSteps = new ArrayList();
        plstSteps.add(new Choice_a0b0a0(behaviour));
        behaviour.injectSteps(plstSteps);
      }

    }
  }
  @ScheduledMethod(start = 1, interval = 1)
  public void ScheduledBehaviourForFluB() {
    if (deSpawnTime == null) {
      for (Object object : context.getObjects(patient.class)) {
        patient a = (patient) object;
        if (a.deSpawnTime == null && distanceTo(a) < 1.2) {
          Signal s = new Signal();
          s.setName("patient" + a.agentName());
          s.setDescription("BackgroundBehaviourForFluBTrigger");
          s.AddActor("patient");
          s.AddData("patient", a);
          BackgroundBehaviourForFluB(s);
        }
      }
    }
  }
  public void BackgroundBehaviourForFluB(Signal s) {
    BackgroundBehaviour backgroundBehaviour = new BackgroundBehaviour("BackgroundBehaviourForFluB", this);

    backgroundBehaviour.setSignalTrigger(s);
    ArrayList<BehaviourStep> plstSteps = new ArrayList();
    plstSteps.add(new DecisionTree_a0a(backgroundBehaviour));
    backgroundBehaviour.setSteps(plstSteps);

    myBackgroundBehaviours.add(backgroundBehaviour);
  }



  public int patientgetAliveTime() {
    if (deSpawnTime == null) {
      return 0;
    }
    return Math.abs((int) TimeKeeper.compareSeconds(deSpawnTime, spawnTime));
  }
}
