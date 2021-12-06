package ActionCards.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Horizontal;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.baseLanguage.closures.runtime.Wrappers;
import de.slisson.mps.tables.runtime.cells.TableEditor;
import jetbrains.mps.baseLanguage.closures.runtime._FunctionTypes;
import de.slisson.mps.hacks.editor.EditorCacheHacks;
import de.slisson.mps.tables.runtime.cells.ChildsTracker;
import de.slisson.mps.tables.runtime.cells.PartialTableExtractor;
import de.slisson.mps.tables.runtime.gridmodel.Grid;
import java.util.List;
import de.slisson.mps.tables.runtime.gridmodel.HeaderGrid;
import java.util.ArrayList;
import de.slisson.mps.tables.runtime.gridmodel.GridAdapter;
import de.slisson.mps.tables.runtime.gridmodel.IHeaderNodeInsertAction;
import de.slisson.mps.tables.runtime.gridmodel.ChildNodesInsertAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SLinkOperations;
import jetbrains.mps.internal.collections.runtime.Sequence;
import jetbrains.mps.openapi.editor.cells.SubstituteInfo;
import de.slisson.mps.hacks.editor.SubstituteUtil;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import de.slisson.mps.tables.runtime.gridmodel.IGridElement;
import de.slisson.mps.tables.runtime.gridmodel.HeaderNodeInsertAction;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import de.slisson.mps.tables.runtime.style.ITableStyleFactory;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import de.slisson.mps.tables.runtime.gridmodel.EditorCellFactory;
import jetbrains.mps.editor.runtime.cells.AbstractCellAction;
import jetbrains.mps.nodeEditor.cellMenu.DefaultSChildSubstituteInfo;
import de.slisson.mps.tables.runtime.gridmodel.IRowCreateHandler;
import de.slisson.mps.tables.runtime.gridmodel.IHeaderNodeDeleteAction;
import de.slisson.mps.tables.runtime.gridmodel.HeaderGridFactory;
import de.slisson.mps.tables.runtime.gridmodel.Header;
import de.slisson.mps.tables.runtime.gridmodel.EditorCellHeader;
import de.slisson.mps.tables.runtime.gridmodel.StringHeaderReference;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class AttributeTable_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public AttributeTable_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
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
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_xahivx_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createCollection_1());
    editorCell.addEditorCell(createTable_1());
    return editorCell;
  }
  private EditorCell createCollection_1() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Horizontal());
    editorCell.setCellId("Collection_xahivx_a0");
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createRefNode_0());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Attribute:");
    editorCell.setCellId("Constant_xahivx_a0a");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new patientPropertySingleRoleHandler_xahivx_b0a(myNode, LINKS.patientProperty$oTU2, getEditorContext());
    return provider.createCell();
  }
  private static class patientPropertySingleRoleHandler_xahivx_b0a extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public patientPropertySingleRoleHandler_xahivx_b0a(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
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
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.patientProperty$oTU2, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.patientProperty$oTU2, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.patientProperty$oTU2);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.patientProperty$oTU2));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_patientProperty");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no patientProperty>";
    }
  }
  private EditorCell createTable_0(final EditorContext editorContext, final SNode node) {

    final Wrappers._T<TableEditor> editorCell = new Wrappers._T<TableEditor>(null);
    _FunctionTypes._void_P0_E0 creator = new _FunctionTypes._void_P0_E0() {
      public void invoke() {
        EditorCacheHacks.noCaching(editorContext, new Runnable() {
          public void run() {
            try {

              ChildsTracker.pushNewInstance();
              PartialTableExtractor.pushNewInstance();
              Grid grid = new Grid();

              // column headers 
              {
                List<HeaderGrid> headerGrids = new ArrayList<HeaderGrid>(0);
                grid.setColumnHeaders(headerGrids);
              }

              // row headers 
              {
                List<HeaderGrid> headerGrids = new ArrayList<HeaderGrid>(0);
                grid.setRowHeaders(headerGrids);
              }
              final Grid childGrid = createChildsVertical_xahivx_a1a(editorContext, node);
              childGrid.setSpanX(Math.max(1, grid.getColumnHeadersSizeX()));
              childGrid.setSpanY(Math.max(1, grid.getRowHeadersSizeY()));
              grid.setElement(0, 0, childGrid);

              editorCell.value = new TableEditor(editorContext, node, grid);
              editorCell.value.setCellId("Table_xahivx_b0");


              editorCell.value.init();
            } finally {
              PartialTableExtractor.popInstance();
              ChildsTracker.popInstance(true);
            }
          }
        });
      }
    };

    creator.invoke();

    return editorCell.value;

  }
  private EditorCell createTable_1() {
    return createTable_0(getEditorContext(), myNode);
  }
  public Grid createChildsVertical_xahivx_a1a(final EditorContext editorContext, final SNode node) {
    Grid grid = new Grid();
    GridAdapter gridAdapter = new GridAdapter(grid, editorContext, node);

    grid.setColumnHeaders(0, 0, createHeaderCollection_xahivx_a0b0(editorContext, node));

    final IHeaderNodeInsertAction insertAction = new ChildNodesInsertAction(node, SLinkOperations.findLinkDeclaration(LINKS.attributeLines$amAy)) {};

    try {
      getCellFactory().pushCellContext();
      getCellFactory().addCellContextHints();
      getCellFactory().removeCellContextHints();
      int y = 0;
      Iterable<SNode> elements = SLinkOperations.getChildren(node, LINKS.attributeLines$amAy);
      for (SNode child : Sequence.fromIterable(elements)) {
        final int yFinal = y;
        EditorCell cell = editorContext.getEditorComponent().getUpdater().getCurrentUpdateSession().updateChildNodeCell(child);
        ChildsTracker.getInstance().registerChild(cell);
        SubstituteInfo substituteInfo = SubstituteUtil.forChild(editorContext, node, (y < ListSequence.fromList(SLinkOperations.getChildren(node, LINKS.attributeLines$amAy)).count() ? ListSequence.fromList(SLinkOperations.getChildren(node, LINKS.attributeLines$amAy)).getElement(y) : null), LINKS.attributeLines$amAy);
        cell.setSubstituteInfo(substituteInfo);

        IGridElement gridElement = PartialTableExtractor.getGridElementFromEditorCell(cell, grid);

        gridElement.setRightRowCreateHandler(new HeaderNodeInsertAction(SNodeOperations.getIndexInParent(child) + 1, insertAction));
        gridElement.setLeftRowCreateHandler(new HeaderNodeInsertAction(SNodeOperations.getIndexInParent(child), insertAction));
        gridElement.setSpanX(Math.max(1, grid.getSizeX()));

        grid.setElement(0, y, gridElement);


        gridElement.setStyle(new ITableStyleFactory() {
          public Style createStyle(final int columnIndex, final int rowIndex) {
            Style style = new StyleImpl();
            final EditorCell editorCell = null;
            return style;
          }
        }.createStyle(0, y));

        gridElement.setInsertBeforeAction(new HeaderNodeInsertAction(SNodeOperations.getIndexInParent(child), insertAction), -1);
        gridElement.setInsertAction(new HeaderNodeInsertAction(SNodeOperations.getIndexInParent(child) + 1, insertAction), -1);

        y++;
      }
    } finally {
      getCellFactory().popCellContext();
    }

    if (ListSequence.fromList(SLinkOperations.getChildren(node, LINKS.attributeLines$amAy)).isEmpty()) {
      EditorCell placeholder = new EditorCellFactory(editorContext, node, grid).createPlaceholderConstant("<no attributeLines>");
      IGridElement element = PartialTableExtractor.getGridElementFromEditorCell(placeholder, grid);
      element.setSpanX(Math.max(element.getSpanX(), grid.getColumnHeadersSizeX()));
      element.setSpanY(Math.max(element.getSpanY(), grid.getRowHeadersSizeY()));
      grid.setElement(0, 0, element);

      placeholder.setAction(CellActionType.INSERT, new AbstractCellAction() {
        public void execute(EditorContext p0) {
          insertAction.insertNew(0);
        }
      });
      placeholder.setAction(CellActionType.INSERT_BEFORE, placeholder.getAction(CellActionType.INSERT));
      SubstituteInfo substituteInfo = new DefaultSChildSubstituteInfo(node, null, LINKS.attributeLines$amAy, editorContext);
      placeholder.setSubstituteInfo(substituteInfo);
      IRowCreateHandler rowCreateHandler = new IRowCreateHandler() {
        public void create() {
          insertAction.insertNew(0);
        }
      };

      grid.setLeftRowCreateHandler(rowCreateHandler);
      grid.setRightRowCreateHandler(rowCreateHandler);
    }

    grid.flattenOneLevel();
    return grid;
  }
  public HeaderGrid createHeaderCollection_xahivx_a0b0(final EditorContext editorContext, final SNode node) {
    IHeaderNodeInsertAction insertAction = null;
    IHeaderNodeDeleteAction deleteAction = null;

    List<HeaderGrid> nodeList = new ArrayList<HeaderGrid>();
    nodeList.add(createStaticHeader_xahivx_a0a1a(editorContext, node));
    nodeList.add(createStaticHeader_xahivx_b0a1a(editorContext, node));

    return new HeaderGridFactory(editorContext, node, true).createFromHeaderGridList(nodeList);
  }
  public HeaderGrid createStaticHeader_xahivx_a0a1a(final EditorContext editorContext, final SNode snode) {
    final Style style = new ITableStyleFactory() {
      public Style createStyle(final int columnIndex, final int rowIndex) {
        Style style = new StyleImpl();
        final EditorCell editorCell = null;
        return style;
      }
    }.createStyle(0, 0);
    final EditorCell_Constant cell = new EditorCell_Constant(editorContext, snode, "Value", false);
    Header header = new EditorCellHeader(new StringHeaderReference("Value"), cell);
    header.setLabel("Value");
    header.setStyle(style);
    HeaderGrid grid = new HeaderGrid();
    grid.setElement(0, 0, header);
    return grid;
  }
  public HeaderGrid createStaticHeader_xahivx_b0a1a(final EditorContext editorContext, final SNode snode) {
    final Style style = new ITableStyleFactory() {
      public Style createStyle(final int columnIndex, final int rowIndex) {
        Style style = new StyleImpl();
        final EditorCell editorCell = null;
        return style;
      }
    }.createStyle(0, 0);
    final EditorCell_Constant cell = new EditorCell_Constant(editorContext, snode, "Prevalence (%)", false);
    Header header = new EditorCellHeader(new StringHeaderReference("Prevalence (%)"), cell);
    header.setLabel("Prevalence (%)");
    header.setStyle(style);
    HeaderGrid grid = new HeaderGrid();
    grid.setElement(0, 0, header);
    return grid;
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink patientProperty$oTU2 = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a60L, 0x18668ef26f411a0aL, "patientProperty");
    /*package*/ static final SContainmentLink attributeLines$amAy = MetaAdapterFactory.getContainmentLink(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x25745663764b1a60L, 0x25745663764b1ad2L, "attributeLines");
  }
}
