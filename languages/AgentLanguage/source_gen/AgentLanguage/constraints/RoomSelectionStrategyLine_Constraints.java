package AgentLanguage.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeParent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class RoomSelectionStrategyLine_Constraints extends BaseConstraintsDescriptor {
  public RoomSelectionStrategyLine_Constraints() {
    super(CONCEPTS.RoomSelectionStrategyLine$5S);
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeParent, Boolean> calculateCanBeParentConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeParent, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeParent context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAParent(context.getNode(), context.getChildNode(), context.getChildConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeParentBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAParent(SNode node, SNode childNode, SAbstractConcept childConcept, SContainmentLink link) {
    return (SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(childConcept), CONCEPTS.RoomSelectionCondition$N0) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(childConcept), CONCEPTS.BinaryExpression$j$) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(childConcept), CONCEPTS.RoomSelectionRule$y$));
  }
  private static final SNodePointer canBeParentBreakingPoint = new SNodePointer("r:8af044a8-b97e-4b60-8dc9-53a519dacbc1(AgentLanguage.constraints)", "3692958048418844653");

  private static final class CONCEPTS {
    /*package*/ static final SConcept RoomSelectionStrategyLine$5S = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6e3a4f6d5ccaaf60L, "AgentLanguage.structure.RoomSelectionStrategyLine");
    /*package*/ static final SConcept RoomSelectionRule$y$ = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6e3a4f6d5ccab90aL, "AgentLanguage.structure.RoomSelectionRule");
    /*package*/ static final SConcept RoomSelectionCondition$N0 = MetaAdapterFactory.getConcept(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x334005c7663c2373L, "AgentLanguage.structure.RoomSelectionCondition");
    /*package*/ static final SConcept BinaryExpression$j$ = MetaAdapterFactory.getConcept(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x46ff3b3d86c99c15L, "org.iets3.core.expr.base.structure.BinaryExpression");
  }
}
