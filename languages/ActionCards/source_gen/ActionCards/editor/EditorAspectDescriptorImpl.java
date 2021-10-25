package ActionCards.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import jetbrains.mps.openapi.editor.descriptor.EditorHintsProvider;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorHint;
import java.util.Arrays;
import jetbrains.mps.editor.runtime.descriptor.ConceptEditorHintImpl;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase implements EditorHintsProvider {
  private Collection<ConceptEditorHint> myHints = Arrays.<ConceptEditorHint>asList(new ConceptEditorHintImpl("diagram", "Diagram View", true, "ActionCards.editor.views.diagram"));
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Arrays.asList(new ConceptEditor[]{new Action_Editor(), new Action_diagram_Editor()});
      case 1:
        return Arrays.asList(new ConceptEditor[]{new ActionCard_Editor(), new ActionCard_diagram_Editor()});
      case 2:
        return Collections.<ConceptEditor>singletonList(new AdmissionAction_diagram_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new AtributeLine_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new AttributeTable_Editor());
      case 5:
        return Arrays.asList(new ConceptEditor[]{new Branch_Editor(), new Branch_diagram_Editor()});
      case 6:
        return Collections.<ConceptEditor>singletonList(new DiagnosticCondition_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new Disease_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new DiseaseInitialiserLine_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new DiseaseInitialiserTable_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new DiseaseList_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new EDScenario_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new GoToAction_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new PatientArrivalLine_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new PatientArrivals_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new PatientProfile_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new ProcessingTimeLine_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new ProcessingTimeTable_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new Resource_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new StaffNumber_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new StaffType_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new StaffTypeReference_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new Test_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new TestCapturedDisease_Editor());
      default:
    }
    return Collections.<ConceptEditor>emptyList();
  }

  @NotNull
  public Collection<ConceptEditorComponent> getDeclaredEditorComponents(SAbstractConcept concept, String editorComponentId) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex1.index(cncpt)) {
      case 0:
        if (true) {
          if ("ActionCards.editor.DummyForGrammarCells".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new DummyForGrammarCells());
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }
  public Collection<ConceptEditorHint> getHints() {
    return myHints;
  }

  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex2.index(cncpt)) {
      case 0:
        return Collections.<TransformationMenu>singletonList(new template_GrammarCellsSideTransformationsMenu());
      case 1:
        return Collections.<TransformationMenu>singletonList(new Branch_TransformationMenu());
      default:
    }
    return Collections.<TransformationMenu>emptyList();
  }
  @NotNull
  @Override
  public Collection<SubstituteMenu> getDeclaredDefaultSubstituteMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex3.index(cncpt)) {
      case 0:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Action());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ActionCard());
      case 2:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ActionStep());
      case 3:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AdmissionAction());
      case 4:
        return Arrays.asList(new SubstituteMenu[]{new AtributeLine_SubstituteMenu(), new GrammarCellsSubstituteMenu_AtributeLine()});
      case 5:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Attribute());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AttributeTable());
      case 7:
        return Arrays.asList(new SubstituteMenu[]{new Branch_SubstituteMenu(), new GrammarCellsSubstituteMenu_Branch()});
      case 8:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DiagnosticCondition());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Disease());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DiseaseInitialiserLine());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DiseaseInitialiserTable());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DiseaseList());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_EDScenario());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_GoToAction());
      case 15:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PatientArrivalLine());
      case 16:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PatientArrivals());
      case 17:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PatientProfile());
      case 18:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ProcessingTimeLine());
      case 19:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ProcessingTimeTable());
      case 20:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Resource());
      case 21:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_StaffNumber(), new StaffNumber_SubstituteMenu()});
      case 22:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StaffType());
      case 23:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_StaffTypeReference(), new StaffTypeReference_SubstituteMenu()});
      case 24:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Test());
      case 25:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_TestCapturedDisease(), new TestCapturedDisease_SubstituteMenu()});
      case 26:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Variable());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x78ac3095dfdf9aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a7cL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a60L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df36170cL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c23aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c28bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab389L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e56L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f36ef2L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x27ebd2392beaa324L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x637eade0e62ce2b8L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0ee1aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0edf5L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df2f3819L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x549fe0474671cd38L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).seal();
  private static final ConceptSwitchIndex conceptIndex2 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL)).seal();
  private static final ConceptSwitchIndex conceptIndex3 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3455bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x78ac3095dfdf9aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a7cL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab027L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a60L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df36170cL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab012L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c23aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x296f74efb3f1c28bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663758ab389L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e56L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f36ef2L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x27ebd2392beaa324L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x637eade0e62ce2b8L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0ee1aL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x16d45e8703e0edf5L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df2f3819L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647eff82e7bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f346ecL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4af9c647efda3a80L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4936c0ffc391ca7L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x549fe0474671cd38L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df307244L)).seal();
}
