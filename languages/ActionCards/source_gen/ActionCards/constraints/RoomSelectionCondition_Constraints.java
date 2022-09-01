package ActionCards.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeChild;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class RoomSelectionCondition_Constraints extends BaseConstraintsDescriptor {
  public RoomSelectionCondition_Constraints() {
    super(CONCEPTS.RoomSelectionCondition$7k);
  }

  @Override
  protected ConstraintFunction<ConstraintContext_CanBeChild, Boolean> calculateCanBeChildConstraint() {
    return new ConstraintFunction<ConstraintContext_CanBeChild, Boolean>() {
      @NotNull
      public Boolean invoke(@NotNull ConstraintContext_CanBeChild context, @Nullable CheckingNodeContext checkingNodeContext) {
        boolean result = staticCanBeAChild(context.getNode(), context.getParentNode(), context.getConcept(), context.getLink());

        if (!(result) && checkingNodeContext != null) {
          checkingNodeContext.setBreakingNode(canBeChildBreakingPoint);
        }

        return result;
      }
    };
  }
  private static boolean staticCanBeAChild(SNode node, SNode parentNode, SAbstractConcept childConcept, SContainmentLink link) {
    return false;
  }
  private static final SNodePointer canBeChildBreakingPoint = new SNodePointer("r:74fe0192-4a81-4beb-a23f-6c0508ee7fc0(ActionCards.constraints)", "4878912887035352242");

  private static final class CONCEPTS {
    /*package*/ static final SConcept RoomSelectionCondition$7k = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x43b5616bd1d154aeL, "ActionCards.structure.RoomSelectionCondition");
  }
}
