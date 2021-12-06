package ActionCards.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private ConceptPresentation props_Action;
  private ConceptPresentation props_ActionCard;
  private ConceptPresentation props_ActionStep;
  private ConceptPresentation props_AdmissionAction;
  private ConceptPresentation props_Attribute;
  private ConceptPresentation props_AttributeLine;
  private ConceptPresentation props_AttributeTable;
  private ConceptPresentation props_Branch;
  private ConceptPresentation props_BranchConditional;
  private ConceptPresentation props_DiagnosticCondition;
  private ConceptPresentation props_Disease;
  private ConceptPresentation props_DiseaseSymptom;
  private ConceptPresentation props_DiseaseSymptomReference;
  private ConceptPresentation props_DiseaseTest;
  private ConceptPresentation props_EDScenario;
  private ConceptPresentation props_FullyVaccinated;
  private ConceptPresentation props_IPatientProperty;
  private ConceptPresentation props_InfectionStatusCondition;
  private ConceptPresentation props_InfectionStatusProperty;
  private ConceptPresentation props_ObservationTest;
  private ConceptPresentation props_ObservationsCondition;
  private ConceptPresentation props_PartiallyVaccinated;
  private ConceptPresentation props_PatientArrivalLine;
  private ConceptPresentation props_PatientArrivals;
  private ConceptPresentation props_PatientProfile;
  private ConceptPresentation props_PatientPropertyConditional;
  private ConceptPresentation props_PatientPropertyReference;
  private ConceptPresentation props_ProcessingTimeLine;
  private ConceptPresentation props_ProcessingTimeTable;
  private ConceptPresentation props_Resource;
  private ConceptPresentation props_StaffNumber;
  private ConceptPresentation props_StaffType;
  private ConceptPresentation props_StaffTypeReference;
  private ConceptPresentation props_SymptomList;
  private ConceptPresentation props_Test;
  private ConceptPresentation props_TestCapturedDisease;
  private ConceptPresentation props_Unvaccinated;
  private ConceptPresentation props_VaccinationStatus;
  private ConceptPresentation props_VaccineStatusCondition;
  private ConceptPresentation props_VaccineStatusProperty;
  private ConceptPresentation props_Variable;

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case LanguageConceptSwitch.Action:
        if (props_Action == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("A task that must be completed");
          cpb.presentationByName();
          props_Action = cpb.create();
        }
        return props_Action;
      case LanguageConceptSwitch.ActionCard:
        if (props_ActionCard == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Overall Description of a patient pathway");
          cpb.rawPresentation("Action Card");
          props_ActionCard = cpb.create();
        }
        return props_ActionCard;
      case LanguageConceptSwitch.ActionStep:
        if (props_ActionStep == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Individual steps of an Action");
          cpb.rawPresentation("ActionStep");
          props_ActionStep = cpb.create();
        }
        return props_ActionStep;
      case LanguageConceptSwitch.AdmissionAction:
        if (props_AdmissionAction == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_AdmissionAction = cpb.create();
        }
        return props_AdmissionAction;
      case LanguageConceptSwitch.Attribute:
        if (props_Attribute == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Attribute = cpb.create();
        }
        return props_Attribute;
      case LanguageConceptSwitch.AttributeLine:
        if (props_AttributeLine == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("AttributeLine");
          props_AttributeLine = cpb.create();
        }
        return props_AttributeLine;
      case LanguageConceptSwitch.AttributeTable:
        if (props_AttributeTable == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("AttributeTable");
          props_AttributeTable = cpb.create();
        }
        return props_AttributeTable;
      case LanguageConceptSwitch.Branch:
        if (props_Branch == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Connect Activities using this Branch");
          cpb.rawPresentation("Branch");
          props_Branch = cpb.create();
        }
        return props_Branch;
      case LanguageConceptSwitch.BranchConditional:
        if (props_BranchConditional == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("BranchConditional");
          props_BranchConditional = cpb.create();
        }
        return props_BranchConditional;
      case LanguageConceptSwitch.DiagnosticCondition:
        if (props_DiagnosticCondition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("diagnostic condition");
          props_DiagnosticCondition = cpb.create();
        }
        return props_DiagnosticCondition;
      case LanguageConceptSwitch.Disease:
        if (props_Disease == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Disease = cpb.create();
        }
        return props_Disease;
      case LanguageConceptSwitch.DiseaseSymptom:
        if (props_DiseaseSymptom == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_DiseaseSymptom = cpb.create();
        }
        return props_DiseaseSymptom;
      case LanguageConceptSwitch.DiseaseSymptomReference:
        if (props_DiseaseSymptomReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x6ca3e29db4791247L, 0x6ca3e29db4791251L, "symptom", "", "");
          props_DiseaseSymptomReference = cpb.create();
        }
        return props_DiseaseSymptomReference;
      case LanguageConceptSwitch.DiseaseTest:
        if (props_DiseaseTest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Type of a test");
          cpb.presentationByName();
          props_DiseaseTest = cpb.create();
        }
        return props_DiseaseTest;
      case LanguageConceptSwitch.EDScenario:
        if (props_EDScenario == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("EDScenario");
          props_EDScenario = cpb.create();
        }
        return props_EDScenario;
      case LanguageConceptSwitch.FullyVaccinated:
        if (props_FullyVaccinated == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("fully vaccinated");
          props_FullyVaccinated = cpb.create();
        }
        return props_FullyVaccinated;
      case LanguageConceptSwitch.IPatientProperty:
        if (props_IPatientProperty == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          props_IPatientProperty = cpb.create();
        }
        return props_IPatientProperty;
      case LanguageConceptSwitch.InfectionStatusCondition:
        if (props_InfectionStatusCondition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("check infection status of a patient");
          props_InfectionStatusCondition = cpb.create();
        }
        return props_InfectionStatusCondition;
      case LanguageConceptSwitch.InfectionStatusProperty:
        if (props_InfectionStatusProperty == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Infection Status");
          props_InfectionStatusProperty = cpb.create();
        }
        return props_InfectionStatusProperty;
      case LanguageConceptSwitch.ObservationTest:
        if (props_ObservationTest == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_ObservationTest = cpb.create();
        }
        return props_ObservationTest;
      case LanguageConceptSwitch.ObservationsCondition:
        if (props_ObservationsCondition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("observations result");
          props_ObservationsCondition = cpb.create();
        }
        return props_ObservationsCondition;
      case LanguageConceptSwitch.PartiallyVaccinated:
        if (props_PartiallyVaccinated == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("partially vaccinated");
          props_PartiallyVaccinated = cpb.create();
        }
        return props_PartiallyVaccinated;
      case LanguageConceptSwitch.PatientArrivalLine:
        if (props_PatientArrivalLine == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("PatientArrivalLine");
          props_PatientArrivalLine = cpb.create();
        }
        return props_PatientArrivalLine;
      case LanguageConceptSwitch.PatientArrivals:
        if (props_PatientArrivals == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Patient Arrivals");
          props_PatientArrivals = cpb.create();
        }
        return props_PatientArrivals;
      case LanguageConceptSwitch.PatientProfile:
        if (props_PatientProfile == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("The patient profile");
          cpb.presentationByName();
          props_PatientProfile = cpb.create();
        }
        return props_PatientProfile;
      case LanguageConceptSwitch.PatientPropertyConditional:
        if (props_PatientPropertyConditional == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("patient property");
          props_PatientPropertyConditional = cpb.create();
        }
        return props_PatientPropertyConditional;
      case LanguageConceptSwitch.PatientPropertyReference:
        if (props_PatientPropertyReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0a06L, 0x18668ef270ed0a07L, "property", "", "");
          props_PatientPropertyReference = cpb.create();
        }
        return props_PatientPropertyReference;
      case LanguageConceptSwitch.ProcessingTimeLine:
        if (props_ProcessingTimeLine == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("ProcessingTimeLine");
          props_ProcessingTimeLine = cpb.create();
        }
        return props_ProcessingTimeLine;
      case LanguageConceptSwitch.ProcessingTimeTable:
        if (props_ProcessingTimeTable == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Test processing time table");
          props_ProcessingTimeTable = cpb.create();
        }
        return props_ProcessingTimeTable;
      case LanguageConceptSwitch.Resource:
        if (props_Resource == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("A resource in the hospital");
          cpb.presentationByName();
          props_Resource = cpb.create();
        }
        return props_Resource;
      case LanguageConceptSwitch.StaffNumber:
        if (props_StaffNumber == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL, 0x4af9c647eff82e87L, "staff", "", "");
          props_StaffNumber = cpb.create();
        }
        return props_StaffNumber;
      case LanguageConceptSwitch.StaffType:
        if (props_StaffType == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.shortDesc("Staff type in the ED");
          cpb.presentationByName();
          props_StaffType = cpb.create();
        }
        return props_StaffType;
      case LanguageConceptSwitch.StaffTypeReference:
        if (props_StaffTypeReference == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByReference(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L, 0x4af9c647efda3aa5L, "staffType", "", "");
          props_StaffTypeReference = cpb.create();
        }
        return props_StaffTypeReference;
      case LanguageConceptSwitch.SymptomList:
        if (props_SymptomList == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Complete list of Symptoms");
          props_SymptomList = cpb.create();
        }
        return props_SymptomList;
      case LanguageConceptSwitch.Test:
        if (props_Test == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_Test = cpb.create();
        }
        return props_Test;
      case LanguageConceptSwitch.TestCapturedDisease:
        if (props_TestCapturedDisease == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.presentationByName();
          props_TestCapturedDisease = cpb.create();
        }
        return props_TestCapturedDisease;
      case LanguageConceptSwitch.Unvaccinated:
        if (props_Unvaccinated == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Unvaccinated");
          props_Unvaccinated = cpb.create();
        }
        return props_Unvaccinated;
      case LanguageConceptSwitch.VaccinationStatus:
        if (props_VaccinationStatus == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("VaccinationStatus");
          props_VaccinationStatus = cpb.create();
        }
        return props_VaccinationStatus;
      case LanguageConceptSwitch.VaccineStatusCondition:
        if (props_VaccineStatusCondition == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("check vaccine status of patient");
          props_VaccineStatusCondition = cpb.create();
        }
        return props_VaccineStatusCondition;
      case LanguageConceptSwitch.VaccineStatusProperty:
        if (props_VaccineStatusProperty == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Vaccine status");
          props_VaccineStatusProperty = cpb.create();
        }
        return props_VaccineStatusProperty;
      case LanguageConceptSwitch.Variable:
        if (props_Variable == null) {
          ConceptPresentationBuilder cpb = new ConceptPresentationBuilder();
          cpb.rawPresentation("Variable");
          props_Variable = cpb.create();
        }
        return props_Variable;
    }
    return null;
  }
}
