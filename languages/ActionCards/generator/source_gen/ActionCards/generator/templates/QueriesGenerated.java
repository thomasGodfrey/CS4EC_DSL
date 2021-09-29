package ActionCards.generator.templates;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import ActionCards.behavior.Action__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import jetbrains.mps.internal.collections.runtime.IVisitor;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.generator.template.ReferenceMacroContext;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SEnumOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import java.util.Objects;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodeContext;
import jetbrains.mps.generator.template.SourceSubstituteMacroNodesContext;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.generator.template.InsertMacroContext;
import jetbrains.mps.generator.template.TemplateQueryContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.SourceNodeQuery;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.SourceNodesQuery;
import java.util.Collection;
import jetbrains.mps.util.IterableUtil;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.generator.impl.query.IfMacroCondition;
import jetbrains.mps.generator.impl.query.ReferenceTargetQuery;
import jetbrains.mps.generator.impl.query.InsertMacroQuery;
import jetbrains.mps.generator.impl.query.LabelInputQuery;
import jetbrains.mps.generator.template.LabelKeyQueryContext;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SConcept;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_3_0(final PropertyMacroContext _context) {
    return Action__BehaviorDescriptor.getFormattedName_id2lOlAdPvbFq.invoke(SLinkOperations.getTarget(_context.getNode(), LINKS.targetAction$Z7ub)) + "Trigger";
  }
  public static Object propertyMacro_GetValue_4_0(final PropertyMacroContext _context) {
    return (String) Action__BehaviorDescriptor.getFormattedName_id2lOlAdPvbFq.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetValue_8_0(final PropertyMacroContext _context) {
    return (Double.parseDouble(SPropertyOperations.getString(_context.getNode(), PROPS.Sensitivity$Zmvc)) / 100) + "";
  }
  public static Object propertyMacro_GetValue_8_1(final PropertyMacroContext _context) {
    return (Double.parseDouble(SPropertyOperations.getString(_context.getNode(), PROPS.Specificity$ZmXe)) / 100) + "";
  }
  public static Object propertyMacro_GetValue_8_2(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_8_3(final PropertyMacroContext _context) {
    final Wrappers._T<Integer> sum = new Wrappers._T<Integer>(1);
    ListSequence.fromList(SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), LINKS.ProcessingTimeTable$iO6F), LINKS.ProcessingTimeLines$e7T7)).visitAll(new IVisitor<SNode>() {
      public void visit(SNode it) {
        sum.value += SPropertyOperations.getInteger(it, PROPS.Occurances$bnEV);
      }
    });
    return sum.value;
  }
  public static Object propertyMacro_GetValue_8_4(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), PROPS.Occurances$bnEV);
  }
  public static Object propertyMacro_GetValue_8_5(final PropertyMacroContext _context) {
    return Integer.valueOf(SPropertyOperations.getString(_context.getNode(), PROPS.Time$bncT)) * 60;
  }
  public static Object propertyMacro_GetValue_8_6(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_8_7(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_9_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getEnum(_context.getNode(), PROPS.value$Cizf).getName();
  }
  public static Object propertyMacro_GetValue_9_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object propertyMacro_GetValue_10_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), PROPS.NumPatientsInHour$_nla);
  }
  public static Object propertyMacro_GetValue_11_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getInteger(_context.getNode(), PROPS.number$HYc8);
  }
  public static Object propertyMacro_GetValue_12_0(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL).toLowerCase();
  }
  public static Object referenceMacro_GetReferent_3_0(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.targetAction$Z7ub), LINKS.staffTypeReference$jtXw), LINKS.staffType$$i7d), "staffReduction");
  }
  public static Object referenceMacro_GetReferent_3_1(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(SLinkOperations.getTarget(SNodeOperations.getNodeAncestor(_context.getNode(), CONCEPTS.Action$K5, false, false), LINKS.staffTypeReference$jtXw), LINKS.staffType$$i7d), "staffReduction");
  }
  public static Object referenceMacro_GetReferent_4_0(final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.location$2x_J), LINKS.roomType$xuJp);
  }
  public static Object referenceMacro_GetReferent_4_1(final ReferenceMacroContext _context) {
    return SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd010732aL, "AgentLanguage.structure.Signal"));
  }
  public static Object referenceMacro_GetReferent_5_0(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(_context.getNode(), "SignalReduction");
  }
  public static Object referenceMacro_GetReferent_6_0(final ReferenceMacroContext _context) {
    return SLinkOperations.getTarget(SLinkOperations.getTarget(_context.getNode(), LINKS.testType$pirF), LINKS.testCategoryType$2nw8);
  }
  public static Object referenceMacro_GetReferent_7_0(final ReferenceMacroContext _context) {
    SNode newDataMap = SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f0c96L, "AgentLanguage.structure.DataMap"));

    SPropertyOperations.assignEnum(newDataMap, PROPS.valueType$F2s2, SEnumOperations.getMember(MetaAdapterFactory.getEnumeration(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d9709f40L, "AgentLanguage.structure.BaseType"), 0x226b0bb9136503b3L, "Person"));
    SPropertyOperations.assign(newDataMap, PROPS.name$MnvL, "patient");

    return newDataMap;
  }
  public static Object referenceMacro_GetReferent_7_1(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(((SNode) SLinkOperations.getTarget(_context.getNode(), LINKS.targetAction$Z7ub)), "SignalReduction");
  }
  public static Object referenceMacro_GetReferent_8_0(final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object referenceMacro_GetReferent_8_1(final ReferenceMacroContext _context) {
    return SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
  }
  public static Object referenceMacro_GetReferent_10_0(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SNodeOperations.getNodeAncestor(_context.getNode(), CONCEPTS.PatientProfile$ZT, false, false), "staffReduction");
  }
  public static Object referenceMacro_GetReferent_10_1(final ReferenceMacroContext _context) {
    return SConceptOperations.createNewNode(MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33966e8fe19L, "AgentLanguage.structure.RoomType"));
  }
  public static Object referenceMacro_GetReferent_11_0(final ReferenceMacroContext _context) {
    return _context.getOutputNodeByInputNodeAndMappingLabel(SLinkOperations.getTarget(_context.getNode(), LINKS.staff$HYEa), "staffReduction");
  }
  public static boolean ifMacro_Condition_1_0(final IfMacroContext _context) {
    return false;
  }
  public static boolean ifMacro_Condition_4_0(final IfMacroContext _context) {
    return !(Objects.equals(SLinkOperations.getTarget(_context.getNode(), LINKS.location$2x_J), null));
  }
  public static boolean ifMacro_Condition_4_1(final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), PROPS.requiresPatient$9L4w);
  }
  public static boolean ifMacro_Condition_4_2(final IfMacroContext _context) {
    return ListSequence.fromList(SModelOperations.nodes(_context.getInputModel(), CONCEPTS.Branch$sq)).any(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SLinkOperations.getTarget(it, LINKS.targetAction$Z7ub) == _context.getNode();
      }
    });
  }
  public static boolean ifMacro_Condition_8_0(final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), LINKS.ProcessingTimeTable$iO6F) != null);
  }
  public static boolean ifMacro_Condition_8_1(final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), LINKS.ProcessingTimeTable$iO6F) != null);
  }
  public static boolean ifMacro_Condition_8_2(final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), LINKS.ProcessingTimeTable$iO6F) != null);
  }
  public static boolean ifMacro_Condition_8_3(final IfMacroContext _context) {
    return (SLinkOperations.getTarget(_context.getNode(), LINKS.ProcessingTimeTable$iO6F) != null);
  }
  public static SNode sourceNodeQuery_6_0(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), LINKS.IfPositive$pnP2);
  }
  public static SNode sourceNodeQuery_6_1(final SourceSubstituteMacroNodeContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), LINKS.IfNegative$rZmc);
  }
  public static Iterable<SNode> sourceNodesQuery_1_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.collectMany(SModelOperations.roots(_context.getInputModel(), CONCEPTS.DiseaseList$8$), LINKS.diseases$1RjC);
  }
  public static Iterable<SNode> sourceNodesQuery_1_1(final SourceSubstituteMacroNodesContext _context) {
    return Sequence.fromIterable(SLinkOperations.collectMany(SModelOperations.roots(_context.getInputModel(), CONCEPTS.ActionCard$eb), LINKS.Actions$nh$G)).where(new IWhereFilter<SNode>() {
      public boolean accept(SNode it) {
        return SPropertyOperations.getString(SLinkOperations.getTarget(SLinkOperations.getTarget(it, LINKS.staffTypeReference$jtXw), LINKS.staffType$$i7d), PROPS.name$MnvL) == SPropertyOperations.getString(_context.getNode(), PROPS.name$MnvL);
      }
    });
  }
  public static Iterable<SNode> sourceNodesQuery_3_0(final SourceSubstituteMacroNodesContext _context) {
    return SModelOperations.nodes(_context.getInputModel(), CONCEPTS.Branch$sq);
  }
  public static Iterable<SNode> sourceNodesQuery_4_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.outgoingBranches$cwqF);
  }
  public static Iterable<SNode> sourceNodesQuery_8_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(SLinkOperations.getTarget(_context.getNode(), LINKS.ProcessingTimeTable$iO6F), LINKS.ProcessingTimeLines$e7T7);
  }
  public static Iterable<SNode> sourceNodesQuery_10_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.PatientArrivalLines$6zwB);
  }
  public static Iterable<SNode> sourceNodesQuery_11_0(final SourceSubstituteMacroNodesContext _context) {
    return SLinkOperations.getChildren(_context.getNode(), LINKS.staffNumbers$IepE);
  }
  public static SNode insertMacro_Query_10_0(final InsertMacroContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), LINKS.ArrivalLocation$5hIS);
  }
  public static SNode labelMapNode3_0(final TemplateQueryContext _context) {
    return SLinkOperations.getTarget(_context.getNode(), LINKS.targetAction$Z7ub);
  }
  private final Map<String, SourceNodeQuery> snqMethods = new HashMap<String, SourceNodeQuery>();
  {
    int i = 0;
    snqMethods.put("4544390881339160584", new SNQ(i++));
    snqMethods.put("4544390881339160802", new SNQ(i++));
  }
  @NotNull
  @Override
  public SourceNodeQuery getSourceNodeQuery(@NotNull QueryKey identity) {
    SourceNodeQuery query = identity.forFunctionNode(snqMethods);
    return (query != null ? query : super.getSourceNodeQuery(identity));
  }
  private static class SNQ implements SourceNodeQuery {
    private final int methodKey;
    public SNQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Nullable
    public SNode evaluate(@NotNull SourceSubstituteMacroNodeContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.sourceNodeQuery_6_0(ctx);
        case 1:
          return QueriesGenerated.sourceNodeQuery_6_1(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, SourceNodesQuery> snsqMethods = new HashMap<String, SourceNodesQuery>();
  {
    int i = 0;
    snsqMethods.put("768972137533170326", new SNsQ(i++));
    snsqMethods.put("5402567240274544690", new SNsQ(i++));
    snsqMethods.put("5402567240276588816", new SNsQ(i++));
    snsqMethods.put("768972137599014680", new SNsQ(i++));
    snsqMethods.put("1645043697877429493", new SNsQ(i++));
    snsqMethods.put("768972137574892036", new SNsQ(i++));
    snsqMethods.put("5402567240278923201", new SNsQ(i++));
  }
  @NotNull
  @Override
  public SourceNodesQuery getSourceNodesQuery(@NotNull QueryKey identity) {
    SourceNodesQuery query = identity.forFunctionNode(snsqMethods);
    return (query != null ? query : super.getSourceNodesQuery(identity));
  }
  private static class SNsQ implements SourceNodesQuery {
    private final int methodKey;
    public SNsQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @NotNull
    public Collection<SNode> evaluate(@NotNull SourceSubstituteMacroNodesContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_0(ctx));
        case 1:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_1_1(ctx));
        case 2:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_3_0(ctx));
        case 3:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_4_0(ctx));
        case 4:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_8_0(ctx));
        case 5:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_10_0(ctx));
        case 6:
          return IterableUtil.asCollection(QueriesGenerated.sourceNodesQuery_11_0(ctx));
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("5402567240274524530", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "map_StaffType"));
    pvqMethods.put("5402567240277091920", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "placeholderName"));
    pvqMethods.put("2014390094197849889", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "test"));
    pvqMethods.put("329726013644456839", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102cb19a434L, 0x103245d193fL, "value"), "1.0"));
    pvqMethods.put("329726013644459489", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0x102cb19a434L, 0x103245d193fL, "value"), "1.0"));
    pvqMethods.put("88285669867912681", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "this"));
    pvqMethods.put("1645043697881038683", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "20"));
    pvqMethods.put("1645043697877429473", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "3"));
    pvqMethods.put("1645043697877429482", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf8cc59b314L, 0xf8cc59b315L, "value"), "2"));
    pvqMethods.put("329726013644462246", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), null));
    pvqMethods.put("188877551435998869", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "map_Test"));
    pvqMethods.put("2698877061886898048", new PVQ(i++, MetaAdapterFactory.getProperty(0x6b277d9ad52d416fL, 0xa2091919bd737f50L, 0x46ff3b3d86d3edc8L, 0x46ff3b3d86d3edcbL, "value"), "Hello"));
    pvqMethods.put("2698877061886895400", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "trev"));
    pvqMethods.put("768972137574895409", new PVQ(i++, MetaAdapterFactory.getProperty(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x27ebd2392beaa324L, 0x27ebd2392beaa330L, "NumAgentsInHour"), null));
    pvqMethods.put("5402567240278923950", new PVQ(i++, MetaAdapterFactory.getProperty(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f7b02L, 0x35463334ce306bc9L, "number"), "1"));
    pvqMethods.put("768972137579183244", new PVQ(i++, MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name"), "map_Patient"));
  }
  @NotNull
  @Override
  public PropertyValueQuery getPropertyValueQuery(@NotNull QueryKey identity) {
    PropertyValueQuery query = identity.forTemplateNode(pvqMethods);
    return (query != null ? query : super.getPropertyValueQuery(identity));
  }
  private static class PVQ extends PropertyValueQuery.Base {
    private final int methodKey;
    /*package*/ PVQ(int methodKey, SProperty property, String templateValue) {
      super(property, templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull PropertyMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.propertyMacro_GetValue_1_0(ctx);
        case 1:
          return QueriesGenerated.propertyMacro_GetValue_3_0(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetValue_4_0(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetValue_8_0(ctx);
        case 4:
          return QueriesGenerated.propertyMacro_GetValue_8_1(ctx);
        case 5:
          return QueriesGenerated.propertyMacro_GetValue_8_2(ctx);
        case 6:
          return QueriesGenerated.propertyMacro_GetValue_8_3(ctx);
        case 7:
          return QueriesGenerated.propertyMacro_GetValue_8_4(ctx);
        case 8:
          return QueriesGenerated.propertyMacro_GetValue_8_5(ctx);
        case 9:
          return QueriesGenerated.propertyMacro_GetValue_8_6(ctx);
        case 10:
          return QueriesGenerated.propertyMacro_GetValue_8_7(ctx);
        case 11:
          return QueriesGenerated.propertyMacro_GetValue_9_0(ctx);
        case 12:
          return QueriesGenerated.propertyMacro_GetValue_9_1(ctx);
        case 13:
          return QueriesGenerated.propertyMacro_GetValue_10_0(ctx);
        case 14:
          return QueriesGenerated.propertyMacro_GetValue_11_0(ctx);
        case 15:
          return QueriesGenerated.propertyMacro_GetValue_12_0(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("768972137568923596", new IfMC(i++));
    imcMethods.put("4544390881338977963", new IfMC(i++));
    imcMethods.put("4544390881339156271", new IfMC(i++));
    imcMethods.put("4544390881338645036", new IfMC(i++));
    imcMethods.put("1645043697879074165", new IfMC(i++));
    imcMethods.put("1645043697879085072", new IfMC(i++));
    imcMethods.put("1645043697879091132", new IfMC(i++));
    imcMethods.put("1645043697879092286", new IfMC(i++));
  }
  @NotNull
  @Override
  public IfMacroCondition getIfMacroCondition(@NotNull QueryKey identity) {
    IfMacroCondition query = identity.forTemplateNode(imcMethods);
    return (query != null ? query : super.getIfMacroCondition(identity));
  }
  private static class IfMC implements IfMacroCondition {
    private final int methodKey;
    public IfMC(int methodKey) {
      this.methodKey = methodKey;
    }
    @Override
    public boolean check(@NotNull IfMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.ifMacro_Condition_1_0(ctx);
        case 1:
          return QueriesGenerated.ifMacro_Condition_4_0(ctx);
        case 2:
          return QueriesGenerated.ifMacro_Condition_4_1(ctx);
        case 3:
          return QueriesGenerated.ifMacro_Condition_4_2(ctx);
        case 4:
          return QueriesGenerated.ifMacro_Condition_8_0(ctx);
        case 5:
          return QueriesGenerated.ifMacro_Condition_8_1(ctx);
        case 6:
          return QueriesGenerated.ifMacro_Condition_8_2(ctx);
        case 7:
          return QueriesGenerated.ifMacro_Condition_8_3(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, ReferenceTargetQuery> rtqMethods = new HashMap<String, ReferenceTargetQuery>();
  {
    rtqMethods.put("5402567240277525408", new RTQ(0, "map_StaffType"));
    rtqMethods.put("5402567240277562787", new RTQ(1, "map_StaffType"));
    rtqMethods.put("4544390881338980129", new RTQ(2, null));
    rtqMethods.put("768972137599004042", new RTQ(3, null));
    rtqMethods.put("4544390881338585373", new RTQ(4, null));
    rtqMethods.put("4544390881339156792", new RTQ(5, null));
    rtqMethods.put("768972137603697489", new RTQ(6, null));
    rtqMethods.put("4544390881339165999", new RTQ(7, null));
    rtqMethods.put("885129310533521708", new RTQ(8, "Test"));
    rtqMethods.put("329726013644468540", new RTQ(9, "Test"));
    rtqMethods.put("768972137579212820", new RTQ(10, "map_StaffType"));
    rtqMethods.put("768972137593373021", new RTQ(11, null));
    rtqMethods.put("5402567240278924551", new RTQ(12, "map_StaffType"));
  }
  @NotNull
  @Override
  public ReferenceTargetQuery getReferenceTargetQuery(@NotNull QueryKey queryKey) {
    ReferenceTargetQuery query = queryKey.forTemplateNode(rtqMethods);
    return (query != null ? query : super.getReferenceTargetQuery(queryKey));
  }
  private static class RTQ extends ReferenceTargetQuery.Base {
    private final int methodKey;
    /*package*/ RTQ(int methodKey, String templateValue) {
      super(templateValue);
      this.methodKey = methodKey;
    }
    @Nullable
    public Object evaluate(@NotNull ReferenceMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.referenceMacro_GetReferent_3_0(ctx);
        case 1:
          return QueriesGenerated.referenceMacro_GetReferent_3_1(ctx);
        case 2:
          return QueriesGenerated.referenceMacro_GetReferent_4_0(ctx);
        case 3:
          return QueriesGenerated.referenceMacro_GetReferent_4_1(ctx);
        case 4:
          return QueriesGenerated.referenceMacro_GetReferent_5_0(ctx);
        case 5:
          return QueriesGenerated.referenceMacro_GetReferent_6_0(ctx);
        case 6:
          return QueriesGenerated.referenceMacro_GetReferent_7_0(ctx);
        case 7:
          return QueriesGenerated.referenceMacro_GetReferent_7_1(ctx);
        case 8:
          return QueriesGenerated.referenceMacro_GetReferent_8_0(ctx);
        case 9:
          return QueriesGenerated.referenceMacro_GetReferent_8_1(ctx);
        case 10:
          return QueriesGenerated.referenceMacro_GetReferent_10_0(ctx);
        case 11:
          return QueriesGenerated.referenceMacro_GetReferent_10_1(ctx);
        case 12:
          return QueriesGenerated.referenceMacro_GetReferent_11_0(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, InsertMacroQuery> imqMethods = new HashMap<String, InsertMacroQuery>();
  {
    imqMethods.put("768972137593340091", new IMQ(0));
  }
  @NotNull
  @Override
  public InsertMacroQuery getInsertMacroQuery(@NotNull QueryKey queryKey) {
    InsertMacroQuery query = queryKey.forTemplateNode(imqMethods);
    return (query != null ? query : super.getInsertMacroQuery(queryKey));
  }
  private static class IMQ implements InsertMacroQuery {
    private final int methodKey;
    /*package*/ IMQ(int methodKey) {
      this.methodKey = methodKey;
    }
    @Nullable
    public SNode evaluate(@NotNull InsertMacroContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.insertMacro_Query_10_0(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private Map<String, LabelInputQuery> liqMethods = new HashMap<String, LabelInputQuery>();
  {
    liqMethods.put("4544390881339670968", new LIQ(0));
  }
  @NotNull
  @Override
  public LabelInputQuery getLabelInputQuery(@NotNull QueryKey key) {
    LabelInputQuery query = key.forFunctionNode(liqMethods);
    return (query != null ? query : super.getLabelInputQuery(key));
  }
  private static class LIQ implements LabelInputQuery {
    private final int methodKey;
    private LIQ(int key) {
      methodKey = key;
    }
    @Nullable
    @Override
    public Object evaluate(@NotNull LabelKeyQueryContext ctx) throws GenerationFailureException {
      switch (methodKey) {
        case 0:
          return QueriesGenerated.labelMapNode3_0(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
    /*package*/ static final SProperty Sensitivity$Zmvc = MetaAdapterFactory.getProperty(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L, 0x4936c0ffc391caaL, "Sensitivity");
    /*package*/ static final SProperty Specificity$ZmXe = MetaAdapterFactory.getProperty(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L, 0x4936c0ffc391cacL, "Specificity");
    /*package*/ static final SProperty Occurances$bnEV = MetaAdapterFactory.getProperty(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x16d45e8703e0ee1aL, 0x16d45e8703e0ee38L, "Occurances");
    /*package*/ static final SProperty Time$bncT = MetaAdapterFactory.getProperty(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x16d45e8703e0ee1aL, 0x16d45e8703e0ee36L, "Time");
    /*package*/ static final SProperty value$Cizf = MetaAdapterFactory.getProperty(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L, 0x25745663758ab0deL, "value");
    /*package*/ static final SProperty NumPatientsInHour$_nla = MetaAdapterFactory.getProperty(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x27ebd2392beaa324L, 0x27ebd2392beaa330L, "NumPatientsInHour");
    /*package*/ static final SProperty number$HYc8 = MetaAdapterFactory.getProperty(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL, 0x4af9c647eff82e85L, "number");
    /*package*/ static final SProperty valueType$F2s2 = MetaAdapterFactory.getProperty(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f0c96L, 0x3a7166f1d9709f4eL, "valueType");
    /*package*/ static final SProperty requiresPatient$9L4w = MetaAdapterFactory.getProperty(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L, 0x3f10eb6deabdc338L, "requiresPatient");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink targetAction$Z7ub = MetaAdapterFactory.getReferenceLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL, 0x4f415ebce3f345b2L, "targetAction");
    /*package*/ static final SContainmentLink ProcessingTimeTable$iO6F = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L, 0x16d45e8703e0ee93L, "ProcessingTimeTable");
    /*package*/ static final SContainmentLink ProcessingTimeLines$e7T7 = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x16d45e8703e0edf5L, 0x16d45e8703e0ee61L, "ProcessingTimeLines");
    /*package*/ static final SContainmentLink staffTypeReference$jtXw = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L, 0x4af9c647efdb14f9L, "staffTypeReference");
    /*package*/ static final SReferenceLink staffType$$i7d = MetaAdapterFactory.getReferenceLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L, 0x4af9c647efda3aa5L, "staffType");
    /*package*/ static final SContainmentLink location$2x_J = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L, 0x3f10eb6deabbd805L, "location");
    /*package*/ static final SReferenceLink roomType$xuJp = MetaAdapterFactory.getReferenceLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33967953caaL, 0x5dafd3396799c110L, "roomType");
    /*package*/ static final SContainmentLink testType$pirF = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x3f10eb6deabea835L, 0x3f10eb6deabea863L, "testType");
    /*package*/ static final SReferenceLink testCategoryType$2nw8 = MetaAdapterFactory.getReferenceLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x4936c0ffc9a8d3fL, 0x4936c0ffd590128L, "testCategoryType");
    /*package*/ static final SReferenceLink staff$HYEa = MetaAdapterFactory.getReferenceLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL, 0x4af9c647eff82e87L, "staff");
    /*package*/ static final SContainmentLink IfPositive$pnP2 = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x3f10eb6deabea835L, 0x3f10eb6deabea865L, "IfPositive");
    /*package*/ static final SContainmentLink IfNegative$rZmc = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x3f10eb6deabea835L, 0x3f10eb6deabea87aL, "IfNegative");
    /*package*/ static final SContainmentLink diseases$1RjC = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab389L, 0x25745663758ab393L, "diseases");
    /*package*/ static final SContainmentLink Actions$nh$G = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L, 0x2ef557ae9cb06877L, "Actions");
    /*package*/ static final SContainmentLink outgoingBranches$cwqF = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L, 0x29f0721df2f38bbL, "outgoingBranches");
    /*package*/ static final SContainmentLink PatientArrivalLines$6zwB = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x637eade0e62ce2b8L, 0x27ebd2392beaa3d1L, "PatientArrivalLines");
    /*package*/ static final SContainmentLink staffNumbers$IepE = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e56L, 0x4af9c647eff82ea4L, "staffNumbers");
    /*package*/ static final SContainmentLink ArrivalLocation$5hIS = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x637eade0e62ce2b8L, 0xaabf015bf63b5d0L, "ArrivalLocation");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept Action$K5 = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L, "ActionCards.structure.Action");
    /*package*/ static final SConcept PatientProfile$ZT = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L, "ActionCards.structure.PatientProfile");
    /*package*/ static final SConcept Branch$sq = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL, "ActionCards.structure.Branch");
    /*package*/ static final SConcept DiseaseList$8$ = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab389L, "ActionCards.structure.DiseaseList");
    /*package*/ static final SConcept ActionCard$eb = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L, "ActionCards.structure.ActionCard");
  }
}
