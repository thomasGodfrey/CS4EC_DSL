package AgentLanguage.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Indent;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.AttributeOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.openapi.editor.menus.transformation.SPropertyInfo;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.SPropertyAccessor;
import jetbrains.mps.nodeEditor.cellMenu.SPropertySubstituteInfo;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.IAttributeDescriptor;
import jetbrains.mps.internal.collections.runtime.IWhereFilter;
import java.util.Objects;
import jetbrains.mps.lang.core.behavior.PropertyAttribute__BehaviorDescriptor;
import jetbrains.mps.nodeEditor.EditorManager;
import jetbrains.mps.openapi.editor.update.AttributeKind;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import com.mbeddr.mpsutil.grammarcells.runtime.CellActionWithReadAccess;
import com.mbeddr.mpsutil.grammarcells.runtime.SavedCaretPosition;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import com.mbeddr.mpsutil.grammarcells.runtime.DelegateToParentCellAction;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import org.jetbrains.mps.openapi.language.SConcept;

/*package*/ class Attribute_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public Attribute_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Indent());
    editorCell.setCellId("Collection_mc4j88_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createProperty_0());
    if (nodeCondition_mc4j88_a1a()) {
      editorCell.addEditorCell(createCustomFactory_1());
    }
    editorCell.addEditorCell(createRefNode_1());
    return editorCell;
  }
  private boolean nodeCondition_mc4j88_a1a() {
    return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.type$1eya)).isNotEmpty();
  }
  private EditorCell createProperty_0() {
    getCellFactory().pushCellContext();
    try {
      final SProperty property = PROPS.name$MnvL;
      getCellFactory().setPropertyInfo(new SPropertyInfo(myNode, property));
      EditorCell_Property editorCell = EditorCell_Property.create(getEditorContext(), new SPropertyAccessor(myNode, property, false, false), myNode);
      editorCell.setDefaultText("<no name>");
      editorCell.setCellId("property_name");
      editorCell.setSubstituteInfo(new SPropertySubstituteInfo(editorCell, property));
      setCellContext(editorCell);
      Iterable<SNode> propertyAttributes = SNodeOperations.ofConcept(new IAttributeDescriptor.AllAttributes().list(myNode), CONCEPTS.PropertyAttribute$Gb);
      Iterable<SNode> currentPropertyAttributes = Sequence.fromIterable(propertyAttributes).where(new IWhereFilter<SNode>() {
        public boolean accept(SNode it) {
          return Objects.equals(PropertyAttribute__BehaviorDescriptor.getProperty_id1avfQ4BBzOo.invoke(it), property);
        }
      });
      if (Sequence.fromIterable(currentPropertyAttributes).isNotEmpty()) {
        EditorManager manager = EditorManager.getInstanceFromContext(getEditorContext());
        return manager.createNodeRoleAttributeCell(Sequence.fromIterable(currentPropertyAttributes).first(), AttributeKind.PROPERTY, editorCell);
      } else
      return editorCell;
    } finally {
      getCellFactory().popCellContext();
    }
  }
  private EditorCell createCustomFactory_0(final EditorContext editorContext, final SNode node) {

    if (!(new Object() {
      public boolean showWrapped() {
        return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.type$1eya)).isNotEmpty();
      }
    }.showWrapped())) {
      return EditorCell_Collection.createVertical(editorContext, node);
    }

    final EditorCell cell = createCustomFactory_3();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        cell.setAction(CellActionType.BACKSPACE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            SavedCaretPosition caretPosition = new SavedCaretPosition(editorContext);
            caretPosition.save();
            SNodeOperations.deleteNode(SLinkOperations.getTarget(node, LINKS.type$1eya));
            editorContext.flushEvents();
            caretPosition.restore(true);
          }
        });
        cell.setAction(CellActionType.DELETE, new CellActionWithReadAccess() {
          public void execute(EditorContext editorContext) {
            SavedCaretPosition caretPosition = new SavedCaretPosition(editorContext);
            caretPosition.save();
            SNodeOperations.deleteNode(SLinkOperations.getTarget(node, LINKS.type$1eya));
            editorContext.flushEvents();
            caretPosition.restore(false);
          }
        });
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_1() {
    return createCustomFactory_0(getEditorContext(), myNode);
  }
  private EditorCell createCustomFactory_2(final EditorContext editorContext, final SNode node) {

    if (!(new Object() {
      public boolean showWrapped() {
        return Sequence.fromIterable(AttributeOperations.getChildNodesAndAttributes(myNode, LINKS.type$1eya)).isNotEmpty();
      }
    }.showWrapped())) {
      return EditorCell_Collection.createVertical(editorContext, node);
    }

    final EditorCell cell = createCollection_1();
    EditorCell editorCell = new _FunctionTypes._return_P0_E0<EditorCell>() {
      public EditorCell invoke() {
        final SNode childNode = SLinkOperations.getTarget(myNode, LINKS.type$1eya);
        new Object() {
          public void removeDeleteAction(EditorCell descendantCell) {
            if (descendantCell.getSNode() == childNode) {
              descendantCell.setAction(CellActionType.DELETE, new DelegateToParentCellAction(descendantCell, CellActionType.DELETE));
              descendantCell.setAction(CellActionType.BACKSPACE, new DelegateToParentCellAction(descendantCell, CellActionType.BACKSPACE));
            } else {
              if (descendantCell instanceof jetbrains.mps.openapi.editor.cells.EditorCell_Collection) {
                for (EditorCell childCell : Sequence.fromIterable(((jetbrains.mps.openapi.editor.cells.EditorCell_Collection) descendantCell))) {
                  removeDeleteAction(childCell);
                }
              }
            }
          }
        }.removeDeleteAction(cell);
        return cell;
      }
    }.invoke();
    return editorCell;
  }
  private EditorCell createCustomFactory_3() {
    return createCustomFactory_2(getEditorContext(), myNode);
  }
  private EditorCell createCollection_1() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_mc4j88_a0b0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.SELECTABLE, false);
    editorCell.getStyle().putAll(style);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createRefNode_0());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, ":");
    editorCell.setCellId("Constant_mc4j88_a0a1a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new typeSingleRoleHandler_mc4j88_b0a1a(myNode, LINKS.type$1eya, getEditorContext());
    return provider.createCell();
  }
  private static class typeSingleRoleHandler_mc4j88_b0a1a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public typeSingleRoleHandler_mc4j88_b0a1a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.type$1eya, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.type$1eya, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.type$1eya);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.type$1eya));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_type");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no type>";
    }
  }
  private EditorCell createRefNode_1() {
    SingleRoleCellProvider provider = new valueSingleRoleHandler_mc4j88_c0(myNode, LINKS.value$2S9x, getEditorContext());
    return provider.createCell();
  }
  private static class valueSingleRoleHandler_mc4j88_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public valueSingleRoleHandler_mc4j88_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.value$2S9x, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.value$2S9x, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.value$2S9x);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.value$2S9x));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_value");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no value>";
    }
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink type$1eya = MetaAdapterFactory.getContainmentLink(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x62632b96c1ab0b7cL, 0x62632b96c1ab0b7dL, "type");
    /*package*/ static final SContainmentLink value$2S9x = MetaAdapterFactory.getContainmentLink(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x3c282c112f125516L, 0x2574566375976ad5L, "value");
  }

  private static final class PROPS {
    /*package*/ static final SProperty name$MnvL = MetaAdapterFactory.getProperty(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L, 0x110396ec041L, "name");
  }

  private static final class CONCEPTS {
    /*package*/ static final SConcept PropertyAttribute$Gb = MetaAdapterFactory.getConcept(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x2eb1ad060897da56L, "jetbrains.mps.lang.core.structure.PropertyAttribute");
  }
}