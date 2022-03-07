package AgentLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorComponent;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import jetbrains.mps.openapi.editor.descriptor.SubstituteMenu;
import java.util.Arrays;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    SAbstractConcept cncpt = ((SAbstractConcept) concept);
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return Collections.<ConceptEditor>singletonList(new Actor_Editor());
      case 1:
        return Collections.<ConceptEditor>singletonList(new ActorInstantiation_Editor());
      case 2:
        return Collections.<ConceptEditor>singletonList(new ActorReference_Editor());
      case 3:
        return Collections.<ConceptEditor>singletonList(new ActorTypeSignal_Editor());
      case 4:
        return Collections.<ConceptEditor>singletonList(new AdmissionBay_Editor());
      case 5:
        return Collections.<ConceptEditor>singletonList(new AdmissionBayList_Editor());
      case 6:
        return Collections.<ConceptEditor>singletonList(new AdmitAction_Editor());
      case 7:
        return Collections.<ConceptEditor>singletonList(new AgentGenerator_Editor());
      case 8:
        return Collections.<ConceptEditor>singletonList(new AgentGeneratorLine_Editor());
      case 9:
        return Collections.<ConceptEditor>singletonList(new AggregateAttributeMonitor_Editor());
      case 10:
        return Collections.<ConceptEditor>singletonList(new Attribute_Editor());
      case 11:
        return Collections.<ConceptEditor>singletonList(new AttributeCondition_Editor());
      case 12:
        return Collections.<ConceptEditor>singletonList(new AttributeDistributionLine_Editor());
      case 13:
        return Collections.<ConceptEditor>singletonList(new AttributeDistributionTable_Editor());
      case 14:
        return Collections.<ConceptEditor>singletonList(new AttributeExpressionReference_Editor());
      case 15:
        return Collections.<ConceptEditor>singletonList(new AttributeMonitor_Editor());
      case 16:
        return Collections.<ConceptEditor>singletonList(new AttributeReference_Editor());
      case 17:
        return Collections.<ConceptEditor>singletonList(new BedAvailableCondition_Editor());
      case 18:
        return Collections.<ConceptEditor>singletonList(new BehaviourElement_Editor());
      case 19:
        return Collections.<ConceptEditor>singletonList(new BehaviourElementReference_Editor());
      case 20:
        return Collections.<ConceptEditor>singletonList(new BehaviourSequence_Editor());
      case 21:
        return Collections.<ConceptEditor>singletonList(new BinaryCondition_Editor());
      case 22:
        return Collections.<ConceptEditor>singletonList(new Choice_Editor());
      case 23:
        return Collections.<ConceptEditor>singletonList(new CompositeOrder_Editor());
      case 24:
        return Collections.<ConceptEditor>singletonList(new ConsequenceElement_Editor());
      case 25:
        return Collections.<ConceptEditor>singletonList(new ConsequenceInStep_Editor());
      case 26:
        return Collections.<ConceptEditor>singletonList(new DataInstanceMap_Editor());
      case 27:
        return Collections.<ConceptEditor>singletonList(new DataMap_Editor());
      case 28:
        return Collections.<ConceptEditor>singletonList(new Description_Editor());
      case 29:
        return Collections.<ConceptEditor>singletonList(new DirectSignal_Editor());
      case 30:
        return Collections.<ConceptEditor>singletonList(new DischargeAction_Editor());
      case 31:
        return Collections.<ConceptEditor>singletonList(new FollowOrder_Editor());
      case 32:
        return Collections.<ConceptEditor>singletonList(new HumanInstanceFromSignal_Editor());
      case 33:
        return Collections.<ConceptEditor>singletonList(new InfectionCondition_Editor());
      case 34:
        return Collections.<ConceptEditor>singletonList(new KernelFCondition_Editor());
      case 35:
        return Collections.<ConceptEditor>singletonList(new MessageSelectionStrategy_Editor());
      case 36:
        return Collections.<ConceptEditor>singletonList(new MoveAction_Editor());
      case 37:
        return Collections.<ConceptEditor>singletonList(new MoveOrder_Editor());
      case 38:
        return Collections.<ConceptEditor>singletonList(new NewPatientSignal_Editor());
      case 39:
        return Collections.<ConceptEditor>singletonList(new NumericExpression_Editor());
      case 40:
        return Collections.<ConceptEditor>singletonList(new ObjectInstance_Editor());
      case 41:
        return Collections.<ConceptEditor>singletonList(new OccupiableInstance_Editor());
      case 42:
        return Collections.<ConceptEditor>singletonList(new OccupyAction_Editor());
      case 43:
        return Collections.<ConceptEditor>singletonList(new OccupyOrder_Editor());
      case 44:
        return Collections.<ConceptEditor>singletonList(new OrderPatientAction_Editor());
      case 45:
        return Collections.<ConceptEditor>singletonList(new PatientAdmissionOutcomeCondition_Editor());
      case 46:
        return Collections.<ConceptEditor>singletonList(new PatientInstance_Editor());
      case 47:
        return Collections.<ConceptEditor>singletonList(new PlaceInstanceCollection_Editor());
      case 48:
        return Collections.<ConceptEditor>singletonList(new PlaceInstanceFromSignal_Editor());
      case 49:
        return Collections.<ConceptEditor>singletonList(new PlaceInstanceReference_Editor());
      case 50:
        return Collections.<ConceptEditor>singletonList(new PossibilityCondition_Editor());
      case 51:
        return Collections.<ConceptEditor>singletonList(new Relationship_Editor());
      case 52:
        return Collections.<ConceptEditor>singletonList(new RemoveRelationshipAction_Editor());
      case 53:
        return Collections.<ConceptEditor>singletonList(new Room_Editor());
      case 54:
        return Collections.<ConceptEditor>singletonList(new RoomDefinition_Editor());
      case 55:
        return Collections.<ConceptEditor>singletonList(new RoomInstanceDefinition_Editor());
      case 56:
        return Collections.<ConceptEditor>singletonList(new RoomTypeReference_Editor());
      case 57:
        return Collections.<ConceptEditor>singletonList(new ScenarioBuilder_Editor());
      case 58:
        return Collections.<ConceptEditor>singletonList(new SelectFirstSignal_Editor());
      case 59:
        return Collections.<ConceptEditor>singletonList(new SelectNotRelationshipDataSignal_Editor());
      case 60:
        return Collections.<ConceptEditor>singletonList(new SelectRandomSignal_Editor());
      case 61:
        return Collections.<ConceptEditor>singletonList(new SelectRelationshipDataSignal_Editor());
      case 62:
        return Collections.<ConceptEditor>singletonList(new SelfInstance_Editor());
      case 63:
        return Collections.<ConceptEditor>singletonList(new SendSignalAction_Editor());
      case 64:
        return Collections.<ConceptEditor>singletonList(new Signal_Editor());
      case 65:
        return Collections.<ConceptEditor>singletonList(new SignalDefinition_Editor());
      case 66:
        return Collections.<ConceptEditor>singletonList(new SignalInitReference_Editor());
      case 67:
        return Collections.<ConceptEditor>singletonList(new SignalReference_Editor());
      case 68:
        return Collections.<ConceptEditor>singletonList(new SignalSelectionRuleLine_Editor());
      case 69:
        return Collections.<ConceptEditor>singletonList(new SpaceAtCondition_Editor());
      case 70:
        return Collections.<ConceptEditor>singletonList(new StayForConditionAction_Editor());
      case 71:
        return Collections.<ConceptEditor>singletonList(new StayForTimeAction_Editor());
      case 72:
        return Collections.<ConceptEditor>singletonList(new StayForTimeDistributionAction_Editor());
      case 73:
        return Collections.<ConceptEditor>singletonList(new StopOrder_Editor());
      case 74:
        return Collections.<ConceptEditor>singletonList(new SuitableForSideRoomCondition_Editor());
      case 75:
        return Collections.<ConceptEditor>singletonList(new TimeDistributionLine_Editor());
      case 76:
        return Collections.<ConceptEditor>singletonList(new TimeDistributionTable_Editor());
      case 77:
        return Collections.<ConceptEditor>singletonList(new UpdateAttributeAction_Editor());
      case 78:
        return Collections.<ConceptEditor>singletonList(new WallDefinition_Editor());
      case 79:
        return Collections.<ConceptEditor>singletonList(new WallInstanceDefinition_Editor());
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
          if ("AgentLanguage.editor.DummyForGrammarCells".equals(editorComponentId)) {
            return Collections.<ConceptEditorComponent>singletonList(new DummyForGrammarCells());
          }
        }
        break;
      default:
    }
    return Collections.<ConceptEditorComponent>emptyList();
  }

  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex2.index(cncpt)) {
      case 0:
        return Collections.<TransformationMenu>singletonList(new template_GrammarCellsSideTransformationsMenu());
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
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Actor());
      case 1:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ActorInstantiation());
      case 2:
        return Arrays.asList(new SubstituteMenu[]{new ActorReference_SubstituteMenu(), new GrammarCellsSubstituteMenu_ActorReference()});
      case 3:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ActorTypeSignal());
      case 4:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AdmissionBay());
      case 5:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AdmissionBayList());
      case 6:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AdmitAction());
      case 7:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AgentGenerator());
      case 8:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AgentGeneratorLine());
      case 9:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AggregateAttributeMonitor());
      case 10:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AndCondition());
      case 11:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Attribute());
      case 12:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AttributeCondition());
      case 13:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AttributeDistributionLine());
      case 14:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_AttributeDistributionTable());
      case 15:
        return Arrays.asList(new SubstituteMenu[]{new AttributeExpressionReference_SubstituteMenu(), new GrammarCellsSubstituteMenu_AttributeExpressionReference()});
      case 16:
        return Arrays.asList(new SubstituteMenu[]{new AttributeMonitor_SubstituteMenu(), new GrammarCellsSubstituteMenu_AttributeMonitor()});
      case 17:
        return Arrays.asList(new SubstituteMenu[]{new AttributeReference_SubstituteMenu(), new GrammarCellsSubstituteMenu_AttributeReference()});
      case 18:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_BedAvailableCondition());
      case 19:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Behaviour());
      case 20:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_BehaviourElement());
      case 21:
        return Arrays.asList(new SubstituteMenu[]{new BehaviourElementReference_SubstituteMenu(), new GrammarCellsSubstituteMenu_BehaviourElementReference()});
      case 22:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_BehaviourSequence());
      case 23:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_BinaryCondition());
      case 24:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Choice());
      case 25:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_CompositeOrder());
      case 26:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Condition());
      case 27:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ConsequenceElement());
      case 28:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ConsequenceInStep());
      case 29:
        return Arrays.asList(new SubstituteMenu[]{new DataInstanceMap_SubstituteMenu(), new GrammarCellsSubstituteMenu_DataInstanceMap()});
      case 30:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DataMap());
      case 31:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Description());
      case 32:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DirectSignal());
      case 33:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_DischargeAction());
      case 34:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_FollowOrder());
      case 35:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_HumanInstance());
      case 36:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_HumanInstanceFromSignal());
      case 37:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_InfectionCondition());
      case 38:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_InfectionState());
      case 39:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_KernelFCondition());
      case 40:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_MessageSelectionStrategy());
      case 41:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_MoveAction());
      case 42:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_MoveOrder());
      case 43:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_NewPatientSignal());
      case 44:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_NumericExpression());
      case 45:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ObjectInstance());
      case 46:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_OccupiableInstance());
      case 47:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_OccupyAction());
      case 48:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_OccupyOrder());
      case 49:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Order());
      case 50:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_OrderPatientAction());
      case 51:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PatientAdmissionOutcomeCondition());
      case 52:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PatientInstance());
      case 53:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PlaceInstance());
      case 54:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PlaceInstanceCollection());
      case 55:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PlaceInstanceFromSignal());
      case 56:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_PlaceInstanceReference(), new PlaceInstanceReference_SubstituteMenu()});
      case 57:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_PossibilityCondition());
      case 58:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Relationship());
      case 59:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RemoveRelationshipAction());
      case 60:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Room());
      case 61:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RoomDefinition());
      case 62:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_RoomInstanceDefinition(), new RoomInstanceDefinition_SubstituteMenu()});
      case 63:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RoomType());
      case 64:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_RoomTypeReference());
      case 65:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_ScenarioBuilder());
      case 66:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SelectFirstSignal());
      case 67:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SelectNotRelationshipDataSignal());
      case 68:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SelectRandomSignal());
      case 69:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SelectRelationshipDataSignal());
      case 70:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SelfInstance());
      case 71:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SendSignalAction());
      case 72:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_Signal());
      case 73:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SignalDefinition());
      case 74:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SignalInitReference());
      case 75:
        return Arrays.asList(new SubstituteMenu[]{new GrammarCellsSubstituteMenu_SignalReference(), new SignalReference_SubstituteMenu()});
      case 76:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SignalSelectionRule());
      case 77:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SignalSelectionRuleLine());
      case 78:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SignalTrigger());
      case 79:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SpaceAtCondition());
      case 80:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StayAction());
      case 81:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StayForConditionAction());
      case 82:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StayForTimeAction());
      case 83:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StayForTimeDistributionAction());
      case 84:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_StopOrder());
      case 85:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_SuitableForSideRoomCondition());
      case 86:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_TimeDistributionLine());
      case 87:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_TimeDistributionTable());
      case 88:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_UpdateAttributeAction());
      case 89:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_WallDefinition());
      case 90:
        return Collections.<SubstituteMenu>singletonList(new GrammarCellsSubstituteMenu_WallInstanceDefinition());
      default:
    }
    return Collections.<SubstituteMenu>emptyList();
  }

  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f7b02L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd0118aabL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a759561627f4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xc489c6b16b4a524L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xc489c6b16b4a529L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a75955f0be54L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x637eade0e62ce2b8L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x27ebd2392beaa324L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6ca3e29db4287123L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125516L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125515L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb466f367L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb466f407L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d466277fcL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7117c8e6083740b4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125519L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x22d5ede83b745a85L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce306b7aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3ee12f7242ef3be0L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308546L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x142c08a9440bcbdL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce30854aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x314f6777a655b3faL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x50f1fbdc6defea52L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xbc00e5badf6b520L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x45056e1fe037ad68L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f0c96L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7ba98c3ed5361882L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a759560ba2b4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a75955df55b4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483beL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99baabefL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x4936c0ffdc634baL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x142c08a93d880afL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f379c3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308554L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bdL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x2faec239055220ccL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d465e21e9L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f1255b0L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x757b60e121ce55abL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x757b60e121ce5041L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a75957e06520L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bbL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x2dcf788384f0e15fL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b863a4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xa159abb4e9e65L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f1255b3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f27bdc3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f12564bL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3096379b5dL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xaabf015bded4881L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f249042L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f249082L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f249045L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33967953caaL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f7b00L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f38ad7L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f78dbfL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f38affL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f38b27L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b5cf14L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f1890L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd010732aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd010732dL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f0c93L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd013d59eL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f379d6L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125578L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f19d58aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f19d52dL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb560f155L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bfL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xc489c6b174cfdc9L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb5610eb7L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb5610e89L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x50f1fbdc6defec6aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x109830a68a82ca51L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x109830a68a78a1e8L)).seal();
  private static final ConceptSwitchIndex conceptIndex1 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).seal();
  private static final ConceptSwitchIndex conceptIndex2 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).seal();
  private static final ConceptSwitchIndex conceptIndex3 = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f7b02L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd0118aabL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a759561627f4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xc489c6b16b4a524L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xc489c6b16b4a529L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a75955f0be54L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x637eade0e62ce2b8L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x27ebd2392beaa324L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6ca3e29db4287123L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x142c08a9440cdabL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125516L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125515L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb466f367L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb466f407L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d466277fcL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7117c8e6083740b4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125519L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x22d5ede83b745a85L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308547L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce306b7aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3ee12f7242ef3be0L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308546L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x142c08a9440bcbdL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce30854aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x314f6777a655b3faL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3ee12f7242ebbb42L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x50f1fbdc6defea52L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xbc00e5badf6b520L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x45056e1fe037ad68L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f0c96L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7ba98c3ed5361882L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a759560ba2b4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a75955df55b4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483beL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b863a2L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99baabefL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x4936c0ffdc634baL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x4936c0ffdc6342bL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x142c08a93d880afL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f379c3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce308554L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bdL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x2faec239055220ccL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x6773e65d465e21e9L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f1255b0L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x757b60e121ce55abL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x757b60e121ce5041L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x139a75957e06520L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bcL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bbL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x2dcf788384f0e15fL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b863a4L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b863a3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xa159abb4e9e65L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f1255b3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f27bdc3L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f12564bL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3096379b5dL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xaabf015bded4881L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f249042L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f249082L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f249045L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33966e8fe19L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x5dafd33967953caaL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f7b00L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f38ad7L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f78dbfL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f38affL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f38b27L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b5cf14L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f1890L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd010732aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd010732dL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f0c93L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x71ffe5bd013d59eL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f379eeL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3095f379d6L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x2faec239055220c9L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125578L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3a7166f1d96f188fL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f19d58aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f19d52dL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb560f155L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x7606d63a99b483bfL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0xc489c6b174cfdc9L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb5610eb7L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x296f74efb5610e89L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x50f1fbdc6defec6aL), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x109830a68a82ca51L), MetaIdFactory.conceptId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x109830a68a78a1e8L)).seal();
}
