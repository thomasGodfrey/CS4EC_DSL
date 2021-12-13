package ActionCards.constraints;

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

public class ActionCardCondition_Constraints extends BaseConstraintsDescriptor {
  public ActionCardCondition_Constraints() {
    super(CONCEPTS.ActionCardCondition$FL);
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
    return SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(childConcept), CONCEPTS.BranchConditional$k$) || SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(childConcept), CONCEPTS.BinaryExpression$j$);
  }
  private static final SNodePointer canBeParentBreakingPoint = new SNodePointer("r:74fe0192-4a81-4beb-a23f-6c0508ee7fc0(ActionCards.constraints)", "1758249876506653990");

  private static final class CONCEPTS {
    /*package*/ static final SConcept ActionCardCondition$FL = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef27386cf02L, "ActionCards.structure.ActionCardCondition");
    /*package*/ static final SConcept BinaryExpression$j$ = MetaAdapterFactory.getConcept(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x46ff3b3d86c99c15L, "org.iets3.core.expr.base.structure.BinaryExpression");
    /*package*/ static final SConcept BranchConditional$k$ = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fa67c60L, "ActionCards.structure.BranchConditional");
  }
}
