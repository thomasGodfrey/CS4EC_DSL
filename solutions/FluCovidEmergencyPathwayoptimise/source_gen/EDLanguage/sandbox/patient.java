package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.agents.Actor;
import simcore.action.Behaviour;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.grid.Grid;
import repast.simphony.context.Context;
import simcore.Signals.Signal;
import java.util.List;

public class patient extends Actor {

  public String placeholder = "PlaceholderAttribute";
  public String admittedTo = "NA";
  public String admissionRoute = "UnConfigured";
  public String COVIDVaccineStatus = "NotConfigured";
  public String FluAVaccineStatus = "NotConfigured";
  public String FluBVaccineStatus = "NotConfigured";
  public String COVIDInfectionStatus = "NotConfigured";
  public String FluAInfectionStatus = "NotConfigured";
  public String FluBInfectionStatus = "NotConfigured";
  public String RecentCovidContact = "NotConfigured";
  public String Immunocompromised = "NotConfigured";
  public String LFDCOVIDResult = "Incomplete";
  public String LFDFluAResult = "Incomplete";
  public String LFDFluBResult = "Incomplete";
  public String LIATCOVIDResult = "Incomplete";
  public String LIATFluAResult = "Incomplete";
  public String LIATFluBResult = "Incomplete";
  public String LabPCRCOVIDResult = "Incomplete";
  public String LabPCRFluAResult = "Incomplete";
  public String LabPCRFluBResult = "Incomplete";
  public String TriagingToolResult = "Incomplete";
  public Behaviour behaviourBuilder;

  public patient(ContinuousSpace<Object> space, Grid<Object> grid, Context<Object> context) {
    super(space, grid, context);
    mintMyMaxPatients = 1;
  }

  public patient(ContinuousSpace<Object> space, Grid<Object> grid, String pstrStartLocation) {
    super(space, grid, pstrStartLocation);
  }

  protected Signal selectSignal(List<Signal> plstSignals) {
    if (plstSignals.isEmpty()) {
      return null;
    }
    return null;
  }



  public Behaviour BuildActionFromSignal(Signal s) {
    switch (s.getName()) {
      case "":
        break;
      default:
        System.out.println("Set mission: " + s.getName() + " failed!");
        return behaviourBuilder;
    }
    return behaviourBuilder;
  }


  public int getCOVIDVaccineStatusisUnvaccinated() {
    if (this.COVIDVaccineStatus == "Unvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getCOVIDVaccineStatusispartiallyvaccinated() {
    if (this.COVIDVaccineStatus == "partiallyvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getCOVIDVaccineStatusisfullyvaccinated() {
    if (this.COVIDVaccineStatus == "fullyvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getFluAVaccineStatusisUnvaccinated() {
    if (this.FluAVaccineStatus == "Unvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getFluAVaccineStatusispartiallyvaccinated() {
    if (this.FluAVaccineStatus == "partiallyvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getFluAVaccineStatusisfullyvaccinated() {
    if (this.FluAVaccineStatus == "fullyvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getFluBVaccineStatusisUnvaccinated() {
    if (this.FluBVaccineStatus == "Unvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getFluBVaccineStatusispartiallyvaccinated() {
    if (this.FluBVaccineStatus == "partiallyvaccinated") {
      return 1;
    }
    return 0;
  }
  public int getFluBVaccineStatusisfullyvaccinated() {
    if (this.FluBVaccineStatus == "fullyvaccinated") {
      return 1;
    }
    return 0;
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
  public int getRecentCovidContactisYes() {
    if (this.RecentCovidContact == "Yes") {
      return 1;
    }
    return 0;
  }
  public int getRecentCovidContactisNo() {
    if (this.RecentCovidContact == "No") {
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
  public int getLFDCOVIDResultisPositive() {
    if (this.LFDCOVIDResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLFDCOVIDResultisNegative() {
    if (this.LFDCOVIDResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLFDFluAResultisPositive() {
    if (this.LFDFluAResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLFDFluAResultisNegative() {
    if (this.LFDFluAResult == "Negative") {
      return 1;
    }
    return 0;
  }
  public int getLFDFluBResultisPositive() {
    if (this.LFDFluBResult == "Positive") {
      return 1;
    }
    return 0;
  }
  public int getLFDFluBResultisNegative() {
    if (this.LFDFluBResult == "Negative") {
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
  public int getadmittedToisSideRoom() {
    if (this.admittedTo == "SideRoom") {
      return 1;
    }
    return 0;
  }




}
