package ActionCards.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Action_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ActionCard_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new Branch_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new EDScenario_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new GoToAction_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new StaffNumber_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new StaffType_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new StaffTypeReference_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new TestActionStep_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }


  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new Branch_SubstituteMenu());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new StaffNumber_SubstituteMenu());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new StaffTypeReference_SubstituteMenu());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e56L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f36ef2L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x3f10eb6deabea835L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L)).seal();
}
