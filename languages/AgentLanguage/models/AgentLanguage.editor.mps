<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:95c0b0eb-dcf6-42e6-beaa-085ce5a76ca6(AgentLanguage.editor)">
  <persistence version="9" />
  <languages>
    <use id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor" version="14" />
    <use id="7e450f4e-1ac3-41ef-a851-4598161bdb94" name="de.slisson.mps.tables" version="0" />
    <use id="9d69e719-78c8-4286-90db-fb19c107d049" name="com.mbeddr.mpsutil.grammarcells" version="2" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="3751" ref="r:773fb116-fb45-4750-a73a-f0ffaf85115c(AgentLanguage.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
    <import index="tpco" ref="r:00000000-0000-4000-0000-011c89590284(jetbrains.mps.lang.core.editor)" implicit="true" />
    <import index="hm2y" ref="r:66e07cb4-a4b0-4bf3-a36d-5e9ed1ff1bd3(org.iets3.core.expr.base.structure)" implicit="true" />
    <import index="3z3g" ref="r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="18bc6592-03a6-4e29-a83a-7ff23bde13ba" name="jetbrains.mps.lang.editor">
      <concept id="1071666914219" name="jetbrains.mps.lang.editor.structure.ConceptEditorDeclaration" flags="ig" index="24kQdi" />
      <concept id="1140524381322" name="jetbrains.mps.lang.editor.structure.CellModel_ListWithRole" flags="ng" index="2czfm3">
        <property id="1140524450557" name="separatorText" index="2czwfO" />
        <child id="1140524464360" name="cellLayout" index="2czzBx" />
        <child id="1233141163694" name="separatorStyle" index="sWeuL" />
      </concept>
      <concept id="1106270549637" name="jetbrains.mps.lang.editor.structure.CellLayout_Horizontal" flags="nn" index="2iRfu4" />
      <concept id="1106270571710" name="jetbrains.mps.lang.editor.structure.CellLayout_Vertical" flags="nn" index="2iRkQZ" />
      <concept id="1106270637846" name="jetbrains.mps.lang.editor.structure.CellLayout_Flow" flags="nn" index="2iR$Sn" />
      <concept id="1237303669825" name="jetbrains.mps.lang.editor.structure.CellLayout_Indent" flags="nn" index="l2Vlx" />
      <concept id="1237308012275" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineStyleClassItem" flags="ln" index="ljvvj" />
      <concept id="1237375020029" name="jetbrains.mps.lang.editor.structure.IndentLayoutNewLineChildrenStyleClassItem" flags="ln" index="pj6Ft" />
      <concept id="1142886221719" name="jetbrains.mps.lang.editor.structure.QueryFunction_NodeCondition" flags="in" index="pkWqt" />
      <concept id="1142886811589" name="jetbrains.mps.lang.editor.structure.ConceptFunctionParameter_node" flags="nn" index="pncrf" />
      <concept id="1237385578942" name="jetbrains.mps.lang.editor.structure.IndentLayoutOnNewLineStyleClassItem" flags="ln" index="pVoyu" />
      <concept id="1233148810477" name="jetbrains.mps.lang.editor.structure.InlineStyleDeclaration" flags="ng" index="tppnM" />
      <concept id="1080736578640" name="jetbrains.mps.lang.editor.structure.BaseEditorComponent" flags="ig" index="2wURMF">
        <child id="1080736633877" name="cellModel" index="2wV5jI" />
      </concept>
      <concept id="1078938745671" name="jetbrains.mps.lang.editor.structure.EditorComponentDeclaration" flags="ig" index="PKFIW" />
      <concept id="1078939183254" name="jetbrains.mps.lang.editor.structure.CellModel_Component" flags="sg" stub="3162947552742194261" index="PMmxH">
        <reference id="1078939183255" name="editorComponent" index="PMmxG" />
      </concept>
      <concept id="1186403751766" name="jetbrains.mps.lang.editor.structure.FontStyleStyleClassItem" flags="ln" index="Vb9p2">
        <property id="1186403771423" name="style" index="Vbekb" />
      </concept>
      <concept id="1186414536763" name="jetbrains.mps.lang.editor.structure.BooleanStyleSheetItem" flags="ln" index="VOi$J">
        <property id="1186414551515" name="flag" index="VOm3f" />
      </concept>
      <concept id="1186414928363" name="jetbrains.mps.lang.editor.structure.SelectableStyleSheetItem" flags="ln" index="VPM3Z" />
      <concept id="1186414999511" name="jetbrains.mps.lang.editor.structure.UnderlinedStyleClassItem" flags="ln" index="VQ3r3">
        <property id="1214316229833" name="underlined" index="2USNnj" />
      </concept>
      <concept id="1186415722038" name="jetbrains.mps.lang.editor.structure.FontSizeStyleClassItem" flags="ln" index="VSNWy">
        <property id="1221209241505" name="value" index="1lJzqX" />
      </concept>
      <concept id="1233758997495" name="jetbrains.mps.lang.editor.structure.PunctuationLeftStyleClassItem" flags="ln" index="11L4FC" />
      <concept id="1233759184865" name="jetbrains.mps.lang.editor.structure.PunctuationRightStyleClassItem" flags="ln" index="11LMrY" />
      <concept id="1088013125922" name="jetbrains.mps.lang.editor.structure.CellModel_RefCell" flags="sg" stub="730538219795941030" index="1iCGBv">
        <child id="1088186146602" name="editorComponent" index="1sWHZn" />
      </concept>
      <concept id="1088185857835" name="jetbrains.mps.lang.editor.structure.InlineEditorComponent" flags="ig" index="1sVBvm" />
      <concept id="1215007762405" name="jetbrains.mps.lang.editor.structure.FloatStyleClassItem" flags="ln" index="3$6MrZ">
        <property id="1215007802031" name="value" index="3$6WeP" />
      </concept>
      <concept id="1215007883204" name="jetbrains.mps.lang.editor.structure.PaddingLeftStyleClassItem" flags="ln" index="3$7fVu" />
      <concept id="1215007897487" name="jetbrains.mps.lang.editor.structure.PaddingRightStyleClassItem" flags="ln" index="3$7jql" />
      <concept id="1139848536355" name="jetbrains.mps.lang.editor.structure.CellModel_WithRole" flags="ng" index="1$h60E">
        <property id="1139852716018" name="noTargetText" index="1$x2rV" />
        <property id="1140017977771" name="readOnly" index="1Intyy" />
        <reference id="1140103550593" name="relationDeclaration" index="1NtTu8" />
      </concept>
      <concept id="1073389446423" name="jetbrains.mps.lang.editor.structure.CellModel_Collection" flags="sn" stub="3013115976261988961" index="3EZMnI">
        <child id="1106270802874" name="cellLayout" index="2iSdaV" />
        <child id="1073389446424" name="childCellModel" index="3EZMnx" />
      </concept>
      <concept id="1073389577006" name="jetbrains.mps.lang.editor.structure.CellModel_Constant" flags="sn" stub="3610246225209162225" index="3F0ifn">
        <property id="1073389577007" name="text" index="3F0ifm" />
      </concept>
      <concept id="1073389658414" name="jetbrains.mps.lang.editor.structure.CellModel_Property" flags="sg" stub="730538219796134133" index="3F0A7n" />
      <concept id="1219418625346" name="jetbrains.mps.lang.editor.structure.IStyleContainer" flags="ng" index="3F0Thp">
        <child id="1219418656006" name="styleItem" index="3F10Kt" />
      </concept>
      <concept id="1073389882823" name="jetbrains.mps.lang.editor.structure.CellModel_RefNode" flags="sg" stub="730538219795960754" index="3F1sOY" />
      <concept id="1073390211982" name="jetbrains.mps.lang.editor.structure.CellModel_RefNodeList" flags="sg" stub="2794558372793454595" index="3F2HdR" />
      <concept id="1088612959204" name="jetbrains.mps.lang.editor.structure.CellModel_Alternation" flags="sg" stub="8104358048506729361" index="1QoScp">
        <property id="1088613081987" name="vertical" index="1QpmdY" />
        <child id="1145918517974" name="alternationCondition" index="3e4ffs" />
        <child id="1088612958265" name="ifTrueCellModel" index="1QoS34" />
        <child id="1088612973955" name="ifFalseCellModel" index="1QoVPY" />
      </concept>
      <concept id="1198256887712" name="jetbrains.mps.lang.editor.structure.CellModel_Indent" flags="ng" index="3XFhqQ" />
      <concept id="1166049232041" name="jetbrains.mps.lang.editor.structure.AbstractComponent" flags="ng" index="1XWOmA">
        <reference id="1166049300910" name="conceptDeclaration" index="1XX52x" />
      </concept>
    </language>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068580123137" name="jetbrains.mps.baseLanguage.structure.BooleanConstant" flags="nn" index="3clFbT">
        <property id="1068580123138" name="value" index="3clFbU" />
      </concept>
      <concept id="1068581242878" name="jetbrains.mps.baseLanguage.structure.ReturnStatement" flags="nn" index="3cpWs6">
        <child id="1068581517676" name="expression" index="3cqZAk" />
      </concept>
    </language>
    <language id="9d69e719-78c8-4286-90db-fb19c107d049" name="com.mbeddr.mpsutil.grammarcells">
      <concept id="5083944728298846680" name="com.mbeddr.mpsutil.grammarcells.structure.OptionalCell" flags="ng" index="_tjkj">
        <child id="5083944728298846681" name="option" index="_tjki" />
      </concept>
      <concept id="8207263695490893775" name="com.mbeddr.mpsutil.grammarcells.structure.CellBasedRule" flags="ng" index="2ElW$n" />
      <concept id="7363578995839435357" name="com.mbeddr.mpsutil.grammarcells.structure.WrapperCell" flags="ng" index="1kIj98">
        <child id="7363578995839435358" name="wrapped" index="1kIj9b" />
      </concept>
      <concept id="2862331529394479412" name="com.mbeddr.mpsutil.grammarcells.structure.GrammarConstantQuery" flags="ig" index="1Lj6DC" />
      <concept id="2862331529394479405" name="com.mbeddr.mpsutil.grammarcells.structure.GrammarConstantQueryCell" flags="ng" index="1Lj6DL">
        <child id="2862331529394487726" name="query" index="1Lj8FM" />
      </concept>
      <concept id="2862331529394480355" name="com.mbeddr.mpsutil.grammarcells.structure.Parameter_SubConcept" flags="ng" index="1Lj6YZ" />
      <concept id="3011849438420226693" name="com.mbeddr.mpsutil.grammarcells.structure.GrammarInfoCell" flags="ng" index="1WcQYu">
        <child id="8207263695490916687" name="rules" index="2El2Yn" />
        <child id="2862331529394260612" name="projection" index="1LiK7o" />
      </concept>
    </language>
    <language id="7e450f4e-1ac3-41ef-a851-4598161bdb94" name="de.slisson.mps.tables">
      <concept id="1397920687865593407" name="de.slisson.mps.tables.structure.PartialTable" flags="ng" index="2r0Tta">
        <child id="1397920687865593523" name="cells" index="2r0Tv6" />
      </concept>
      <concept id="1397920687865839151" name="de.slisson.mps.tables.structure.HeaderCollection" flags="ng" index="2r3Xtq">
        <child id="6874252336974775034" name="childs" index="uCobI" />
      </concept>
      <concept id="1397920687864997170" name="de.slisson.mps.tables.structure.TableNodeCollection" flags="ng" index="2reCL7">
        <child id="1397920687864997171" name="childTableNodes" index="2reCL6" />
      </concept>
      <concept id="1397920687864997153" name="de.slisson.mps.tables.structure.StaticHorizontal" flags="ng" index="2reCLk" />
      <concept id="1397920687864997143" name="de.slisson.mps.tables.structure.TableCell" flags="ng" index="2reCLy">
        <child id="1397920687865064647" name="editorCell" index="2reSmM" />
      </concept>
      <concept id="1397920687865064415" name="de.slisson.mps.tables.structure.ChildsVertical" flags="ng" index="2reSaE" />
      <concept id="1397920687865064509" name="de.slisson.mps.tables.structure.ChildCollection" flags="ng" index="2reSl8">
        <reference id="1397920687864997201" name="linkDeclaration" index="2reCK$" />
        <child id="2199447184406843652" name="columnHeaders" index="2YiT2b" />
        <child id="2199447184407180854" name="rowHeaders" index="2YlbuT" />
      </concept>
      <concept id="1397920687864864270" name="de.slisson.mps.tables.structure.StaticHeader" flags="ng" index="2rfbtV">
        <property id="1397920687864864274" name="text" index="2rfbtB" />
      </concept>
      <concept id="1397920687864683158" name="de.slisson.mps.tables.structure.Table" flags="ng" index="2rfBfz">
        <child id="1397920687864865354" name="cells" index="2rf8GZ" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1883223317721008708" name="jetbrains.mps.lang.smodel.structure.IfInstanceOfStatement" flags="nn" index="Jncv_">
        <reference id="1883223317721008712" name="nodeConcept" index="JncvD" />
        <child id="1883223317721008709" name="body" index="Jncv$" />
        <child id="1883223317721008711" name="variable" index="JncvA" />
        <child id="1883223317721008710" name="nodeExpression" index="JncvB" />
      </concept>
      <concept id="1883223317721008713" name="jetbrains.mps.lang.smodel.structure.IfInstanceOfVariable" flags="ng" index="JncvC" />
      <concept id="6870613620390542976" name="jetbrains.mps.lang.smodel.structure.ConceptAliasOperation" flags="ng" index="3n3YKJ" />
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="24kQdi" id="3VxbR92VNJF">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:3VxbR92VNJw" resolve="BehaviourElementReference" />
    <node concept="1iCGBv" id="3VxbR92VNLp" role="2wV5jI">
      <ref role="1NtTu8" to="3751:3VxbR92VNJx" resolve="behaviourElement" />
      <node concept="1sVBvm" id="3VxbR92VNLr" role="1sWHZn">
        <node concept="3F0A7n" id="3VxbR92VNLy" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="svZ_Jg47cS">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:svZ_Jg47cH" resolve="SignalDefinition" />
    <node concept="3EZMnI" id="svZ_Jg47cU" role="2wV5jI">
      <node concept="3EZMnI" id="svZ_Jg47fT" role="3EZMnx">
        <node concept="VPM3Z" id="svZ_Jg47fW" role="3F10Kt" />
        <node concept="3F0ifn" id="svZ_Jg47fY" role="3EZMnx">
          <property role="3F0ifm" value="Signal Definition" />
          <node concept="ljvvj" id="svZ_Jg47fZ" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="2iRfu4" id="svZ_Jg47g0" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="svZ_Jg47dJ" role="3EZMnx">
        <node concept="ljvvj" id="svZ_Jg47dO" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="svZ_Jg47dW" role="3EZMnx">
        <node concept="ljvvj" id="svZ_Jg47e3" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="svZ_Jg47gK" role="3EZMnx">
        <property role="3F0ifm" value="signals" />
        <node concept="ljvvj" id="svZ_Jg47hS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKX9" role="3EZMnx">
        <node concept="ljvvj" id="3DLpJ7prKXX" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="4TDP_mnWdV" role="3EZMnx">
        <node concept="VPM3Z" id="4TDP_mnWdX" role="3F10Kt" />
        <node concept="3F2HdR" id="4TDP_mnWem" role="3EZMnx">
          <ref role="1NtTu8" to="3751:svZ_Jg47cI" resolve="signals" />
          <node concept="2iRkQZ" id="4TDP_mnWep" role="2czzBx" />
          <node concept="VPM3Z" id="4TDP_mnWeq" role="3F10Kt" />
        </node>
        <node concept="l2Vlx" id="4TDP_mnWe0" role="2iSdaV" />
      </node>
      <node concept="l2Vlx" id="svZ_Jg47cX" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="svZ_Jg8uLu">
    <property role="3GE5qa" value="actors" />
    <ref role="1XX52x" to="3751:svZ_Jg4oEF" resolve="ActorReference" />
    <node concept="1iCGBv" id="svZ_Jg8uLw" role="2wV5jI">
      <ref role="1NtTu8" to="3751:svZ_Jg4oEG" resolve="actor" />
      <node concept="1sVBvm" id="svZ_Jg8uLy" role="1sWHZn">
        <node concept="3F0A7n" id="svZ_Jg8uLD" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3DLpJ7prKMO">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:3DLpJ7prKMm" resolve="DataMap" />
    <node concept="3EZMnI" id="3DLpJ7prKMQ" role="2wV5jI">
      <node concept="3F0A7n" id="53LYXLHGwTM" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKN4" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F0A7n" id="3DLpJ7ps9Xn" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3DLpJ7ps9Xe" resolve="valueType" />
      </node>
      <node concept="l2Vlx" id="3DLpJ7prKMT" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3DLpJ7prLyr">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction" />
    <ref role="1XX52x" to="3751:3DLpJ7prLyg" resolve="SendSignalAction" />
    <node concept="3EZMnI" id="3DLpJ7psBzA" role="2wV5jI">
      <node concept="3F0ifn" id="3DLpJ7psBzH" role="3EZMnx">
        <property role="3F0ifm" value="send message:" />
      </node>
      <node concept="l2Vlx" id="3DLpJ7psBzD" role="2iSdaV" />
      <node concept="3EZMnI" id="53LYXLI10tJ" role="3EZMnx">
        <node concept="VPM3Z" id="53LYXLI10tM" role="3F10Kt" />
        <node concept="3F1sOY" id="53LYXLI10u0" role="3EZMnx">
          <ref role="1NtTu8" to="3751:3DLpJ7prLyh" resolve="signalInitReference" />
        </node>
        <node concept="l2Vlx" id="53LYXLI10tQ" role="2iSdaV" />
        <node concept="3F1sOY" id="7IDz3VleGEE" role="3EZMnx">
          <ref role="1NtTu8" to="3751:7IDz3Vldxyw" resolve="description" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3DLpJ7prLzw">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:3DLpJ7prKMj" resolve="SignalInitReference" />
    <node concept="3EZMnI" id="53LYXLI10u_" role="2wV5jI">
      <node concept="l2Vlx" id="53LYXLI10uA" role="2iSdaV" />
      <node concept="3EZMnI" id="53LYXLI10xH" role="3EZMnx">
        <node concept="VPM3Z" id="53LYXLI10xK" role="3F10Kt" />
        <node concept="3EZMnI" id="53LYXLI10zp" role="3EZMnx">
          <node concept="VPM3Z" id="53LYXLI10zr" role="3F10Kt" />
          <node concept="1iCGBv" id="53LYXLI10z2" role="3EZMnx">
            <ref role="1NtTu8" to="3751:3DLpJ7prKMk" resolve="signal" />
            <node concept="1sVBvm" id="53LYXLI10z3" role="1sWHZn">
              <node concept="3F0A7n" id="53LYXLI10z4" role="2wV5jI">
                <property role="1Intyy" value="true" />
                <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
          <node concept="3F0ifn" id="53LYXLI10zt" role="3EZMnx">
            <property role="3F0ifm" value="{" />
          </node>
          <node concept="l2Vlx" id="53LYXLI10zu" role="2iSdaV" />
        </node>
        <node concept="3EZMnI" id="53LYXLI1wTB" role="3EZMnx">
          <node concept="VPM3Z" id="53LYXLI1wTD" role="3F10Kt" />
          <node concept="3XFhqQ" id="53LYXLI1wU1" role="3EZMnx" />
          <node concept="3F2HdR" id="53LYXLI10zW" role="3EZMnx">
            <ref role="1NtTu8" to="3751:3KCb14J4_ov" resolve="signalContent" />
            <node concept="2iRkQZ" id="53LYXLI10$0" role="2czzBx" />
            <node concept="VPM3Z" id="53LYXLI10$1" role="3F10Kt" />
          </node>
          <node concept="l2Vlx" id="53LYXLI1wTG" role="2iSdaV" />
        </node>
        <node concept="3F0ifn" id="53LYXLI10$e" role="3EZMnx">
          <property role="3F0ifm" value="}" />
        </node>
        <node concept="1QoScp" id="4TDP_mI0ZX" role="3EZMnx">
          <property role="1QpmdY" value="true" />
          <node concept="3EZMnI" id="4TDP_mI12c" role="1QoS34">
            <node concept="2iRfu4" id="4TDP_mI12d" role="2iSdaV" />
            <node concept="3F0ifn" id="4TDP_mI0ZZ" role="3EZMnx">
              <property role="3F0ifm" value="send to:" />
            </node>
            <node concept="3F1sOY" id="4TDP_mI12n" role="3EZMnx">
              <ref role="1NtTu8" to="3751:4TDP_mEgeY" resolve="signalReceiver" />
            </node>
          </node>
          <node concept="pkWqt" id="4TDP_mI100" role="3e4ffs">
            <node concept="3clFbS" id="4TDP_mI102" role="2VODD2">
              <node concept="Jncv_" id="4TDP_mPvLp" role="3cqZAp">
                <ref role="JncvD" to="3751:4TDP_m2UaO" resolve="DirectSignal" />
                <node concept="2OqwBi" id="4TDP_mPvUs" role="JncvB">
                  <node concept="pncrf" id="4TDP_mPvM1" role="2Oq$k0" />
                  <node concept="3TrEf2" id="4TDP_mPw8U" role="2OqNvi">
                    <ref role="3Tt5mk" to="3751:3DLpJ7prKMk" resolve="signal" />
                  </node>
                </node>
                <node concept="3clFbS" id="4TDP_mPvLr" role="Jncv$">
                  <node concept="3cpWs6" id="4TDP_mPwc2" role="3cqZAp">
                    <node concept="3clFbT" id="4TDP_mPwdc" role="3cqZAk">
                      <property role="3clFbU" value="true" />
                    </node>
                  </node>
                </node>
                <node concept="JncvC" id="4TDP_mPvLs" role="JncvA">
                  <property role="TrG5h" value="directSignal" />
                  <node concept="2jxLKc" id="4TDP_mPvLt" role="1tU5fm" />
                </node>
              </node>
              <node concept="3cpWs6" id="4TDP_mPwki" role="3cqZAp">
                <node concept="3clFbT" id="4TDP_mPwlm" role="3cqZAk" />
              </node>
            </node>
          </node>
          <node concept="3F0ifn" id="4TDP_mI28$" role="1QoVPY" />
        </node>
        <node concept="2iRkQZ" id="53LYXLI10xO" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="53LYXLI10we" role="3EZMnx">
        <node concept="ljvvj" id="53LYXLI10w$" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3DLpJ7puc0K">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:3l6cNjec8l6" resolve="BehaviourSequence" />
    <node concept="3EZMnI" id="3KCb14J87DF" role="2wV5jI">
      <node concept="3F2HdR" id="3KCb14J87Ep" role="3EZMnx">
        <property role="2czwfO" value="---------------------" />
        <ref role="1NtTu8" to="3751:3l6cNjec8l8" resolve="steps" />
        <node concept="2iRkQZ" id="3KCb14J87Es" role="2czzBx" />
        <node concept="VPM3Z" id="3KCb14J87Et" role="3F10Kt" />
      </node>
      <node concept="l2Vlx" id="3KCb14J87DI" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J4_n0">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:3KCb14J4_mN" resolve="PlaceInstanceFromSignal" />
    <node concept="3EZMnI" id="3KCb14J4_n2" role="2wV5jI">
      <node concept="3F0ifn" id="3KCb14J4_nc" role="3EZMnx">
        <property role="3F0ifm" value="signal &quot;" />
      </node>
      <node concept="3F0A7n" id="3KCb14J4_ny" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3KCb14J4_mQ" resolve="data" />
      </node>
      <node concept="3F0ifn" id="29F2V$jqkvi" role="3EZMnx">
        <property role="3F0ifm" value="&quot;" />
      </node>
      <node concept="l2Vlx" id="3KCb14J4_n5" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J4_oJ">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:3KCb14J4_lS" resolve="SpaceAtCondition" />
    <node concept="3EZMnI" id="3KCb14J4_oL" role="2wV5jI">
      <node concept="3F1sOY" id="3KCb14J4_oS" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3KCb14J4_oy" resolve="left" />
      </node>
      <node concept="3F0ifn" id="3KCb14J4_oY" role="3EZMnx">
        <property role="3F0ifm" value="is at" />
      </node>
      <node concept="3F1sOY" id="3KCb14J4_p6" role="3EZMnx">
        <property role="1$x2rV" value="integer" />
        <ref role="1NtTu8" to="3751:3KCb14J4_o$" resolve="right" />
      </node>
      <node concept="l2Vlx" id="3KCb14J4_oO" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J4_pm">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:3KCb14J4_pb" resolve="PossibilityCondition" />
    <node concept="3EZMnI" id="3KCb14J4_po" role="2wV5jI">
      <node concept="3F0ifn" id="3KCb14J4_pv" role="3EZMnx">
        <property role="3F0ifm" value="at probability" />
      </node>
      <node concept="3F1sOY" id="6tNT_P6pQaw" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6tNT_P6pQaq" resolve="possibility" />
      </node>
      <node concept="3F0ifn" id="ijr0ZXQl0P" role="3EZMnx">
        <property role="3F0ifm" value="%" />
      </node>
      <node concept="l2Vlx" id="3KCb14J4_pr" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J5ffO">
    <property role="3GE5qa" value="actions.OperationsFlow" />
    <ref role="1XX52x" to="3751:3l6cNjec8la" resolve="Choice" />
    <node concept="3EZMnI" id="3KCb14J5ffQ" role="2wV5jI">
      <node concept="3F0ifn" id="3KCb14J5fgN" role="3EZMnx">
        <property role="3F0ifm" value="if" />
      </node>
      <node concept="1kIj98" id="52K8EkiqFv" role="3EZMnx">
        <node concept="3F1sOY" id="52K8EkiqFQ" role="1kIj9b">
          <ref role="1NtTu8" to="3751:3l6cNjec8ld" resolve="condition" />
        </node>
      </node>
      <node concept="3XFhqQ" id="3KCb14J5fhv" role="3EZMnx">
        <node concept="pVoyu" id="52K8Eknw2q" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3KCb14J7952" role="3EZMnx">
        <node concept="VPM3Z" id="3KCb14J7955" role="3F10Kt" />
        <node concept="3F1sOY" id="3KCb14J795o" role="3EZMnx">
          <ref role="1NtTu8" to="3751:3l6cNjec8lb" resolve="if_case" />
        </node>
        <node concept="2iRkQZ" id="3KCb14J7959" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="3KCb14J795F" role="3EZMnx">
        <node concept="ljvvj" id="3KCb14J795V" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3KCb14J5fj0" role="3EZMnx">
        <property role="3F0ifm" value="otherwise" />
        <node concept="ljvvj" id="3KCb14J5fjc" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="7o6PzEpKeof" role="3EZMnx" />
      <node concept="3EZMnI" id="7o6PzEpKeow" role="3EZMnx">
        <node concept="VPM3Z" id="7o6PzEpKeoy" role="3F10Kt" />
        <node concept="3F1sOY" id="7o6PzEpKeoS" role="3EZMnx">
          <ref role="1NtTu8" to="3751:3l6cNjec8lg" resolve="else_case" />
        </node>
        <node concept="2iRkQZ" id="7o6PzEpKeo_" role="2iSdaV" />
      </node>
      <node concept="l2Vlx" id="3KCb14J5ffT" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J5xBD">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:3KCb14J4_kl" resolve="AttributeCondition" />
    <node concept="3EZMnI" id="3KCb14J5xBF" role="2wV5jI">
      <node concept="1iCGBv" id="2_JteYSjZ2x" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2_JteYSjZ1X" resolve="actorRef" />
        <node concept="1sVBvm" id="2_JteYSjZ2z" role="1sWHZn">
          <node concept="3F0A7n" id="2_JteYSjZ2K" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2_JteYSbqjS" role="3EZMnx">
        <property role="3F0ifm" value="." />
        <node concept="11L4FC" id="2_JteYSpAdb" role="3F10Kt" />
        <node concept="11LMrY" id="2_JteYSpAdG" role="3F10Kt" />
      </node>
      <node concept="1iCGBv" id="2_JteYRiXyr" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2_JteYRiHEQ" resolve="attrRef" />
        <node concept="1sVBvm" id="2_JteYRiXyt" role="1sWHZn">
          <node concept="3F0A7n" id="2_JteYRiXyA" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0A7n" id="3KCb14J5xDo" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3KCb14J4_lJ" resolve="operator" />
      </node>
      <node concept="3F1sOY" id="6tNT_P6oAL3" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6tNT_P6oAKT" resolve="right" />
      </node>
      <node concept="l2Vlx" id="3KCb14J5xBI" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J5NGo">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:3KCb14J4_kp" resolve="AttributeReference" />
    <node concept="3EZMnI" id="3KCb14J5NGq" role="2wV5jI">
      <node concept="1iCGBv" id="3KCb14J5NGz" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3KCb14J4_kq" resolve="attribute" />
        <node concept="1sVBvm" id="3KCb14J5NG_" role="1sWHZn">
          <node concept="3F0A7n" id="3KCb14J5NGG" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="3KCb14J5NGt" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J68fJ">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:3KCb14J4_mK" resolve="ObjectInstance" />
    <node concept="3EZMnI" id="3KCb14J68fL" role="2wV5jI">
      <node concept="3F0A7n" id="3KCb14J68fS" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="l2Vlx" id="3KCb14J68fO" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J6tkS">
    <property role="3GE5qa" value="actions.basic actions.StayAction" />
    <ref role="1XX52x" to="3751:3KCb14J6tkH" resolve="StayForTimeAction" />
    <node concept="3EZMnI" id="3KCb14J6tlK" role="2wV5jI">
      <node concept="3F0ifn" id="3KCb14J6tlR" role="3EZMnx">
        <property role="3F0ifm" value="Stay for" />
      </node>
      <node concept="3F0A7n" id="3KCb14J6tlX" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3KCb14J6tkI" resolve="timeSpan" />
      </node>
      <node concept="3F0ifn" id="3KCb14J6tm5" role="3EZMnx">
        <property role="3F0ifm" value="mins" />
      </node>
      <node concept="3F1sOY" id="7IDz3VleGDq" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7IDz3Vldxyw" resolve="description" />
      </node>
      <node concept="l2Vlx" id="3KCb14J6tlN" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J6tml">
    <property role="3GE5qa" value="actions.basic actions.StayAction" />
    <ref role="1XX52x" to="3751:3KCb14J6tma" resolve="StayForConditionAction" />
    <node concept="3EZMnI" id="3KCb14J6tmn" role="2wV5jI">
      <node concept="3F0ifn" id="3KCb14J6tmu" role="3EZMnx">
        <property role="3F0ifm" value="Stay until" />
      </node>
      <node concept="3F1sOY" id="3KCb14J6tm$" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3KCb14J6tmb" resolve="condition" />
      </node>
      <node concept="3F1sOY" id="J03_IHWVkK" role="3EZMnx">
        <ref role="1NtTu8" to="3751:J03_IHWVkC" resolve="consequence" />
      </node>
      <node concept="3F1sOY" id="J03_II06Bw" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7IDz3Vldxyw" resolve="description" />
      </node>
      <node concept="l2Vlx" id="3KCb14J6tmq" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J6Na_">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:3l6cNjec8lk" resolve="MoveAction" />
    <node concept="3EZMnI" id="3KCb14J6NaB" role="2wV5jI">
      <node concept="l2Vlx" id="3KCb14J6NaE" role="2iSdaV" />
      <node concept="3F0ifn" id="7IDz3Vleqkj" role="3EZMnx">
        <property role="3F0ifm" value="go to" />
      </node>
      <node concept="3F1sOY" id="3KCb14J6NaO" role="3EZMnx">
        <ref role="1NtTu8" to="3751:svZ_Jg8sLy" resolve="targetObject" />
      </node>
      <node concept="3F1sOY" id="7IDz3VldxyF" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7IDz3Vldxyw" resolve="description" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J7tku">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:3l6cNjec6HU" resolve="BehaviourElement" />
    <node concept="3EZMnI" id="3KCb14J7tkw" role="2wV5jI">
      <node concept="3F0ifn" id="53LYXLHYNNm" role="3EZMnx">
        <node concept="ljvvj" id="53LYXLHYNPl" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3KCb14J7tkB" role="3EZMnx">
        <property role="3F0ifm" value="Behaviour:" />
      </node>
      <node concept="3F0A7n" id="3KCb14J7tkH" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3KCb14J7tkP" role="3EZMnx">
        <node concept="ljvvj" id="3KCb14J7tkU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="3KCb14J7tlC" role="3EZMnx" />
      <node concept="3EZMnI" id="3KCb14J7tmf" role="3EZMnx">
        <node concept="3F0ifn" id="3KCb14J7tp3" role="3EZMnx">
          <property role="3F0ifm" value="Trigger Message:" />
        </node>
        <node concept="3F1sOY" id="3KCb14J7tp7" role="3EZMnx">
          <ref role="1NtTu8" to="3751:svZ_Jg4NU9" resolve="signal" />
        </node>
        <node concept="VPM3Z" id="3KCb14J7tmi" role="3F10Kt" />
        <node concept="l2Vlx" id="3KCb14J7tmm" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="3KCb14J7tmX" role="3EZMnx">
        <node concept="ljvvj" id="3KCb14J7tn9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="3KCb14J7trF" role="3EZMnx">
        <node concept="pVoyu" id="34hhAWvzrN5" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="3KCb14J87Cp" role="3EZMnx">
        <node concept="VPM3Z" id="3KCb14J87Cs" role="3F10Kt" />
        <node concept="3F0ifn" id="3KCb14J87Cu" role="3EZMnx">
          <property role="3F0ifm" value="Steps:" />
          <node concept="ljvvj" id="3KCb14J87Cv" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="3F0ifn" id="35fpRuA5Sns" role="3EZMnx">
          <property role="3F0ifm" value="---------------------------" />
        </node>
        <node concept="3EZMnI" id="3KCb14J87D0" role="3EZMnx">
          <node concept="VPM3Z" id="3KCb14J87D2" role="3F10Kt" />
          <node concept="3XFhqQ" id="3KCb14J87Dn" role="3EZMnx" />
          <node concept="3EZMnI" id="3KCb14J87Dr" role="3EZMnx">
            <node concept="VPM3Z" id="3KCb14J87Dt" role="3F10Kt" />
            <node concept="3F1sOY" id="3KCb14J87DA" role="3EZMnx">
              <ref role="1NtTu8" to="3751:3l6cNjec8l3" resolve="behaviourSequence" />
            </node>
            <node concept="2iRkQZ" id="3KCb14J87Dw" role="2iSdaV" />
          </node>
          <node concept="l2Vlx" id="3KCb14J87D5" role="2iSdaV" />
        </node>
        <node concept="2iRkQZ" id="3KCb14J87Cw" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="3KCb14J7toq" role="3EZMnx">
        <node concept="ljvvj" id="3KCb14J7toG" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="53LYXLHWxg1" role="3EZMnx">
        <node concept="ljvvj" id="53LYXLHWxgH" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="53LYXLHVYFl" role="3EZMnx" />
      <node concept="3EZMnI" id="53LYXLHYjol" role="3EZMnx">
        <node concept="VPM3Z" id="53LYXLHYjoo" role="3F10Kt" />
        <node concept="3F1sOY" id="53LYXLHYjp2" role="3EZMnx">
          <ref role="1NtTu8" to="3751:53LYXLHVYDe" resolve="consequence" />
        </node>
        <node concept="2iRkQZ" id="53LYXLHYjos" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="53LYXLHWxkj" role="3EZMnx">
        <node concept="ljvvj" id="53LYXLHYjp6" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="53LYXLHYjpJ" role="3EZMnx" />
      <node concept="l2Vlx" id="3KCb14J7tkz" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J8LIE">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:svZ_Jg4Xmu" resolve="SignalReference" />
    <node concept="3EZMnI" id="3KCb14J8LIG" role="2wV5jI">
      <node concept="1iCGBv" id="3KCb14J8LIN" role="3EZMnx">
        <ref role="1NtTu8" to="3751:svZ_Jg4Xmv" resolve="signal" />
        <node concept="1sVBvm" id="3KCb14J8LIP" role="1sWHZn">
          <node concept="3F0A7n" id="3KCb14J8LIW" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="3KCb14J8LIJ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3KCb14J9VRe">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:3KCb14J9VR3" resolve="PlaceInstanceReference" />
    <node concept="1iCGBv" id="3KCb14J9VRg" role="2wV5jI">
      <ref role="1NtTu8" to="3751:3KCb14J9VR4" resolve="spaceInstance" />
      <node concept="1sVBvm" id="3KCb14J9VRi" role="1sWHZn">
        <node concept="3F0A7n" id="3KCb14J9VRp" role="2wV5jI">
          <property role="1Intyy" value="true" />
          <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="50kYvNePXHn">
    <property role="3GE5qa" value="actors" />
    <ref role="1XX52x" to="3751:3l6cNjebQ9L" resolve="Actor" />
    <node concept="3EZMnI" id="50kYvNePXHp" role="2wV5jI">
      <node concept="PMmxH" id="7o6PzEpEZmM" role="3EZMnx">
        <ref role="PMmxG" to="tpco:2wZex4PafBj" resolve="alias" />
      </node>
      <node concept="3F0A7n" id="7o6PzEpEZn7" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="7o6PzEpEZl3" role="3EZMnx">
        <node concept="ljvvj" id="7o6PzEpEZl9" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="7o6PzEpEZpH" role="3EZMnx">
        <node concept="pVoyu" id="7lVoe4yrHEL" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="7o6PzEpEZ$9" role="3EZMnx">
        <node concept="VPM3Z" id="7o6PzEpEZ$c" role="3F10Kt" />
        <node concept="3F0ifn" id="7o6PzEpEZAV" role="3EZMnx" />
        <node concept="3EZMnI" id="i1eH3Vlz$a" role="3EZMnx">
          <node concept="2iRfu4" id="i1eH3Vlz$b" role="2iSdaV" />
          <node concept="3F0ifn" id="i1eH3Vlzyl" role="3EZMnx">
            <property role="3F0ifm" value="Patient Limit:" />
          </node>
          <node concept="3F0A7n" id="i1eH3Vlz$S" role="3EZMnx">
            <ref role="1NtTu8" to="3751:7lVoe4yrHCt" resolve="patientCapacity" />
          </node>
        </node>
        <node concept="3EZMnI" id="1MmdcH82HYd" role="3EZMnx">
          <node concept="VPM3Z" id="1MmdcH82HYf" role="3F10Kt" />
          <node concept="3F0ifn" id="1MmdcH82HYh" role="3EZMnx">
            <property role="3F0ifm" value="Display Colour:" />
          </node>
          <node concept="3F0A7n" id="1MmdcH82HZ3" role="3EZMnx">
            <ref role="1NtTu8" to="3751:1MmdcH82HW9" resolve="colour" />
          </node>
          <node concept="2iRfu4" id="1MmdcH82HYi" role="2iSdaV" />
        </node>
        <node concept="3F0ifn" id="7o6PzEpEZAC" role="3EZMnx" />
        <node concept="3F0ifn" id="3QFgDmIWw1F" role="3EZMnx">
          <property role="3F0ifm" value="Behaviours" />
        </node>
        <node concept="3F0ifn" id="1FCnaGvDVWp" role="3EZMnx">
          <property role="3F0ifm" value="-----------" />
        </node>
        <node concept="3F0ifn" id="1FCnaGvDVXh" role="3EZMnx" />
        <node concept="3F0ifn" id="3QFgDmIWw2d" role="3EZMnx">
          <property role="3F0ifm" value="When idle will:" />
        </node>
        <node concept="3F1sOY" id="3QFgDmIWw3k" role="3EZMnx">
          <ref role="1NtTu8" to="3751:3QFgDmIWw1y" resolve="isIdleBehaviour" />
        </node>
        <node concept="3F0ifn" id="7o6PzEpEZBf" role="3EZMnx" />
        <node concept="3F0ifn" id="s75sN4xHoF" role="3EZMnx">
          <property role="3F0ifm" value="Triggered Behaviours:" />
        </node>
        <node concept="3F2HdR" id="s75sN4xHnN" role="3EZMnx">
          <ref role="1NtTu8" to="3751:2seZE6jsIgu" resolve="behaviourMethods" />
          <node concept="2iRkQZ" id="s75sN4xHnP" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="s75sN4xHmY" role="3EZMnx" />
        <node concept="3F0ifn" id="1MmdcH97lh9" role="3EZMnx">
          <property role="3F0ifm" value="Scheduled Behaviours:" />
        </node>
        <node concept="3F2HdR" id="1MmdcH97ljs" role="3EZMnx">
          <ref role="1NtTu8" to="3751:1MmdcH97lgZ" resolve="scheduledBehaviours" />
          <node concept="2iRkQZ" id="1MmdcH97lju" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="1MmdcH97liE" role="3EZMnx" />
        <node concept="3F0ifn" id="1MmdcH9tisA" role="3EZMnx">
          <property role="3F0ifm" value="Background Behaviours:" />
        </node>
        <node concept="3F2HdR" id="1MmdcHagY8n" role="3EZMnx">
          <ref role="1NtTu8" to="3751:1MmdcHa7tAF" resolve="backgroundBehaviours" />
          <node concept="2iRkQZ" id="1MmdcHagY8p" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="7o6PzEpEZ$A" role="3EZMnx" />
        <node concept="3EZMnI" id="7o6PzEpEZA7" role="3EZMnx">
          <node concept="VPM3Z" id="7o6PzEpEZA9" role="3F10Kt" />
          <node concept="3F0ifn" id="7o6PzEpEZAb" role="3EZMnx">
            <property role="3F0ifm" value="with attributes:" />
          </node>
          <node concept="3EZMnI" id="7o6PzEpF$fL" role="3EZMnx">
            <node concept="VPM3Z" id="7o6PzEpF$fN" role="3F10Kt" />
            <node concept="3XFhqQ" id="7o6PzEpF$g3" role="3EZMnx" />
            <node concept="3F2HdR" id="2lYAlRFy4AE" role="3EZMnx">
              <ref role="1NtTu8" to="3751:2lYAlRFxtS0" resolve="attributes" />
              <node concept="2iRkQZ" id="2lYAlRFy4AH" role="2czzBx" />
              <node concept="VPM3Z" id="2lYAlRFy4AI" role="3F10Kt" />
            </node>
            <node concept="2iRfu4" id="7o6PzEpF$fQ" role="2iSdaV" />
          </node>
          <node concept="2iRkQZ" id="7o6PzEpEZAc" role="2iSdaV" />
        </node>
        <node concept="3F0ifn" id="74nMeo8ltMm" role="3EZMnx">
          <property role="3F0ifm" value="With Attribute Monitors:" />
        </node>
        <node concept="3F2HdR" id="74nMeo8lvby" role="3EZMnx">
          <ref role="1NtTu8" to="3751:74nMeo8ltN9" resolve="attributeMonitors" />
          <node concept="2iRkQZ" id="74nMeo8lvb$" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="6MzSDQOiuI5" role="3EZMnx" />
        <node concept="3F0ifn" id="1$Pby2vHkLo" role="3EZMnx">
          <property role="3F0ifm" value="With Aggregate Attribute Monitors:" />
        </node>
        <node concept="3F2HdR" id="3i9haAJkQTX" role="3EZMnx">
          <ref role="1NtTu8" to="3751:1$Pby2vHkLh" resolve="aggregateAttributeMonitors" />
          <node concept="2iRkQZ" id="3i9haAJkQTZ" role="2czzBx" />
        </node>
        <node concept="3F0ifn" id="1$Pby2vHkLO" role="3EZMnx" />
        <node concept="3EZMnI" id="2_JteYOhd$8" role="3EZMnx">
          <node concept="3F1sOY" id="1SF32lWSJZ" role="3EZMnx">
            <ref role="1NtTu8" to="3751:1SF32lWSJU" resolve="messageSelectionstrategy" />
          </node>
          <node concept="2iRfu4" id="2_JteYOhd$9" role="2iSdaV" />
        </node>
        <node concept="3F0ifn" id="10oeqP5kfIQ" role="3EZMnx" />
        <node concept="3EZMnI" id="6SUjQPsRMQY" role="3EZMnx">
          <node concept="3F1sOY" id="6SUjQPsRMR_" role="3EZMnx">
            <ref role="1NtTu8" to="3751:6SUjQPsMEcs" resolve="roomSelectionStrategy" />
          </node>
          <node concept="2iRfu4" id="6SUjQPsRMR3" role="2iSdaV" />
        </node>
        <node concept="3F0ifn" id="6yEBuhzAMN$" role="3EZMnx" />
        <node concept="2iRkQZ" id="7o6PzEpEZ$g" role="2iSdaV" />
      </node>
      <node concept="l2Vlx" id="50kYvNePXHs" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpGQbe">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:3KCb14J4_km" resolve="Attribute" />
    <node concept="3EZMnI" id="7o6PzEpGQbg" role="2wV5jI">
      <node concept="3F0A7n" id="7o6PzEpGQbq" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="_tjkj" id="2lOlAdPFxI0" role="3EZMnx">
        <node concept="3EZMnI" id="2lOlAdPGsvZ" role="_tjki">
          <node concept="3F0ifn" id="2lOlAdPGsw8" role="3EZMnx">
            <property role="3F0ifm" value=":" />
          </node>
          <node concept="3F1sOY" id="2lOlAdPGswe" role="3EZMnx">
            <ref role="1NtTu8" to="hm2y:69zaTr1EKHX" resolve="type" />
          </node>
          <node concept="2iRfu4" id="2lOlAdPGsw2" role="2iSdaV" />
          <node concept="VPM3Z" id="2lOlAdPGsw3" role="3F10Kt" />
        </node>
      </node>
      <node concept="3F1sOY" id="2lOlAdPAHt3" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2lOlAdP_QFl" resolve="value" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpGQbj" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpH8gg">
    <property role="3GE5qa" value="actions.basic actions.OrderPatientAction" />
    <ref role="1XX52x" to="3751:7o6PzEpH8eV" resolve="OrderPatientAction" />
    <node concept="3EZMnI" id="7o6PzEpH8gi" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpH8gp" role="3EZMnx">
        <property role="3F0ifm" value="ask" />
      </node>
      <node concept="3F1sOY" id="7o6PzEpH8gy" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7o6PzEpH8gv" resolve="targetPatient" />
      </node>
      <node concept="3F0ifn" id="7o6PzEpH8gE" role="3EZMnx">
        <property role="3F0ifm" value="to" />
      </node>
      <node concept="3F1sOY" id="7o6PzEpH8gO" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7o6PzEpH8f6" resolve="orderContent" />
      </node>
      <node concept="3F1sOY" id="7IDz3VleGFv" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7IDz3Vldxyw" resolve="description" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpH8gl" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpH8h2">
    <property role="3GE5qa" value="actions.basic actions.OrderPatientAction.Orders" />
    <ref role="1XX52x" to="3751:7o6PzEpH8eY" resolve="FollowOrder" />
    <node concept="3EZMnI" id="7o6PzEpH8hb" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpH8hd" role="3EZMnx">
        <property role="3F0ifm" value="follow" />
      </node>
      <node concept="3F1sOY" id="7o6PzEpH8hl" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7o6PzEpH8f4" resolve="targetObject" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpH8he" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpH8hx">
    <property role="3GE5qa" value="actions.basic actions.OrderPatientAction.Orders" />
    <ref role="1XX52x" to="3751:7o6PzEpH8eX" resolve="MoveOrder" />
    <node concept="3EZMnI" id="7o6PzEpH8hz" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpH8hE" role="3EZMnx">
        <property role="3F0ifm" value="go to" />
      </node>
      <node concept="3F1sOY" id="7o6PzEpH8hK" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7o6PzEpH8f2" resolve="targetObject" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpH8hA" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpH8hW">
    <property role="3GE5qa" value="actions.basic actions.OrderPatientAction.Orders" />
    <ref role="1XX52x" to="3751:7o6PzEpH8eZ" resolve="StopOrder" />
    <node concept="3EZMnI" id="7o6PzEpH8hY" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpH8i5" role="3EZMnx">
        <property role="3F0ifm" value="stop following" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpH8i1" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpHsWt">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:7o6PzEpHsWk" resolve="SelfInstance" />
    <node concept="3EZMnI" id="7o6PzEpHsWv" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpHsWA" role="3EZMnx">
        <property role="3F0ifm" value="me" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpHsWy" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpI6eH">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:7o6PzEpI6e$" resolve="PatientInstance" />
    <node concept="3EZMnI" id="7o6PzEpI6eJ" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpI6f7" role="3EZMnx">
        <property role="3F0ifm" value="the patient" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpI6eP" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7o6PzEpIEJW">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:7o6PzEpIEJJ" resolve="HumanInstanceFromSignal" />
    <node concept="3EZMnI" id="7o6PzEpIEJY" role="2wV5jI">
      <node concept="3F0ifn" id="7o6PzEpIEK2" role="3EZMnx">
        <property role="3F0ifm" value="Message dataline: &quot;" />
      </node>
      <node concept="3F0A7n" id="7o6PzEpIEK3" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7o6PzEpIEJK" resolve="data" />
      </node>
      <node concept="3F0ifn" id="29F2V$jqkvu" role="3EZMnx">
        <property role="3F0ifm" value="&quot;" />
      </node>
      <node concept="l2Vlx" id="7o6PzEpIEK4" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4k5rxZwdUSU">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:4k5rxZwdUPC" resolve="DataInstanceMap" />
    <node concept="3EZMnI" id="4k5rxZwdUSW" role="2wV5jI">
      <node concept="1iCGBv" id="53LYXLHGYeN" role="3EZMnx">
        <ref role="1NtTu8" to="3751:53LYXLHFI0d" resolve="dataLine" />
        <node concept="1sVBvm" id="53LYXLHGYeP" role="1sWHZn">
          <node concept="3F0A7n" id="53LYXLHGYeY" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="4k5rxZwdUTk" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F1sOY" id="4k5rxZwdUTw" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4k5rxZwdUPF" resolve="objectInstance" />
      </node>
      <node concept="l2Vlx" id="4k5rxZwdUSZ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="53LYXLHVYHI">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:53LYXLHVYDi" resolve="ConsequenceElement" />
    <node concept="3EZMnI" id="53LYXLHVYHK" role="2wV5jI">
      <node concept="3EZMnI" id="53LYXLHVYFQ" role="3EZMnx">
        <node concept="VPM3Z" id="53LYXLHVYFS" role="3F10Kt" />
        <node concept="3F0ifn" id="53LYXLHVYGZ" role="3EZMnx">
          <property role="3F0ifm" value="Consequence:" />
        </node>
        <node concept="3EZMnI" id="53LYXLHVYH5" role="3EZMnx">
          <node concept="VPM3Z" id="53LYXLHVYH7" role="3F10Kt" />
          <node concept="3XFhqQ" id="53LYXLHVYHk" role="3EZMnx" />
          <node concept="3F2HdR" id="53LYXLHYjoc" role="3EZMnx">
            <ref role="1NtTu8" to="3751:53LYXLHVYN6" resolve="consequences" />
            <node concept="2iRkQZ" id="53LYXLHYjof" role="2czzBx" />
            <node concept="VPM3Z" id="53LYXLHYjog" role="3F10Kt" />
          </node>
          <node concept="l2Vlx" id="53LYXLHVYHa" role="2iSdaV" />
        </node>
        <node concept="2iRkQZ" id="53LYXLHVYFV" role="2iSdaV" />
      </node>
      <node concept="l2Vlx" id="53LYXLHVYHN" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="53LYXLHVYM5">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:53LYXLHVYLE" resolve="UpdateAttributeAction" />
    <node concept="3EZMnI" id="53LYXLHVYM7" role="2wV5jI">
      <node concept="1iCGBv" id="2_JteYSt6_j" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2_JteYSt6$A" resolve="actorRef" />
        <node concept="1sVBvm" id="2_JteYSt6_l" role="1sWHZn">
          <node concept="3F0A7n" id="2_JteYSt6_C" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            <node concept="11LMrY" id="2_JteYSt6A6" role="3F10Kt" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2_JteYSt6Az" role="3EZMnx">
        <property role="3F0ifm" value="." />
        <node concept="11L4FC" id="2_JteYSt6Bs" role="3F10Kt" />
        <node concept="11LMrY" id="2_JteYSt6BE" role="3F10Kt" />
      </node>
      <node concept="l2Vlx" id="53LYXLHVYMa" role="2iSdaV" />
      <node concept="3F1sOY" id="EFW1mX8QoS" role="3EZMnx">
        <ref role="1NtTu8" to="3751:EFW1mX8QoQ" resolve="attributeReference" />
        <node concept="11L4FC" id="2_JteYSt6B8" role="3F10Kt" />
      </node>
      <node concept="3F0ifn" id="EFW1mXaZdB" role="3EZMnx">
        <property role="3F0ifm" value="=" />
      </node>
      <node concept="3F1sOY" id="EFW1mXaZdJ" role="3EZMnx">
        <ref role="1NtTu8" to="3751:EFW1mXaZdx" resolve="value" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="7IDz3Vldxyd">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:7IDz3Vldxy2" resolve="Description" />
    <node concept="3EZMnI" id="7IDz3Vldxyf" role="2wV5jI">
      <node concept="3F0ifn" id="29F2V$jnDzu" role="3EZMnx">
        <node concept="ljvvj" id="29F2V$jnDz$" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="29F2V$jnDzG" role="3EZMnx" />
      <node concept="3F0ifn" id="29F2V$jnccO" role="3EZMnx">
        <property role="3F0ifm" value="description:" />
      </node>
      <node concept="3F0A7n" id="7IDz3Vldxys" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7IDz3Vldxy3" resolve="description" />
      </node>
      <node concept="l2Vlx" id="7IDz3Vldxyi" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="a5pEVjDTK">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:a5pEVjDT_" resolve="PlaceInstanceCollection" />
    <node concept="3EZMnI" id="a5pEVjDTM" role="2wV5jI">
      <node concept="3F0ifn" id="4TDP_nXXc4" role="3EZMnx">
        <property role="3F0ifm" value="the" />
      </node>
      <node concept="3F1sOY" id="a5pEVjDTT" role="3EZMnx">
        <ref role="1NtTu8" to="3751:a5pEVjDTA" resolve="place" />
      </node>
      <node concept="l2Vlx" id="a5pEVjDTP" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6tNT_P6nIfh">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:6tNT_P6ny7D" resolve="ExpressionWrapper" />
    <node concept="3EZMnI" id="6tNT_P6nIfo" role="2wV5jI">
      <node concept="3F0A7n" id="3cDB1MUiygD" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3cDB1MUiy7S" resolve="value" />
      </node>
      <node concept="3F0ifn" id="3cDB1MTM3Bx" role="3EZMnx">
        <property role="3F0ifm" value="(" />
      </node>
      <node concept="3F0A7n" id="3cDB1MTM3BD" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3cDB1MTM3Bq" resolve="repastVariableName" />
      </node>
      <node concept="3F0ifn" id="3cDB1MTM3BN" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="l2Vlx" id="6tNT_P6nIfr" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6tNT_P6oBxS">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:6tNT_P6oBvW" resolve="AttributeExpressionReference" />
    <node concept="3EZMnI" id="6tNT_P6oBxU" role="2wV5jI">
      <node concept="1iCGBv" id="6tNT_P6oBy1" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6tNT_P6oBxI" resolve="attribute" />
        <node concept="1sVBvm" id="6tNT_P6oBy3" role="1sWHZn">
          <node concept="3F0A7n" id="6tNT_P6pn3y" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="6tNT_P6oBxX" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2YIKz$5ky3l">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:2YIKz$5ky3c" resolve="NewPatientSignal" />
    <node concept="3F0ifn" id="2YIKz$5ky3n" role="2wV5jI">
      <property role="3F0ifm" value="NewpatientArrive" />
    </node>
  </node>
  <node concept="24kQdi" id="J03_IHXFWQ">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:J03_IHXFkw" resolve="ConsequenceInStep" />
    <node concept="3EZMnI" id="J03_IHXFWS" role="2wV5jI">
      <node concept="3F0ifn" id="J03_II0J1n" role="3EZMnx">
        <node concept="ljvvj" id="J03_II0J1s" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3XFhqQ" id="J03_II0J1$" role="3EZMnx" />
      <node concept="3F0ifn" id="J03_IHXKGG" role="3EZMnx">
        <property role="3F0ifm" value="consequence:" />
      </node>
      <node concept="3F1sOY" id="J03_IHXFWZ" role="3EZMnx">
        <ref role="1NtTu8" to="3751:J03_IHXFkx" resolve="consequence" />
      </node>
      <node concept="l2Vlx" id="J03_IHXFWV" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7lVoe4xPC4b">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:7lVoe4xN_11" resolve="OccupyAction" />
    <node concept="3EZMnI" id="7lVoe4xPC4d" role="2wV5jI">
      <node concept="3F0ifn" id="7lVoe4xPC4k" role="3EZMnx">
        <property role="3F0ifm" value="take" />
      </node>
      <node concept="3F1sOY" id="7lVoe4xPC4q" role="3EZMnx">
        <ref role="1NtTu8" to="3751:7lVoe4xN_14" resolve="targetObject" />
      </node>
      <node concept="l2Vlx" id="7lVoe4xPC4g" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="7lVoe4xQDQM">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:7lVoe4xN_mF" resolve="OccupiableReference" />
    <node concept="3EZMnI" id="7lVoe4xQDQO" role="2wV5jI">
      <node concept="l2Vlx" id="7lVoe4xQDQR" role="2iSdaV" />
      <node concept="3F0ifn" id="7lVoe4xUirw" role="3EZMnx">
        <property role="3F0ifm" value="a" />
      </node>
      <node concept="1iCGBv" id="34hhAWvUvNe" role="3EZMnx">
        <ref role="1NtTu8" to="3751:34hhAWvUvMQ" resolve="occupiable" />
        <node concept="1sVBvm" id="34hhAWvUvNg" role="1sWHZn">
          <node concept="3F0A7n" id="34hhAWvUvNo" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="3z3g:34hhAWvBY1f" resolve="name" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="5QJON_B_jN7">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:5QJON_B_jME" resolve="RoomTypeReference" />
    <node concept="3EZMnI" id="5QJON_B_jN9" role="2wV5jI">
      <node concept="l2Vlx" id="5QJON_B_jNc" role="2iSdaV" />
      <node concept="3F0ifn" id="5QJON_BC6Wo" role="3EZMnx">
        <property role="3F0ifm" value="a" />
      </node>
      <node concept="1iCGBv" id="5QJON_BAXEg" role="3EZMnx">
        <ref role="1NtTu8" to="3751:5QJON_BAs4g" resolve="roomType" />
        <node concept="1sVBvm" id="5QJON_BAXEh" role="1sWHZn">
          <node concept="3F0A7n" id="5QJON_BAXEm" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="4TDP_m2UyI">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:4TDP_m2UaO" resolve="DirectSignal" />
    <node concept="3EZMnI" id="4TDP_m2UyK" role="2wV5jI">
      <node concept="3F0ifn" id="4TDP_m2UyR" role="3EZMnx">
        <property role="3F0ifm" value="direct signal name " />
      </node>
      <node concept="3F0A7n" id="4TDP_m2UyS" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="4TDP_m2UyT" role="3EZMnx">
        <node concept="ljvvj" id="4TDP_m2UyU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4TDP_m2UyV" role="3EZMnx">
        <property role="3F0ifm" value="description: " />
      </node>
      <node concept="3F0A7n" id="4TDP_m2UyW" role="3EZMnx">
        <ref role="1NtTu8" to="3751:svZ_Jg47iz" resolve="description" />
      </node>
      <node concept="3F0ifn" id="4TDP_m2UyX" role="3EZMnx">
        <node concept="ljvvj" id="4TDP_m2UyY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4TDP_m2UyZ" role="3EZMnx">
        <property role="3F0ifm" value="sender:  " />
      </node>
      <node concept="3F2HdR" id="4TDP_m2Uz0" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3DLpJ7prKMB" resolve="senders" />
        <node concept="2iRkQZ" id="4TDP_m2Uz1" role="2czzBx" />
        <node concept="VPM3Z" id="4TDP_m2Uz2" role="3F10Kt" />
      </node>
      <node concept="3F0ifn" id="4TDP_m2Uz3" role="3EZMnx">
        <node concept="ljvvj" id="4TDP_m2Uz4" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4TDP_n1GgA" role="3EZMnx">
        <property role="3F0ifm" value="receiver:" />
      </node>
      <node concept="3F2HdR" id="4TDP_n1GgB" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4TDP_m5yvR" resolve="receivers" />
        <node concept="2iRkQZ" id="4TDP_n1GgC" role="2czzBx" />
        <node concept="VPM3Z" id="4TDP_n1GgD" role="3F10Kt" />
      </node>
      <node concept="3F0ifn" id="4TDP_m2UEr" role="3EZMnx">
        <property role="3F0ifm" value="data:" />
        <node concept="pVoyu" id="4TDP_n1Gh4" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="4TDP_m2Uzd" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3DLpJ7prKMn" resolve="data" />
        <node concept="2iRkQZ" id="4TDP_m2Uze" role="2czzBx" />
        <node concept="VPM3Z" id="4TDP_m2Uzf" role="3F10Kt" />
        <node concept="pVoyu" id="4TDP_m2UHS" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4TDP_m2Uzg" role="3EZMnx">
        <node concept="ljvvj" id="4TDP_m2Uzh" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="4TDP_m2Uzi" role="3EZMnx" />
      <node concept="l2Vlx" id="4TDP_m2UyN" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4TDP_m5yw2">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:4TDP_m5yvO" resolve="ActorTypeSignal" />
    <node concept="3EZMnI" id="4TDP_m5yw4" role="2wV5jI">
      <node concept="3F0ifn" id="svZ_Jg4oEZ" role="3EZMnx">
        <property role="3F0ifm" value="actor type signal name " />
      </node>
      <node concept="3F0A7n" id="svZ_Jg4oF5" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKOO" role="3EZMnx">
        <node concept="ljvvj" id="3DLpJ7prKOV" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="svZ_Jg4oFq" role="3EZMnx">
        <property role="3F0ifm" value="description: " />
      </node>
      <node concept="3F0A7n" id="3DLpJ7prKPU" role="3EZMnx">
        <ref role="1NtTu8" to="3751:svZ_Jg47iz" resolve="description" />
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKPj" role="3EZMnx">
        <node concept="ljvvj" id="3DLpJ7prKPs" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKQ5" role="3EZMnx">
        <property role="3F0ifm" value="sender:  " />
      </node>
      <node concept="3F2HdR" id="29F2V$jukpj" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3DLpJ7prKMB" resolve="senders" />
        <node concept="2iRkQZ" id="29F2V$jukpm" role="2czzBx" />
        <node concept="VPM3Z" id="29F2V$jukpn" role="3F10Kt" />
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKQN" role="3EZMnx">
        <node concept="ljvvj" id="3DLpJ7prKR0" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKRg" role="3EZMnx">
        <property role="3F0ifm" value="receiver:" />
      </node>
      <node concept="3F2HdR" id="29F2V$jukqA" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4TDP_m5yvR" resolve="receivers" />
        <node concept="2iRkQZ" id="29F2V$jukqD" role="2czzBx" />
        <node concept="VPM3Z" id="29F2V$jukqE" role="3F10Kt" />
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKSe" role="3EZMnx">
        <node concept="ljvvj" id="3DLpJ7prKSv" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKWt" role="3EZMnx">
        <property role="3F0ifm" value="data: " />
        <node concept="ljvvj" id="3DLpJ7prKWQ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F2HdR" id="3DLpJ7prKSN" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3DLpJ7prKMn" resolve="data" />
        <node concept="2iRkQZ" id="3DLpJ7prKSQ" role="2czzBx" />
        <node concept="VPM3Z" id="3DLpJ7prKSR" role="3F10Kt" />
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKTw" role="3EZMnx">
        <node concept="ljvvj" id="3DLpJ7prKTQ" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3DLpJ7prKUf" role="3EZMnx" />
      <node concept="3F0ifn" id="3d01st$BtAZ" role="3EZMnx">
        <property role="3F0ifm" value="Pre-Condition:" />
        <node concept="pVoyu" id="3d01st$BtBu" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="3d01st$BtC0" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3QFgDmJICkr" resolve="preCondition" />
      </node>
      <node concept="l2Vlx" id="4TDP_m5yw7" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4TDP_mqZgw">
    <property role="3GE5qa" value="actions.basic actions.SendSignalAction.signals" />
    <ref role="1XX52x" to="3751:svZ_Jg47cE" resolve="Signal" />
    <node concept="3EZMnI" id="4TDP_mqZgy" role="2wV5jI">
      <node concept="3F0A7n" id="4TDP_mqZgD" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="3QFgDmJIClc" role="3EZMnx">
        <property role="3F0ifm" value="-----------------------" />
        <node concept="pVoyu" id="3QFgDmJIClj" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="3QFgDmJICkP" role="3EZMnx">
        <property role="3F0ifm" value="Pre-condition:" />
        <node concept="pVoyu" id="3QFgDmJICkT" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F1sOY" id="3QFgDmJICl0" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3QFgDmJICkr" resolve="preCondition" />
      </node>
      <node concept="l2Vlx" id="4TDP_mqZg_" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4TDP_nS6kz">
    <property role="3GE5qa" value="actions.basic actions.OrderPatientAction.Orders" />
    <ref role="1XX52x" to="3751:4TDP_nS6kw" resolve="OccupyOrder" />
    <node concept="3EZMnI" id="4TDP_nS6k_" role="2wV5jI">
      <node concept="3F0ifn" id="4TDP_nS6kG" role="3EZMnx">
        <property role="3F0ifm" value="occupy" />
      </node>
      <node concept="3F1sOY" id="4TDP_nS6kM" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4TDP_nS6kx" resolve="targetOccupiable" />
      </node>
      <node concept="l2Vlx" id="4TDP_nS6kC" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6dYFu3AhE_C">
    <property role="3GE5qa" value="AgentGeneration" />
    <ref role="1XX52x" to="3751:6dYFu3AbeaS" resolve="AgentGenerator" />
    <node concept="3EZMnI" id="2_JteYOEVVA" role="2wV5jI">
      <node concept="2iRkQZ" id="2_JteYOEVVB" role="2iSdaV" />
      <node concept="3EZMnI" id="2vFOz$FUTDm" role="3EZMnx">
        <node concept="2iRfu4" id="2vFOz$FUTDn" role="2iSdaV" />
        <node concept="3EZMnI" id="74nMeo6B8v2" role="3EZMnx">
          <node concept="VPM3Z" id="74nMeo6B8v4" role="3F10Kt" />
          <node concept="3EZMnI" id="74nMeo6B8xn" role="3EZMnx">
            <node concept="VPM3Z" id="74nMeo6B8xp" role="3F10Kt" />
            <node concept="3F0ifn" id="EFW1mYwZsu" role="3EZMnx">
              <property role="3F0ifm" value="Agent Type:" />
            </node>
            <node concept="3F1sOY" id="EFW1mYwZtq" role="3EZMnx">
              <ref role="1NtTu8" to="3751:EFW1mYsc5K" resolve="AgentType" />
            </node>
            <node concept="2iRfu4" id="74nMeo6B8xs" role="2iSdaV" />
          </node>
          <node concept="3EZMnI" id="2r8kCFte7hX" role="3EZMnx">
            <node concept="VPM3Z" id="2r8kCFte7hZ" role="3F10Kt" />
            <node concept="3F0ifn" id="EFW1mZoVG$" role="3EZMnx">
              <property role="3F0ifm" value="Spawn at:" />
            </node>
            <node concept="3F1sOY" id="EFW1mZp2zv" role="3EZMnx">
              <ref role="1NtTu8" to="3751:EFW1mZoVH$" resolve="SpawnAt" />
            </node>
            <node concept="3F0ifn" id="2r8kCFte7i1" role="3EZMnx" />
            <node concept="2iRfu4" id="2r8kCFte7i2" role="2iSdaV" />
          </node>
          <node concept="3EZMnI" id="74nMeo6B8zG" role="3EZMnx">
            <node concept="VPM3Z" id="74nMeo6B8zI" role="3F10Kt" />
            <node concept="3F0ifn" id="74nMeo6B8zK" role="3EZMnx">
              <property role="3F0ifm" value="Arrival Message:" />
            </node>
            <node concept="3F1sOY" id="74nMeo6B8$0" role="3EZMnx">
              <ref role="1NtTu8" to="3751:74nMeo6B8q1" resolve="ArrivalMessage" />
            </node>
            <node concept="2iRfu4" id="74nMeo6B8zL" role="2iSdaV" />
          </node>
          <node concept="3EZMnI" id="i1eH3W4Jju" role="3EZMnx">
            <node concept="VPM3Z" id="i1eH3W4Jjw" role="3F10Kt" />
            <node concept="3F0ifn" id="i1eH3W4Jjy" role="3EZMnx">
              <property role="3F0ifm" value="Profile Name:" />
            </node>
            <node concept="3F0A7n" id="i1eH3W4JjR" role="3EZMnx">
              <ref role="1NtTu8" to="3751:i1eH3W4JhS" resolve="agentProfileName" />
            </node>
            <node concept="2iRfu4" id="i1eH3W4Jjz" role="2iSdaV" />
          </node>
          <node concept="3F0ifn" id="2r8kCFte7f8" role="3EZMnx">
            <property role="3F0ifm" value="Attributes" />
          </node>
          <node concept="3F0ifn" id="2r8kCFte7fw" role="3EZMnx">
            <property role="3F0ifm" value="-----------" />
          </node>
          <node concept="3EZMnI" id="2_JteYOEVXP" role="3EZMnx">
            <node concept="2iRkQZ" id="2_JteYOEVXQ" role="2iSdaV" />
            <node concept="3F2HdR" id="2_JteYOEVXf" role="3EZMnx">
              <ref role="1NtTu8" to="3751:2_JteYOEVUw" resolve="AttributeMaps" />
              <node concept="2iRkQZ" id="2_JteYOEVXh" role="2czzBx" />
            </node>
          </node>
          <node concept="3F0ifn" id="2r8kCFte7bR" role="3EZMnx" />
          <node concept="2iRkQZ" id="74nMeo6B8v7" role="2iSdaV" />
        </node>
        <node concept="2rfBfz" id="2vFOz$FUEfw" role="3EZMnx">
          <node concept="2reSaE" id="2vFOz$FUEfL" role="2rf8GZ">
            <ref role="2reCK$" to="3751:2vFOz$FUEfh" resolve="AgentGeneratorLines" />
            <node concept="2r3Xtq" id="2vFOz$FUTxP" role="2YlbuT">
              <node concept="2rfbtV" id="2vFOz$FUTxT" role="uCobI">
                <property role="2rfbtB" value="0:00-1:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTxZ" role="uCobI">
                <property role="2rfbtB" value="1:00-2:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTy7" role="uCobI">
                <property role="2rfbtB" value="2:00-3:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyg" role="uCobI">
                <property role="2rfbtB" value="3:00-4:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyl" role="uCobI">
                <property role="2rfbtB" value="4:00-5:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyr" role="uCobI">
                <property role="2rfbtB" value="5:00-6:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyy" role="uCobI">
                <property role="2rfbtB" value="6:00-7:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyE" role="uCobI">
                <property role="2rfbtB" value="7:00-8:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyN" role="uCobI">
                <property role="2rfbtB" value="8:00-9:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTyX" role="uCobI">
                <property role="2rfbtB" value="9:00-10:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTz8" role="uCobI">
                <property role="2rfbtB" value="10:00-11:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTzk" role="uCobI">
                <property role="2rfbtB" value="11:00-12:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTzx" role="uCobI">
                <property role="2rfbtB" value="12:00-13:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTzJ" role="uCobI">
                <property role="2rfbtB" value="13:00-14:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTzY" role="uCobI">
                <property role="2rfbtB" value="14:00-15:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUT$e" role="uCobI">
                <property role="2rfbtB" value="15:00-16:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUT$v" role="uCobI">
                <property role="2rfbtB" value="16:00-17:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUT$L" role="uCobI">
                <property role="2rfbtB" value="17:00-18:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUT_4" role="uCobI">
                <property role="2rfbtB" value="18:00-19:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUT_o" role="uCobI">
                <property role="2rfbtB" value="19:00-20:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTA3" role="uCobI">
                <property role="2rfbtB" value="20:00-21:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTAK" role="uCobI">
                <property role="2rfbtB" value="21:00-22:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTBv" role="uCobI">
                <property role="2rfbtB" value="22:00-23:00" />
              </node>
              <node concept="2rfbtV" id="2vFOz$FUTCg" role="uCobI">
                <property role="2rfbtB" value="23:00-24:00" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2vFOz$FUEcN">
    <property role="3GE5qa" value="AgentGeneration" />
    <ref role="1XX52x" to="3751:2vFOz$FUEc$" resolve="AgentGeneratorLine" />
    <node concept="2r0Tta" id="2vFOz$FUEdR" role="2wV5jI">
      <node concept="2reCLk" id="2vFOz$FUEel" role="2r0Tv6">
        <node concept="2reCLy" id="2vFOz$FUEey" role="2reCL6">
          <node concept="3F0A7n" id="2vFOz$FUEeE" role="2reSmM">
            <ref role="1NtTu8" to="3751:2vFOz$FUEcK" resolve="NumAgentsInHour" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="35fpRuAlrha">
    <property role="3GE5qa" value="actions.basic actions.OrderPatientAction.Orders" />
    <ref role="1XX52x" to="3751:35fpRuAlrfU" resolve="CompositeOrder" />
    <node concept="3EZMnI" id="35fpRuAlrhl" role="2wV5jI">
      <node concept="3F1sOY" id="35fpRuAlrhs" role="3EZMnx">
        <ref role="1NtTu8" to="3751:35fpRuAlrgm" resolve="orderLeft" />
      </node>
      <node concept="3F0ifn" id="35fpRuAlrhy" role="3EZMnx">
        <property role="3F0ifm" value="and then" />
      </node>
      <node concept="3F1sOY" id="35fpRuAlrhE" role="3EZMnx">
        <ref role="1NtTu8" to="3751:35fpRuAlrgo" resolve="orderRight" />
      </node>
      <node concept="l2Vlx" id="35fpRuAlrho" role="2iSdaV" />
    </node>
  </node>
  <node concept="PKFIW" id="2lOlAdPGsvw">
    <property role="TrG5h" value="DummyForGrammarCells" />
    <ref role="1XX52x" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="3F0ifn" id="2lOlAdPGsvx" role="2wV5jI">
      <property role="3F0ifm" value="Workaround to fix contributions to BaseConcept generated by grammarCells." />
    </node>
  </node>
  <node concept="24kQdi" id="EFW1mZKI3u">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:EFW1mXVky1" resolve="RemoveRelationshipAction" />
    <node concept="3EZMnI" id="EFW1mZKI3D" role="2wV5jI">
      <node concept="3F0ifn" id="EFW1mZKI3K" role="3EZMnx">
        <property role="3F0ifm" value="Remove relationship '" />
      </node>
      <node concept="3F0A7n" id="1SF32lSZXj" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1SF32lSZQ9" resolve="relationshipName" />
      </node>
      <node concept="3F0ifn" id="1SF32lSZXd" role="3EZMnx">
        <property role="3F0ifm" value="' with" />
      </node>
      <node concept="3F1sOY" id="EFW1mZKI3Q" role="3EZMnx">
        <ref role="1NtTu8" to="3751:EFW1mZKI4V" resolve="target" />
      </node>
      <node concept="l2Vlx" id="EFW1mZKI3G" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1SF32lWRC1">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:1SF32lWRBm" resolve="SignalSelectionRuleLine" />
    <node concept="3EZMnI" id="1SF32lWRC3" role="2wV5jI">
      <node concept="3F0ifn" id="1SF32lWSEP" role="3EZMnx">
        <property role="3F0ifm" value="if" />
      </node>
      <node concept="3F1sOY" id="1SF32lWRCa" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1SF32lWRBw" resolve="condition" />
      </node>
      <node concept="3F0ifn" id="1SF32lWSEZ" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F1sOY" id="1SF32lWRCg" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1SF32lWRBy" resolve="rule" />
      </node>
      <node concept="l2Vlx" id="1SF32lWRC6" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1SF32lWSFx">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:1SF32lWSFn" resolve="SelectFirstSignal" />
    <node concept="3EZMnI" id="1SF32lWSFG" role="2wV5jI">
      <node concept="3F0ifn" id="1SF32lWSFN" role="3EZMnx">
        <property role="3F0ifm" value="select first message" />
      </node>
      <node concept="l2Vlx" id="1SF32lWSFJ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1SF32lWSG9">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:1SF32lWSFZ" resolve="SelectRandomSignal" />
    <node concept="3EZMnI" id="1SF32lWSGk" role="2wV5jI">
      <node concept="3F0ifn" id="1SF32lWSGr" role="3EZMnx">
        <property role="3F0ifm" value="Select a random message" />
      </node>
      <node concept="l2Vlx" id="1SF32lWSGn" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1SF32lWSGQ">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:1SF32lWSGB" resolve="SelectRelationshipDataSignal" />
    <node concept="3EZMnI" id="1SF32lWSH1" role="2wV5jI">
      <node concept="3F0ifn" id="1SF32lWSH8" role="3EZMnx">
        <property role="3F0ifm" value="Select message where data slot '" />
      </node>
      <node concept="3F0A7n" id="1SF32lWSHe" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1SF32lWSGN" resolve="dataName" />
      </node>
      <node concept="3F0ifn" id="1SF32lWSHm" role="3EZMnx">
        <property role="3F0ifm" value="' is in relationship:" />
      </node>
      <node concept="1iCGBv" id="2r8kCFs4HNa" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2r8kCFs4HMW" resolve="relationship" />
        <node concept="1sVBvm" id="2r8kCFs4HNc" role="1sWHZn">
          <node concept="3F0A7n" id="2r8kCFs4HNm" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="1SF32lWSH4" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1SF32lWSIp">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:1SF32lWRB3" resolve="MessageSelectionStrategy" />
    <node concept="3EZMnI" id="1SF32lWSII" role="2wV5jI">
      <node concept="2iRkQZ" id="1SF32lWSIJ" role="2iSdaV" />
      <node concept="3EZMnI" id="1SF32lWSI$" role="3EZMnx">
        <node concept="3F0ifn" id="1SF32lWSIF" role="3EZMnx">
          <property role="3F0ifm" value="Message Selection Strategy" />
        </node>
        <node concept="l2Vlx" id="1SF32lWSIB" role="2iSdaV" />
      </node>
      <node concept="3F0ifn" id="1SF32lWSIW" role="3EZMnx">
        <property role="3F0ifm" value="------------------------------" />
      </node>
      <node concept="3F0ifn" id="2r8kCFsy8L2" role="3EZMnx">
        <property role="3F0ifm" value="In order of preference..." />
        <node concept="Vb9p2" id="2r8kCFsy8Li" role="3F10Kt">
          <property role="Vbekb" value="g1_kEg4/ITALIC" />
        </node>
      </node>
      <node concept="3EZMnI" id="10oeqP5pDaM" role="3EZMnx">
        <node concept="3F0ifn" id="10oeqP5pDbh" role="3EZMnx">
          <property role="3F0ifm" value="+" />
        </node>
        <node concept="VPM3Z" id="10oeqP5pDaO" role="3F10Kt" />
        <node concept="3F2HdR" id="10oeqP5pDb1" role="3EZMnx">
          <property role="2czwfO" value="+" />
          <ref role="1NtTu8" to="3751:1SF32lWSIn" resolve="rules" />
          <node concept="l2Vlx" id="10oeqP5pDb4" role="2czzBx" />
          <node concept="tppnM" id="10oeqP5pDbo" role="sWeuL">
            <node concept="pVoyu" id="10oeqP5pDbq" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
        </node>
        <node concept="l2Vlx" id="10oeqP5pDaR" role="2iSdaV" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="1SF32lXYVa">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:1SF32lXSQZ" resolve="SelectNotRelationshipDataSignal" />
    <node concept="3EZMnI" id="1SF32lXYVl" role="2wV5jI">
      <node concept="3F0ifn" id="1SF32lXZrl" role="3EZMnx">
        <property role="3F0ifm" value="Select message where data line: '" />
      </node>
      <node concept="3F0A7n" id="1SF32lXZrr" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1SF32lXXNK" resolve="dataName" />
      </node>
      <node concept="3F0ifn" id="1SF32lXZrz" role="3EZMnx">
        <property role="3F0ifm" value="' is not present in :" />
      </node>
      <node concept="1iCGBv" id="10oeqP5pDkQ" role="3EZMnx">
        <ref role="1NtTu8" to="3751:10oeqP5pDkF" resolve="relationship" />
        <node concept="1sVBvm" id="10oeqP5pDkS" role="1sWHZn">
          <node concept="3F0A7n" id="10oeqP5pDl2" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="1SF32lXYVo" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1SF32mdTHF">
    <property role="3GE5qa" value="actors" />
    <ref role="1XX52x" to="3751:1SF32mdTHt" resolve="Relationship" />
    <node concept="3EZMnI" id="1SF32mdTHQ" role="2wV5jI">
      <node concept="3F0A7n" id="1SF32mdTHX" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="l2Vlx" id="1SF32mdTHT" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2_JteYOpJeQ">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:2_JteYOpJdB" resolve="AttributeDistributionLine" />
    <node concept="2r0Tta" id="2_JteYNWseY" role="2wV5jI">
      <node concept="2reCLk" id="2_JteYNWseZ" role="2r0Tv6">
        <node concept="2reCLy" id="2_JteYNWsf0" role="2reCL6">
          <node concept="3F1sOY" id="2_JteYOpJiC" role="2reSmM">
            <ref role="1NtTu8" to="3751:2_JteYOpJiq" resolve="attributeValue" />
          </node>
        </node>
        <node concept="2reCLy" id="2_JteYNWsf2" role="2reCL6">
          <node concept="3F0A7n" id="2_JteYOpJfn" role="2reSmM">
            <ref role="1NtTu8" to="3751:2_JteYOpJey" resolve="probabilityDistribution" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2_JteYOtdTW">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:2_JteYOpJg7" resolve="AttributeDistributionTable" />
    <node concept="3EZMnI" id="2_JteYNYsUz" role="2wV5jI">
      <node concept="3EZMnI" id="2_JteYNYsVB" role="3EZMnx">
        <node concept="2iRfu4" id="2_JteYNYsVC" role="2iSdaV" />
        <node concept="3F0ifn" id="2_JteYNYsUL" role="3EZMnx">
          <property role="3F0ifm" value="Probability Distribution table for" />
        </node>
        <node concept="1iCGBv" id="s75sN7xXxi" role="3EZMnx">
          <ref role="1NtTu8" to="3751:s75sN7xXxb" resolve="attribute" />
          <node concept="1sVBvm" id="s75sN7xXxk" role="1sWHZn">
            <node concept="3F0A7n" id="s75sN7xXxs" role="2wV5jI">
              <property role="1Intyy" value="true" />
              <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2iRkQZ" id="2_JteYNYsU$" role="2iSdaV" />
      <node concept="2rfBfz" id="2_JteYNWsb6" role="3EZMnx">
        <node concept="2reSaE" id="2_JteYNWsbm" role="2rf8GZ">
          <ref role="2reCK$" to="3751:2_JteYOpJgP" resolve="lines" />
          <node concept="2r3Xtq" id="2_JteYNWscj" role="2YiT2b">
            <node concept="2rfbtV" id="2_JteYNWsco" role="uCobI">
              <property role="2rfbtB" value="Value" />
            </node>
            <node concept="2rfbtV" id="2_JteYNWscu" role="uCobI">
              <property role="2rfbtB" value="Distribution (%)" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2_JteYPogVn">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:2_JteYPogUR" resolve="TimeDistributionLine" />
    <node concept="2r0Tta" id="2_JteYPogVO" role="2wV5jI">
      <node concept="2reCLk" id="2_JteYPogVP" role="2r0Tv6">
        <node concept="2reCLy" id="2_JteYPogVQ" role="2reCL6">
          <node concept="3F0A7n" id="2_JteYPogVR" role="2reSmM">
            <ref role="1NtTu8" to="3751:2_JteYPogVj" resolve="Time" />
          </node>
        </node>
        <node concept="2reCLy" id="2_JteYPogVS" role="2reCL6">
          <node concept="3F0A7n" id="2_JteYPogVT" role="2reSmM">
            <ref role="1NtTu8" to="3751:2_JteYPogVk" resolve="Occurances" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2_JteYPogWt">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:2_JteYPogU9" resolve="TimeDistributionTable" />
    <node concept="3EZMnI" id="2_JteYQFO4B" role="2wV5jI">
      <node concept="3F0A7n" id="2_JteYQFO4W" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="2iRkQZ" id="2_JteYQFO4C" role="2iSdaV" />
      <node concept="2rfBfz" id="2_JteYPogWC" role="3EZMnx">
        <node concept="2reSaE" id="2_JteYPogWD" role="2rf8GZ">
          <ref role="2reCK$" to="3751:2_JteYPogWr" resolve="lines" />
          <node concept="2r3Xtq" id="2_JteYPogWE" role="2YiT2b">
            <node concept="2rfbtV" id="2_JteYPogWF" role="uCobI">
              <property role="2rfbtB" value="Time (minutes)" />
            </node>
            <node concept="2rfbtV" id="2_JteYPogWG" role="uCobI">
              <property role="2rfbtB" value="Occurances" />
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="2_JteYPoh8E">
    <property role="3GE5qa" value="actions.basic actions.StayAction" />
    <ref role="1XX52x" to="3751:2_JteYPof5l" resolve="PassiveWaitAction" />
    <node concept="3EZMnI" id="2_JteYPoh8P" role="2wV5jI">
      <node concept="3F0ifn" id="2_JteYPoh8W" role="3EZMnx">
        <property role="3F0ifm" value="Passive wait for" />
      </node>
      <node concept="1iCGBv" id="2_JteYPoh92" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2_JteYPoh8C" resolve="timeDistributionTable" />
        <node concept="1sVBvm" id="2_JteYPoh94" role="1sWHZn">
          <node concept="3F0A7n" id="2_JteYPoh9w" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="2_JteYPoh8S" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="52K8EjQ83d">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:52K8EjQ82J" resolve="KernelFCondition" />
    <node concept="3EZMnI" id="52K8EjQ83o" role="2wV5jI">
      <node concept="3F1sOY" id="52K8EjQ83v" role="3EZMnx">
        <ref role="1NtTu8" to="3751:52K8EjQ82T" resolve="expression" />
      </node>
      <node concept="l2Vlx" id="52K8EjQ83r" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="52K8EkgbNu">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:52K8EkgbMX" resolve="BinaryCondition" />
    <node concept="1WcQYu" id="52K8EkgbTq" role="2wV5jI">
      <node concept="2ElW$n" id="52K8EkgbTs" role="2El2Yn" />
      <node concept="3EZMnI" id="52K8EkgbTA" role="1LiK7o">
        <node concept="1kIj98" id="52K8EkgbTH" role="3EZMnx">
          <node concept="3F1sOY" id="52K8EkgbTN" role="1kIj9b">
            <ref role="1NtTu8" to="3751:52K8EkgbNp" resolve="left" />
          </node>
        </node>
        <node concept="1Lj6DL" id="52K8EkgbTU" role="3EZMnx">
          <node concept="1Lj6DC" id="52K8EkgbTW" role="1Lj8FM">
            <node concept="3clFbS" id="52K8EkgbTY" role="2VODD2">
              <node concept="3clFbF" id="52K8EkgbZ0" role="3cqZAp">
                <node concept="2OqwBi" id="52K8Ekgci0" role="3clFbG">
                  <node concept="1Lj6YZ" id="52K8EkgbYZ" role="2Oq$k0" />
                  <node concept="3n3YKJ" id="52K8EkgcGP" role="2OqNvi" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="1kIj98" id="52K8EkgbYI" role="3EZMnx">
          <node concept="3F1sOY" id="52K8EkgbYV" role="1kIj9b">
            <ref role="1NtTu8" to="3751:52K8EkgbNr" resolve="right" />
          </node>
        </node>
        <node concept="2iRfu4" id="52K8EkgbTD" role="2iSdaV" />
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="74nMeo8dO39">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:74nMeo8dO2O" resolve="AttributeMonitor" />
    <node concept="3EZMnI" id="74nMeo8dO3k" role="2wV5jI">
      <node concept="1iCGBv" id="74nMeo8dO3r" role="3EZMnx">
        <ref role="1NtTu8" to="3751:74nMeo8dO2Y" resolve="attribute" />
        <node concept="1sVBvm" id="74nMeo8dO3t" role="1sWHZn">
          <node concept="3F0A7n" id="74nMeo8dO3$" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="74nMeo8dO3G" role="3EZMnx">
        <property role="3F0ifm" value="Possible Values:" />
        <node concept="pVoyu" id="74nMeo8dO3M" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="74nMeo8dO45" role="3EZMnx">
        <node concept="2iRkQZ" id="74nMeo8dO46" role="2iSdaV" />
        <node concept="3F2HdR" id="74nMeo8dO3V" role="3EZMnx">
          <ref role="1NtTu8" to="3751:74nMeo8dO36" resolve="possibleValues" />
          <node concept="l2Vlx" id="74nMeo8dO3X" role="2czzBx" />
        </node>
      </node>
      <node concept="l2Vlx" id="74nMeo8dO3n" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6MzSDQOabST">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:6MzSDQOa74z" resolve="AggregateAttributeMonitor" />
    <node concept="3EZMnI" id="6MzSDQOabT4" role="2wV5jI">
      <node concept="3F0ifn" id="72S_VmciqW2" role="3EZMnx">
        <property role="3F0ifm" value="Values from:" />
      </node>
      <node concept="3F2HdR" id="72S_Vmc5ugu" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6MzSDQOa75g" resolve="AttributeMonitors" />
        <node concept="l2Vlx" id="72S_Vmc5ugw" role="2czzBx" />
        <node concept="pj6Ft" id="72S_VmcbUOY" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
        <node concept="pVoyu" id="72S_VmciqW8" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="6MzSDQOabT7" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4EKCctwQr$R">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:4EKCctwQrzN" resolve="OccupiableAvailabilityCondition" />
    <node concept="3EZMnI" id="4EKCctwQr_b" role="2wV5jI">
      <node concept="3F0ifn" id="4EKCctwQr_i" role="3EZMnx">
        <property role="3F0ifm" value="There are at least" />
      </node>
      <node concept="3F0A7n" id="4EKCctwQufl" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4EKCctwQufd" resolve="minCapacity" />
      </node>
      <node concept="3F1sOY" id="4EKCctwQr_o" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4EKCctwQr$E" resolve="targetObject" />
      </node>
      <node concept="3F0ifn" id="4EKCctwQr_w" role="3EZMnx">
        <property role="3F0ifm" value="'s available in" />
      </node>
      <node concept="3F1sOY" id="4EKCctwQr_E" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4EKCctwQr$f" resolve="targetRoom" />
      </node>
      <node concept="2iRfu4" id="4EKCctwQr_e" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3JSrgvKC7cZ">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:3JSrgvKC6bQ" resolve="UseResourceAction" />
    <node concept="3EZMnI" id="3JSrgvKC7dj" role="2wV5jI">
      <node concept="3F0ifn" id="3JSrgvKC7dq" role="3EZMnx">
        <property role="3F0ifm" value="use" />
      </node>
      <node concept="1iCGBv" id="3JSrgvKSH7o" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3JSrgvKSH7i" resolve="targetResource" />
        <node concept="1sVBvm" id="3JSrgvKSH7q" role="1sWHZn">
          <node concept="3F0A7n" id="3JSrgvKSH7y" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="3JSrgvKC7dm" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3JSrgvMqo3m">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:3JSrgvMqo35" resolve="IsExactlyOperator" />
    <node concept="3EZMnI" id="3JSrgvMqo3o" role="2wV5jI">
      <node concept="3F0ifn" id="3JSrgvMqo3v" role="3EZMnx">
        <property role="3F0ifm" value="is" />
      </node>
      <node concept="l2Vlx" id="3JSrgvMqo3r" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3JSrgvMqo3N">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:3JSrgvMqo3y" resolve="IsLessThanOperator" />
    <node concept="3EZMnI" id="3JSrgvMqo3P" role="2wV5jI">
      <node concept="3F0ifn" id="3JSrgvMqo3W" role="3EZMnx">
        <property role="3F0ifm" value="is less than" />
      </node>
      <node concept="l2Vlx" id="3JSrgvMqo3S" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2XblIMS1PMz">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:2XblIMS1PMe" resolve="RepastParam" />
    <node concept="3EZMnI" id="2XblIMS1PM_" role="2wV5jI">
      <node concept="3F0ifn" id="2XblIMS1PMG" role="3EZMnx">
        <property role="3F0ifm" value="&lt;--(" />
      </node>
      <node concept="3F0A7n" id="2XblIMS1PMM" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="2XblIMS1PMU" role="3EZMnx">
        <property role="3F0ifm" value=")" />
      </node>
      <node concept="l2Vlx" id="2XblIMS1PMC" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="8bhHoC7_RH">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:8bhHoC7_QQ" resolve="RoomTypeIsAvailableCondition" />
    <node concept="3EZMnI" id="8bhHoC7_S1" role="2wV5jI">
      <node concept="3F0ifn" id="8bhHoC7_S8" role="3EZMnx">
        <property role="3F0ifm" value="Room type:" />
      </node>
      <node concept="3F1sOY" id="8bhHoC7_Se" role="3EZMnx">
        <ref role="1NtTu8" to="3751:8bhHoC7_R$" resolve="targetRoomType" />
      </node>
      <node concept="3F0ifn" id="8bhHoC7_Sm" role="3EZMnx">
        <property role="3F0ifm" value="is" />
      </node>
      <node concept="3F0ifn" id="8bhHoC7_Sw" role="3EZMnx">
        <property role="3F0ifm" value="empty" />
      </node>
      <node concept="l2Vlx" id="8bhHoC7_S4" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6SUjQPsMH1$">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:6SUjQPsMGA_" resolve="SelectRoomByVacancy" />
    <node concept="3EZMnI" id="6SUjQPsMH3Y" role="2wV5jI">
      <node concept="3F0ifn" id="6SUjQPsMH6J" role="3EZMnx">
        <property role="3F0ifm" value="Select room vacant of" />
      </node>
      <node concept="3F1sOY" id="6SUjQPsMHIG" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6SUjQPsMHIB" resolve="AgentType" />
      </node>
      <node concept="l2Vlx" id="6SUjQPsMH41" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6SUjQPsRMSy">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:6SUjQPsMEtJ" resolve="RoomSelectionStrategy" />
    <node concept="3EZMnI" id="6SUjQPsRMS$" role="2wV5jI">
      <node concept="3F0ifn" id="6SUjQPsRMSF" role="3EZMnx">
        <property role="3F0ifm" value="Room Selection Strategy" />
      </node>
      <node concept="3F0ifn" id="6SUjQPsRMSI" role="3EZMnx">
        <property role="3F0ifm" value="------------------------" />
      </node>
      <node concept="3F0ifn" id="10oeqP5eYHb" role="3EZMnx">
        <property role="3F0ifm" value="In order of preference..." />
        <node concept="Vb9p2" id="10oeqP5eYV5" role="3F10Kt">
          <property role="Vbekb" value="g1_kEg4/ITALIC" />
        </node>
      </node>
      <node concept="3EZMnI" id="10oeqP5kfOA" role="3EZMnx">
        <node concept="3F0ifn" id="10oeqP5kfP0" role="3EZMnx">
          <property role="3F0ifm" value="+" />
        </node>
        <node concept="VPM3Z" id="10oeqP5kfOC" role="3F10Kt" />
        <node concept="3F2HdR" id="10oeqP5kfOQ" role="3EZMnx">
          <property role="2czwfO" value="+" />
          <ref role="1NtTu8" to="3751:6SUjQPsMES_" resolve="rules" />
          <node concept="l2Vlx" id="10oeqP5kfOT" role="2czzBx" />
          <node concept="tppnM" id="10oeqP5kfP9" role="sWeuL">
            <node concept="pVoyu" id="10oeqP5kfPd" role="3F10Kt">
              <property role="VOm3f" value="true" />
            </node>
          </node>
        </node>
        <node concept="l2Vlx" id="10oeqP5kfOF" role="2iSdaV" />
      </node>
      <node concept="2iRkQZ" id="6SUjQPsRMSB" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6SUjQPsRMTl">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:6SUjQPsMEXw" resolve="RoomSelectionStrategyLine" />
    <node concept="3EZMnI" id="6SUjQPsRMTn" role="2wV5jI">
      <node concept="3F0ifn" id="6SUjQPsRMTu" role="3EZMnx">
        <property role="3F0ifm" value="if" />
      </node>
      <node concept="3F1sOY" id="6SUjQPsRMT$" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6SUjQPsMFq_" resolve="condition" />
      </node>
      <node concept="3F0ifn" id="6SUjQPsRMTL" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F1sOY" id="6SUjQPsRMTV" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6SUjQPsMFvn" resolve="rule" />
      </node>
      <node concept="l2Vlx" id="6SUjQPsRMTq" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6SUjQPtUvTa">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:6SUjQPtUvT0" resolve="SelectClosestRoom" />
    <node concept="3EZMnI" id="6SUjQPtUvTl" role="2wV5jI">
      <node concept="3F0ifn" id="6SUjQPtUvTs" role="3EZMnx">
        <property role="3F0ifm" value="Select the closest room" />
      </node>
      <node concept="l2Vlx" id="6SUjQPtUvTo" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="6SUjQPu39jq">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:6SUjQPu39iP" resolve="SelectRoomByRelationshipToOccupier" />
    <node concept="3EZMnI" id="6SUjQPu39js" role="2wV5jI">
      <node concept="3F0ifn" id="6SUjQPu39l5" role="3EZMnx">
        <property role="3F0ifm" value="Select room where I have relationship:" />
      </node>
      <node concept="3F0A7n" id="6SUjQPu7RHL" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6SUjQPu39kj" resolve="relationshipName" />
      </node>
      <node concept="3F0ifn" id="6SUjQPu7RHV" role="3EZMnx">
        <property role="3F0ifm" value="with occupier of type" />
      </node>
      <node concept="3F1sOY" id="6SUjQPu7RH9" role="3EZMnx">
        <ref role="1NtTu8" to="3751:6SUjQPu7Ogp" resolve="AgentType" />
      </node>
      <node concept="l2Vlx" id="6SUjQPu39jv" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3QFgDmIMr5G">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:3QFgDmIMr4_" resolve="SelectRoomByCapacity" />
    <node concept="3EZMnI" id="3QFgDmIMr5I" role="2wV5jI">
      <node concept="3F0ifn" id="3QFgDmIMr5P" role="3EZMnx">
        <property role="3F0ifm" value="Select room that has capacity" />
      </node>
      <node concept="l2Vlx" id="3QFgDmIMr5L" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3d01st_AyvY">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:3d01st_AyuY" resolve="IAmAtCondition" />
    <node concept="3EZMnI" id="3d01st_Aywi" role="2wV5jI">
      <node concept="3F0ifn" id="3d01st_Aywp" role="3EZMnx">
        <property role="3F0ifm" value="I am at" />
      </node>
      <node concept="3F1sOY" id="3d01st_Aywv" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3d01st_AyvP" resolve="target" />
      </node>
      <node concept="l2Vlx" id="3d01st_Aywl" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3d01stAf2mq">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:3d01stAf2m5" resolve="RoomTypeCondition" />
    <node concept="3EZMnI" id="3d01stAf2ms" role="2wV5jI">
      <node concept="3F0ifn" id="3d01stAf2mz" role="3EZMnx">
        <property role="3F0ifm" value="Room is a" />
      </node>
      <node concept="3F1sOY" id="3d01stAf2mD" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3d01stAf2mh" resolve="roomType" />
      </node>
      <node concept="l2Vlx" id="3d01stAf2mv" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="34hhAWvBScq">
    <property role="3GE5qa" value="actions.basic actions.StayAction" />
    <ref role="1XX52x" to="3751:34hhAWvBQiY" resolve="PassiveWaitUntil" />
    <node concept="3EZMnI" id="34hhAWvBSc_" role="2wV5jI">
      <node concept="3F0ifn" id="34hhAWvBScG" role="3EZMnx">
        <property role="3F0ifm" value="Passive wait until" />
      </node>
      <node concept="3F1sOY" id="34hhAWvBScM" role="3EZMnx">
        <ref role="1NtTu8" to="3751:34hhAWvBSc8" resolve="condition" />
      </node>
      <node concept="l2Vlx" id="34hhAWvBScC" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4Skof6wwmFu">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:4Skof6wwmET" resolve="InSameRoomCondition" />
    <node concept="3EZMnI" id="4Skof6wwmFw" role="2wV5jI">
      <node concept="3F0ifn" id="4Skof6wwmFB" role="3EZMnx">
        <property role="3F0ifm" value="I am in the same room as" />
      </node>
      <node concept="3F1sOY" id="4Skof6wwmFH" role="3EZMnx">
        <ref role="1NtTu8" to="3751:4Skof6wwmFl" resolve="target" />
      </node>
      <node concept="l2Vlx" id="4Skof6wwmFz" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4Skof6wY8E1">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:4Skof6wY8pa" resolve="MyRoomInstance" />
    <node concept="3EZMnI" id="4Skof6wY8ED" role="2wV5jI">
      <node concept="3F0ifn" id="4Skof6wY8Fm" role="3EZMnx">
        <property role="3F0ifm" value="my room" />
      </node>
      <node concept="l2Vlx" id="4Skof6wY8EG" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3mDt9djdNrk">
    <property role="3GE5qa" value="actions.OperationsFlow" />
    <ref role="1XX52x" to="3751:3mDt9djdNq_" resolve="ProbabilityDistribution" />
    <node concept="3EZMnI" id="3mDt9djdNrm" role="2wV5jI">
      <node concept="3F0ifn" id="2K0oNvrFWCW" role="3EZMnx">
        <property role="3F0ifm" value="Probability distribution" />
      </node>
      <node concept="3F2HdR" id="3mDt9djdNrt" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3mDt9djdNrb" resolve="lines" />
        <node concept="2iRkQZ" id="3mDt9djdNrv" role="2czzBx" />
      </node>
      <node concept="2iRkQZ" id="3mDt9djdNrp" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="3mDt9djdNrD">
    <property role="3GE5qa" value="actions.OperationsFlow" />
    <ref role="1XX52x" to="3751:3mDt9djdNr2" resolve="ProbabilityDistributionLine" />
    <node concept="3EZMnI" id="3mDt9djdNrF" role="2wV5jI">
      <node concept="3EZMnI" id="3mDt9djdNrW" role="3EZMnx">
        <node concept="VPM3Z" id="3mDt9djdNrY" role="3F10Kt" />
        <node concept="3F0ifn" id="3mDt9djdNs0" role="3EZMnx">
          <property role="3F0ifm" value="at probability" />
        </node>
        <node concept="3F1sOY" id="3i9haAHH6QA" role="3EZMnx">
          <ref role="1NtTu8" to="3751:3i9haAHH6Qt" resolve="prob" />
        </node>
        <node concept="3F0ifn" id="3mDt9djdNsA" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="2iRfu4" id="3mDt9djdNs1" role="2iSdaV" />
      </node>
      <node concept="3F1sOY" id="3mDt9djdNsq" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3mDt9djdNr3" resolve="behaviour" />
      </node>
      <node concept="2iRkQZ" id="3mDt9djdNrI" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="72S_VmbZ5ma">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:72S_VmbS_tu" resolve="AttributeMonitorReference" />
    <node concept="3EZMnI" id="72S_VmbZ5mg" role="2wV5jI">
      <node concept="1iCGBv" id="72S_VmbZ5mn" role="3EZMnx">
        <ref role="1NtTu8" to="3751:72S_VmbS_tU" resolve="attributeMonitor" />
        <node concept="1sVBvm" id="72S_VmbZ5mp" role="1sWHZn">
          <node concept="1iCGBv" id="72S_VmbZ5mw" role="2wV5jI">
            <ref role="1NtTu8" to="3751:74nMeo8dO2Y" resolve="attribute" />
            <node concept="1sVBvm" id="72S_VmbZ5my" role="1sWHZn">
              <node concept="3F0A7n" id="72S_VmbZ5mD" role="2wV5jI">
                <property role="1Intyy" value="true" />
                <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2iRfu4" id="72S_VmbZ5mj" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="351ASBN64bD">
    <property role="3GE5qa" value="actors.attribute" />
    <ref role="1XX52x" to="3751:351ASBN64bs" resolve="AgentAttributeReference" />
    <node concept="3EZMnI" id="351ASBN64bF" role="2wV5jI">
      <node concept="1iCGBv" id="351ASBN64bM" role="3EZMnx">
        <ref role="1NtTu8" to="3751:351ASBN64bv" resolve="actorReference" />
        <node concept="1sVBvm" id="351ASBN64bO" role="1sWHZn">
          <node concept="3F0A7n" id="351ASBN64bV" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="351ASBN64cw" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="3F1sOY" id="351ASBN64cG" role="3EZMnx">
        <ref role="1NtTu8" to="3751:351ASBN64bt" resolve="attributeReference" />
      </node>
      <node concept="l2Vlx" id="351ASBN64bI" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="5YqbxEqMl1x">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:5YqbxEqMl1l" resolve="DeSpawnAction" />
    <node concept="3EZMnI" id="5YqbxEqMl1z" role="2wV5jI">
      <node concept="3F0ifn" id="5YqbxEqMl1E" role="3EZMnx">
        <property role="3F0ifm" value="De-spawn" />
      </node>
      <node concept="1iCGBv" id="5YqbxEqMqnb" role="3EZMnx">
        <ref role="1NtTu8" to="3751:5YqbxEqMqn3" resolve="actorRef" />
        <node concept="1sVBvm" id="5YqbxEqMqnd" role="1sWHZn">
          <node concept="3F0A7n" id="5YqbxEqMqnl" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="5YqbxEqMl1A" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="i1eH3WOKIY">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:i1eH3WOG5k" resolve="RoomIsEmptyOrContainsRelationshipMemberCondition" />
    <node concept="3EZMnI" id="i1eH3WOKOI" role="2wV5jI">
      <node concept="3EZMnI" id="i1eH3WOKP5" role="3EZMnx">
        <node concept="2iR$Sn" id="i1eH3WOKP6" role="2iSdaV" />
        <node concept="3F0ifn" id="i1eH3WOKP7" role="3EZMnx">
          <property role="3F0ifm" value="Room" />
          <node concept="3$7fVu" id="i1eH3WOKP8" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
          <node concept="3$7jql" id="i1eH3WOKP9" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
        </node>
        <node concept="3F1sOY" id="i1eH3WOKQ8" role="3EZMnx">
          <ref role="1NtTu8" to="3751:i1eH3WOJH5" resolve="targetRoomType" />
        </node>
        <node concept="3F0ifn" id="i1eH3WOKPa" role="3EZMnx">
          <property role="3F0ifm" value="contains" />
          <node concept="3$7fVu" id="i1eH3WOKPb" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
          <node concept="3$7jql" id="i1eH3WOKPc" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
        </node>
        <node concept="3F0ifn" id="i1eH3WOKPd" role="3EZMnx">
          <property role="3F0ifm" value="member" />
          <node concept="3$7fVu" id="i1eH3WOKPe" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
          <node concept="3$7jql" id="i1eH3WOKPf" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
        </node>
        <node concept="3F0ifn" id="i1eH3WOKPg" role="3EZMnx">
          <property role="3F0ifm" value="of" />
          <node concept="3$7fVu" id="i1eH3WOKPh" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
          <node concept="3$7jql" id="i1eH3WOKPi" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
        </node>
        <node concept="3F0ifn" id="i1eH3WOKPj" role="3EZMnx">
          <property role="3F0ifm" value="relationship" />
          <node concept="3$7fVu" id="i1eH3WOKPk" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
          <node concept="3$7jql" id="i1eH3WOKPl" role="3F10Kt">
            <property role="3$6WeP" value="0.5" />
          </node>
        </node>
      </node>
      <node concept="3F0A7n" id="i1eH3WOKOV" role="3EZMnx">
        <ref role="1NtTu8" to="3751:i1eH3WOKp5" resolve="relationshipName" />
      </node>
      <node concept="3F0ifn" id="i1eH3WOKQJ" role="3EZMnx">
        <property role="3F0ifm" value="of type" />
      </node>
      <node concept="3F1sOY" id="i1eH3WOKRr" role="3EZMnx">
        <ref role="1NtTu8" to="3751:i1eH3WOK8I" resolve="ActorRef" />
      </node>
      <node concept="l2Vlx" id="i1eH3WOKOL" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH8IVPz">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:1MmdcH8IVPp" resolve="BackgroundBehaviour" />
    <node concept="3EZMnI" id="1MmdcH8IVP_" role="2wV5jI">
      <node concept="3F0ifn" id="1MmdcH8IVPK" role="3EZMnx">
        <property role="3F0ifm" value="Background Behaviour:" />
      </node>
      <node concept="3F0A7n" id="1MmdcH8IVPS" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="1MmdcH8IVQt" role="3EZMnx">
        <property role="3F0ifm" value="Steps:" />
        <node concept="pVoyu" id="1MmdcH8IVQ_" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1MmdcH8IVQK" role="3EZMnx">
        <property role="3F0ifm" value="----------------------------" />
        <node concept="pVoyu" id="1MmdcH8IVQU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="1MmdcH9So93" role="3EZMnx">
        <node concept="2iRkQZ" id="1MmdcH9So94" role="2iSdaV" />
        <node concept="3F1sOY" id="1MmdcH9So8S" role="3EZMnx">
          <ref role="1NtTu8" to="3751:3l6cNjec8l3" resolve="behaviourSequence" />
          <node concept="pVoyu" id="1MmdcH9So91" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pVoyu" id="1MmdcHb11Hr" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="1MmdcH8IVPC" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH8Jffl">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:1MmdcH8Jffb" resolve="AgentIterable" />
    <node concept="3EZMnI" id="1MmdcH8Jffn" role="2wV5jI">
      <node concept="3F0A7n" id="1MmdcH8OpE3" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="1MmdcH8OpEj" role="3EZMnx">
        <property role="3F0ifm" value="=" />
      </node>
      <node concept="1iCGBv" id="1MmdcH8Jffu" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH8Jffc" resolve="agentReference" />
        <node concept="1sVBvm" id="1MmdcH8Jffw" role="1sWHZn">
          <node concept="1iCGBv" id="1MmdcH8JffB" role="2wV5jI">
            <ref role="1NtTu8" to="3751:svZ_Jg4oEG" resolve="actor" />
            <node concept="1sVBvm" id="1MmdcH8JffD" role="1sWHZn">
              <node concept="3F0A7n" id="1MmdcH8JffK" role="2wV5jI">
                <property role="1Intyy" value="true" />
                <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="1MmdcH8Jffq" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH8JffU">
    <property role="3GE5qa" value="actions.OperationsFlow" />
    <ref role="1XX52x" to="3751:1MmdcH8Jff4" resolve="ForEach" />
    <node concept="3EZMnI" id="1MmdcH8JffW" role="2wV5jI">
      <node concept="3F0ifn" id="1MmdcH8Jfg3" role="3EZMnx">
        <property role="3F0ifm" value="for each:" />
      </node>
      <node concept="3F1sOY" id="1MmdcH8Jfg9" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH8Jff5" resolve="iterable" />
      </node>
      <node concept="3F0ifn" id="3EfopCAys_5" role="3EZMnx">
        <property role="3F0ifm" value="in range" />
      </node>
      <node concept="3F0A7n" id="3EfopCAys_n" role="3EZMnx">
        <ref role="1NtTu8" to="3751:3EfopCAys$V" resolve="withinRange" />
      </node>
      <node concept="3F0ifn" id="1MmdcH8Jfgh" role="3EZMnx">
        <property role="3F0ifm" value=":" />
      </node>
      <node concept="1iCGBv" id="1MmdcH9o00r" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH9o00d" resolve="behaviourRef" />
        <node concept="1sVBvm" id="1MmdcH9o00t" role="1sWHZn">
          <node concept="3F0A7n" id="1MmdcH9o00B" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="1MmdcH8JffZ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH8OpDr">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:1MmdcH8OnFq" resolve="IterableAttributeCondition" />
    <node concept="3EZMnI" id="1MmdcH8OpDt" role="2wV5jI">
      <node concept="3F0ifn" id="1MmdcH8OpDB" role="3EZMnx">
        <property role="3F0ifm" value="check" />
      </node>
      <node concept="1iCGBv" id="1MmdcH8OpDH" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH8OpDd" resolve="iterable" />
        <node concept="1sVBvm" id="1MmdcH8OpDJ" role="1sWHZn">
          <node concept="3F0A7n" id="1MmdcH8OpEs" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="1MmdcH8OpE_" role="3EZMnx">
        <property role="3F0ifm" value="." />
      </node>
      <node concept="1iCGBv" id="1MmdcH8Oqw3" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH8OpDg" resolve="attribute" />
        <node concept="1sVBvm" id="1MmdcH8Oqw5" role="1sWHZn">
          <node concept="3F0A7n" id="1MmdcH8Oqwj" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0A7n" id="1MmdcH8OpFe" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH8OnOO" resolve="operator" />
      </node>
      <node concept="3F1sOY" id="1MmdcH8OpF$" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH8OnOQ" resolve="right" />
      </node>
      <node concept="l2Vlx" id="1MmdcH8OpDw" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH921mw">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:1MmdcH921mh" resolve="MyAttributeCondition" />
    <node concept="3EZMnI" id="1MmdcH921my" role="2wV5jI">
      <node concept="3F0ifn" id="1MmdcH921mD" role="3EZMnx">
        <property role="3F0ifm" value="check " />
      </node>
      <node concept="1iCGBv" id="1MmdcH921mJ" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH921mm" resolve="atribute" />
        <node concept="1sVBvm" id="1MmdcH921mL" role="1sWHZn">
          <node concept="3F0A7n" id="1MmdcH921mT" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0A7n" id="1MmdcH921n2" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH921mi" resolve="operator" />
      </node>
      <node concept="3F1sOY" id="1MmdcH921ng" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH921mk" resolve="right" />
      </node>
      <node concept="l2Vlx" id="1MmdcH921m_" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH9duCz">
    <property role="3GE5qa" value="actions" />
    <ref role="1XX52x" to="3751:1MmdcH9duf1" resolve="ScheduledBehaviour" />
    <node concept="3EZMnI" id="1MmdcH9duC_" role="2wV5jI">
      <node concept="3F0ifn" id="1MmdcH9duCK" role="3EZMnx">
        <property role="3F0ifm" value="Scheduled Behaviour:" />
        <node concept="pVoyu" id="1MmdcH9duCU" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="1MmdcH9duCQ" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="3F0ifn" id="1MmdcH9duD1" role="3EZMnx">
        <property role="3F0ifm" value="Start at tick:" />
        <node concept="pVoyu" id="1MmdcH9duDk" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="1MmdcH9duDd" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH9duCl" resolve="startTick" />
      </node>
      <node concept="3F0ifn" id="1MmdcH9duDu" role="3EZMnx">
        <property role="3F0ifm" value="Interval:" />
        <node concept="pVoyu" id="1MmdcH9duDW" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0A7n" id="1MmdcH9duDK" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH9duCn" resolve="interval" />
      </node>
      <node concept="3F0ifn" id="1MmdcH9duE9" role="3EZMnx">
        <property role="3F0ifm" value="Steps:" />
        <node concept="pVoyu" id="1MmdcH9duEl" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3F0ifn" id="1MmdcH9duE$" role="3EZMnx">
        <property role="3F0ifm" value="----------------------------------" />
        <node concept="pVoyu" id="1MmdcH9duEM" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="3EZMnI" id="1MmdcH9duFl" role="3EZMnx">
        <node concept="2iRkQZ" id="1MmdcH9duFm" role="2iSdaV" />
        <node concept="3F1sOY" id="1MmdcH9duF3" role="3EZMnx">
          <ref role="1NtTu8" to="3751:1MmdcH9duCq" resolve="behaviourSequence" />
          <node concept="pVoyu" id="1MmdcH9duFj" role="3F10Kt">
            <property role="VOm3f" value="true" />
          </node>
        </node>
        <node concept="pVoyu" id="1MmdcH9duFE" role="3F10Kt">
          <property role="VOm3f" value="true" />
        </node>
      </node>
      <node concept="l2Vlx" id="1MmdcH9duCC" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1MmdcH9tbrw">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:1MmdcH9tbrk" resolve="DistanceCondition" />
    <node concept="3EZMnI" id="1MmdcH9tbry" role="2wV5jI">
      <node concept="3F0ifn" id="1MmdcH9tbrD" role="3EZMnx">
        <property role="3F0ifm" value="I am within" />
      </node>
      <node concept="3F0A7n" id="1MmdcH9tbrJ" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH9tbrn" resolve="range" />
      </node>
      <node concept="3F0ifn" id="1MmdcH9tbrR" role="3EZMnx">
        <property role="3F0ifm" value="metres" />
      </node>
      <node concept="3F0ifn" id="1MmdcH9tbs1" role="3EZMnx">
        <property role="3F0ifm" value="of" />
      </node>
      <node concept="3F1sOY" id="1MmdcH9tbsd" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1MmdcH9tbrl" resolve="target" />
      </node>
      <node concept="l2Vlx" id="1MmdcH9tbr_" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4NxsD3bcMP_">
    <property role="3GE5qa" value="actions.OperationsFlow" />
    <ref role="1XX52x" to="3751:4NxsD3bcMPn" resolve="DecisionTreeLine" />
    <node concept="3EZMnI" id="4NxsD3bcMPB" role="2wV5jI">
      <node concept="3EZMnI" id="4NxsD3bcMPC" role="3EZMnx">
        <node concept="VPM3Z" id="4NxsD3bcMPD" role="3F10Kt" />
        <node concept="3F0ifn" id="4NxsD3bcMPE" role="3EZMnx">
          <property role="3F0ifm" value="Case:" />
        </node>
        <node concept="3F1sOY" id="4NxsD3bcMPZ" role="3EZMnx">
          <ref role="1NtTu8" to="3751:4NxsD3bcMPo" resolve="condition" />
        </node>
        <node concept="3F0ifn" id="4NxsD3bcMPG" role="3EZMnx">
          <property role="3F0ifm" value=":" />
        </node>
        <node concept="2iRfu4" id="4NxsD3bcMPH" role="2iSdaV" />
      </node>
      <node concept="3EZMnI" id="4NxsD3bpdiw" role="3EZMnx">
        <node concept="3F0ifn" id="4NxsD3bpdiS" role="3EZMnx" />
        <node concept="2iRfu4" id="4NxsD3bpdix" role="2iSdaV" />
        <node concept="3F1sOY" id="4NxsD3bcMQi" role="3EZMnx">
          <ref role="1NtTu8" to="3751:4NxsD3bcMPp" resolve="behaviour" />
        </node>
      </node>
      <node concept="2iRkQZ" id="4NxsD3bcMPJ" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="4NxsD3bcNeP">
    <property role="3GE5qa" value="actions.OperationsFlow" />
    <ref role="1XX52x" to="3751:4NxsD3bcMPg" resolve="DecisionTree" />
    <node concept="3EZMnI" id="4NxsD3bcNeR" role="2wV5jI">
      <node concept="3F0ifn" id="4NxsD3bcNeY" role="3EZMnx">
        <property role="3F0ifm" value="Select Case:" />
      </node>
      <node concept="3EZMnI" id="4NxsD3bkaw9" role="3EZMnx">
        <node concept="2iRkQZ" id="4NxsD3bkawa" role="2iSdaV" />
        <node concept="3F2HdR" id="4NxsD3bcNf4" role="3EZMnx">
          <ref role="1NtTu8" to="3751:4NxsD3bcNeG" resolve="lines" />
          <node concept="l2Vlx" id="4NxsD3bkaw6" role="2czzBx" />
        </node>
      </node>
      <node concept="2iRkQZ" id="4NxsD3bcNeU" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="G77p895LKj">
    <property role="3GE5qa" value="actions.basic actions" />
    <ref role="1XX52x" to="3751:G77p895LJz" resolve="DropBreadcrumb" />
    <node concept="3EZMnI" id="G77p895LKr" role="2wV5jI">
      <node concept="3F0ifn" id="G77p895LKt" role="3EZMnx">
        <property role="3F0ifm" value="Drop" />
      </node>
      <node concept="1iCGBv" id="G77p895LK_" role="3EZMnx">
        <ref role="1NtTu8" to="3751:G77p895LKa" resolve="breadcrumb" />
        <node concept="1sVBvm" id="G77p895LKB" role="1sWHZn">
          <node concept="3F0A7n" id="G77p895LL3" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="2iRfu4" id="G77p895LKu" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="G77p895LLm">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:G77p895LJp" resolve="Breadcrumb" />
    <node concept="3EZMnI" id="G77p895LLo" role="2wV5jI">
      <node concept="3F0A7n" id="G77p895LLv" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
        <node concept="VQ3r3" id="G77p8aOD_O" role="3F10Kt">
          <property role="2USNnj" value="gtbM8PH/underlined" />
        </node>
        <node concept="VSNWy" id="G77p8aOD_T" role="3F10Kt">
          <property role="1lJzqX" value="18" />
        </node>
      </node>
      <node concept="3F1sOY" id="G77p8aOD_B" role="3EZMnx">
        <ref role="1NtTu8" to="3751:G77p8aOD__" resolve="colourTable" />
      </node>
      <node concept="2iRkQZ" id="G77p8981ns" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="G77p8aOBX4">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:G77p8aOBWj" resolve="ColourLine" />
    <node concept="2r0Tta" id="G77p8aOBXo" role="2wV5jI">
      <node concept="2reCLk" id="G77p8aOBXr" role="2r0Tv6">
        <node concept="2reCLy" id="G77p8aOBXt" role="2reCL6">
          <node concept="3F0A7n" id="G77p8aOBXx" role="2reSmM">
            <ref role="1NtTu8" to="3751:G77p8aOBWS" resolve="Colour" />
          </node>
        </node>
        <node concept="2reCLy" id="G77p8aOBXC" role="2reCL6">
          <node concept="3F0A7n" id="G77p8aOBXK" role="2reSmM">
            <ref role="1NtTu8" to="3751:G77p8aOBWU" resolve="Occurances" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="24kQdi" id="G77p8aOBYe">
    <property role="3GE5qa" value="Structures" />
    <ref role="1XX52x" to="3751:G77p8aOBVq" resolve="ColourTable" />
    <node concept="3EZMnI" id="G77p8aOBY_" role="2wV5jI">
      <node concept="3F0A7n" id="G77p8aOBYG" role="3EZMnx">
        <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
      </node>
      <node concept="2rfBfz" id="G77p8aOBYM" role="3EZMnx">
        <node concept="2reSaE" id="G77p8aOBYS" role="2rf8GZ">
          <ref role="2reCK$" to="3751:G77p8aOBY5" resolve="lines" />
          <node concept="2r3Xtq" id="G77p8aOBYV" role="2YiT2b">
            <node concept="2rfbtV" id="G77p8aOBYZ" role="uCobI">
              <property role="2rfbtB" value="Colour" />
            </node>
            <node concept="2rfbtV" id="G77p8aOBZ5" role="uCobI">
              <property role="2rfbtB" value=" &gt;=Occurances" />
            </node>
          </node>
        </node>
      </node>
      <node concept="2iRkQZ" id="G77p8aOBYC" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="pxbXbtDjKk">
    <property role="3GE5qa" value="actions.actions.basic actions.StayAction.StayForConditionAction.Condition" />
    <ref role="1XX52x" to="3751:pxbXbtDjCy" resolve="IsPathObstructedCondition" />
    <node concept="3EZMnI" id="pxbXbtDjKm" role="2wV5jI">
      <node concept="3F0ifn" id="pxbXbtDjKt" role="3EZMnx">
        <property role="3F0ifm" value="Is path to" />
      </node>
      <node concept="3F1sOY" id="pxbXbtDjKz" role="3EZMnx">
        <ref role="1NtTu8" to="3751:pxbXbtDjKb" resolve="target" />
      </node>
      <node concept="3F0ifn" id="pxbXbtDjKF" role="3EZMnx">
        <property role="3F0ifm" value="obstructed" />
      </node>
      <node concept="l2Vlx" id="pxbXbtDjKp" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="1Sy0AbOnHHP">
    <property role="3GE5qa" value="Structures.Class" />
    <ref role="1XX52x" to="3751:1Sy0AbOnHGY" resolve="MyRoomsOccupiableReference" />
    <node concept="3EZMnI" id="1Sy0AbOnHHR" role="2wV5jI">
      <node concept="3F0ifn" id="1Sy0AbOnHI1" role="3EZMnx">
        <property role="3F0ifm" value="my room's" />
      </node>
      <node concept="1iCGBv" id="1Sy0AbOnHI7" role="3EZMnx">
        <ref role="1NtTu8" to="3751:1Sy0AbOnHGZ" resolve="occupiable" />
        <node concept="1sVBvm" id="1Sy0AbOnHI9" role="1sWHZn">
          <node concept="3F0A7n" id="1Sy0AbOnHIh" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="3z3g:34hhAWvBY1f" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="1Sy0AbOnHHU" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="10oeqP4V2vh">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:10oeqP4V2u$" resolve="SelectRoomByOccupantRelationship" />
    <node concept="3EZMnI" id="10oeqP4V2vj" role="2wV5jI">
      <node concept="3F0ifn" id="10oeqP4V2vq" role="3EZMnx">
        <property role="3F0ifm" value="Select room where occupant is part of:" />
      </node>
      <node concept="1iCGBv" id="10oeqP4V2vw" role="3EZMnx">
        <ref role="1NtTu8" to="3751:10oeqP4V2u_" resolve="relationship" />
        <node concept="1sVBvm" id="10oeqP4V2vy" role="1sWHZn">
          <node concept="3F0A7n" id="10oeqP4V2vE" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="l2Vlx" id="10oeqP4V2vm" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="10oeqP59vpB">
    <property role="3GE5qa" value="RoomSelectionStrategy" />
    <ref role="1XX52x" to="3751:10oeqP59vpt" resolve="SelectRoomByMessageContent" />
    <node concept="3EZMnI" id="10oeqP59vpD" role="2wV5jI">
      <node concept="3F0ifn" id="10oeqP59vpK" role="3EZMnx">
        <property role="3F0ifm" value="Select room that contains dataLine:'" />
      </node>
      <node concept="3F0A7n" id="10oeqP59vpQ" role="3EZMnx">
        <ref role="1NtTu8" to="3751:10oeqP59vpu" resolve="dataLineKey" />
      </node>
      <node concept="3F0ifn" id="10oeqP59vpY" role="3EZMnx">
        <property role="3F0ifm" value="' in behaviour trigger" />
      </node>
      <node concept="l2Vlx" id="10oeqP59vpG" role="2iSdaV" />
    </node>
  </node>
  <node concept="24kQdi" id="2r8kCFsbPOS">
    <property role="3GE5qa" value="SignalSelectionStrategy" />
    <ref role="1XX52x" to="3751:2r8kCFsbPOG" resolve="SelectMessageByRelationshipCapacity" />
    <node concept="3EZMnI" id="2r8kCFsbPOU" role="2wV5jI">
      <node concept="3F0ifn" id="2r8kCFsbPP1" role="3EZMnx">
        <property role="3F0ifm" value="Select message where" />
      </node>
      <node concept="3F0ifn" id="2r8kCFsbPPf" role="3EZMnx">
        <property role="3F0ifm" value="relationship:" />
      </node>
      <node concept="1iCGBv" id="2r8kCFsbPPp" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2r8kCFsbPOH" resolve="relationship" />
        <node concept="1sVBvm" id="2r8kCFsbPPr" role="1sWHZn">
          <node concept="3F0A7n" id="2r8kCFsbPPH" role="2wV5jI">
            <property role="1Intyy" value="true" />
            <ref role="1NtTu8" to="tpck:h0TrG11" resolve="name" />
          </node>
        </node>
      </node>
      <node concept="3F0ifn" id="2r8kCFsqQmV" role="3EZMnx">
        <property role="3F0ifm" value="has capacity for data slot:'" />
      </node>
      <node concept="3F0A7n" id="2r8kCFsqQnb" role="3EZMnx">
        <ref role="1NtTu8" to="3751:2r8kCFsqQmB" resolve="dataline" />
      </node>
      <node concept="3F0ifn" id="2r8kCFsy5M9" role="3EZMnx">
        <property role="3F0ifm" value="'" />
      </node>
      <node concept="l2Vlx" id="2r8kCFsbPOX" role="2iSdaV" />
    </node>
  </node>
</model>

