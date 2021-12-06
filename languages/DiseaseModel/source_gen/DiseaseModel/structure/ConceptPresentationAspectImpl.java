package DiseaseModel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Asymptomatic;
  private ConceptPresentation props_DiseaseStatus;
  private ConceptPresentation props_Infected;
  private ConceptPresentation props_InfectionStatus;
  private ConceptPresentation props_Susceptible;
  private ConceptPresentation props_Symptomatic;
  private ConceptPresentation props_Unvaccinated;
  private ConceptPresentation props_Vaccinated;
  private ConceptPresentation props_VaccineStatus;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Asymptomatic:
        if (props_Asymptomatic == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Asymptomatic");
          props_Asymptomatic = cpb.create();
        }
        return props_Asymptomatic;
      case LanguageConceptSwitch.DiseaseStatus:
        if (props_DiseaseStatus == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("DiseaseStatus");
          props_DiseaseStatus = cpb.create();
        }
        return props_DiseaseStatus;
      case LanguageConceptSwitch.Infected:
        if (props_Infected == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Infected");
          props_Infected = cpb.create();
        }
        return props_Infected;
      case LanguageConceptSwitch.InfectionStatus:
        if (props_InfectionStatus == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("A person's infection status");
          cpb.rawPresentation("Infection Status");
          props_InfectionStatus = cpb.create();
        }
        return props_InfectionStatus;
      case LanguageConceptSwitch.Susceptible:
        if (props_Susceptible == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Susceptible");
          props_Susceptible = cpb.create();
        }
        return props_Susceptible;
      case LanguageConceptSwitch.Symptomatic:
        if (props_Symptomatic == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Symptomatic");
          props_Symptomatic = cpb.create();
        }
        return props_Symptomatic;
      case LanguageConceptSwitch.Unvaccinated:
        if (props_Unvaccinated == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Unvaccinated");
          props_Unvaccinated = cpb.create();
        }
        return props_Unvaccinated;
      case LanguageConceptSwitch.Vaccinated:
        if (props_Vaccinated == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Vaccinated");
          props_Vaccinated = cpb.create();
        }
        return props_Vaccinated;
      case LanguageConceptSwitch.VaccineStatus:
        if (props_VaccineStatus == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("VaccineStatus");
          props_VaccineStatus = cpb.create();
        }
        return props_VaccineStatus;
    }
    return null;
  }
}