package ActionCards.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAction = createDescriptorForAction();
  /*package*/ final ConceptDescriptor myConceptActionCard = createDescriptorForActionCard();
  /*package*/ final ConceptDescriptor myConceptActionStep = createDescriptorForActionStep();
  /*package*/ final ConceptDescriptor myConceptAdmissionAction = createDescriptorForAdmissionAction();
  /*package*/ final ConceptDescriptor myConceptAtributeLine = createDescriptorForAtributeLine();
  /*package*/ final ConceptDescriptor myConceptAttribute = createDescriptorForAttribute();
  /*package*/ final ConceptDescriptor myConceptAttributeTable = createDescriptorForAttributeTable();
  /*package*/ final ConceptDescriptor myConceptBranch = createDescriptorForBranch();
  /*package*/ final ConceptDescriptor myConceptDiagnosticCondition = createDescriptorForDiagnosticCondition();
  /*package*/ final ConceptDescriptor myConceptDisease = createDescriptorForDisease();
  /*package*/ final ConceptDescriptor myConceptDiseaseInitialiserLine = createDescriptorForDiseaseInitialiserLine();
  /*package*/ final ConceptDescriptor myConceptDiseaseInitialiserTable = createDescriptorForDiseaseInitialiserTable();
  /*package*/ final ConceptDescriptor myConceptDiseaseList = createDescriptorForDiseaseList();
  /*package*/ final ConceptDescriptor myConceptEDScenario = createDescriptorForEDScenario();
  /*package*/ final ConceptDescriptor myConceptGoToAction = createDescriptorForGoToAction();
  /*package*/ final ConceptDescriptor myConceptPatientArrivalLine = createDescriptorForPatientArrivalLine();
  /*package*/ final ConceptDescriptor myConceptPatientArrivals = createDescriptorForPatientArrivals();
  /*package*/ final ConceptDescriptor myConceptPatientProfile = createDescriptorForPatientProfile();
  /*package*/ final ConceptDescriptor myConceptProcessingTimeLine = createDescriptorForProcessingTimeLine();
  /*package*/ final ConceptDescriptor myConceptProcessingTimeTable = createDescriptorForProcessingTimeTable();
  /*package*/ final ConceptDescriptor myConceptResource = createDescriptorForResource();
  /*package*/ final ConceptDescriptor myConceptStaffNumber = createDescriptorForStaffNumber();
  /*package*/ final ConceptDescriptor myConceptStaffType = createDescriptorForStaffType();
  /*package*/ final ConceptDescriptor myConceptStaffTypeReference = createDescriptorForStaffTypeReference();
  /*package*/ final ConceptDescriptor myConceptTest = createDescriptorForTest();
  /*package*/ final ConceptDescriptor myConceptTestCapturedDisease = createDescriptorForTestCapturedDisease();
  /*package*/ final ConceptDescriptor myConceptVariable = createDescriptorForVariable();
  /*package*/ final EnumerationDescriptor myEnumerationE_Result = new EnumerationDescriptor_E_Result();
  /*package*/ final EnumerationDescriptor myEnumerationE_SEIR = new EnumerationDescriptor_E_SEIR();
  /*package*/ final EnumerationDescriptor myEnumerationE_Severity = new EnumerationDescriptor_E_Severity();
  /*package*/ final EnumerationDescriptor myEnumerationOperators = new EnumerationDescriptor_Operators();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
    deps.extendedLanguage(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, "org.iets3.core.expr.base");
    deps.aggregatedLanguage(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, "AgentLanguage");
    deps.aggregatedLanguage(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, "org.iets3.core.expr.base");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAction, myConceptActionCard, myConceptActionStep, myConceptAdmissionAction, myConceptAtributeLine, myConceptAttribute, myConceptAttributeTable, myConceptBranch, myConceptDiagnosticCondition, myConceptDisease, myConceptDiseaseInitialiserLine, myConceptDiseaseInitialiserTable, myConceptDiseaseList, myConceptEDScenario, myConceptGoToAction, myConceptPatientArrivalLine, myConceptPatientArrivals, myConceptPatientProfile, myConceptProcessingTimeLine, myConceptProcessingTimeTable, myConceptResource, myConceptStaffNumber, myConceptStaffType, myConceptStaffTypeReference, myConceptTest, myConceptTestCapturedDisease, myConceptVariable);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Action:
        return myConceptAction;
      case LanguageConceptSwitch.ActionCard:
        return myConceptActionCard;
      case LanguageConceptSwitch.ActionStep:
        return myConceptActionStep;
      case LanguageConceptSwitch.AdmissionAction:
        return myConceptAdmissionAction;
      case LanguageConceptSwitch.AtributeLine:
        return myConceptAtributeLine;
      case LanguageConceptSwitch.Attribute:
        return myConceptAttribute;
      case LanguageConceptSwitch.AttributeTable:
        return myConceptAttributeTable;
      case LanguageConceptSwitch.Branch:
        return myConceptBranch;
      case LanguageConceptSwitch.DiagnosticCondition:
        return myConceptDiagnosticCondition;
      case LanguageConceptSwitch.Disease:
        return myConceptDisease;
      case LanguageConceptSwitch.DiseaseInitialiserLine:
        return myConceptDiseaseInitialiserLine;
      case LanguageConceptSwitch.DiseaseInitialiserTable:
        return myConceptDiseaseInitialiserTable;
      case LanguageConceptSwitch.DiseaseList:
        return myConceptDiseaseList;
      case LanguageConceptSwitch.EDScenario:
        return myConceptEDScenario;
      case LanguageConceptSwitch.GoToAction:
        return myConceptGoToAction;
      case LanguageConceptSwitch.PatientArrivalLine:
        return myConceptPatientArrivalLine;
      case LanguageConceptSwitch.PatientArrivals:
        return myConceptPatientArrivals;
      case LanguageConceptSwitch.PatientProfile:
        return myConceptPatientProfile;
      case LanguageConceptSwitch.ProcessingTimeLine:
        return myConceptProcessingTimeLine;
      case LanguageConceptSwitch.ProcessingTimeTable:
        return myConceptProcessingTimeTable;
      case LanguageConceptSwitch.Resource:
        return myConceptResource;
      case LanguageConceptSwitch.StaffNumber:
        return myConceptStaffNumber;
      case LanguageConceptSwitch.StaffType:
        return myConceptStaffType;
      case LanguageConceptSwitch.StaffTypeReference:
        return myConceptStaffTypeReference;
      case LanguageConceptSwitch.Test:
        return myConceptTest;
      case LanguageConceptSwitch.TestCapturedDisease:
        return myConceptTestCapturedDisease;
      case LanguageConceptSwitch.Variable:
        return myConceptVariable;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationE_Result, myEnumerationE_SEIR, myEnumerationE_Severity, myEnumerationOperators);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Action", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/3383707102503528548");
    b.version(2);
    b.property("requiresPatient", 0x3f10eb6deabdc338L).type(PrimitiveTypeId.BOOLEAN).origin("4544390881339097912").done();
    b.property("xPos", 0x749103faecdc6bd7L).type(PrimitiveTypeId.INTEGER).origin("8399499156273261527").done();
    b.property("yPos", 0x749103faecdc6bdaL).type(PrimitiveTypeId.INTEGER).origin("8399499156273261530").done();
    b.property("duration", 0x78ac3096ccb324L).type(PrimitiveTypeId.INTEGER).origin("33966321893684004").done();
    b.associate("resource", 0x29f0721df4a9974L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df2f3819L).optional(true).origin("188877551434373492").done();
    b.aggregate("staffTypeReference", 0x4af9c647efdb14f9L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L).optional(false).ordered(true).multiple(false).origin("5402567240276710649").done();
    b.aggregate("location", 0x3f10eb6deabbd805L).target(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33967953caaL).optional(true).ordered(true).multiple(false).origin("4544390881338972165").done();
    b.aggregate("outgoingBranches", 0x29f0721df2f38bbL).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL).optional(true).ordered(true).multiple(true).origin("188877551432579259").done();
    b.aggregate("incomingBranches", 0x29f0721df719ebcL).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL).optional(true).ordered(true).multiple(true).origin("188877551436930748").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionCard() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "ActionCard", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L);
    b.class_(false, false, true);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/3383707102503528520");
    b.version(2);
    b.aggregate("Actions", 0x2ef557ae9cb06877L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L).optional(false).ordered(true).multiple(true).origin("3383707102503528567").done();
    b.aggregate("Branches", 0x2574566374fd2551L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL).optional(true).ordered(true).multiple(true).origin("2698877061866267985").done();
    b.alias("Action Card");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForActionStep() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "ActionStep", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3455bL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5710949967853733211");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAdmissionAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "AdmissionAction", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x78ac3095dfdf9aL);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.Action", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/33966321878163354");
    b.version(2);
    b.alias("admission action");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAtributeLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "AtributeLine", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a7cL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2698877061888154236");
    b.version(2);
    b.associate("attribute", 0x25745663764b1ac7L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab027L).optional(false).origin("2698877061888154311").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAttribute() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Attribute", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab027L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2698877061875544103");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAttributeTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "AttributeTable", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a60L);
    b.class_(false, false, true);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2698877061888154208");
    b.version(2);
    b.aggregate("attributeLines", 0x25745663764b1ad2L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a7cL).optional(true).ordered(true).multiple(true).origin("2698877061888154322").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForBranch() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Branch", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5710949967853733230");
    b.version(2);
    b.property("fromPort", 0x29f0721df719ea5L).type(PrimitiveTypeId.STRING).origin("188877551436930725").done();
    b.property("toPort", 0x29f0721df719ea7L).type(PrimitiveTypeId.STRING).origin("188877551436930727").done();
    b.associate("targetAction", 0x4f415ebce3f345b2L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L).optional(true).origin("5710949967853733298").done();
    b.associate("fromAction", 0x29f0721df71afb6L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L).optional(true).origin("188877551436935094").done();
    b.aggregate("condition", 0x2574566374febfecL).target(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x670d5e92f854a047L).optional(true).ordered(true).multiple(false).origin("2698877061866373100").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiagnosticCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "DiagnosticCondition", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df36170cL);
    b.class_(false, false, false);
    b.super_("org.iets3.core.expr.base.structure.Expression", 0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x670d5e92f854a047L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/188877551433029388");
    b.version(2);
    b.property("outcome", 0x25745663758ab474L).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab07cL)).origin("2698877061875545204").done();
    b.associate("test", 0x29f0721df37881fL).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L).optional(false).origin("188877551433123871").done();
    b.associate("disease", 0x3f397d5ebb790a0cL).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L).optional(false).origin("4555810343887637004").done();
    b.alias("diagnostic condition");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDisease() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Disease", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.Attribute", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab027L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2698877061875544082");
    b.version(2);
    b.property("value", 0x25745663758ab0deL).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab06aL)).origin("2698877061875544286").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiseaseInitialiserLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "DiseaseInitialiserLine", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c23aL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2985733650834899514");
    b.version(2);
    b.property("Condition", 0x296f74efb3f1c256L).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab06aL)).origin("2985733650834899542").done();
    b.property("Prevalence", 0x296f74efb3f1c258L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("2985733650834899544").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiseaseInitialiserTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "DiseaseInitialiserTable", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c28bL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2985733650834899595");
    b.version(2);
    b.associate("Disease", 0x296f74efb3f1c346L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L).optional(true).origin("2985733650834899782").done();
    b.aggregate("lines", 0x296f74efb3f1c2a7L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c23aL).optional(true).ordered(true).multiple(true).origin("2985733650834899623").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiseaseList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "DiseaseList", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab389L);
    b.class_(false, false, true);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2698877061875544969");
    b.version(2);
    b.aggregate("diseases", 0x25745663758ab393L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L).optional(true).ordered(true).multiple(true).origin("2698877061875544979").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForEDScenario() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "EDScenario", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e56L);
    b.class_(false, false, true);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5402567240278617686");
    b.version(2);
    b.aggregate("staffNumbers", 0x4af9c647eff82ea4L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL).optional(true).ordered(true).multiple(true).origin("5402567240278617764").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForGoToAction() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "GoToAction", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f36ef2L);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.ActionStep", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3455bL);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5710949967853743858");
    b.version(2);
    b.aggregate("destination", 0x4f415ebce3f36f0eL).target(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33967953caaL).optional(false).ordered(true).multiple(false).origin("5710949967853743886").done();
    b.alias("Go to a place");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPatientArrivalLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "PatientArrivalLine", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x27ebd2392beaa324L);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/2876623929997959972");
    b.version(2);
    b.property("Time", 0x27ebd2392beaa32eL).type(PrimitiveTypeId.INTEGER).origin("2876623929997959982").done();
    b.property("NumPatientsInHour", 0x27ebd2392beaa330L).type(PrimitiveTypeId.INTEGER).origin("2876623929997959984").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPatientArrivals() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "PatientArrivals", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x637eade0e62ce2b8L);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/7169358838266389176");
    b.version(2);
    b.aggregate("PatientArrivalLines", 0x27ebd2392beaa3d1L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x27ebd2392beaa324L).optional(true).ordered(true).multiple(true).origin("2876623929997960145").done();
    b.aggregate("ArrivalLocation", 0xaabf015bf63b5d0L).target(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33967953caaL).optional(false).ordered(true).multiple(false).origin("768972137592763856").done();
    b.alias("Patient Arrivals");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForPatientProfile() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "PatientProfile", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L);
    b.class_(false, false, true);
    b.super_("ActionCards.structure.StaffType", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/768972137579180806");
    b.version(2);
    b.aggregate("attributes", 0xaabf015be951259L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab027L).optional(true).ordered(true).multiple(true).origin("768972137579221593").done();
    b.aggregate("arrivalRate", 0xaabf015be951280L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x637eade0e62ce2b8L).optional(false).ordered(true).multiple(false).origin("768972137579221632").done();
    b.aggregate("diseaseTables", 0x296f74efb3f628b0L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c28bL).optional(true).ordered(true).multiple(true).origin("2985733650835187888").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProcessingTimeLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "ProcessingTimeLine", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0ee1aL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/1645043697875742234");
    b.version(2);
    b.property("Time", 0x16d45e8703e0ee36L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("1645043697875742262").done();
    b.property("Occurances", 0x16d45e8703e0ee38L).type(PrimitiveTypeId.INTEGER).origin("1645043697875742264").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProcessingTimeTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "ProcessingTimeTable", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0edf5L);
    b.class_(false, false, true);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/1645043697875742197");
    b.version(2);
    b.aggregate("ProcessingTimeLines", 0x16d45e8703e0ee61L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0ee1aL).optional(true).ordered(true).multiple(true).origin("1645043697875742305").done();
    b.alias("Test processing time table");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResource() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Resource", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df2f3819L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/188877551432579097");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStaffNumber() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "StaffNumber", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5402567240278617723");
    b.version(2);
    b.property("number", 0x4af9c647eff82e85L).type(PrimitiveTypeId.INTEGER).origin("5402567240278617733").done();
    b.associate("staff", 0x4af9c647eff82e87L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL).optional(false).origin("5402567240278617735").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStaffType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "StaffType", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5710949967853733612");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForStaffTypeReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "StaffTypeReference", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/5402567240276654720");
    b.version(2);
    b.associate("staffType", 0x4af9c647efda3aa5L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL).optional(false).origin("5402567240276654757").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTest() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Test", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L);
    b.class_(false, false, true);
    b.super_("ActionCards.structure.Resource", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df2f3819L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/329726013640088743");
    b.version(2);
    b.aggregate("ProcessingTimeTable", 0x16d45e8703e0ee93L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0edf5L).optional(true).ordered(true).multiple(false).origin("1645043697875742355").done();
    b.aggregate("CapturedDiseases", 0x549fe0474671ce43L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x549fe0474671cd38L).optional(false).ordered(true).multiple(true).origin("6097839017212104259").done();
    b.alias("test");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestCapturedDisease() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "TestCapturedDisease", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x549fe0474671cd38L);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/6097839017212103992");
    b.version(2);
    b.property("Sensitivity", 0x549fe0474671cd6fL).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("6097839017212104047").done();
    b.property("Specificity", 0x549fe0474671cd70L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("6097839017212104048").done();
    b.associate("disease", 0x549fe0474671cd85L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L).optional(false).origin("6097839017212104069").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVariable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("ActionCards", "Variable", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df307244L);
    b.class_(false, false, false);
    b.origin("r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)/188877551432659524");
    b.version(2);
    return b.create();
  }
}
