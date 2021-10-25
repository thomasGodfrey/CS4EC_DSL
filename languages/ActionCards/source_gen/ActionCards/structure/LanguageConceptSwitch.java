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
  public static final int ActionStep = 2;
  public static final int AdmissionAction = 3;
  public static final int AtributeLine = 4;
  public static final int Attribute = 5;
  public static final int AttributeTable = 6;
  public static final int Branch = 7;
  public static final int DiagnosticCondition = 8;
  public static final int Disease = 9;
  public static final int DiseaseInitialiserLine = 10;
  public static final int DiseaseInitialiserTable = 11;
  public static final int DiseaseList = 12;
  public static final int EDScenario = 13;
  public static final int GoToAction = 14;
  public static final int PatientArrivalLine = 15;
  public static final int PatientArrivals = 16;
  public static final int PatientProfile = 17;
  public static final int ProcessingTimeLine = 18;
  public static final int ProcessingTimeTable = 19;
  public static final int Resource = 20;
  public static final int StaffNumber = 21;
  public static final int StaffType = 22;
  public static final int StaffTypeReference = 23;
  public static final int Test = 24;
  public static final int TestCapturedDisease = 25;
  public static final int Variable = 26;

  public LanguageConceptSwitch() {
    LanguageConceptIndexBuilder builder = new LanguageConceptIndexBuilder(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L);
    builder.put(0x2ef557ae9cb06864L, Action);
    builder.put(0x2ef557ae9cb06848L, ActionCard);
    builder.put(0x4f415ebce3f3455bL, ActionStep);
    builder.put(0x78ac3095dfdf9aL, AdmissionAction);
    builder.put(0x25745663764b1a7cL, AtributeLine);
    builder.put(0x25745663758ab027L, Attribute);
    builder.put(0x25745663764b1a60L, AttributeTable);
    builder.put(0x4f415ebce3f3456eL, Branch);
    builder.put(0x29f0721df36170cL, DiagnosticCondition);
    builder.put(0x25745663758ab012L, Disease);
    builder.put(0x296f74efb3f1c23aL, DiseaseInitialiserLine);
    builder.put(0x296f74efb3f1c28bL, DiseaseInitialiserTable);
    builder.put(0x25745663758ab389L, DiseaseList);
    builder.put(0x4af9c647eff82e56L, EDScenario);
    builder.put(0x4f415ebce3f36ef2L, GoToAction);
    builder.put(0x27ebd2392beaa324L, PatientArrivalLine);
    builder.put(0x637eade0e62ce2b8L, PatientArrivals);
    builder.put(0xaabf015be947306L, PatientProfile);
    builder.put(0x16d45e8703e0ee1aL, ProcessingTimeLine);
    builder.put(0x16d45e8703e0edf5L, ProcessingTimeTable);
    builder.put(0x29f0721df2f3819L, Resource);
    builder.put(0x4af9c647eff82e7bL, StaffNumber);
    builder.put(0x4f415ebce3f346ecL, StaffType);
    builder.put(0x4af9c647efda3a80L, StaffTypeReference);
    builder.put(0x4936c0ffc391ca7L, Test);
    builder.put(0x549fe0474671cd38L, TestCapturedDisease);
    builder.put(0x29f0721df307244L, Variable);
    myIndex = builder.seal();
  }

  /*package*/ int index(SConceptId cid) {
    return myIndex.index(cid);
  }

  public int index(SAbstractConcept concept) {
    return myIndex.index(concept);
  }
}
