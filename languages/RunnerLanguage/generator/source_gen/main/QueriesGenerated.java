package main;

/*Generated by MPS */

import jetbrains.mps.generator.runtime.Generated;
import jetbrains.mps.generator.impl.query.QueryProviderBase;
import jetbrains.mps.generator.template.PropertyMacroContext;
import RunnerLanguage.behavior.Runner__BehaviorDescriptor;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.generator.template.IfMacroContext;
import java.util.Map;
import jetbrains.mps.generator.impl.query.PropertyValueQuery;
import java.util.HashMap;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.generator.impl.query.QueryKey;
import org.jetbrains.mps.openapi.language.SProperty;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.generator.impl.GenerationFailureException;
import jetbrains.mps.generator.impl.query.IfMacroCondition;
import org.jetbrains.mps.openapi.language.SContainmentLink;

@Generated
public class QueriesGenerated extends QueryProviderBase {
  public QueriesGenerated() {
    super(1);
  }
  public static Object propertyMacro_GetValue_1_0(final PropertyMacroContext _context) {
    return (String) Runner__BehaviorDescriptor.GenerateInputString_id1wal9D1amCA.invoke(_context.getNode());
  }
  public static Object propertyMacro_GetValue_1_1(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.RepastSettingsSourceAddress$4G2F), PROPS.path$VaYg).toString().replace("/", "\\\\") + "\\\\";
  }
  public static Object propertyMacro_GetValue_1_2(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.ClassesFolderAddress$oLYy), PROPS.path$VaYg).toString().replace("/", "\\\\") + "\\\\";
  }
  public static Object propertyMacro_GetValue_1_3(final PropertyMacroContext _context) {
    return SPropertyOperations.getString(SLinkOperations.getTarget(_context.getNode(), LINKS.SourcesFolderAddress$d1b1), PROPS.path$VaYg).toString().replace("/", "\\\\") + "\\\\";
  }
  public static boolean ifMacro_Condition_1_0(final IfMacroContext _context) {
    return SPropertyOperations.getBoolean(_context.getNode(), PROPS.BatchRun$HHlb);
  }
  private final Map<String, PropertyValueQuery> pvqMethods = new HashMap<String, PropertyValueQuery>();
  {
    int i = 0;
    pvqMethods.put("1732290028172257098", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), "E:\\\\program\\\\mps\\\\workSpace\\\\HelloAgent"));
    pvqMethods.put("8149202941052351604", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), ""));
    pvqMethods.put("2876623930008149565", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), ""));
    pvqMethods.put("2876623930008174821", new PVQ(i++, MetaAdapterFactory.getProperty(0xf3061a5392264cc5L, 0xa443f952ceaf5816L, 0xf93d565d10L, 0xf93d565d11L, "value"), ""));
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
          return QueriesGenerated.propertyMacro_GetValue_1_1(ctx);
        case 2:
          return QueriesGenerated.propertyMacro_GetValue_1_2(ctx);
        case 3:
          return QueriesGenerated.propertyMacro_GetValue_1_3(ctx);
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no method for query %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }
  private final Map<String, IfMacroCondition> imcMethods = new HashMap<String, IfMacroCondition>();
  {
    int i = 0;
    imcMethods.put("8149202941055874890", new IfMC(i++));
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
        default:
          throw new GenerationFailureException(String.format("Inconsistent QueriesGenerated: there's no condition method for if macro %s (key: #%d)", ctx.getTemplateReference(), methodKey));
      }
    }
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink RepastSettingsSourceAddress$4G2F = MetaAdapterFactory.getContainmentLink(0x3fb39b69f96e474bL, 0xa5f6477776571ddfL, 0x596b60deef3964dcL, 0x5dc1936ab377c7f8L, "RepastSettingsSourceAddress");
    /*package*/ static final SContainmentLink ClassesFolderAddress$oLYy = MetaAdapterFactory.getContainmentLink(0x3fb39b69f96e474bL, 0xa5f6477776571ddfL, 0x596b60deef3964dcL, 0x27ebd2392c7d49a9L, "ClassesFolderAddress");
    /*package*/ static final SContainmentLink SourcesFolderAddress$d1b1 = MetaAdapterFactory.getContainmentLink(0x3fb39b69f96e474bL, 0xa5f6477776571ddfL, 0x596b60deef3964dcL, 0x27ebd2392c85062cL, "SourcesFolderAddress");
  }

  private static final class PROPS {
    /*package*/ static final SProperty path$VaYg = MetaAdapterFactory.getProperty(0xd3a0fd26445a466cL, 0x900e10444ddfed52L, 0x55705e73a6773808L, 0x55705e73a6774a6eL, "path");
    /*package*/ static final SProperty BatchRun$HHlb = MetaAdapterFactory.getProperty(0x3fb39b69f96e474bL, 0xa5f6477776571ddfL, 0x596b60deef3964dcL, 0x7117c8e60834121dL, "BatchRun");
  }
}
