package ActionCards.structure;

/*Generated by MPS */

import jetbrains.mps.lang.smodel.LanguageConceptIndex;
import jetbrains.mps.lang.smodel.LanguageConceptIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public final class LanguageConceptSwitch {
  private final LanguageConceptIndex myIndex;
  public static final int Action = 0;
  public static final int ActionCard = 1;
  public static final int ActionCardCondition = 2;
  public static final int ActionStep = 3;
  public static final int AdmissionAction = 4;
  public static final int AttendanceRoute = 5;
  public static final int AttendanceRouteCondition = 6;
  public static final int Attribute = 7;
  public static final int AttributeLine = 8;
  public static final int AttributeTable = 9;
  public static final int BooleanExpression = 10;
  public static final int Branch = 11;
  public static final int BranchConditional = 12;
  public static final int DiagnosticCondition = 13;
  public static final int Disease = 14;
  public static final int DiseaseSymptom = 15;
  public static final int DiseaseSymptomReference = 16;
  public static final int DiseaseTest = 17;
  public static final int EDScenario = 18;
  public static final int ElectiveAttendanceRoute = 19;
  public static final int EmergencyAttendanceRoute = 20;
  public static final int FullyVaccinated = 21;
  public static final int IPatientProperty = 22;
  public static final int ImmunocompromisedCondition = 23;
  public static final int ImmunosuppressedProperty = 24;
  public static final int InfectionStatusCondition = 25;
  public static final int InfectionStatusProperty = 26;
  public static final int No = 27;
  public static final int ObservationTest = 28;
  public static final int ObservationsCondition = 29;
  public static final int PartiallyVaccinated = 30;
  public static final int PatientArrivalLine = 31;
  public static final int PatientArrivals = 32;
  public static final int PatientProfile = 33;
  public static final int PatientPropertyConditional = 34;
  public static final int PatientPropertyReference = 35;
  public static final int ProcessingTimeLine = 36;
  public static final int ProcessingTimeTable = 37;
  public static final int RecentCOVIDContactCondition = 38;
  public static final int RecentCovidContactProperty = 39;
  public static final int Resource = 40;
  public static final int StaffNumber = 41;
  public static final int StaffType = 42;
  public static final int StaffTypeReference = 43;
  public static final int SymptomList = 44;
  public static final int Test = 45;
  public static final int TestCapturedDisease = 46;
  public static final int Unvaccinated = 47;
  public static final int VaccinationStatus = 48;
  public static final int VaccineStatusCondition = 49;
  public static final int VaccineStatusProperty = 50;
  public static final int Variable = 51;
  public static final int Yes = 52;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L);
    builder.put(0x2ef557ae9cb06864L, Action);
    builder.put(0x2ef557ae9cb06848L, ActionCard);
    builder.put(0x18668ef27386cf02L, ActionCardCondition);
    builder.put(0x4f415ebce3f3455bL, ActionStep);
    builder.put(0x78ac3095dfdf9aL, AdmissionAction);
    builder.put(0x18668ef273b09a5dL, AttendanceRoute);
    builder.put(0x18668ef273c1dbbaL, AttendanceRouteCondition);
    builder.put(0x25745663758ab027L, Attribute);
    builder.put(0x25745663764b1a7cL, AttributeLine);
    builder.put(0x25745663764b1a60L, AttributeTable);
    builder.put(0x18668ef2732bb4e3L, BooleanExpression);
    builder.put(0x4f415ebce3f3456eL, Branch);
    builder.put(0x18668ef26fa67c60L, BranchConditional);
    builder.put(0x29f0721df36170cL, DiagnosticCondition);
    builder.put(0x25745663758ab012L, Disease);
    builder.put(0x6ca3e29db4791132L, DiseaseSymptom);
    builder.put(0x6ca3e29db4791247L, DiseaseSymptomReference);
    builder.put(0x4936c0ffc391ca7L, DiseaseTest);
    builder.put(0x4af9c647eff82e56L, EDScenario);
    builder.put(0x18668ef273b09e71L, ElectiveAttendanceRoute);
    builder.put(0x18668ef273b09c56L, EmergencyAttendanceRoute);
    builder.put(0x18668ef26fc61137L, FullyVaccinated);
    builder.put(0x18668ef26f3e3b4cL, IPatientProperty);
    builder.put(0x18668ef2755ea288L, ImmunocompromisedCondition);
    builder.put(0x18668ef2755e811eL, ImmunosuppressedProperty);
    builder.put(0x18668ef27101e2faL, InfectionStatusCondition);
    builder.put(0x18668ef26f3e7089L, InfectionStatusProperty);
    builder.put(0x18668ef2732bb4e4L, No);
    builder.put(0x6ca3e29db47911a7L, ObservationTest);
    builder.put(0x6ca3e29db4926ae3L, ObservationsCondition);
    builder.put(0x18668ef26fc61154L, PartiallyVaccinated);
    builder.put(0x27ebd2392beaa324L, PatientArrivalLine);
    builder.put(0x637eade0e62ce2b8L, PatientArrivals);
    builder.put(0xaabf015be947306L, PatientProfile);
    builder.put(0x18668ef270ed0969L, PatientPropertyConditional);
    builder.put(0x18668ef270ed0a06L, PatientPropertyReference);
    builder.put(0x16d45e8703e0ee1aL, ProcessingTimeLine);
    builder.put(0x16d45e8703e0edf5L, ProcessingTimeTable);
    builder.put(0x18668ef2732bde64L, RecentCOVIDContactCondition);
    builder.put(0x18668ef2732b9054L, RecentCovidContactProperty);
    builder.put(0x29f0721df2f3819L, Resource);
    builder.put(0x4af9c647eff82e7bL, StaffNumber);
    builder.put(0x4f415ebce3f346ecL, StaffType);
    builder.put(0x4af9c647efda3a80L, StaffTypeReference);
    builder.put(0x6ca3e29db47911f9L, SymptomList);
    builder.put(0x6ca3e29db479214fL, Test);
    builder.put(0x549fe0474671cd38L, TestCapturedDisease);
    builder.put(0x18668ef26fc61167L, Unvaccinated);
    builder.put(0x18668ef26fc61141L, VaccinationStatus);
    builder.put(0x18668ef26f431e45L, VaccineStatusCondition);
    builder.put(0x18668ef26f40915dL, VaccineStatusProperty);
    builder.put(0x29f0721df307244L, Variable);
    builder.put(0x18668ef2732bb4e2L, Yes);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
