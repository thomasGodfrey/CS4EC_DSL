package ActionCards.actions;

/*Generated by MPS */

import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SModel;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SModelOperations;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import org.jetbrains.mps.openapi.language.SReferenceLink;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import org.jetbrains.mps.openapi.language.SConcept;

public class RecentContactFactory {
  public static class NodeFactory_1758249876502950645 implements NodeFactory {
    public void setup(SNode newNode, SNode sampleNode, SNode enclosingNode, SModel model) {
      SLinkOperations.setTarget(newNode, LINKS.patientProperty$FJ4E, SLinkOperations.getTarget(Sequence.fromIterable(SLinkOperations.collectMany(SModelOperations.roots(model, CONCEPTS.PatientProfile$ZT), LINKS.attributes$kiaM)).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return SNodeOperations.isInstanceOf(SLinkOperations.getTarget(it, LINKS.patientProperty$oTU2), CONCEPTS.RecentCovidContactProperty$IY);
        }
      }).first(), LINKS.patientProperty$oTU2));
    }
  }

  private static final class LINKS {
    /*package*/ static final SReferenceLink patientProperty$FJ4E = MetaAdapterFactory.getReferenceLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L, 0x18668ef27115ff2aL, "patientProperty");
    /*package*/ static final SContainmentLink attributes$kiaM = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L, 0xaabf015be951259L, "attributes");
    /*package*/ static final SContainmentLink patientProperty$oTU2 = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a60L, 0x18668ef26f411a0aL, "patientProperty");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept PatientProfile$ZT = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L, "ActionCards.structure.PatientProfile");
    /*package*/ static final SConcept RecentCovidContactProperty$IY = MetaAdapterFactory.getConcept(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732b9054L, "ActionCards.structure.RecentCovidContactProperty");
  }
}