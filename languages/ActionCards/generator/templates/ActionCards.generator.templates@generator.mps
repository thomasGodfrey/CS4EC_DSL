<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:2b34b262-70b8-44fb-abbb-589788150497(ActionCards.generator.templates@generator)">
  <persistence version="9" />
  <languages>
    <use id="7dcff301-ba01-414e-8574-a8f6da31876b" name="EDLanguage" version="0" />
    <use id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator" version="3" />
    <use id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext" version="2" />
    <devkit ref="a2eb3a43-fcc2-4200-80dc-c60110c4862d(jetbrains.mps.devkit.templates)" />
  </languages>
  <imports>
    <import index="e88n" ref="r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)" />
    <import index="3751" ref="r:773fb116-fb45-4750-a73a-f0ffaf85115c(EDLanguage.structure)" implicit="true" />
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="4836112446988635817" name="jetbrains.mps.baseLanguage.structure.UndefinedType" flags="in" index="2jxLKc" />
      <concept id="1197027756228" name="jetbrains.mps.baseLanguage.structure.DotExpression" flags="nn" index="2OqwBi">
        <child id="1197027771414" name="operand" index="2Oq$k0" />
        <child id="1197027833540" name="operation" index="2OqNvi" />
      </concept>
      <concept id="1137021947720" name="jetbrains.mps.baseLanguage.structure.ConceptFunction" flags="in" index="2VMwT0">
        <child id="1137022507850" name="body" index="2VODD2" />
      </concept>
      <concept id="1070475926800" name="jetbrains.mps.baseLanguage.structure.StringLiteral" flags="nn" index="Xl_RD">
        <property id="1070475926801" name="value" index="Xl_RC" />
      </concept>
      <concept id="1070534058343" name="jetbrains.mps.baseLanguage.structure.NullLiteral" flags="nn" index="10Nm6u" />
      <concept id="1068498886296" name="jetbrains.mps.baseLanguage.structure.VariableReference" flags="nn" index="37vLTw">
        <reference id="1068581517664" name="variableDeclaration" index="3cqZAo" />
      </concept>
      <concept id="1225271221393" name="jetbrains.mps.baseLanguage.structure.NPENotEqualsExpression" flags="nn" index="17QLQc" />
      <concept id="1225271283259" name="jetbrains.mps.baseLanguage.structure.NPEEqualsExpression" flags="nn" index="17R0WA" />
      <concept id="4972933694980447171" name="jetbrains.mps.baseLanguage.structure.BaseVariableDeclaration" flags="ng" index="19Szcq">
        <child id="5680397130376446158" name="type" index="1tU5fm" />
      </concept>
      <concept id="1068580123152" name="jetbrains.mps.baseLanguage.structure.EqualsExpression" flags="nn" index="3clFbC" />
      <concept id="1068580123155" name="jetbrains.mps.baseLanguage.structure.ExpressionStatement" flags="nn" index="3clFbF">
        <child id="1068580123156" name="expression" index="3clFbG" />
      </concept>
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
      <concept id="1068581242875" name="jetbrains.mps.baseLanguage.structure.PlusExpression" flags="nn" index="3cpWs3" />
      <concept id="1081773326031" name="jetbrains.mps.baseLanguage.structure.BinaryOperation" flags="nn" index="3uHJSO">
        <child id="1081773367579" name="rightExpression" index="3uHU7w" />
        <child id="1081773367580" name="leftExpression" index="3uHU7B" />
      </concept>
    </language>
    <language id="7dcff301-ba01-414e-8574-a8f6da31876b" name="EDLanguage">
      <concept id="4334763093660390701" name="EDLanguage.structure.StayForTimeAction" flags="ng" index="jcv$W">
        <property id="4334763093660390702" name="timeSpan" index="jcv$Z" />
      </concept>
      <concept id="6839259415242834338" name="EDLanguage.structure.PatientInterval" flags="ng" index="2qCAYh" />
      <concept id="3435897115888459980" name="EDLanguage.structure.NewPatientSignal" flags="ng" index="EZebP" />
      <concept id="8910807539222190210" name="EDLanguage.structure.Description" flags="ng" index="2IBTiW" />
      <concept id="6750846609956093098" name="EDLanguage.structure.RoomTypeReference" flags="ng" index="UeIYj" />
      <concept id="513408552829815467" name="EDLanguage.structure.ActorReference" flags="ng" index="3n3BjK">
        <reference id="513408552829815468" name="actor" index="3n3BjR" />
      </concept>
      <concept id="513408552829743914" name="EDLanguage.structure.Signal" flags="ng" index="3n3SPL">
        <property id="513408552829744291" name="description" index="3n3SFS" />
        <child id="88285669848655863" name="receivers" index="1nbS2I" />
        <child id="4211260315489209511" name="senders" index="3z7ADm" />
      </concept>
      <concept id="513408552829743917" name="EDLanguage.structure.SignalDefinition" flags="ng" index="3n3SPQ">
        <child id="513408552829743918" name="signals" index="3n3SPP" />
      </concept>
      <concept id="88285669848655860" name="EDLanguage.structure.ActorTypeSignal" flags="ng" index="1nbS2H" />
      <concept id="4211260315489209491" name="EDLanguage.structure.SignalInitReference" flags="ng" index="3z7ADy" />
      <concept id="4211260315489212560" name="EDLanguage.structure.SendSignalAction" flags="ng" index="3z7BTx">
        <child id="4211260315489212561" name="signalInitReference" index="3z7BTw" />
      </concept>
      <concept id="8504720493511036692" name="EDLanguage.structure.SelfInstance" flags="ng" index="3JGL$I" />
      <concept id="3838812034270460672" name="EDLanguage.structure.EmergencyDepartment" flags="ng" index="3VqkwO">
        <property id="649219036782541956" name="percentageHighSeverity" index="XQ$72" />
        <property id="649219036782541960" name="percentageMediumSeverity" index="XQ$7e" />
        <property id="329726013670468742" name="percentageAsymptomatic" index="3UAW29" />
        <property id="329726013670468740" name="pecentageSymptomatic" index="3UAW2b" />
        <child id="6839259415242834378" name="patientInterval" index="2qCAZT" />
        <child id="3838812034270522283" name="staff" index="3Vt_yv" />
      </concept>
      <concept id="3838812034270460674" name="EDLanguage.structure.ActorInstantiation" flags="ng" index="3VqkwQ">
        <property id="3838812034270522313" name="number" index="3Vt_zX" />
        <reference id="3838812034270522315" name="actorType" index="3Vt_zZ" />
      </concept>
      <concept id="3838812034270454385" name="EDLanguage.structure.Actor" flags="ng" index="3Vql55">
        <child id="2814466787070108702" name="behaviours" index="2Ov1EZ" />
      </concept>
      <concept id="3838812034270522234" name="EDLanguage.structure.BehaviourElement" flags="ng" index="3Vt_xe">
        <child id="513408552829927049" name="signal" index="3n3c3i" />
        <child id="3838812034270528835" name="behaviour" index="3VtFpR" />
      </concept>
      <concept id="3838812034270528852" name="EDLanguage.structure.MoveAction" flags="ng" index="3VtFpw">
        <child id="513408552830880866" name="targetObject" index="3nfz8T" />
      </concept>
      <concept id="3838812034270528838" name="EDLanguage.structure.BehaviourSequence" flags="ng" index="3VtFpM">
        <child id="3838812034270528840" name="steps" index="3VtFpW" />
      </concept>
      <concept id="3838812034270528839" name="EDLanguage.structure.Behaviour" flags="ng" index="3VtFpN">
        <child id="8910807539222190240" name="description" index="2IBTiu" />
      </concept>
    </language>
    <language id="b401a680-8325-4110-8fd3-84331ff25bef" name="jetbrains.mps.lang.generator">
      <concept id="1114706874351" name="jetbrains.mps.lang.generator.structure.CopySrcNodeMacro" flags="ln" index="29HgVG">
        <child id="1168024447342" name="sourceNodeQuery" index="3NFExx" />
      </concept>
      <concept id="1114729360583" name="jetbrains.mps.lang.generator.structure.CopySrcListMacro" flags="ln" index="2b32R4">
        <child id="1168278589236" name="sourceNodesQuery" index="2P8S$" />
      </concept>
      <concept id="1095416546421" name="jetbrains.mps.lang.generator.structure.MappingConfiguration" flags="ig" index="bUwia">
        <child id="1200911492601" name="mappingLabel" index="2rTMjI" />
        <child id="1167328349397" name="reductionMappingRule" index="3acgRq" />
        <child id="1167514678247" name="rootMappingRule" index="3lj3bC" />
      </concept>
      <concept id="1168559333462" name="jetbrains.mps.lang.generator.structure.TemplateDeclarationReference" flags="ln" index="j$656" />
      <concept id="1168619357332" name="jetbrains.mps.lang.generator.structure.RootTemplateAnnotation" flags="lg" index="n94m4">
        <reference id="1168619429071" name="applicableConcept" index="n9lRv" />
      </concept>
      <concept id="1095672379244" name="jetbrains.mps.lang.generator.structure.TemplateFragment" flags="ng" index="raruj" />
      <concept id="1200911316486" name="jetbrains.mps.lang.generator.structure.MappingLabelDeclaration" flags="lg" index="2rT7sh">
        <reference id="1200911342686" name="sourceConcept" index="2rTdP9" />
        <reference id="1200913004646" name="targetConcept" index="2rZz_L" />
      </concept>
      <concept id="1722980698497626400" name="jetbrains.mps.lang.generator.structure.ITemplateCall" flags="ng" index="v9R3L">
        <reference id="1722980698497626483" name="template" index="v9R2y" />
      </concept>
      <concept id="5133195082121471908" name="jetbrains.mps.lang.generator.structure.LabelMacro" flags="ln" index="2ZBi8u" />
      <concept id="1167169188348" name="jetbrains.mps.lang.generator.structure.TemplateFunctionParameter_sourceNode" flags="nn" index="30H73N" />
      <concept id="1167169308231" name="jetbrains.mps.lang.generator.structure.BaseMappingRule" flags="ng" index="30H$t8">
        <reference id="1200917515464" name="labelDeclaration" index="2sgKRv" />
        <reference id="1167169349424" name="applicableConcept" index="30HIoZ" />
      </concept>
      <concept id="1227303129915" name="jetbrains.mps.lang.generator.structure.AbstractMacro" flags="ng" index="30XT8A">
        <property id="3265704088513289864" name="comment" index="34cw8o" />
      </concept>
      <concept id="1092059087312" name="jetbrains.mps.lang.generator.structure.TemplateDeclaration" flags="ig" index="13MO4I">
        <reference id="1168285871518" name="applicableConcept" index="3gUMe" />
        <child id="1092060348987" name="contentNode" index="13RCb5" />
      </concept>
      <concept id="1087833241328" name="jetbrains.mps.lang.generator.structure.PropertyMacro" flags="ln" index="17Uvod">
        <child id="1167756362303" name="propertyValueFunction" index="3zH0cK" />
      </concept>
      <concept id="1087833466690" name="jetbrains.mps.lang.generator.structure.NodeMacro" flags="lg" index="17VmuZ">
        <reference id="1200912223215" name="mappingLabel" index="2rW$FS" />
      </concept>
      <concept id="1167327847730" name="jetbrains.mps.lang.generator.structure.Reduction_MappingRule" flags="lg" index="3aamgX">
        <child id="1169672767469" name="ruleConsequence" index="1lVwrX" />
      </concept>
      <concept id="1167514355419" name="jetbrains.mps.lang.generator.structure.Root_MappingRule" flags="lg" index="3lhOvk">
        <reference id="1167514355421" name="template" index="3lhOvi" />
      </concept>
      <concept id="1167756080639" name="jetbrains.mps.lang.generator.structure.PropertyMacro_GetPropertyValue" flags="in" index="3zFVjK" />
      <concept id="1167770111131" name="jetbrains.mps.lang.generator.structure.ReferenceMacro_GetReferent" flags="in" index="3$xsQk" />
      <concept id="1167945743726" name="jetbrains.mps.lang.generator.structure.IfMacro_Condition" flags="in" index="3IZrLx" />
      <concept id="1167951910403" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodesQuery" flags="in" index="3JmXsc" />
      <concept id="1168024337012" name="jetbrains.mps.lang.generator.structure.SourceSubstituteMacro_SourceNodeQuery" flags="in" index="3NFfHV" />
      <concept id="1118773211870" name="jetbrains.mps.lang.generator.structure.IfMacro" flags="ln" index="1W57fq">
        <child id="1167945861827" name="conditionFunction" index="3IZSJc" />
      </concept>
      <concept id="1118786554307" name="jetbrains.mps.lang.generator.structure.LoopMacro" flags="ln" index="1WS0z7">
        <child id="1167952069335" name="sourceNodesQuery" index="3Jn$fo" />
      </concept>
      <concept id="1088761943574" name="jetbrains.mps.lang.generator.structure.ReferenceMacro" flags="ln" index="1ZhdrF">
        <child id="1167770376702" name="referentFunction" index="3$ytzL" />
      </concept>
    </language>
    <language id="fd392034-7849-419d-9071-12563d152375" name="jetbrains.mps.baseLanguage.closures">
      <concept id="1199569711397" name="jetbrains.mps.baseLanguage.closures.structure.ClosureLiteral" flags="nn" index="1bVj0M">
        <child id="1199569906740" name="parameter" index="1bW2Oz" />
        <child id="1199569916463" name="body" index="1bW5cS" />
      </concept>
    </language>
    <language id="d7706f63-9be2-479c-a3da-ae92af1e64d5" name="jetbrains.mps.lang.generator.generationContext">
      <concept id="1216860049627" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetOutputByLabelAndInput" flags="nn" index="1iwH70">
        <reference id="1216860049628" name="label" index="1iwH77" />
        <child id="1216860049632" name="inputNode" index="1iwH7V" />
      </concept>
      <concept id="1216860049635" name="jetbrains.mps.lang.generator.generationContext.structure.TemplateFunctionParameter_generationContext" flags="nn" index="1iwH7S" />
      <concept id="1217004708011" name="jetbrains.mps.lang.generator.generationContext.structure.GenerationContextOp_GetInputModel" flags="nn" index="1r8y6K" />
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="1177026924588" name="jetbrains.mps.lang.smodel.structure.RefConcept_Reference" flags="nn" index="chp4Y">
        <reference id="1177026940964" name="conceptDeclaration" index="cht4Q" />
      </concept>
      <concept id="1138411891628" name="jetbrains.mps.lang.smodel.structure.SNodeOperation" flags="nn" index="eCIE_">
        <child id="1144104376918" name="parameter" index="1xVPHs" />
      </concept>
      <concept id="1171315804604" name="jetbrains.mps.lang.smodel.structure.Model_RootsOperation" flags="nn" index="2RRcyG">
        <reference id="1171315804605" name="concept" index="2RRcyH" />
      </concept>
      <concept id="1171323947159" name="jetbrains.mps.lang.smodel.structure.Model_NodesOperation" flags="nn" index="2SmgA7">
        <child id="1758937410080001570" name="conceptArgument" index="1dBWTz" />
      </concept>
      <concept id="1171407110247" name="jetbrains.mps.lang.smodel.structure.Node_GetAncestorOperation" flags="nn" index="2Xjw5R" />
      <concept id="3562215692195599741" name="jetbrains.mps.lang.smodel.structure.SLinkImplicitSelect" flags="nn" index="13MTOL">
        <reference id="3562215692195600259" name="link" index="13MTZf" />
      </concept>
      <concept id="1144101972840" name="jetbrains.mps.lang.smodel.structure.OperationParm_Concept" flags="ng" index="1xMEDy">
        <child id="1207343664468" name="conceptArgument" index="ri$Ld" />
      </concept>
      <concept id="1138056022639" name="jetbrains.mps.lang.smodel.structure.SPropertyAccess" flags="nn" index="3TrcHB">
        <reference id="1138056395725" name="property" index="3TsBF5" />
      </concept>
      <concept id="1138056143562" name="jetbrains.mps.lang.smodel.structure.SLinkAccess" flags="nn" index="3TrEf2">
        <reference id="1138056516764" name="link" index="3Tt5mk" />
      </concept>
      <concept id="1138056282393" name="jetbrains.mps.lang.smodel.structure.SLinkListAccess" flags="nn" index="3Tsc0h">
        <reference id="1138056546658" name="link" index="3TtcxE" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="3364660638048049750" name="jetbrains.mps.lang.core.structure.PropertyAttribute" flags="ng" index="A9Btg">
        <property id="1757699476691236117" name="name_DebugInfo" index="2qtEX9" />
        <property id="1341860900487648621" name="propertyId" index="P4ACc" />
      </concept>
      <concept id="3364660638048049745" name="jetbrains.mps.lang.core.structure.LinkAttribute" flags="ng" index="A9Btn">
        <property id="1757699476691236116" name="role_DebugInfo" index="2qtEX8" />
        <property id="1341860900488019036" name="linkId" index="P3scX" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="83888646-71ce-4f1c-9c53-c54016f6ad4f" name="jetbrains.mps.baseLanguage.collections">
      <concept id="1204796164442" name="jetbrains.mps.baseLanguage.collections.structure.InternalSequenceOperation" flags="nn" index="23sCx2">
        <child id="1204796294226" name="closure" index="23t8la" />
      </concept>
      <concept id="1235566554328" name="jetbrains.mps.baseLanguage.collections.structure.AnyOperation" flags="nn" index="2HwmR7" />
      <concept id="1203518072036" name="jetbrains.mps.baseLanguage.collections.structure.SmartClosureParameterDeclaration" flags="ig" index="Rh6nW" />
      <concept id="1165525191778" name="jetbrains.mps.baseLanguage.collections.structure.GetFirstOperation" flags="nn" index="1uHKPH" />
      <concept id="1225727723840" name="jetbrains.mps.baseLanguage.collections.structure.FindFirstOperation" flags="nn" index="1z4cxt" />
      <concept id="1202120902084" name="jetbrains.mps.baseLanguage.collections.structure.WhereOperation" flags="nn" index="3zZkjj" />
    </language>
  </registry>
  <node concept="bUwia" id="2VPlUUsG6vW">
    <property role="TrG5h" value="main" />
    <node concept="3aamgX" id="4X1nFNzXDEu" role="3acgRq">
      <ref role="30HIoZ" to="e88n:2VPlUUsG6x$" resolve="Action" />
      <node concept="j$656" id="4X1nFNzXDEv" role="1lVwrX">
        <ref role="v9R2y" node="4X1nFNzXDEs" resolve="reduce_Action" />
      </node>
    </node>
    <node concept="3lhOvk" id="4FTL$vJIr_m" role="3lj3bC">
      <ref role="30HIoZ" to="e88n:4X1nFNzWOrG" resolve="StaffType" />
      <ref role="3lhOvi" node="4FTL$vJIr_A" resolve="map_StaffType" />
      <ref role="2sgKRv" node="4FTL$vJSBos" resolve="staffReduction" />
    </node>
    <node concept="3lhOvk" id="4FTL$vJQj1V" role="3lj3bC">
      <ref role="30HIoZ" to="e88n:2VPlUUsG6x8" resolve="ActionCard" />
      <ref role="3lhOvi" node="4FTL$vJQj1Z" />
    </node>
    <node concept="3lhOvk" id="4FTL$vJYPws" role="3lj3bC">
      <ref role="30HIoZ" to="e88n:4FTL$vJY2Tm" resolve="EDScenario" />
      <ref role="3lhOvi" node="4FTL$vJZduI" />
    </node>
    <node concept="3aamgX" id="4FTL$vJQbHh" role="3acgRq">
      <ref role="30HIoZ" to="e88n:4X1nFNzWQVM" resolve="GoToAction" />
      <node concept="j$656" id="4FTL$vJQbHi" role="1lVwrX">
        <ref role="v9R2y" node="4FTL$vJQbHf" resolve="reduce_GoToAction" />
      </node>
    </node>
    <node concept="2rT7sh" id="4FTL$vJSBos" role="2rTMjI">
      <property role="TrG5h" value="staffReduction" />
      <ref role="2rTdP9" to="e88n:4X1nFNzWOrG" resolve="StaffType" />
      <ref role="2rZz_L" to="3751:3l6cNjebQ9L" resolve="Actor" />
    </node>
    <node concept="2rT7sh" id="4FTL$vJTd2Q" role="2rTMjI">
      <property role="TrG5h" value="SignalReduction" />
      <ref role="2rTdP9" to="e88n:2VPlUUsG6x$" resolve="Action" />
      <ref role="2rZz_L" to="3751:svZ_Jg47cE" resolve="Signal" />
    </node>
  </node>
  <node concept="13MO4I" id="4X1nFNzXDEs">
    <property role="TrG5h" value="reduce_Action" />
    <ref role="3gUMe" to="e88n:2VPlUUsG6x$" resolve="Action" />
    <node concept="3Vt_xe" id="4X1nFNzXDE_" role="13RCb5">
      <property role="TrG5h" value="name" />
      <node concept="3VtFpM" id="4X1nFNzXDEA" role="3VtFpR">
        <node concept="3VtFpM" id="4X1nFNzXEif" role="3VtFpW">
          <node concept="3VtFpw" id="4X1nFNzXEsh" role="3VtFpW">
            <node concept="3JGL$I" id="4X1nFNzXEsl" role="3nfz8T" />
            <node concept="1WS0z7" id="4X1nFNzXEsp" role="lGtFl">
              <node concept="3JmXsc" id="4X1nFNzXEss" role="3Jn$fo">
                <node concept="3clFbS" id="4X1nFNzXEst" role="2VODD2">
                  <node concept="3clFbF" id="4X1nFN$55Qi" role="3cqZAp">
                    <node concept="2OqwBi" id="4X1nFN$563p" role="3clFbG">
                      <node concept="30H73N" id="4X1nFN$55Qh" role="2Oq$k0" />
                      <node concept="3Tsc0h" id="4X1nFN$56ej" role="2OqNvi">
                        <ref role="3TtcxE" to="e88n:4X1nFNzWOml" resolve="steps" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
            <node concept="29HgVG" id="4X1nFNzXE$k" role="lGtFl" />
            <node concept="2IBTiW" id="4FTL$vJXxe0" role="2IBTiu" />
          </node>
        </node>
        <node concept="3z7BTx" id="4FTL$vJXxl9" role="3VtFpW">
          <node concept="3z7ADy" id="4FTL$vJXxlb" role="3z7BTw">
            <node concept="1ZhdrF" id="4FTL$vJXxpm" role="lGtFl">
              <property role="2qtEX8" value="signal" />
              <property role="P3scX" value="7dcff301-ba01-414e-8574-a8f6da31876b/4211260315489209491/4211260315489209492" />
              <node concept="3$xsQk" id="4FTL$vJXxpn" role="3$ytzL">
                <node concept="3clFbS" id="4FTL$vJXxpo" role="2VODD2">
                  <node concept="3clFbF" id="4FTL$vJXxpW" role="3cqZAp">
                    <node concept="2OqwBi" id="4FTL$vJXxuK" role="3clFbG">
                      <node concept="1iwH7S" id="4FTL$vJXxpV" role="2Oq$k0" />
                      <node concept="1iwH70" id="4FTL$vJXxwu" role="2OqNvi">
                        <ref role="1iwH77" node="4FTL$vJTd2Q" resolve="SignalReduction" />
                        <node concept="2OqwBi" id="4FTL$vJXE6x" role="1iwH7V">
                          <node concept="2OqwBi" id="4FTL$vJXDJr" role="2Oq$k0">
                            <node concept="30H73N" id="4FTL$vJXyh4" role="2Oq$k0" />
                            <node concept="3TrEf2" id="4FTL$vJXDVk" role="2OqNvi">
                              <ref role="3Tt5mk" to="e88n:4X1nFNzWOmX" resolve="branch" />
                            </node>
                          </node>
                          <node concept="3TrEf2" id="4FTL$vJXEhM" role="2OqNvi">
                            <ref role="3Tt5mk" to="e88n:4X1nFNzWOmM" resolve="targetAction" />
                          </node>
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
          <node concept="1W57fq" id="4FTL$vJXPP1" role="lGtFl">
            <node concept="3IZrLx" id="4FTL$vJXPP2" role="3IZSJc">
              <node concept="3clFbS" id="4FTL$vJXPP3" role="2VODD2">
                <node concept="3clFbF" id="4FTL$vJXPUa" role="3cqZAp">
                  <node concept="17QLQc" id="4FTL$vJXQBg" role="3clFbG">
                    <node concept="10Nm6u" id="4FTL$vJXQBs" role="3uHU7w" />
                    <node concept="2OqwBi" id="4FTL$vJXQ8u" role="3uHU7B">
                      <node concept="30H73N" id="4FTL$vJXPU9" role="2Oq$k0" />
                      <node concept="3TrEf2" id="4FTL$vJXQna" role="2OqNvi">
                        <ref role="3Tt5mk" to="e88n:4X1nFNzWOmX" resolve="branch" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="raruj" id="4X1nFNzXDEF" role="lGtFl" />
      <node concept="17Uvod" id="4X1nFNzXDEG" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="4X1nFNzXDEH" role="3zH0cK">
          <node concept="3clFbS" id="4X1nFNzXDEI" role="2VODD2">
            <node concept="3clFbF" id="4X1nFNzXDJk" role="3cqZAp">
              <node concept="2OqwBi" id="4X1nFNzXDWm" role="3clFbG">
                <node concept="30H73N" id="4X1nFNzXDJj" role="2Oq$k0" />
                <node concept="3TrcHB" id="4X1nFNzXE78" role="2OqNvi">
                  <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="EZebP" id="4FTL$vJUspN" role="3n3c3i">
        <node concept="1W57fq" id="4FTL$vJX8Ew" role="lGtFl">
          <property role="34cw8o" value=" if this is the first action in the action card, then by default it will be triggered by patient arrival" />
          <node concept="3IZrLx" id="4FTL$vJX8Ex" role="3IZSJc">
            <node concept="3clFbS" id="4FTL$vJX8Ey" role="2VODD2">
              <node concept="3clFbF" id="4FTL$vJX8It" role="3cqZAp">
                <node concept="17R0WA" id="4FTL$vJXipp" role="3clFbG">
                  <node concept="30H73N" id="4FTL$vJXigW" role="3uHU7B" />
                  <node concept="2OqwBi" id="4FTL$vJXhCo" role="3uHU7w">
                    <node concept="1uHKPH" id="4FTL$vJXhRJ" role="2OqNvi" />
                    <node concept="2OqwBi" id="4FTL$vJXfII" role="2Oq$k0">
                      <node concept="13MTOL" id="4FTL$vJXh2s" role="2OqNvi">
                        <ref role="13MTZf" to="e88n:2VPlUUsG6xR" resolve="Actions" />
                      </node>
                      <node concept="2OqwBi" id="4FTL$vJX93n" role="2Oq$k0">
                        <node concept="2RRcyG" id="4FTL$vJXe2m" role="2OqNvi">
                          <ref role="2RRcyH" to="e88n:2VPlUUsG6x8" resolve="ActionCard" />
                        </node>
                        <node concept="2OqwBi" id="4FTL$vJX8Pm" role="2Oq$k0">
                          <node concept="1r8y6K" id="4FTL$vJX8QO" role="2OqNvi" />
                          <node concept="1iwH7S" id="4FTL$vJXixy" role="2Oq$k0" />
                        </node>
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3Vql55" id="4FTL$vJIr_A">
    <property role="TrG5h" value="map_StaffType" />
    <node concept="3Vt_xe" id="4FTL$vJIww3" role="2Ov1EZ">
      <property role="TrG5h" value="PlaceholderName" />
      <node concept="3VtFpM" id="4FTL$vJIww4" role="3VtFpR">
        <node concept="jcv$W" id="4FTL$vJIwwF" role="3VtFpW">
          <property role="jcv$Z" value="1" />
        </node>
      </node>
      <node concept="2b32R4" id="4FTL$vJIwwJ" role="lGtFl">
        <node concept="3JmXsc" id="4FTL$vJIwwM" role="2P8S$">
          <node concept="3clFbS" id="4FTL$vJIwwN" role="2VODD2">
            <node concept="3clFbF" id="4FTL$vJIwwT" role="3cqZAp">
              <node concept="2OqwBi" id="4FTL$vJIAsr" role="3clFbG">
                <node concept="2OqwBi" id="4FTL$vJIyY$" role="2Oq$k0">
                  <node concept="2OqwBi" id="4FTL$vJIxmA" role="2Oq$k0">
                    <node concept="2OqwBi" id="4FTL$vJIx9l" role="2Oq$k0">
                      <node concept="1iwH7S" id="4FTL$vJIwYf" role="2Oq$k0" />
                      <node concept="1r8y6K" id="4FTL$vJIxev" role="2OqNvi" />
                    </node>
                    <node concept="2RRcyG" id="4FTL$vJIxuJ" role="2OqNvi">
                      <ref role="2RRcyH" to="e88n:2VPlUUsG6x8" resolve="ActionCard" />
                    </node>
                  </node>
                  <node concept="13MTOL" id="4FTL$vJI_Ps" role="2OqNvi">
                    <ref role="13MTZf" to="e88n:2VPlUUsG6xR" resolve="Actions" />
                  </node>
                </node>
                <node concept="3zZkjj" id="4FTL$vJIADc" role="2OqNvi">
                  <node concept="1bVj0M" id="4FTL$vJIADe" role="23t8la">
                    <node concept="3clFbS" id="4FTL$vJIADf" role="1bW5cS">
                      <node concept="3clFbF" id="4FTL$vJIAH3" role="3cqZAp">
                        <node concept="3clFbC" id="4FTL$vJIBrD" role="3clFbG">
                          <node concept="2OqwBi" id="4FTL$vJID0f" role="3uHU7w">
                            <node concept="30H73N" id="4FTL$vJIB$J" role="2Oq$k0" />
                            <node concept="3TrcHB" id="4FTL$vJID4$" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                          <node concept="2OqwBi" id="4FTL$vJQP5Z" role="3uHU7B">
                            <node concept="2OqwBi" id="4FTL$vJQOAs" role="2Oq$k0">
                              <node concept="2OqwBi" id="4FTL$vJIAVm" role="2Oq$k0">
                                <node concept="37vLTw" id="4FTL$vJIAH2" role="2Oq$k0">
                                  <ref role="3cqZAo" node="4FTL$vJIADg" resolve="it" />
                                </node>
                                <node concept="3TrEf2" id="4FTL$vJQO8p" role="2OqNvi">
                                  <ref role="3Tt5mk" to="e88n:4FTL$vJQLjT" resolve="staffTypeReference" />
                                </node>
                              </node>
                              <node concept="3TrEf2" id="4FTL$vJQONC" role="2OqNvi">
                                <ref role="3Tt5mk" to="e88n:4FTL$vJQzE_" resolve="staffType" />
                              </node>
                            </node>
                            <node concept="3TrcHB" id="4FTL$vJQPlq" role="2OqNvi">
                              <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="4FTL$vJIADg" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="4FTL$vJIADh" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="n94m4" id="4FTL$vJIr_B" role="lGtFl">
      <ref role="n9lRv" to="e88n:4X1nFNzWOrG" resolve="StaffType" />
    </node>
    <node concept="17Uvod" id="4FTL$vJIr_M" role="lGtFl">
      <property role="2qtEX9" value="name" />
      <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
      <node concept="3zFVjK" id="4FTL$vJIr_N" role="3zH0cK">
        <node concept="3clFbS" id="4FTL$vJIr_O" role="2VODD2">
          <node concept="3clFbF" id="4FTL$vJIrEq" role="3cqZAp">
            <node concept="2OqwBi" id="4FTL$vJIrRs" role="3clFbG">
              <node concept="30H73N" id="4FTL$vJIrEp" role="2Oq$k0" />
              <node concept="3TrcHB" id="4FTL$vJIs2D" role="2OqNvi">
                <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2ZBi8u" id="4FTL$vJTIQ6" role="lGtFl">
      <ref role="2rW$FS" node="4FTL$vJSBos" resolve="staffReduction" />
    </node>
  </node>
  <node concept="13MO4I" id="4FTL$vJQbHf">
    <property role="TrG5h" value="reduce_GoToAction" />
    <ref role="3gUMe" to="e88n:4X1nFNzWQVM" resolve="GoToAction" />
    <node concept="3VtFpw" id="4FTL$vJQbHq" role="13RCb5">
      <node concept="raruj" id="4FTL$vJQbI0" role="lGtFl" />
      <node concept="UeIYj" id="4FTL$vJQdb7" role="3nfz8T">
        <node concept="29HgVG" id="4FTL$vJQdba" role="lGtFl">
          <node concept="3NFfHV" id="4FTL$vJQdbb" role="3NFExx">
            <node concept="3clFbS" id="4FTL$vJQdbc" role="2VODD2">
              <node concept="3clFbF" id="4FTL$vJQdbi" role="3cqZAp">
                <node concept="2OqwBi" id="4FTL$vJQdbd" role="3clFbG">
                  <node concept="3TrEf2" id="4FTL$vJQdbg" role="2OqNvi">
                    <ref role="3Tt5mk" to="e88n:4X1nFNzWQWe" resolve="destination" />
                  </node>
                  <node concept="30H73N" id="4FTL$vJQdbh" role="2Oq$k0" />
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3n3SPQ" id="4FTL$vJQj1Z">
    <node concept="n94m4" id="4FTL$vJQj20" role="lGtFl">
      <ref role="n9lRv" to="e88n:2VPlUUsG6x8" resolve="ActionCard" />
    </node>
    <node concept="1nbS2H" id="4FTL$vJQj2b" role="3n3SPP">
      <property role="TrG5h" value="placeholderName" />
      <property role="3n3SFS" value="hello" />
      <node concept="1WS0z7" id="4FTL$vJQj$d" role="lGtFl">
        <node concept="3JmXsc" id="4FTL$vJQj$g" role="3Jn$fo">
          <node concept="3clFbS" id="4FTL$vJQj$h" role="2VODD2">
            <node concept="3clFbF" id="4FTL$vJQj$n" role="3cqZAp">
              <node concept="2OqwBi" id="4FTL$vJWxlx" role="3clFbG">
                <node concept="2OqwBi" id="4FTL$vJQj$i" role="2Oq$k0">
                  <node concept="3Tsc0h" id="4FTL$vJQj$l" role="2OqNvi">
                    <ref role="3TtcxE" to="e88n:2VPlUUsG6xR" resolve="Actions" />
                  </node>
                  <node concept="30H73N" id="4FTL$vJQj$m" role="2Oq$k0" />
                </node>
                <node concept="3zZkjj" id="4FTL$vJWzuu" role="2OqNvi">
                  <node concept="1bVj0M" id="4FTL$vJWzuw" role="23t8la">
                    <node concept="3clFbS" id="4FTL$vJWzux" role="1bW5cS">
                      <node concept="3clFbF" id="4FTL$vJWzSD" role="3cqZAp">
                        <node concept="2OqwBi" id="4FTL$vJWLkP" role="3clFbG">
                          <node concept="2OqwBi" id="4FTL$vJWLkQ" role="2Oq$k0">
                            <node concept="2OqwBi" id="4FTL$vJWLkR" role="2Oq$k0">
                              <node concept="1iwH7S" id="4FTL$vJWLkS" role="2Oq$k0" />
                              <node concept="1r8y6K" id="4FTL$vJWLkT" role="2OqNvi" />
                            </node>
                            <node concept="2SmgA7" id="4FTL$vJWLkU" role="2OqNvi">
                              <node concept="chp4Y" id="4FTL$vJWLkV" role="1dBWTz">
                                <ref role="cht4Q" to="e88n:4X1nFNzWOlI" resolve="Branch" />
                              </node>
                            </node>
                          </node>
                          <node concept="2HwmR7" id="4FTL$vJWLkW" role="2OqNvi">
                            <node concept="1bVj0M" id="4FTL$vJWLkX" role="23t8la">
                              <node concept="3clFbS" id="4FTL$vJWLkY" role="1bW5cS">
                                <node concept="3clFbF" id="4FTL$vJWLkZ" role="3cqZAp">
                                  <node concept="17R0WA" id="4FTL$vJWLl0" role="3clFbG">
                                    <node concept="2OqwBi" id="4FTL$vJWLl1" role="3uHU7B">
                                      <node concept="37vLTw" id="4FTL$vJWLl2" role="2Oq$k0">
                                        <ref role="3cqZAo" node="4FTL$vJWLl5" resolve="it2" />
                                      </node>
                                      <node concept="3TrEf2" id="4FTL$vJWLl3" role="2OqNvi">
                                        <ref role="3Tt5mk" to="e88n:4X1nFNzWOmM" resolve="targetAction" />
                                      </node>
                                    </node>
                                    <node concept="37vLTw" id="4FTL$vJWLl4" role="3uHU7w">
                                      <ref role="3cqZAo" node="4FTL$vJWzuy" resolve="it" />
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="Rh6nW" id="4FTL$vJWLl5" role="1bW2Oz">
                                <property role="TrG5h" value="it2" />
                                <node concept="2jxLKc" id="4FTL$vJWLl6" role="1tU5fm" />
                              </node>
                            </node>
                          </node>
                        </node>
                      </node>
                    </node>
                    <node concept="Rh6nW" id="4FTL$vJWzuy" role="1bW2Oz">
                      <property role="TrG5h" value="it" />
                      <node concept="2jxLKc" id="4FTL$vJWzuz" role="1tU5fm" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="4FTL$vJSepg" role="lGtFl">
        <property role="2qtEX9" value="name" />
        <property role="P4ACc" value="ceab5195-25ea-4f22-9b92-103b95ca8c0c/1169194658468/1169194664001" />
        <node concept="3zFVjK" id="4FTL$vJSeph" role="3zH0cK">
          <node concept="3clFbS" id="4FTL$vJSepi" role="2VODD2">
            <node concept="3clFbF" id="4FTL$vJSeAd" role="3cqZAp">
              <node concept="3cpWs3" id="4FTL$vJSfr3" role="3clFbG">
                <node concept="Xl_RD" id="4FTL$vJSfr7" role="3uHU7w">
                  <property role="Xl_RC" value="Trigger" />
                </node>
                <node concept="2OqwBi" id="4FTL$vJSeNI" role="3uHU7B">
                  <node concept="30H73N" id="4FTL$vJSeAc" role="2Oq$k0" />
                  <node concept="3TrcHB" id="4FTL$vJSf4y" role="2OqNvi">
                    <ref role="3TsBF5" to="tpck:h0TrG11" resolve="name" />
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="2ZBi8u" id="4FTL$vJTAI$" role="lGtFl">
        <ref role="2rW$FS" node="4FTL$vJTd2Q" resolve="SignalReduction" />
      </node>
      <node concept="3n3BjK" id="4FTL$vJTS8F" role="1nbS2I">
        <ref role="3n3BjR" node="4FTL$vJIr_A" resolve="map_StaffType" />
        <node concept="1ZhdrF" id="4FTL$vJTSew" role="lGtFl">
          <property role="2qtEX8" value="actor" />
          <property role="P3scX" value="7dcff301-ba01-414e-8574-a8f6da31876b/513408552829815467/513408552829815468" />
          <node concept="3$xsQk" id="4FTL$vJTSex" role="3$ytzL">
            <node concept="3clFbS" id="4FTL$vJTSey" role="2VODD2">
              <node concept="3clFbF" id="4FTL$vJTSf6" role="3cqZAp">
                <node concept="2OqwBi" id="4FTL$vJTSpe" role="3clFbG">
                  <node concept="1iwH7S" id="4FTL$vJTSf5" role="2Oq$k0" />
                  <node concept="1iwH70" id="4FTL$vJTSuV" role="2OqNvi">
                    <ref role="1iwH77" node="4FTL$vJSBos" resolve="staffReduction" />
                    <node concept="2OqwBi" id="4FTL$vJUHPX" role="1iwH7V">
                      <node concept="2OqwBi" id="4FTL$vJTT1q" role="2Oq$k0">
                        <node concept="30H73N" id="4FTL$vJTSDA" role="2Oq$k0" />
                        <node concept="3TrEf2" id="4FTL$vJTTi1" role="2OqNvi">
                          <ref role="3Tt5mk" to="e88n:4FTL$vJQLjT" resolve="staffTypeReference" />
                        </node>
                      </node>
                      <node concept="3TrEf2" id="4FTL$vJUI1O" role="2OqNvi">
                        <ref role="3Tt5mk" to="e88n:4FTL$vJQzE_" resolve="staffType" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="3n3BjK" id="4FTL$vJU1iw" role="3z7ADm">
        <ref role="3n3BjR" node="4FTL$vJIr_A" resolve="map_StaffType" />
        <node concept="1ZhdrF" id="4FTL$vJU1mz" role="lGtFl">
          <property role="2qtEX8" value="actor" />
          <property role="P3scX" value="7dcff301-ba01-414e-8574-a8f6da31876b/513408552829815467/513408552829815468" />
          <node concept="3$xsQk" id="4FTL$vJU1m$" role="3$ytzL">
            <node concept="3clFbS" id="4FTL$vJU1m_" role="2VODD2">
              <node concept="3clFbF" id="4FTL$vJU1n9" role="3cqZAp">
                <node concept="2OqwBi" id="4FTL$vJU1xh" role="3clFbG">
                  <node concept="1iwH7S" id="4FTL$vJU1n8" role="2Oq$k0" />
                  <node concept="1iwH70" id="4FTL$vJVFmH" role="2OqNvi">
                    <ref role="1iwH77" node="4FTL$vJSBos" resolve="staffReduction" />
                    <node concept="2OqwBi" id="4FTL$vJWmqT" role="1iwH7V">
                      <node concept="2OqwBi" id="4FTL$vJWlWR" role="2Oq$k0">
                        <node concept="2OqwBi" id="4FTL$vJWizY" role="2Oq$k0">
                          <node concept="2OqwBi" id="4FTL$vJWgmt" role="2Oq$k0">
                            <node concept="2OqwBi" id="4FTL$vJVORo" role="2Oq$k0">
                              <node concept="2OqwBi" id="4FTL$vJVMBz" role="2Oq$k0">
                                <node concept="2OqwBi" id="4FTL$vJVMrS" role="2Oq$k0">
                                  <node concept="1iwH7S" id="4FTL$vJVMnV" role="2Oq$k0" />
                                  <node concept="1r8y6K" id="4FTL$vJVMu3" role="2OqNvi" />
                                </node>
                                <node concept="2RRcyG" id="4FTL$vJVMI3" role="2OqNvi">
                                  <ref role="2RRcyH" to="e88n:2VPlUUsG6x8" resolve="ActionCard" />
                                </node>
                              </node>
                              <node concept="1z4cxt" id="4FTL$vJWeN4" role="2OqNvi">
                                <node concept="1bVj0M" id="4FTL$vJWeN6" role="23t8la">
                                  <node concept="3clFbS" id="4FTL$vJWeN7" role="1bW5cS">
                                    <node concept="3clFbF" id="4FTL$vJWeVX" role="3cqZAp">
                                      <node concept="17R0WA" id="4FTL$vJWfmo" role="3clFbG">
                                        <node concept="2OqwBi" id="4FTL$vJWfCT" role="3uHU7w">
                                          <node concept="30H73N" id="4FTL$vJWfpL" role="2Oq$k0" />
                                          <node concept="2Xjw5R" id="4FTL$vJWfYs" role="2OqNvi">
                                            <node concept="1xMEDy" id="4FTL$vJWfYu" role="1xVPHs">
                                              <node concept="chp4Y" id="4FTL$vJWg7i" role="ri$Ld">
                                                <ref role="cht4Q" to="e88n:2VPlUUsG6x8" resolve="ActionCard" />
                                              </node>
                                            </node>
                                          </node>
                                        </node>
                                        <node concept="37vLTw" id="4FTL$vJWeVW" role="3uHU7B">
                                          <ref role="3cqZAo" node="4FTL$vJWeN8" resolve="it" />
                                        </node>
                                      </node>
                                    </node>
                                  </node>
                                  <node concept="Rh6nW" id="4FTL$vJWeN8" role="1bW2Oz">
                                    <property role="TrG5h" value="it" />
                                    <node concept="2jxLKc" id="4FTL$vJWeN9" role="1tU5fm" />
                                  </node>
                                </node>
                              </node>
                            </node>
                            <node concept="3Tsc0h" id="4FTL$vJWg_6" role="2OqNvi">
                              <ref role="3TtcxE" to="e88n:2VPlUUsG6xR" resolve="Actions" />
                            </node>
                          </node>
                          <node concept="1z4cxt" id="4FTL$vJWkzu" role="2OqNvi">
                            <node concept="1bVj0M" id="4FTL$vJWkzw" role="23t8la">
                              <node concept="3clFbS" id="4FTL$vJWkzx" role="1bW5cS">
                                <node concept="3clFbF" id="4FTL$vJWkJ8" role="3cqZAp">
                                  <node concept="17R0WA" id="4FTL$vJWlKK" role="3clFbG">
                                    <node concept="30H73N" id="4FTL$vJWlRv" role="3uHU7w" />
                                    <node concept="2OqwBi" id="4FTL$vJWle3" role="3uHU7B">
                                      <node concept="2OqwBi" id="4FTL$vJWkR_" role="2Oq$k0">
                                        <node concept="37vLTw" id="4FTL$vJWkJ7" role="2Oq$k0">
                                          <ref role="3cqZAo" node="4FTL$vJWkzy" resolve="it" />
                                        </node>
                                        <node concept="3TrEf2" id="4FTL$vJWkYJ" role="2OqNvi">
                                          <ref role="3Tt5mk" to="e88n:4X1nFNzWOmX" resolve="branch" />
                                        </node>
                                      </node>
                                      <node concept="3TrEf2" id="4FTL$vJWly3" role="2OqNvi">
                                        <ref role="3Tt5mk" to="e88n:4X1nFNzWOmM" resolve="targetAction" />
                                      </node>
                                    </node>
                                  </node>
                                </node>
                              </node>
                              <node concept="Rh6nW" id="4FTL$vJWkzy" role="1bW2Oz">
                                <property role="TrG5h" value="it" />
                                <node concept="2jxLKc" id="4FTL$vJWkzz" role="1tU5fm" />
                              </node>
                            </node>
                          </node>
                        </node>
                        <node concept="3TrEf2" id="4FTL$vJWm99" role="2OqNvi">
                          <ref role="3Tt5mk" to="e88n:4FTL$vJQLjT" resolve="staffTypeReference" />
                        </node>
                      </node>
                      <node concept="3TrEf2" id="4FTL$vJWmOS" role="2OqNvi">
                        <ref role="3Tt5mk" to="e88n:4FTL$vJQzE_" resolve="staffType" />
                      </node>
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="3VqkwO" id="4FTL$vJZduI">
    <property role="3UAW2b" value="10" />
    <property role="3UAW29" value="20" />
    <property role="XQ$72" value="45" />
    <property role="XQ$7e" value="40" />
    <node concept="3VqkwQ" id="4FTL$vJZduV" role="3Vt_yv">
      <property role="3Vt_zX" value="1" />
      <ref role="3Vt_zZ" node="4FTL$vJIr_A" resolve="map_StaffType" />
      <node concept="1WS0z7" id="4FTL$vJZduY" role="lGtFl">
        <node concept="3JmXsc" id="4FTL$vJZdv1" role="3Jn$fo">
          <node concept="3clFbS" id="4FTL$vJZdv2" role="2VODD2">
            <node concept="3clFbF" id="4FTL$vJZdv8" role="3cqZAp">
              <node concept="2OqwBi" id="4FTL$vJZdv3" role="3clFbG">
                <node concept="3Tsc0h" id="4FTL$vJZdv6" role="2OqNvi">
                  <ref role="3TtcxE" to="e88n:4FTL$vJY2U$" resolve="staffNumbers" />
                </node>
                <node concept="30H73N" id="4FTL$vJZdv7" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="17Uvod" id="4FTL$vJZdEI" role="lGtFl">
        <property role="2qtEX9" value="number" />
        <property role="P4ACc" value="7dcff301-ba01-414e-8574-a8f6da31876b/3838812034270460674/3838812034270522313" />
        <node concept="3zFVjK" id="4FTL$vJZdEL" role="3zH0cK">
          <node concept="3clFbS" id="4FTL$vJZdEM" role="2VODD2">
            <node concept="3clFbF" id="4FTL$vJZdES" role="3cqZAp">
              <node concept="2OqwBi" id="4FTL$vJZdEN" role="3clFbG">
                <node concept="3TrcHB" id="4FTL$vJZdEQ" role="2OqNvi">
                  <ref role="3TsBF5" to="e88n:4FTL$vJY2U5" resolve="number" />
                </node>
                <node concept="30H73N" id="4FTL$vJZdER" role="2Oq$k0" />
              </node>
            </node>
          </node>
        </node>
      </node>
      <node concept="1ZhdrF" id="4FTL$vJZdO7" role="lGtFl">
        <property role="2qtEX8" value="actorType" />
        <property role="P3scX" value="7dcff301-ba01-414e-8574-a8f6da31876b/3838812034270460674/3838812034270522315" />
        <node concept="3$xsQk" id="4FTL$vJZdOa" role="3$ytzL">
          <node concept="3clFbS" id="4FTL$vJZdOb" role="2VODD2">
            <node concept="3clFbF" id="4FTL$vJZdOh" role="3cqZAp">
              <node concept="2OqwBi" id="4FTL$vJZeAO" role="3clFbG">
                <node concept="1iwH7S" id="4FTL$vJZey2" role="2Oq$k0" />
                <node concept="1iwH70" id="4FTL$vJZeCy" role="2OqNvi">
                  <ref role="1iwH77" node="4FTL$vJSBos" resolve="staffReduction" />
                  <node concept="2OqwBi" id="4FTL$vJZeUz" role="1iwH7V">
                    <node concept="30H73N" id="4FTL$vJZeJH" role="2Oq$k0" />
                    <node concept="3TrEf2" id="4FTL$vJZf9d" role="2OqNvi">
                      <ref role="3Tt5mk" to="e88n:4FTL$vJY2U7" resolve="staff" />
                    </node>
                  </node>
                </node>
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="2qCAYh" id="4FTL$vJZduJ" role="2qCAZT" />
    <node concept="n94m4" id="4FTL$vJZduK" role="lGtFl">
      <ref role="n9lRv" to="e88n:4FTL$vJY2Tm" resolve="EDScenario" />
    </node>
  </node>
</model>

