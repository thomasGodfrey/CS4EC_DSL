<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:7ef4b8fb-d504-46d8-992e-206765437297(ActionCards.typesystem)">
  <persistence version="9" />
  <languages>
    <use id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem" version="5" />
    <use id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage" version="11" />
    <use id="3a13115c-633c-4c5c-bbcc-75c4219e9555" name="jetbrains.mps.lang.quotation" version="5" />
    <devkit ref="00000000-0000-4000-0000-1de82b3a4936(jetbrains.mps.devkit.aspect.typesystem)" />
  </languages>
  <imports>
    <import index="5qo5" ref="r:6d93ddb1-b0b0-4eee-8079-51303666672a(org.iets3.core.expr.simpleTypes.structure)" />
    <import index="e88n" ref="r:e220bde4-f6e0-4580-ba24-92680041be3b(ActionCards.structure)" />
  </imports>
  <registry>
    <language id="f3061a53-9226-4cc5-a443-f952ceaf5816" name="jetbrains.mps.baseLanguage">
      <concept id="1068580123136" name="jetbrains.mps.baseLanguage.structure.StatementList" flags="sn" stub="5293379017992965193" index="3clFbS">
        <child id="1068581517665" name="statement" index="3cqZAp" />
      </concept>
    </language>
    <language id="3a13115c-633c-4c5c-bbcc-75c4219e9555" name="jetbrains.mps.lang.quotation">
      <concept id="5455284157993863837" name="jetbrains.mps.lang.quotation.structure.NodeBuilder" flags="nn" index="2pJPEk">
        <child id="5455284157993863838" name="quotedNode" index="2pJPEn" />
      </concept>
      <concept id="5455284157993863840" name="jetbrains.mps.lang.quotation.structure.NodeBuilderNode" flags="nn" index="2pJPED">
        <reference id="5455284157993910961" name="concept" index="2pJxaS" />
      </concept>
    </language>
    <language id="7a5dda62-9140-4668-ab76-d5ed1746f2b2" name="jetbrains.mps.lang.typesystem">
      <concept id="1185788614172" name="jetbrains.mps.lang.typesystem.structure.NormalTypeClause" flags="ng" index="mw_s8">
        <child id="1185788644032" name="normalType" index="mwGJk" />
      </concept>
      <concept id="1195213580585" name="jetbrains.mps.lang.typesystem.structure.AbstractCheckingRule" flags="ig" index="18hYwZ">
        <child id="1195213635060" name="body" index="18ibNy" />
      </concept>
      <concept id="1174642788531" name="jetbrains.mps.lang.typesystem.structure.ConceptReference" flags="ig" index="1YaCAy">
        <reference id="1174642800329" name="concept" index="1YaFvo" />
      </concept>
      <concept id="1174643105530" name="jetbrains.mps.lang.typesystem.structure.InferenceRule" flags="ig" index="1YbPZF" />
      <concept id="1174648085619" name="jetbrains.mps.lang.typesystem.structure.AbstractRule" flags="ng" index="1YuPPy">
        <child id="1174648101952" name="applicableNode" index="1YuTPh" />
      </concept>
      <concept id="1174650418652" name="jetbrains.mps.lang.typesystem.structure.ApplicableNodeReference" flags="nn" index="1YBJjd">
        <reference id="1174650432090" name="applicableNode" index="1YBMHb" />
      </concept>
      <concept id="1174657487114" name="jetbrains.mps.lang.typesystem.structure.TypeOfExpression" flags="nn" index="1Z2H0r">
        <child id="1174657509053" name="term" index="1Z2MuG" />
      </concept>
      <concept id="1174658326157" name="jetbrains.mps.lang.typesystem.structure.CreateEquationStatement" flags="nn" index="1Z5TYs" />
      <concept id="1174660718586" name="jetbrains.mps.lang.typesystem.structure.AbstractEquationStatement" flags="nn" index="1Zf1VF">
        <child id="1174660783413" name="leftExpression" index="1ZfhK$" />
        <child id="1174660783414" name="rightExpression" index="1ZfhKB" />
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
  <node concept="1YbPZF" id="1xAzJ9KEaUD">
    <property role="TrG5h" value="typeof_VaccinationStatus" />
    <property role="3GE5qa" value="Attributes.PatientProperties.VaccinatedAttributes" />
    <node concept="3clFbS" id="1xAzJ9KEaUE" role="18ibNy">
      <node concept="1Z5TYs" id="1xAzJ9KEbbT" role="3cqZAp">
        <node concept="mw_s8" id="1xAzJ9KEbbW" role="1ZfhK$">
          <node concept="1Z2H0r" id="1xAzJ9KEaUK" role="mwGJk">
            <node concept="1YBJjd" id="1xAzJ9KEaWC" role="1Z2MuG">
              <ref role="1YBMHb" node="1xAzJ9KEaUG" resolve="vaccinationStatus" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="1xAzJ9KEbdy" role="1ZfhKB">
          <node concept="2pJPEk" id="1xAzJ9KEbej" role="mwGJk">
            <node concept="2pJPED" id="1xAzJ9LVd4K" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:4rZeNQ6OYR8" resolve="StringLiteral" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1xAzJ9KEaUG" role="1YuTPh">
      <property role="TrG5h" value="vaccinationStatus" />
      <ref role="1YaFvo" to="e88n:1xAzJ9JLx51" resolve="VaccinationStatus" />
    </node>
  </node>
  <node concept="1YbPZF" id="1xAzJ9KVgCX">
    <property role="TrG5h" value="typeof_PatientPropertyConditional" />
    <property role="3GE5qa" value="Expressions.Conditions" />
    <node concept="3clFbS" id="1xAzJ9KVgCY" role="18ibNy">
      <node concept="1Z5TYs" id="1xAzJ9KVh8C" role="3cqZAp">
        <node concept="mw_s8" id="1xAzJ9KVh8D" role="1ZfhK$">
          <node concept="1Z2H0r" id="1xAzJ9KVh8E" role="mwGJk">
            <node concept="1YBJjd" id="1xAzJ9KVhbd" role="1Z2MuG">
              <ref role="1YBMHb" node="1xAzJ9KVgD0" resolve="patientPropertyConditional" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="1xAzJ9KVh8G" role="1ZfhKB">
          <node concept="2pJPEk" id="1xAzJ9KVh8H" role="mwGJk">
            <node concept="2pJPED" id="1xAzJ9KVh8I" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1xAzJ9KVgD0" role="1YuTPh">
      <property role="TrG5h" value="patientPropertyConditional" />
      <ref role="1YaFvo" to="e88n:1xAzJ9KVg_D" resolve="PatientPropertyConditional" />
    </node>
  </node>
  <node concept="1YbPZF" id="1xAzJ9LYdgd">
    <property role="TrG5h" value="typeof_Unvaccinated" />
    <property role="3GE5qa" value="Attributes.PatientProperties.VaccinatedAttributes" />
    <node concept="3clFbS" id="1xAzJ9LYdge" role="18ibNy">
      <node concept="1Z5TYs" id="1xAzJ9LYdgk" role="3cqZAp">
        <node concept="mw_s8" id="1xAzJ9LYdgl" role="1ZfhK$">
          <node concept="1Z2H0r" id="1xAzJ9LYdgm" role="mwGJk">
            <node concept="1YBJjd" id="1xAzJ9LYdiN" role="1Z2MuG">
              <ref role="1YBMHb" node="1xAzJ9LYdgg" resolve="unvaccinated" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="1xAzJ9LYdgo" role="1ZfhKB">
          <node concept="2pJPEk" id="1xAzJ9LYdgp" role="mwGJk">
            <node concept="2pJPED" id="1xAzJ9LYdgq" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:4rZeNQ6OYR8" resolve="StringLiteral" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1xAzJ9LYdgg" role="1YuTPh">
      <property role="TrG5h" value="unvaccinated" />
      <ref role="1YaFvo" to="e88n:1xAzJ9JLx5B" resolve="Unvaccinated" />
    </node>
  </node>
  <node concept="1YbPZF" id="4EKCctwQqDu">
    <property role="TrG5h" value="typeof_LocationCapacityCondition" />
    <property role="3GE5qa" value="Expressions.Conditions" />
    <node concept="3clFbS" id="4EKCctwQqDv" role="18ibNy">
      <node concept="1Z5TYs" id="4EKCctwQqDR" role="3cqZAp">
        <node concept="mw_s8" id="4EKCctwQqDS" role="1ZfhK$">
          <node concept="1Z2H0r" id="4EKCctwQqDT" role="mwGJk">
            <node concept="1YBJjd" id="4EKCctwQqEp" role="1Z2MuG">
              <ref role="1YBMHb" node="4EKCctwQqDx" resolve="locationCapacityCondition" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="4EKCctwQqDV" role="1ZfhKB">
          <node concept="2pJPEk" id="4EKCctwQqDW" role="mwGJk">
            <node concept="2pJPED" id="4EKCctwQqDX" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="4EKCctwQqDx" role="1YuTPh">
      <property role="TrG5h" value="locationCapacityCondition" />
      <ref role="1YaFvo" to="e88n:4EKCctwQp7G" resolve="LocationCapacityCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="3JSrgvMffwG">
    <property role="TrG5h" value="typeof_ResourceAvailableCondition" />
    <property role="3GE5qa" value="Expressions.Conditions" />
    <node concept="3clFbS" id="3JSrgvMffwH" role="18ibNy">
      <node concept="1Z5TYs" id="3JSrgvMffwN" role="3cqZAp">
        <node concept="mw_s8" id="3JSrgvMffwO" role="1ZfhK$">
          <node concept="1Z2H0r" id="3JSrgvMffwP" role="mwGJk">
            <node concept="1YBJjd" id="3JSrgvMffxS" role="1Z2MuG">
              <ref role="1YBMHb" node="3JSrgvMffwJ" resolve="resourceAvailableCondition" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="3JSrgvMffwR" role="1ZfhKB">
          <node concept="2pJPEk" id="3JSrgvMffwS" role="mwGJk">
            <node concept="2pJPED" id="3JSrgvMffwT" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3JSrgvMffwJ" role="1YuTPh">
      <property role="TrG5h" value="resourceAvailableCondition" />
      <ref role="1YaFvo" to="e88n:3JSrgvMff0N" resolve="ResourceAvailableCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="3JSrgvO6fys">
    <property role="TrG5h" value="typeof_TimeOfDayCondition" />
    <property role="3GE5qa" value="Expressions.Conditions" />
    <node concept="3clFbS" id="3JSrgvO6fyt" role="18ibNy">
      <node concept="1Z5TYs" id="3JSrgvO6fyz" role="3cqZAp">
        <node concept="mw_s8" id="3JSrgvO6fy$" role="1ZfhK$">
          <node concept="1Z2H0r" id="3JSrgvO6fy_" role="mwGJk">
            <node concept="1YBJjd" id="3JSrgvO6fz5" role="1Z2MuG">
              <ref role="1YBMHb" node="3JSrgvO6fyv" resolve="timeOfDayCondition" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="3JSrgvO6fyB" role="1ZfhKB">
          <node concept="2pJPEk" id="3JSrgvO6fyC" role="mwGJk">
            <node concept="2pJPED" id="3JSrgvO6fyD" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="3JSrgvO6fyv" role="1YuTPh">
      <property role="TrG5h" value="timeOfDayCondition" />
      <ref role="1YaFvo" to="e88n:3JSrgvO6fgX" resolve="TimeOfDayCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="4ePomJhOlQa">
    <property role="TrG5h" value="typeof_RoomTypeCondition" />
    <property role="3GE5qa" value="RoomSelection" />
    <node concept="3clFbS" id="4ePomJhOlQb" role="18ibNy">
      <node concept="1Z5TYs" id="3d01stCgWV5" role="3cqZAp">
        <node concept="mw_s8" id="3d01stCgWV6" role="1ZfhKB">
          <node concept="2pJPEk" id="3d01stCgWV7" role="mwGJk">
            <node concept="2pJPED" id="3d01stCgWV8" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="3d01stCgWV9" role="1ZfhK$">
          <node concept="1Z2H0r" id="3d01stCgWVa" role="mwGJk">
            <node concept="1YBJjd" id="4ePomJhOlRu" role="1Z2MuG">
              <ref role="1YBMHb" node="4ePomJhOlQd" resolve="roomTypeCondition" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="4ePomJhOlQd" role="1YuTPh">
      <property role="TrG5h" value="roomTypeCondition" />
      <ref role="1YaFvo" to="e88n:4ePomJhOliH" resolve="RoomTypeCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="sr1c8P9h2O">
    <property role="TrG5h" value="typeof_PatientSeverity" />
    <property role="3GE5qa" value="Attributes.PatientProperties.PatientSeverity" />
    <node concept="3clFbS" id="sr1c8P9h2P" role="18ibNy">
      <node concept="1Z5TYs" id="1ofb2Ww00IW" role="3cqZAp">
        <node concept="mw_s8" id="1ofb2Ww00Jg" role="1ZfhKB">
          <node concept="2pJPEk" id="1ofb2Ww00Jc" role="mwGJk">
            <node concept="2pJPED" id="1xAzJ9MuxEH" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:4rZeNQ6OYR8" resolve="StringLiteral" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="1ofb2Ww00IZ" role="1ZfhK$">
          <node concept="1Z2H0r" id="1ofb2Ww00v6" role="mwGJk">
            <node concept="1YBJjd" id="sr1c8P9h3C" role="1Z2MuG">
              <ref role="1YBMHb" node="sr1c8P9h2R" resolve="patientSeverity" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="sr1c8P9h2R" role="1YuTPh">
      <property role="TrG5h" value="patientSeverity" />
      <ref role="1YaFvo" to="e88n:sr1c8P9fkH" resolve="PatientSeverity" />
    </node>
  </node>
  <node concept="1YbPZF" id="i1eH3WpcqG">
    <property role="TrG5h" value="typeof_ProbabilityCondition" />
    <property role="3GE5qa" value="Expressions.Conditions" />
    <node concept="3clFbS" id="i1eH3WpcqH" role="18ibNy">
      <node concept="1Z5TYs" id="i1eH3WpcqW" role="3cqZAp">
        <node concept="mw_s8" id="i1eH3WpcqX" role="1ZfhK$">
          <node concept="1Z2H0r" id="i1eH3WpcqY" role="mwGJk">
            <node concept="1YBJjd" id="i1eH3WpcrB" role="1Z2MuG">
              <ref role="1YBMHb" node="i1eH3WpcqJ" resolve="probabilityCondition" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="i1eH3Wpcr0" role="1ZfhKB">
          <node concept="2pJPEk" id="i1eH3Wpcr1" role="mwGJk">
            <node concept="2pJPED" id="i1eH3Wpcr2" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="i1eH3WpcqJ" role="1YuTPh">
      <property role="TrG5h" value="probabilityCondition" />
      <ref role="1YaFvo" to="e88n:i1eH3Wpca0" resolve="ProbabilityCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="1MmdcHbXLhT">
    <property role="TrG5h" value="typeof_BranchConditional" />
    <property role="3GE5qa" value="Expressions" />
    <node concept="3clFbS" id="1MmdcHbXLhU" role="18ibNy">
      <node concept="1Z5TYs" id="1MmdcHbXLkd" role="3cqZAp">
        <node concept="mw_s8" id="1MmdcHbXLke" role="1ZfhK$">
          <node concept="1Z2H0r" id="1MmdcHbXLkf" role="mwGJk">
            <node concept="1YBJjd" id="1MmdcHbXLkJ" role="1Z2MuG">
              <ref role="1YBMHb" node="1MmdcHbXLhW" resolve="branchConditional" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="1MmdcHbXLkh" role="1ZfhKB">
          <node concept="2pJPEk" id="1MmdcHbXLki" role="mwGJk">
            <node concept="2pJPED" id="1MmdcHbXLkj" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="1MmdcHbXLhW" role="1YuTPh">
      <property role="TrG5h" value="branchConditional" />
      <ref role="1YaFvo" to="e88n:1xAzJ9JDBLw" resolve="BranchConditional" />
    </node>
  </node>
  <node concept="1YbPZF" id="7hL7ecKWoj_">
    <property role="TrG5h" value="typeof_PatientCohortCondition" />
    <property role="3GE5qa" value="Expressions.Conditions" />
    <node concept="3clFbS" id="7hL7ecKWojA" role="18ibNy">
      <node concept="1Z5TYs" id="7hL7ecKWojG" role="3cqZAp">
        <node concept="mw_s8" id="7hL7ecKWojH" role="1ZfhK$">
          <node concept="1Z2H0r" id="7hL7ecKWojI" role="mwGJk">
            <node concept="1YBJjd" id="7hL7ecKWojJ" role="1Z2MuG">
              <ref role="1YBMHb" node="7hL7ecKWojC" resolve="patientCohortCondition" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7hL7ecKWojK" role="1ZfhKB">
          <node concept="2pJPEk" id="7hL7ecKWojL" role="mwGJk">
            <node concept="2pJPED" id="7hL7ecKWojM" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7hL7ecKWojC" role="1YuTPh">
      <property role="TrG5h" value="patientCohortCondition" />
      <ref role="1YaFvo" to="e88n:7hL7ecKWo9q" resolve="PatientCohortCondition" />
    </node>
  </node>
  <node concept="1YbPZF" id="7hL7ecMntla">
    <property role="TrG5h" value="typeof_AndConditional" />
    <property role="3GE5qa" value="Expressions.Conditions.LogicalOperators" />
    <node concept="3clFbS" id="7hL7ecMntlb" role="18ibNy">
      <node concept="1Z5TYs" id="7hL7ecMntlW" role="3cqZAp">
        <node concept="mw_s8" id="7hL7ecMntlX" role="1ZfhK$">
          <node concept="1Z2H0r" id="7hL7ecMntlY" role="mwGJk">
            <node concept="1YBJjd" id="7hL7ecMntlZ" role="1Z2MuG">
              <ref role="1YBMHb" node="7hL7ecMntld" resolve="andConditional" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7hL7ecMntm0" role="1ZfhKB">
          <node concept="2pJPEk" id="7hL7ecMntm1" role="mwGJk">
            <node concept="2pJPED" id="7hL7ecMntm2" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7hL7ecMntld" role="1YuTPh">
      <property role="TrG5h" value="andConditional" />
      <ref role="1YaFvo" to="e88n:7hL7ecLXnQQ" resolve="AndConditional" />
    </node>
  </node>
  <node concept="1YbPZF" id="7hL7ecMntnd">
    <property role="TrG5h" value="typeof_OrConditional" />
    <property role="3GE5qa" value="Expressions.Conditions.LogicalOperators" />
    <node concept="3clFbS" id="7hL7ecMntne" role="18ibNy">
      <node concept="1Z5TYs" id="7hL7ecMntnk" role="3cqZAp">
        <node concept="mw_s8" id="7hL7ecMntnl" role="1ZfhK$">
          <node concept="1Z2H0r" id="7hL7ecMntnm" role="mwGJk">
            <node concept="1YBJjd" id="7hL7ecMntnn" role="1Z2MuG">
              <ref role="1YBMHb" node="7hL7ecMntng" resolve="orConditional" />
            </node>
          </node>
        </node>
        <node concept="mw_s8" id="7hL7ecMntno" role="1ZfhKB">
          <node concept="2pJPEk" id="7hL7ecMntnp" role="mwGJk">
            <node concept="2pJPED" id="7hL7ecMntnq" role="2pJPEn">
              <ref role="2pJxaS" to="5qo5:6sdnDbSlaon" resolve="BooleanType" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="1YaCAy" id="7hL7ecMntng" role="1YuTPh">
      <property role="TrG5h" value="orConditional" />
      <ref role="1YaFvo" to="e88n:7hL7ecM2uaI" resolve="OrConditional" />
    </node>
  </node>
</model>

