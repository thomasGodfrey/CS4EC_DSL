package ActionCards.actions;

/*Generated by MPS */

import jetbrains.mps.actions.descriptor.BaseActionAspectDescriptor;
import jetbrains.mps.openapi.actions.descriptor.ActionAspectDescriptor;
import java.util.Collection;
import jetbrains.mps.openapi.actions.descriptor.NodeFactory;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;

public class ActionAspectDescriptorImpl extends BaseActionAspectDescriptor implements ActionAspectDescriptor {
  private static final String LANGUAGE_FQ_NAME = "ActionCards";

  @Override
  public Collection<NodeFactory> getFactories(SAbstractConcept concept) {
    if (LANGUAGE_FQ_NAME.equals(concept.getLanguage().getQualifiedName())) {
      switch (concept.getName()) {
        case "IPatientProperty":
          return Collections.<NodeFactory>singletonList(new PatientPropertyTableUpdater.NodeFactory_1758249876435103904());
        case "RecentCOVIDContactCondition":
          return Collections.<NodeFactory>singletonList(new RecentContactFactory.NodeFactory_1758249876502950645());
        default:
      }
    }
    return Collections.<NodeFactory>emptyList();
  }

}
