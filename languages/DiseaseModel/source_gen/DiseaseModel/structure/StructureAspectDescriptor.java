package DiseaseModel.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptAsymptomatic = createDescriptorForAsymptomatic();
  /*package*/ final ConceptDescriptor myConceptCompositeDiagnosticCondition = createDescriptorForCompositeDiagnosticCondition();
  /*package*/ final ConceptDescriptor myConceptCompositeTest = createDescriptorForCompositeTest();
  /*package*/ final ConceptDescriptor myConceptCompositeTestResultCondition = createDescriptorForCompositeTestResultCondition();
  /*package*/ final ConceptDescriptor myConceptConditionalLine = createDescriptorForConditionalLine();
  /*package*/ final ConceptDescriptor myConceptConditionalSelection = createDescriptorForConditionalSelection();
  /*package*/ final ConceptDescriptor myConceptDiagnosticCondition = createDescriptorForDiagnosticCondition();
  /*package*/ final ConceptDescriptor myConceptDisease = createDescriptorForDisease();
  /*package*/ final ConceptDescriptor myConceptDiseaseSymptom = createDescriptorForDiseaseSymptom();
  /*package*/ final ConceptDescriptor myConceptDiseaseSymptomReference = createDescriptorForDiseaseSymptomReference();
  /*package*/ final ConceptDescriptor myConceptDiseaseTest = createDescriptorForDiseaseTest();
  /*package*/ final ConceptDescriptor myConceptExposed = createDescriptorForExposed();
  /*package*/ final ConceptDescriptor myConceptImmunocompromisedCondition = createDescriptorForImmunocompromisedCondition();
  /*package*/ final ConceptDescriptor myConceptInfected = createDescriptorForInfected();
  /*package*/ final ConceptDescriptor myConceptInfectionSpreadLine = createDescriptorForInfectionSpreadLine();
  /*package*/ final ConceptDescriptor myConceptInfectionSpreadTable = createDescriptorForInfectionSpreadTable();
  /*package*/ final ConceptDescriptor myConceptInfectionStatus = createDescriptorForInfectionStatus();
  /*package*/ final ConceptDescriptor myConceptInfectionStatusCondition = createDescriptorForInfectionStatusCondition();
  /*package*/ final ConceptDescriptor myConceptObservationTest = createDescriptorForObservationTest();
  /*package*/ final ConceptDescriptor myConceptObservationsCondition = createDescriptorForObservationsCondition();
  /*package*/ final ConceptDescriptor myConceptProbabilityDistribution = createDescriptorForProbabilityDistribution();
  /*package*/ final ConceptDescriptor myConceptProbabilityDistributionLine = createDescriptorForProbabilityDistributionLine();
  /*package*/ final ConceptDescriptor myConceptProcessingTimeLine = createDescriptorForProcessingTimeLine();
  /*package*/ final ConceptDescriptor myConceptProcessingTimeTable = createDescriptorForProcessingTimeTable();
  /*package*/ final ConceptDescriptor myConceptResultsMappingLine = createDescriptorForResultsMappingLine();
  /*package*/ final ConceptDescriptor myConceptResultsMappingTable = createDescriptorForResultsMappingTable();
  /*package*/ final ConceptDescriptor myConceptSusceptibilityStatus = createDescriptorForSusceptibilityStatus();
  /*package*/ final ConceptDescriptor myConceptSusceptible = createDescriptorForSusceptible();
  /*package*/ final ConceptDescriptor myConceptSymptomatic = createDescriptorForSymptomatic();
  /*package*/ final ConceptDescriptor myConceptTest = createDescriptorForTest();
  /*package*/ final ConceptDescriptor myConceptTestCapturedDisease = createDescriptorForTestCapturedDisease();
  /*package*/ final ConceptDescriptor myConceptTestOutcome = createDescriptorForTestOutcome();
  /*package*/ final ConceptDescriptor myConceptTestSelectionRule = createDescriptorForTestSelectionRule();
  /*package*/ final ConceptDescriptor myConceptTestSelectionRuleLine = createDescriptorForTestSelectionRuleLine();
  /*package*/ final ConceptDescriptor myConceptTestSelectionStrategy = createDescriptorForTestSelectionStrategy();
  /*package*/ final ConceptDescriptor myConceptUnvaccinated = createDescriptorForUnvaccinated();
  /*package*/ final ConceptDescriptor myConceptVaccinated = createDescriptorForVaccinated();
  /*package*/ final ConceptDescriptor myConceptVaccineStatus = createDescriptorForVaccineStatus();
  /*package*/ final ConceptDescriptor myConceptVaccineStatusCondition = createDescriptorForVaccineStatusCondition();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, "ActionCards");
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
    deps.extendedLanguage(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, "org.iets3.core.expr.base");
    deps.extendedLanguage(0x1a0150acdda54129L, 0x824e01dce96fdea4L, "BuiltEnvironment");
    deps.aggregatedLanguage(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, "org.iets3.core.expr.base");
    deps.aggregatedLanguage(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, "ActionCards");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAsymptomatic, myConceptCompositeDiagnosticCondition, myConceptCompositeTest, myConceptCompositeTestResultCondition, myConceptConditionalLine, myConceptConditionalSelection, myConceptDiagnosticCondition, myConceptDisease, myConceptDiseaseSymptom, myConceptDiseaseSymptomReference, myConceptDiseaseTest, myConceptExposed, myConceptImmunocompromisedCondition, myConceptInfected, myConceptInfectionSpreadLine, myConceptInfectionSpreadTable, myConceptInfectionStatus, myConceptInfectionStatusCondition, myConceptObservationTest, myConceptObservationsCondition, myConceptProbabilityDistribution, myConceptProbabilityDistributionLine, myConceptProcessingTimeLine, myConceptProcessingTimeTable, myConceptResultsMappingLine, myConceptResultsMappingTable, myConceptSusceptibilityStatus, myConceptSusceptible, myConceptSymptomatic, myConceptTest, myConceptTestCapturedDisease, myConceptTestOutcome, myConceptTestSelectionRule, myConceptTestSelectionRuleLine, myConceptTestSelectionStrategy, myConceptUnvaccinated, myConceptVaccinated, myConceptVaccineStatus, myConceptVaccineStatusCondition);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.Asymptomatic:
        return myConceptAsymptomatic;
      case LanguageConceptSwitch.CompositeDiagnosticCondition:
        return myConceptCompositeDiagnosticCondition;
      case LanguageConceptSwitch.CompositeTest:
        return myConceptCompositeTest;
      case LanguageConceptSwitch.CompositeTestResultCondition:
        return myConceptCompositeTestResultCondition;
      case LanguageConceptSwitch.ConditionalLine:
        return myConceptConditionalLine;
      case LanguageConceptSwitch.ConditionalSelection:
        return myConceptConditionalSelection;
      case LanguageConceptSwitch.DiagnosticCondition:
        return myConceptDiagnosticCondition;
      case LanguageConceptSwitch.Disease:
        return myConceptDisease;
      case LanguageConceptSwitch.DiseaseSymptom:
        return myConceptDiseaseSymptom;
      case LanguageConceptSwitch.DiseaseSymptomReference:
        return myConceptDiseaseSymptomReference;
      case LanguageConceptSwitch.DiseaseTest:
        return myConceptDiseaseTest;
      case LanguageConceptSwitch.Exposed:
        return myConceptExposed;
      case LanguageConceptSwitch.ImmunocompromisedCondition:
        return myConceptImmunocompromisedCondition;
      case LanguageConceptSwitch.Infected:
        return myConceptInfected;
      case LanguageConceptSwitch.InfectionSpreadLine:
        return myConceptInfectionSpreadLine;
      case LanguageConceptSwitch.InfectionSpreadTable:
        return myConceptInfectionSpreadTable;
      case LanguageConceptSwitch.InfectionStatus:
        return myConceptInfectionStatus;
      case LanguageConceptSwitch.InfectionStatusCondition:
        return myConceptInfectionStatusCondition;
      case LanguageConceptSwitch.ObservationTest:
        return myConceptObservationTest;
      case LanguageConceptSwitch.ObservationsCondition:
        return myConceptObservationsCondition;
      case LanguageConceptSwitch.ProbabilityDistribution:
        return myConceptProbabilityDistribution;
      case LanguageConceptSwitch.ProbabilityDistributionLine:
        return myConceptProbabilityDistributionLine;
      case LanguageConceptSwitch.ProcessingTimeLine:
        return myConceptProcessingTimeLine;
      case LanguageConceptSwitch.ProcessingTimeTable:
        return myConceptProcessingTimeTable;
      case LanguageConceptSwitch.ResultsMappingLine:
        return myConceptResultsMappingLine;
      case LanguageConceptSwitch.ResultsMappingTable:
        return myConceptResultsMappingTable;
      case LanguageConceptSwitch.SusceptibilityStatus:
        return myConceptSusceptibilityStatus;
      case LanguageConceptSwitch.Susceptible:
        return myConceptSusceptible;
      case LanguageConceptSwitch.Symptomatic:
        return myConceptSymptomatic;
      case LanguageConceptSwitch.Test:
        return myConceptTest;
      case LanguageConceptSwitch.TestCapturedDisease:
        return myConceptTestCapturedDisease;
      case LanguageConceptSwitch.TestOutcome:
        return myConceptTestOutcome;
      case LanguageConceptSwitch.TestSelectionRule:
        return myConceptTestSelectionRule;
      case LanguageConceptSwitch.TestSelectionRuleLine:
        return myConceptTestSelectionRuleLine;
      case LanguageConceptSwitch.TestSelectionStrategy:
        return myConceptTestSelectionStrategy;
      case LanguageConceptSwitch.Unvaccinated:
        return myConceptUnvaccinated;
      case LanguageConceptSwitch.Vaccinated:
        return myConceptVaccinated;
      case LanguageConceptSwitch.VaccineStatus:
        return myConceptVaccineStatus;
      case LanguageConceptSwitch.VaccineStatusCondition:
        return myConceptVaccineStatusCondition;
      default:
        return null;
    }
  }


  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForAsymptomatic() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Asymptomatic", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab311194bL);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.Infected", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111910L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512513355");
    b.version(2);
    b.alias("Asymptomatic");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCompositeDiagnosticCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "CompositeDiagnosticCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x19d87264f3d651cfL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1862364223830905295");
    b.version(2);
    b.property("outcome", 0x19d87264f3d651d2L).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab07cL)).origin("1862364223830905298").done();
    b.associate("test", 0x19d87264f3d651d0L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b87564L).optional(false).origin("1862364223830905296").done();
    b.associate("disease", 0x19d87264f3d651d1L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L).optional(false).origin("1862364223830905297").done();
    b.alias("composite diagnostic condition");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCompositeTest() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "CompositeTest", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b87564L);
    b.class_(false, false, true);
    b.super_("DiseaseModel.structure.Test", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db479214fL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3866749931154339172");
    b.version(2);
    b.aggregate("testSelectionStrategy", 0x35a9749351b87569L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8756cL).optional(false).ordered(true).multiple(false).origin("3866749931154339177").done();
    b.aggregate("resultsMappingTable", 0x31419b89f2ca8480L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x31419b89f2ca37a8L).optional(false).ordered(true).multiple(false).origin("3549288998130844800").done();
    b.alias("composite test");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForCompositeTestResultCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "CompositeTestResultCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x2c006337dddd52a9L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3170643229265449641");
    b.version(2);
    b.property("outcome", 0x2c006337dddd52aaL).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab07cL)).origin("3170643229265449642").done();
    b.associate("test", 0x2c006337dddd52acL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b87564L).optional(false).origin("3170643229265449644").done();
    b.associate("disease", 0x2c006337dddd52aeL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L).optional(false).origin("3170643229265449646").done();
    b.alias("composite test result condition");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConditionalLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ConditionalLine", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x465f14a415e67319L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/5070794400417084185");
    b.version(2);
    b.associate("test", 0x465f14a415e6734dL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db479214fL).optional(false).origin("5070794400417084237").done();
    b.aggregate("condition", 0x465f14a415e6734bL).target(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x670d5e92f854a047L).optional(false).ordered(true).multiple(false).origin("5070794400417084235").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForConditionalSelection() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ConditionalSelection", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x465f14a415e67306L);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.TestSelectionStrategy", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8756cL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/5070794400417084166");
    b.version(2);
    b.aggregate("lines", 0x465f14a415e67362L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x465f14a415e67319L).optional(true).ordered(true).multiple(true).origin("5070794400417084258").done();
    b.alias("conditional distribution");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiagnosticCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "DiagnosticCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x29f0721df36170cL);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.BranchConditional", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fa67c60L);
    b.parent(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x74711ce3321800daL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/188877551433029388");
    b.version(2);
    b.property("outcome", 0x25745663758ab474L).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab07cL)).origin("2698877061875545204").done();
    b.associate("test", 0x29f0721df37881fL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db479214fL).optional(false).origin("188877551433123871").done();
    b.associate("disease", 0x3f397d5ebb790a0cL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L).optional(false).origin("4555810343887637004").done();
    b.alias("diagnostic condition");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDisease() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Disease", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/2698877061875544082");
    b.version(2);
    b.aggregate("symptomReferences", 0x6ca3e29db479125cL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db4791247L).optional(true).ordered(true).multiple(true).origin("7828349744265630300").done();
    b.aggregate("infectionSpreadTable", 0x1c9634cb4b041bc7L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x1c9634cb4b041b5dL).optional(true).ordered(true).multiple(false).origin("2059891927310146503").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiseaseSymptom() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "DiseaseSymptom", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db4791132L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/7828349744265630002");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiseaseSymptomReference() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "DiseaseSymptomReference", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db4791247L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/7828349744265630279");
    b.version(2);
    b.associate("symptom", 0x6ca3e29db4791251L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db4791132L).optional(false).origin("7828349744265630289").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForDiseaseTest() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "DiseaseTest", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x4936c0ffc391ca7L);
    b.class_(false, false, true);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/329726013640088743");
    b.version(2);
    b.property("sensitivity", 0x31419b89f22801d0L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("3549288998120194512").done();
    b.property("specificity", 0x31419b89f22801d2L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("3549288998120194514").done();
    b.associate("disease", 0x31419b89f22801cbL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L).optional(false).origin("3549288998120194507").done();
    b.alias("disease test");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForExposed() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Exposed", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x1c9634cb4b0672f6L);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.Infected", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111910L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/2059891927310299894");
    b.version(2);
    b.alias("Exposed");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForImmunocompromisedCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ImmunocompromisedCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x18668ef2755ea288L);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.PatientPropertyConditional", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1758249876537123464");
    b.version(2);
    b.alias("check if patient is immuno-compromised");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInfected() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Infected", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111910L);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.InfectionStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab31118fbL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512513296");
    b.version(2);
    b.alias("Infected");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInfectionSpreadLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "InfectionSpreadLine", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x1c9634cb4b041b5eL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/2059891927310146398");
    b.version(2);
    b.property("distance", 0x1c9634cb4b041b61L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("2059891927310146401").done();
    b.property("spreadChance", 0x1c9634cb4b041b63L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("2059891927310146403").done();
    b.aggregate("infectionStatus", 0x1c9634cb4b041b5fL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab31118fbL).optional(false).ordered(true).multiple(false).origin("2059891927310146399").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInfectionSpreadTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "InfectionSpreadTable", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x1c9634cb4b041b5dL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/2059891927310146397");
    b.version(2);
    b.aggregate("lines", 0x1c9634cb4b041baeL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x1c9634cb4b041b5eL).optional(true).ordered(true).multiple(true).origin("2059891927310146478").done();
    b.alias("Infection spread table");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInfectionStatus() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "InfectionStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab31118fbL);
    b.class_(false, false, false);
    b.super_("org.iets3.core.expr.base.structure.Expression", 0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x670d5e92f854a047L);
    b.parent(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x34a8e13b09c97b2cL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512513275");
    b.version(2);
    b.alias("Infection Status");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForInfectionStatusCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "InfectionStatusCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x18668ef27101e2faL);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.PatientPropertyConditional", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1758249876463936250");
    b.version(2);
    b.alias("check infection status of a patient");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForObservationTest() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ObservationTest", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db47911a7L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/7828349744265630119");
    b.version(2);
    b.aggregate("SymptomReference", 0x6ca3e29db47912c5L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db4791247L).optional(true).ordered(true).multiple(true).origin("7828349744265630405").done();
    b.alias("observation");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForObservationsCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ObservationsCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db4926ae3L);
    b.class_(false, false, false);
    b.parent(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x74711ce3321800daL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/7828349744267291363");
    b.version(2);
    b.property("outcome", 0x6ca3e29db4926b23L).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab07cL)).origin("7828349744267291427").done();
    b.associate("test", 0x6ca3e29db4926b37L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db47911a7L).optional(true).origin("7828349744267291447").done();
    b.alias("observations result");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProbabilityDistribution() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ProbabilityDistribution", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8eff3L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3866749931154370547");
    b.version(2);
    b.aggregate("lines", 0x35a9749351b8f06aL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8f00eL).optional(true).ordered(true).multiple(true).origin("3866749931154370666").done();
    b.alias("probability distribution");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProbabilityDistributionLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ProbabilityDistributionLine", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8f00eL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3866749931154370574");
    b.version(2);
    b.property("probability", 0x35a9749351b8f00fL).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("3866749931154370575").done();
    b.associate("test", 0x35a9749351b8f081L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db479214fL).optional(false).origin("3866749931154370689").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProcessingTimeLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ProcessingTimeLine", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x16d45e8703e0ee1aL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1645043697875742234");
    b.version(2);
    b.property("Time", 0x16d45e8703e0ee36L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("1645043697875742262").done();
    b.property("Occurances", 0x16d45e8703e0ee38L).type(PrimitiveTypeId.INTEGER).origin("1645043697875742264").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForProcessingTimeTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ProcessingTimeTable", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x16d45e8703e0edf5L);
    b.class_(false, false, true);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1645043697875742197");
    b.version(2);
    b.aggregate("ProcessingTimeLines", 0x16d45e8703e0ee61L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x16d45e8703e0ee1aL).optional(true).ordered(true).multiple(true).origin("1645043697875742305").done();
    b.alias("Test processing time table");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResultsMappingLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ResultsMappingLine", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x31419b89f2ca37faL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3549288998130825210");
    b.version(2);
    b.associate("Disease", 0x31419b89f2ca381fL).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L).optional(false).origin("3549288998130825247").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResultsMappingTable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "ResultsMappingTable", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x31419b89f2ca37a8L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3549288998130825128");
    b.version(2);
    b.aggregate("lines", 0x31419b89f2ca38e7L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x31419b89f2ca37faL).optional(true).ordered(true).multiple(true).origin("3549288998130825447").done();
    b.alias("results mapping table");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSusceptibilityStatus() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "SusceptibilityStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111979L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512513401");
    b.version(2);
    b.aggregate("InfectionStatus", 0x5dc1936ab32b6e54L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab31118fbL).optional(false).ordered(true).multiple(false).origin("6755843002514239060").done();
    b.aggregate("VaccineStatus", 0x5dc1936ab32b6e58L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111fd4L).optional(false).ordered(true).multiple(false).origin("6755843002514239064").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSusceptible() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Susceptible", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111925L);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.InfectionStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab31118fbL);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512513317");
    b.version(2);
    b.alias("Susceptible");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForSymptomatic() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Symptomatic", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111938L);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.Infected", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111910L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512513336");
    b.version(2);
    b.alias("Symptomatic");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTest() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Test", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x6ca3e29db479214fL);
    b.class_(false, false, true);
    b.super_("BuiltEnvironment.structure.Resource", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07f032c8d7L);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/7828349744265634127");
    b.version(2);
    b.aggregate("ProcessingTimeTable", 0x6ca3e29db4792188L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x16d45e8703e0edf5L).optional(true).ordered(true).multiple(false).origin("7828349744265634184").done();
    b.aggregate("TestingProcess", 0x348ff1b011d7b149L).target(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2758152c8L).optional(true).ordered(true).multiple(false).origin("3787511550157762889").done();
    b.aggregate("Captures", 0x31419b89f22801c7L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x4936c0ffc391ca7L).optional(true).ordered(true).multiple(true).origin("3549288998120194503").done();
    b.alias("test");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestCapturedDisease() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "TestCapturedDisease", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x549fe0474671cd38L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6097839017212103992");
    b.version(2);
    b.property("Sensitivity", 0x549fe0474671cd6fL).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("6097839017212104047").done();
    b.property("Specificity", 0x549fe0474671cd70L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d467289bcL)).origin("6097839017212104048").done();
    b.associate("disease", 0x549fe0474671cd85L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x25745663758ab012L).optional(false).origin("6097839017212104069").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestOutcome() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "TestOutcome", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x19d87264f3d59728L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1862364223830857512");
    b.version(2);
    b.property("outcome", 0x31419b89f22801d9L).type(MetaIdFactory.dataTypeId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab07cL)).origin("3549288998120194521").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestSelectionRule() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "TestSelectionRule", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b87572L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3866749931154339186");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestSelectionRuleLine() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "TestSelectionRuleLine", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8756dL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3866749931154339181");
    b.version(2);
    b.aggregate("rule", 0x35a9749351b87570L).target(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b87572L).optional(false).ordered(true).multiple(false).origin("3866749931154339184").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForTestSelectionStrategy() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "TestSelectionStrategy", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x35a9749351b8756cL);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/3866749931154339180");
    b.version(2);
    b.alias("test selection strategy");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForUnvaccinated() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Unvaccinated", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3112032L);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.VaccineStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111fd4L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512515122");
    b.version(2);
    b.alias("Unvaccinated");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVaccinated() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "Vaccinated", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab311201fL);
    b.class_(false, false, false);
    b.super_("DiseaseModel.structure.VaccineStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111fd4L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512515103");
    b.version(2);
    b.alias("Vaccinated");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVaccineStatus() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "VaccineStatus", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111fd4L);
    b.class_(false, false, false);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/6755843002512515028");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForVaccineStatusCondition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("DiseaseModel", "VaccineStatusCondition", 0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x18668ef26f431e45L);
    b.class_(false, false, false);
    b.super_("ActionCards.structure.PatientPropertyConditional", 0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L);
    b.origin("r:05ae8c50-350e-4329-955e-32a7f7194003(DiseaseModel.structure)/1758249876434656837");
    b.version(2);
    b.alias("check vaccine status of patient");
    return b.create();
  }
}
