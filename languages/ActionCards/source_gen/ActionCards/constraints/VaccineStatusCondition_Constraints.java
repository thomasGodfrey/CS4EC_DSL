package ActionCards.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintFunction;
import jetbrains.mps.smodel.runtime.ConstraintContext_CanBeParent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.runtime.CheckingNodeContext;
import java.util.Map;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.base.BaseReferenceConstraintsDescriptor;
import jetbrains.mps.smodel.runtime.ReferenceScopeProvider;
import jetbrains.mps.smodel.runtime.base.BaseScopeProvider;
import org.jetbrains.mps.openapi.model.SNodeReference;
import jetbrains.mps.scope.Scope;
import jetbrains.mps.smodel.runtime.ReferenceConstraintsContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.internal.collections.runtime.Sequence;
import java.util.Collections;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.scope.ListScope;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import java.util.HashMap;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.smodel.SNodePointer;
import org.jetbrains.mps.openapi.language.SConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SProperty;

public class VaccineStatusCondition_Constraints extends BaseConstraintsDescriptor {
  public VaccineStatusCondition_Constraints() {
    super(CONCEPTS.VaccineStatusCondition$cq);
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
  @Override
  protected Map<SReferenceLink, ReferenceConstraintsDescriptor> getSpecifiedReferences() {
    BaseReferenceConstraintsDescriptor d0 = new BaseReferenceConstraintsDescriptor(LINKS.patientProperty$FJ4E, this) {
      @Override
      public boolean hasOwnScopeProvider() {
        return true;
      }
      @Nullable
      @Override
      public ReferenceScopeProvider getScopeProvider() {
        return new BaseScopeProvider() {
          @Override
          public SNodeReference getSearchScopeValidatorNode() {
            return breakingNode_d8k0x1_a0a0a0a0a1a0a0a0d;
          }
          @Override
          public Scope createScope(final ReferenceConstraintsContext _context) {
            Iterable<SNode> plstVaccineStatuses = Sequence.fromIterable(Collections.<SNode>emptyList());
            plstVaccineStatuses = SModelOperations.nodesIncludingImported(SNodeOperations.getModel(_context.getReferenceNode()), CONCEPTS.VaccineStatusProperty$D4);
            return new ListScope(plstVaccineStatuses) {
              @Override
              public String getName(SNode child) {
                return SPropertyOperations.getString(SLinkOperations.getTarget(SNodeOperations.cast(child, CONCEPTS.VaccineStatusProperty$D4), LINKS.disease$27QG), PROPS.name$MnvL);
              }
            };
          }
        };
      }
    };
    Map<SReferenceLink, ReferenceConstraintsDescriptor> references = new HashMap<SReferenceLink, ReferenceConstraintsDescriptor>();
    references.put(d0.getReference(), d0);
    return references;
  }
  private static boolean staticCanBeAParent(SNode node, SNode childNode, SAbstractConcept childConcept, SContainmentLink link) {
    return SConceptOperations.isSubConceptOf(SNodeOperations.asSConcept(childConcept), CONCEPTS.VaccinationStatus$Oy);
  }
  private static final SNodePointer canBeParentBreakingPoint = new SNodePointer("r:74fe0192-4a81-4beb-a23f-6c0508ee7fc0(ActionCards.constraints)", "1758249876469087660");
  private static final SNodePointer breakingNode_d8k0x1_a0a0a0a0a1a0a0a0d = new SNodePointer("r:74fe0192-4a81-4beb-a23f-6c0508ee7fc0(ActionCards.constraints)", "1758249876469957427");

  private static final class CONCEPTS {
    /*package*/ static final SConcept VaccineStatusCondition$cq = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f431e45L, "ActionCards.structure.VaccineStatusCondition");
    /*package*/ static final SConcept VaccineStatusProperty$D4 = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f40915dL, "ActionCards.structure.VaccineStatusProperty");
    /*package*/ static final SConcept VaccinationStatus$Oy = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fc61141L, "ActionCards.structure.VaccinationStatus");
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink patientProperty$FJ4E = MetaAdapterFactory.getReferenceLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L, 0x18668ef27115ff2aL, "patientProperty");
    /*package*/ static final SReferenceLink disease$27QG = MetaAdapterFactory.getReferenceLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f40915dL, 0x18668ef26f40bdfaL, "disease");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }
}
