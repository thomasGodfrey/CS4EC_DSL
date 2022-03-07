package DiseaseModel.constraints;

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

public class VaccineStatus_Constraints extends BaseConstraintsDescriptor {
  public VaccineStatus_Constraints() {
    super(CONCEPTS.VaccineStatus$Kl);
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
  private static final SNodePointer canBeChildBreakingPoint = new SNodePointer("r:5ea0c119-3427-443f-a640-b7f5d321a2c8(DiseaseModel.constraints)", "6755843002514227682");

  private static final class CONCEPTS {
    /*package*/ static final SConcept VaccineStatus$Kl = MetaAdapterFactory.getConcept(0xbb69d08796cc48caL, 0xaeb6c2cb27e532b0L, 0x5dc1936ab3111fd4L, "DiseaseModel.structure.VaccineStatus");
  }
}
