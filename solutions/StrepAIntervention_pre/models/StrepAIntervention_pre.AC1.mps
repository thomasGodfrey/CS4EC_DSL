<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:a0ad5691-4a34-473a-83c1-cb5043f546fd(StrepAIntervention_pre.AC1)">
  <persistence version="9" />
  <attribute name="doNotGenerate" value="false" />
  <languages>
    <use id="7dcff301-ba01-414e-8574-a8f6da31876b" name="AgentLanguage" version="1" />
    <use id="b3cac82c-d024-46bc-b485-624ad80c3cc2" name="ActionCards" version="1" />
    <use id="8ca79d43-eb45-4791-bdd4-0d6130ff895b" name="de.itemis.mps.editor.diagram.layout" version="0" />
    <use id="cfaa4966-b7d5-4b69-b66a-309a6e1a7290" name="org.iets3.core.expr.base" version="3" />
    <use id="1a0150ac-dda5-4129-824e-01dce96fdea4" name="BuiltEnvironment" version="1" />
    <use id="bb69d087-96cc-48ca-aeb6-c2cb27e532b0" name="DiseaseModel" version="0" />
    <engage id="30254c5b-f87e-4bb3-a60a-77a7ec6ed411" name="org.iets3.core.expr.genjava.base" />
    <engage id="5a0b0b9c-ca67-4d27-9caa-ec974d9cfa40" name="org.iets3.core.expr.genjava.simpleTypes" />
    <devkit ref="68431102-8c53-4b26-b93f-2e7c57674ca6(NewDevkit)" />
  </languages>
  <imports>
    <import index="2jw" ref="r:89d28cee-e63f-45c3-83da-f519738636d8(org.iets3.core.expr.genjava.simpleTypes.typesystem)" />
    <import index="lltn" ref="r:d1dbd56f-9eb3-425c-aec9-c5f47b537d7c(StThomasDiseaseSpread.AC1)" implicit="true" />
  </imports>
  <registry>
    <language id="b3cac82c-d024-46bc-b485-624ad80c3cc2" name="ActionCards">
      <concept id="7169358838266389176" name="ActionCards.structure.PatientArrivals" flags="ng" index="25k$Xo">
        <child id="2876623929997960145" name="PatientArrivalLines" index="c0n7C" />
        <child id="768972137592763856" name="ArrivalLocation" index="2PM4n5" />
      </concept>
      <concept id="2876623929997959972" name="ActionCards.structure.PatientArrivalLine" flags="ng" index="c0n4t">
        <property id="2876623929997959984" name="NumPatientsInHour" index="c0n49" />
      </concept>
      <concept id="5402567240278617686" name="ActionCards.structure.EDScenario" flags="ng" index="2_0uwh">
        <property id="5729391434181383388" name="runDuration" index="i3JvV" />
        <property id="3785632457359082556" name="simulation_repetitions" index="2rAC2l" />
        <property id="8998806958909918627" name="secondsPerTick" index="wKqbz" />
        <child id="5402567240278617764" name="staffNumbers" index="2_0uzz" />
      </concept>
      <concept id="5402567240278617723" name="ActionCards.structure.StaffNumber" flags="ng" index="2_0uwW">
        <property id="5402567240278617733" name="number" index="2_0uz2" />
        <reference id="5402567240278617735" name="staff" index="2_0uz0" />
      </concept>
      <concept id="5402567240276654720" name="ActionCards.structure.StaffTypeReference" flags="ng" index="2_8ZN7">
        <reference id="5402567240276654757" name="staffType" index="2_8ZNy" />
      </concept>
      <concept id="3787511550160215531" name="ActionCards.structure.ActionCardElement" flags="ng" index="_sILr">
        <child id="3787511550169010962" name="outgoingBranches" index="A3aay" />
      </concept>
      <concept id="147289298423155117" name="ActionCards.structure.TimeDistributionLine" flags="ng" index="_GsXV">
        <property id="147289298423155120" name="Occurances" index="_GsXA" />
        <property id="147289298423155118" name="Time" index="_GsXS" />
      </concept>
      <concept id="147289298423155114" name="ActionCards.structure.TimeDistributionTable" flags="ng" index="_GsXW">
        <child id="147289298423155115" name="timeLines" index="_GsXX" />
      </concept>
      <concept id="5710949967853733612" name="ActionCards.structure.StaffType" flags="ng" index="2GGxxg">
        <property id="2059891927260254807" name="colour" index="1kBeqs" />
        <property id="324605317393027070" name="patientLimit" index="3ZUNkI" />
        <child id="4443718667985551902" name="idleLocation" index="2iD$2b" />
      </concept>
      <concept id="5710949967853733230" name="ActionCards.structure.Branch" flags="ng" index="2GGxJi">
        <reference id="5710949967853733298" name="targetAction" index="2GGxGe" />
        <reference id="188877551436935094" name="fromAction" index="3tVEyn" />
        <child id="2698877061866373100" name="condition" index="1hyIAf" />
      </concept>
      <concept id="512008214798467707" name="ActionCards.structure.PatientSeverity_Low" flags="ng" index="MfwqT" />
      <concept id="512008214798455935" name="ActionCards.structure.PatientSeverityProperty" flags="ng" index="MfX2X" />
      <concept id="512008214798463870" name="ActionCards.structure.PatientSeverity_Severe" flags="ng" index="MfZuW" />
      <concept id="512008214798466923" name="ActionCards.structure.Patient_Severity_Moderate" flags="ng" index="MfZID" />
      <concept id="3383707102503528548" name="ActionCards.structure.Action" flags="ng" index="2MhjZa">
        <property id="4544390881339097912" name="requiresPatient" index="3lFixl" />
        <child id="5402567240276710649" name="staffTypeReference" index="2_8HaY" />
        <child id="4544390881338972165" name="location" index="3lENdC" />
        <child id="6963522544237016585" name="duration" index="1M293l" />
      </concept>
      <concept id="3383707102503528520" name="ActionCards.structure.ActionCard" flags="ng" index="2MhjZA">
        <child id="3383707102503528567" name="Actions" index="2MhjZp" />
        <child id="1758249876506198949" name="UsageCondition" index="1FS4Pn" />
        <child id="1758249876539405691" name="ActionCardReferences" index="1HTZI9" />
      </concept>
      <concept id="768972137579180806" name="ActionCards.structure.PatientProfile" flags="ng" index="2OfScj">
        <child id="768972137579221593" name="attributes" index="2OfI9c" />
        <child id="768972137579221632" name="arrivalRate" index="2OfIal" />
        <child id="1758249876507806175" name="attendanceRoute" index="1FYssH" />
      </concept>
      <concept id="2698877061888154208" name="ActionCards.structure.AttributeTable" flags="ng" index="1jfOK3">
        <reference id="324605317397241619" name="patientProperty" index="3ZaQn3" />
        <child id="2698877061888154322" name="attributeLines" index="1jfOML" />
        <child id="1758249876434524682" name="patientProperty" index="1R9TjS" />
      </concept>
      <concept id="2698877061888154236" name="ActionCards.structure.AttributeLine" flags="ng" index="1jfOKv">
        <property id="6755843002504464496" name="prevalence" index="3JlXGq" />
        <child id="6755843002504464494" name="possibleValue" index="3JlXG4" />
      </concept>
      <concept id="7828349744265630201" name="ActionCards.structure.SymptomList" flags="ng" index="3oQJd$">
        <child id="7828349744265630211" name="symptoms" index="3oQJ2u" />
      </concept>
      <concept id="1758249876462569833" name="ActionCards.structure.PatientPropertyConditional" flags="ng" index="1CySur">
        <reference id="1758249876465254186" name="patientProperty" index="1DsR7o" />
        <child id="1758249876462569987" name="checkValue" index="1CySjL" />
      </concept>
      <concept id="1758249876500222036" name="ActionCards.structure.RecentCovidContactProperty" flags="ng" index="1FjhUA" />
      <concept id="1758249876500231394" name="ActionCards.structure.Yes" flags="ng" index="1FjjCg" />
      <concept id="1758249876500231396" name="ActionCards.structure.No" flags="ng" index="1FjjCm" />
      <concept id="1758249876510071738" name="ActionCards.structure.AttendanceRouteCondition" flags="ng" index="1FDPl8">
        <child id="1758249876530420347" name="attendanceRoute" index="1GBHi9" />
      </concept>
      <concept id="1758249876508941937" name="ActionCards.structure.ElectiveAttendanceRoute" flags="ng" index="1FPx23" />
      <concept id="1758249876508941398" name="ActionCards.structure.EmergencyAttendanceRoute" flags="ng" index="1FPxa$" />
      <concept id="1758249876506201858" name="ActionCards.structure.ActionCardCondition" flags="ng" index="1FS47K">
        <child id="1758249876506201859" name="condition" index="1FS47L" />
      </concept>
      <concept id="1758249876538241356" name="ActionCards.structure.DischargeAction" flags="ng" index="1H2jYY" />
      <concept id="1758249876537114910" name="ActionCards.structure.ImmunosuppressedProperty" flags="ng" index="1He0ZG" />
      <concept id="1758249876539396808" name="ActionCards.structure.ActionCardReference" flags="ng" index="1HTXKU">
        <reference id="1758249876539396856" name="actionCard" index="1HTXKa" />
      </concept>
      <concept id="6963522544237023781" name="ActionCards.structure.ActionDurationMinutes" flags="ng" index="1M3RjT">
        <property id="6963522544237023782" name="duration" index="1M3RjU" />
      </concept>
      <concept id="1758249876434336588" name="ActionCards.structure.IPatientProperty" flags="ng" index="1RmbmY">
        <property id="1758249876463009196" name="name" index="1C_jdu" />
        <child id="1758249876434482727" name="possibleValues" index="1R9Jzl" />
      </concept>
      <concept id="1758249876434350217" name="ActionCards.structure.InfectionStatusProperty" flags="ng" index="1RmfTV">
        <reference id="1758249876434489739" name="disease" index="1R9xXT" />
      </concept>
      <concept id="324605317397238451" name="ActionCards.structure.Patient" flags="ng" index="3ZaQxz">
        <child id="324605317397238461" name="patientProperty" index="3ZaQxH" />
      </concept>
    </language>
    <language id="7dcff301-ba01-414e-8574-a8f6da31876b" name="AgentLanguage">
      <concept id="6750846609956093098" name="AgentLanguage.structure.RoomTypeReference" flags="ng" index="UeIYj">
        <reference id="6750846609956389136" name="roomType" index="Udx8D" />
      </concept>
      <concept id="8465466444624057771" name="AgentLanguage.structure.OccupiableReference" flags="ng" index="1kHjla">
        <reference id="3535684625553292470" name="occupiable" index="IYbFp" />
      </concept>
    </language>
    <language id="cfaa4966-b7d5-4b69-b66a-309a6e1a7290" name="org.iets3.core.expr.base">
      <concept id="5115872837156723899" name="org.iets3.core.expr.base.structure.LogicalOrExpression" flags="ng" index="30deu6" />
      <concept id="5115872837156576277" name="org.iets3.core.expr.base.structure.BinaryExpression" flags="ng" index="30dEsC">
        <child id="5115872837156576280" name="right" index="30dEs_" />
        <child id="5115872837156576278" name="left" index="30dEsF" />
      </concept>
    </language>
    <language id="bb69d087-96cc-48ca-aeb6-c2cb27e532b0" name="DiseaseModel">
      <concept id="2698877061875544082" name="DiseaseModel.structure.Disease" flags="ng" index="1gZIpL" />
      <concept id="7828349744265630002" name="DiseaseModel.structure.DiseaseSymptom" flags="ng" index="3oQJeJ" />
      <concept id="6755843002512513355" name="DiseaseModel.structure.Asymptomatic" flags="ng" index="3IO8Cx" />
      <concept id="6755843002512513317" name="DiseaseModel.structure.Susceptible" flags="ng" index="3IO8Df" />
      <concept id="6755843002512513336" name="DiseaseModel.structure.Symptomatic" flags="ng" index="3IO8Di" />
    </language>
    <language id="1a0150ac-dda5-4129-824e-01dce96fdea4" name="BuiltEnvironment">
      <concept id="3535684625554910547" name="BuiltEnvironment.structure.OccupiableAllocation" flags="ng" index="h4YGW">
        <property id="3535684625555883197" name="y" index="h0cbi" />
        <property id="3535684625554910575" name="x" index="h4YG0" />
        <reference id="3535684625554910577" name="occupiable" index="h4YGu" />
      </concept>
      <concept id="4334763093661093957" name="BuiltEnvironment.structure.RoomInstanceDefinition" flags="ng" index="j3bLk">
        <property id="5292086088997749628" name="capacity" index="m3wsY" />
        <property id="5292086088997743941" name="width" index="m3A$7" />
        <property id="5292086088997743945" name="height" index="m3A$b" />
        <property id="5292086088994139263" name="x" index="memwX" />
        <property id="5292086088994139265" name="y" index="memz3" />
        <property id="7350611177167876547" name="colour" index="376uKC" />
        <reference id="6750846609945116617" name="roomType" index="VgANK" />
        <child id="3535684625554910786" name="occupiables" index="h4YwH" />
      </concept>
      <concept id="4334763093661094018" name="BuiltEnvironment.structure.Area" flags="ng" index="j3bMj">
        <child id="4334763093661094019" name="rooms" index="j3bMi" />
      </concept>
      <concept id="1195759192913398353" name="BuiltEnvironment.structure.WallDefinition" flags="ng" index="2q6JFR">
        <child id="1195759192913398356" name="walls" index="2q6JFM" />
      </concept>
      <concept id="1195759192912732648" name="BuiltEnvironment.structure.WallInstanceDefinition" flags="ng" index="2qS95e">
        <property id="1195759192912732653" name="yStart" index="2qS95b" />
        <property id="1195759192912732651" name="xStart" index="2qS95d" />
        <property id="1195759192912732660" name="yEnd" index="2qS95i" />
        <property id="1195759192912732656" name="xEnd" index="2qS95m" />
      </concept>
      <concept id="3535684625548435523" name="BuiltEnvironment.structure.OccupiableDefinition" flags="ng" index="IzEoG">
        <property id="3535684625548435535" name="name" index="IzEow" />
      </concept>
      <concept id="768972137583559191" name="BuiltEnvironment.structure.MapImporter" flags="ng" index="2Ovb82">
        <reference id="768972137583559222" name="targetContainer" index="2Ovb8z" />
        <child id="768972137592500155" name="sourceFile" index="2PX5YI" />
      </concept>
      <concept id="6750846609944804889" name="BuiltEnvironment.structure.RoomType" flags="ng" index="VhMOw">
        <child id="5626228425383343645" name="PatientOccupiable" index="3IeprG" />
      </concept>
    </language>
    <language id="d3a0fd26-445a-466c-900e-10444ddfed52" name="com.mbeddr.mpsutil.filepicker">
      <concept id="6156524541422549000" name="com.mbeddr.mpsutil.filepicker.structure.AbstractPicker" flags="ng" index="3N1QpV">
        <property id="6156524541422553710" name="path" index="3N1Lgt" />
      </concept>
      <concept id="1504214765033455826" name="com.mbeddr.mpsutil.filepicker.structure.FileSystemFilePicker" flags="ng" index="3VlSI9" />
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1133920641626" name="jetbrains.mps.lang.core.structure.BaseConcept" flags="ng" index="2VYdi">
        <property id="1193676396447" name="virtualPackage" index="3GE5qa" />
        <child id="5169995583184591170" name="smodelAttribute" index="lGtFl" />
      </concept>
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="8ca79d43-eb45-4791-bdd4-0d6130ff895b" name="de.itemis.mps.editor.diagram.layout">
      <concept id="6720495385597071406" name="de.itemis.mps.editor.diagram.layout.structure.Layout_Box" flags="ng" index="gqqVs">
        <property id="6720495385597071504" name="bounds_height" index="gqqTy" />
        <property id="6720495385597071502" name="bounds_y" index="gqqTW" />
        <property id="6720495385597071503" name="bounds_width" index="gqqTX" />
        <property id="6720495385597071501" name="bounds_x" index="gqqTZ" />
        <property id="4583510071007917016" name="transform" index="TgtnS" />
      </concept>
      <concept id="2319506556913310852" name="de.itemis.mps.editor.diagram.layout.structure.Layout_Connection" flags="ng" index="2VclpC">
        <child id="2319506556913311101" name="anchors" index="2Vcluh" />
      </concept>
      <concept id="2319506556913310727" name="de.itemis.mps.editor.diagram.layout.structure.Point" flags="ng" index="2VclrF">
        <property id="2319506556913310861" name="x" index="2Vclpx" />
        <property id="2319506556913310863" name="y" index="2Vclpz" />
      </concept>
      <concept id="8963411245960991886" name="de.itemis.mps.editor.diagram.layout.structure.LayoutMap" flags="ng" index="37mRI7">
        <child id="8963411245960991904" name="entries" index="37mRID" />
      </concept>
      <concept id="8963411245960991903" name="de.itemis.mps.editor.diagram.layout.structure.LayoutMapEntry" flags="ng" index="37mRIm">
        <property id="8963411245960998400" name="key" index="37mO49" />
        <child id="8963411245960998404" name="value" index="37mO4d" />
      </concept>
    </language>
  </registry>
  <node concept="2GGxxg" id="av1M7vbJYz">
    <property role="TrG5h" value="MajorsDoctor" />
    <property role="3GE5qa" value="Staff" />
    <property role="3ZUNkI" value="5" />
    <property role="1kBeqs" value="6o2BuIx6R5m/RED" />
    <node concept="UeIYj" id="34hhAWvhKM1" role="2iD$2b">
      <ref role="Udx8D" node="EFW1mYOHdO" resolve="WaitingRoom" />
    </node>
  </node>
  <node concept="2_0uwh" id="EFW1mYe4_u">
    <property role="3GE5qa" value="Simulation Scenario" />
    <property role="i3JvV" value="7" />
    <property role="wKqbz" value="1" />
    <property role="2rAC2l" value="10" />
    <node concept="2_0uwW" id="EFW1mYe4_C" role="2_0uzz">
      <property role="2_0uz2" value="3" />
      <ref role="2_0uz0" node="av1M7vbJYz" resolve="MajorsDoctor" />
    </node>
    <node concept="2_0uwW" id="5Lup6bkacRf" role="2_0uzz">
      <property role="2_0uz2" value="4" />
      <ref role="2_0uz0" node="2_JteYPiCHe" resolve="MajorsNurse" />
    </node>
    <node concept="2_0uwW" id="5Lup6bkacRn" role="2_0uzz">
      <property role="2_0uz2" value="5" />
      <ref role="2_0uz0" node="2_JteYPiCG6" resolve="TriageNurse" />
    </node>
    <node concept="2_0uwW" id="1xAzJ9P173A" role="2_0uzz">
      <property role="2_0uz2" value="3" />
      <ref role="2_0uz0" node="1xAzJ9NxGdV" resolve="MinorsNurse" />
    </node>
    <node concept="2_0uwW" id="3mDt9dit_I3" role="2_0uzz">
      <property role="2_0uz2" value="2" />
      <ref role="2_0uz0" node="52K8Ej3GgM" resolve="SeniorDoc" />
    </node>
    <node concept="2_0uwW" id="i1eH3VeDUS" role="2_0uzz">
      <property role="2_0uz2" value="2" />
      <ref role="2_0uz0" node="i1eH3VeDCH" resolve="MinorsDoctor" />
    </node>
  </node>
  <node concept="2Ovb82" id="EFW1mZonCG">
    <property role="TrG5h" value="EDMapImporter" />
    <property role="3GE5qa" value="ED Layout" />
    <ref role="2Ovb8z" node="EFW1mZkn0D" resolve="EmergencyDepartment" />
    <node concept="3VlSI9" id="EFW1mZonD8" role="2PX5YI">
      <property role="3N1Lgt" value="C:/Users/w2037451/Documents/HelloAgent/solutions/ActionCardWinter2021/StThomasEDMap2.json" />
    </node>
  </node>
  <node concept="2GGxxg" id="2_JteYPiCG6">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="TriageNurse" />
    <property role="3ZUNkI" value="0" />
    <property role="1kBeqs" value="6o2BuIx6R5D/YELLOW" />
  </node>
  <node concept="2GGxxg" id="2_JteYPiCHe">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="MajorsNurse" />
    <property role="3ZUNkI" value="5" />
    <property role="1kBeqs" value="6o2BuIx6R5n/GREEN" />
    <node concept="UeIYj" id="i1eH3VeDCF" role="2iD$2b">
      <ref role="Udx8D" node="EFW1mYOHdO" resolve="WaitingRoom" />
    </node>
  </node>
  <node concept="2GGxxg" id="52K8Ej3GgM">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="SeniorDoc" />
    <property role="3ZUNkI" value="0" />
    <property role="1kBeqs" value="6o2BuIx6R5u/GRAY" />
  </node>
  <node concept="3oQJd$" id="6MzSDQOvLH$">
    <property role="3GE5qa" value="Diseases" />
    <node concept="3oQJeJ" id="6MzSDQOvLHI" role="3oQJ2u">
      <property role="TrG5h" value="Cough" />
    </node>
    <node concept="3oQJeJ" id="5R1$QENZiLL" role="3oQJ2u">
      <property role="TrG5h" value="Sore throat" />
    </node>
    <node concept="3oQJeJ" id="5R1$QENZiLO" role="3oQJ2u">
      <property role="TrG5h" value="Fever" />
    </node>
    <node concept="3oQJeJ" id="5R1$QEO4Qbe" role="3oQJ2u">
      <property role="TrG5h" value="Loss of taste" />
    </node>
    <node concept="3oQJeJ" id="5R1$QEO4Qbj" role="3oQJ2u">
      <property role="TrG5h" value="Loss of smell" />
    </node>
  </node>
  <node concept="2OfScj" id="1xAzJ9Ksr_q">
    <property role="TrG5h" value="patient" />
    <node concept="1jfOK3" id="i1eH3VeD_s" role="2OfI9c">
      <ref role="3ZaQn3" node="i1eH3VeD_w" />
      <node concept="MfX2X" id="i1eH3VeD_w" role="1R9TjS">
        <property role="1C_jdu" value="PatientSeverity" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeD__" role="1jfOML">
        <property role="3JlXGq" value="15" />
        <node concept="MfZuW" id="i1eH3VeD_x" role="3JlXG4" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeD_A" role="1jfOML">
        <property role="3JlXGq" value="85" />
        <node concept="MfZID" id="i1eH3VeD_y" role="3JlXG4" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeD_B" role="1jfOML">
        <property role="3JlXGq" value="0" />
        <node concept="MfwqT" id="i1eH3VeD_z" role="3JlXG4" />
      </node>
    </node>
    <node concept="1jfOK3" id="i1eH3VeDA8" role="2OfI9c">
      <node concept="1He0ZG" id="i1eH3VeDAk" role="1R9TjS">
        <property role="1C_jdu" value="Immunocompromised" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeDAo" role="1jfOML">
        <property role="3JlXGq" value="20" />
        <node concept="1FjjCg" id="i1eH3VeDAl" role="3JlXG4" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeDAp" role="1jfOML">
        <property role="3JlXGq" value="80" />
        <node concept="1FjjCm" id="i1eH3VeDAm" role="3JlXG4" />
      </node>
    </node>
    <node concept="1jfOK3" id="i1eH3VeDAF" role="2OfI9c">
      <node concept="1FjhUA" id="i1eH3VeDAX" role="1R9TjS">
        <property role="1C_jdu" value="RecentCovidContact" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeDB1" role="1jfOML">
        <property role="3JlXGq" value="50" />
        <node concept="1FjjCg" id="i1eH3VeDAY" role="3JlXG4" />
      </node>
      <node concept="1jfOKv" id="i1eH3VeDB2" role="1jfOML">
        <property role="3JlXGq" value="50" />
        <node concept="1FjjCm" id="i1eH3VeDAZ" role="3JlXG4" />
      </node>
    </node>
    <node concept="25k$Xo" id="EFW1mYBKlW" role="2OfIal">
      <node concept="c0n4t" id="EFW1mYBKm6" role="c0n7C">
        <property role="c0n49" value="2" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKm8" role="c0n7C">
        <property role="c0n49" value="2" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmb" role="c0n7C">
        <property role="c0n49" value="2" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmf" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmk" role="c0n7C">
        <property role="c0n49" value="2" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmq" role="c0n7C">
        <property role="c0n49" value="2" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmx" role="c0n7C">
        <property role="c0n49" value="6" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmD" role="c0n7C">
        <property role="c0n49" value="6" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmM" role="c0n7C">
        <property role="c0n49" value="6" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKmW" role="c0n7C">
        <property role="c0n49" value="6" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKn7" role="c0n7C">
        <property role="c0n49" value="6" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKnj" role="c0n7C">
        <property role="c0n49" value="6" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKnw" role="c0n7C">
        <property role="c0n49" value="9" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKnI" role="c0n7C">
        <property role="c0n49" value="9" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKnX" role="c0n7C">
        <property role="c0n49" value="9" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKod" role="c0n7C">
        <property role="c0n49" value="9" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKou" role="c0n7C">
        <property role="c0n49" value="9" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKoK" role="c0n7C">
        <property role="c0n49" value="9" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKp3" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKpn" role="c0n7C">
        <property role="c0n49" value="5" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKpG" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKq2" role="c0n7C">
        <property role="c0n49" value="5" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKqp" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="EFW1mYBKqL" role="c0n7C">
        <property role="c0n49" value="5" />
      </node>
      <node concept="UeIYj" id="EFW1mZs4ME" role="2PM4n5">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
    <node concept="1FPxa$" id="1xAzJ9P01j9" role="1FYssH" />
  </node>
  <node concept="2GGxxg" id="1xAzJ9NxGdV">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="MinorsNurse" />
    <property role="3ZUNkI" value="5" />
    <property role="1kBeqs" value="6o2BuIx6R5n/GREEN" />
  </node>
  <node concept="j3bMj" id="EFW1mZkn0D">
    <property role="3GE5qa" value="ED Layout" />
    <property role="TrG5h" value="EmergencyDepartment" />
    <node concept="j3bLk" id="1$AaFX9fw8w" role="j3bMi">
      <property role="TrG5h" value="Entrance" />
      <property role="memwX" value="5" />
      <property role="memz3" value="199" />
      <property role="m3A$7" value="3" />
      <property role="m3A$b" value="1" />
      <property role="m3wsY" value="10000" />
      <property role="376uKC" value="6o2BuIx6R5u/GRAY" />
      <ref role="VgANK" node="EFW1mYOHez" resolve="MainEntrance" />
    </node>
    <node concept="j3bLk" id="1$AaFX9fzfr" role="j3bMi">
      <property role="TrG5h" value="TriageWaitingRoom" />
      <property role="memwX" value="10" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="11" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="10000" />
      <property role="376uKC" value="6o2BuIx6R5u/GRAY" />
      <ref role="VgANK" node="EFW1mYOHdO" resolve="WaitingRoom" />
      <node concept="h4YGW" id="2w4aK2mW$Il" role="h4YwH">
        <property role="h4YG0" value="11" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrwP" role="h4YwH">
        <property role="h4YG0" value="11" />
        <property role="h0cbi" value="197" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrwZ" role="h4YwH">
        <property role="h4YG0" value="11" />
        <property role="h0cbi" value="198" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrxa" role="h4YwH">
        <property role="h4YG0" value="11" />
        <property role="h0cbi" value="199" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="2w4aK2mW$In" role="h4YwH">
        <property role="h4YG0" value="14" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrxK" role="h4YwH">
        <property role="h4YG0" value="14" />
        <property role="h0cbi" value="197" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrxL" role="h4YwH">
        <property role="h4YG0" value="14" />
        <property role="h0cbi" value="198" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrxM" role="h4YwH">
        <property role="h4YG0" value="14" />
        <property role="h0cbi" value="199" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="2w4aK2mW$Iq" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvry8" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="197" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvry9" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="198" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvrya" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="199" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="2w4aK2mW$Iu" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvryo" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="197" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvryp" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="198" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMvryq" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="199" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzfC" role="j3bMi">
      <property role="TrG5h" value="Triage" />
      <property role="memwX" value="10" />
      <property role="memz3" value="190" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="20" />
      <property role="376uKC" value="6o2BuIx6R5q/BLUE" />
      <ref role="VgANK" node="EFW1mYOHdm" resolve="TriageDesk" />
    </node>
    <node concept="j3bLk" id="1$AaFX9fzfw" role="j3bMi">
      <property role="TrG5h" value="MinorsWaitingRoom" />
      <property role="memwX" value="16" />
      <property role="memz3" value="170" />
      <property role="m3A$7" value="11" />
      <property role="m3A$b" value="13" />
      <property role="m3wsY" value="10000" />
      <property role="376uKC" value="6o2BuIx6R5u/GRAY" />
      <ref role="VgANK" node="EFW1mYOHdO" resolve="WaitingRoom" />
      <node concept="h4YGW" id="7WB5kYMwe7N" role="h4YwH">
        <property role="h4YG0" value="25" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe7P" role="h4YwH">
        <property role="h4YG0" value="24" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe7S" role="h4YwH">
        <property role="h4YG0" value="23" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe7W" role="h4YwH">
        <property role="h4YG0" value="22" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8b" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8h" role="h4YwH">
        <property role="h4YG0" value="19" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuvv" role="h4YwH">
        <property role="h4YG0" value="18" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuvZ" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="170" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8o" role="h4YwH">
        <property role="h4YG0" value="25" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8p" role="h4YwH">
        <property role="h4YG0" value="24" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8q" role="h4YwH">
        <property role="h4YG0" value="23" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8r" role="h4YwH">
        <property role="h4YG0" value="22" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8s" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuww" role="h4YwH">
        <property role="h4YG0" value="19" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8t" role="h4YwH">
        <property role="h4YG0" value="18" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuxy" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="173" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8E" role="h4YwH">
        <property role="h4YG0" value="25" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8F" role="h4YwH">
        <property role="h4YG0" value="24" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8G" role="h4YwH">
        <property role="h4YG0" value="23" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8H" role="h4YwH">
        <property role="h4YG0" value="22" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8I" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe8J" role="h4YwH">
        <property role="h4YG0" value="19" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuy5" role="h4YwH">
        <property role="h4YG0" value="18" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuyD" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="176" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe92" role="h4YwH">
        <property role="h4YG0" value="25" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe93" role="h4YwH">
        <property role="h4YG0" value="24" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe94" role="h4YwH">
        <property role="h4YG0" value="23" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe95" role="h4YwH">
        <property role="h4YG0" value="22" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe96" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe97" role="h4YwH">
        <property role="h4YG0" value="19" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuze" role="h4YwH">
        <property role="h4YG0" value="18" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwuzO" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="179" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe9w" role="h4YwH">
        <property role="h4YG0" value="25" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe9x" role="h4YwH">
        <property role="h4YG0" value="24" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe9y" role="h4YwH">
        <property role="h4YG0" value="23" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe9z" role="h4YwH">
        <property role="h4YG0" value="22" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe9$" role="h4YwH">
        <property role="h4YG0" value="20" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwe9_" role="h4YwH">
        <property role="h4YG0" value="19" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwu$r" role="h4YwH">
        <property role="h4YG0" value="18" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
      <node concept="h4YGW" id="7WB5kYMwu_3" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="182" />
        <ref role="h4YGu" node="lSEs44UkB0" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzfH" role="j3bMi">
      <property role="TrG5h" value="MajorsOne" />
      <property role="memwX" value="3" />
      <property role="memz3" value="163" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzfU" role="h4YwH">
        <property role="h4YG0" value="4" />
        <property role="h0cbi" value="164" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzfW" role="j3bMi">
      <property role="TrG5h" value="MajorsTwo" />
      <property role="memwX" value="8" />
      <property role="memz3" value="163" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzfX" role="h4YwH">
        <property role="h4YG0" value="9" />
        <property role="h0cbi" value="164" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzg7" role="j3bMi">
      <property role="TrG5h" value="MajorsCThree" />
      <property role="memwX" value="15" />
      <property role="memz3" value="163" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzg8" role="h4YwH">
        <property role="h4YG0" value="16" />
        <property role="h0cbi" value="164" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzgk" role="j3bMi">
      <property role="TrG5h" value="MajorsCFour" />
      <property role="memwX" value="20" />
      <property role="memz3" value="163" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzgl" role="h4YwH">
        <property role="h4YG0" value="21" />
        <property role="h0cbi" value="164" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzgz" role="j3bMi">
      <property role="TrG5h" value="MajorsCFive" />
      <property role="memwX" value="1" />
      <property role="memz3" value="156" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzg$" role="h4YwH">
        <property role="h4YG0" value="2" />
        <property role="h0cbi" value="157" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fziq" role="j3bMi">
      <property role="TrG5h" value="MajorsCSix" />
      <property role="memwX" value="6" />
      <property role="memz3" value="156" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzir" role="h4YwH">
        <property role="h4YG0" value="7" />
        <property role="h0cbi" value="157" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fziG" role="j3bMi">
      <property role="TrG5h" value="MajorsCSeven" />
      <property role="memwX" value="11" />
      <property role="memz3" value="156" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fziH" role="h4YwH">
        <property role="h4YG0" value="12" />
        <property role="h0cbi" value="157" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzj0" role="j3bMi">
      <property role="TrG5h" value="MajorsCEight" />
      <property role="memwX" value="16" />
      <property role="memz3" value="156" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzj1" role="h4YwH">
        <property role="h4YG0" value="17" />
        <property role="h0cbi" value="157" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzjm" role="j3bMi">
      <property role="TrG5h" value="MajorsCNine" />
      <property role="memwX" value="21" />
      <property role="memz3" value="156" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="EFW1mYOHdw" resolve="MajorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzjn" role="h4YwH">
        <property role="h4YG0" value="22" />
        <property role="h0cbi" value="157" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzjI" role="j3bMi">
      <property role="TrG5h" value="MajorsABOne" />
      <property role="memwX" value="35" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzk6" role="h4YwH">
        <property role="h4YG0" value="36" />
        <property role="h0cbi" value="195" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzk8" role="j3bMi">
      <property role="TrG5h" value="MajorsABTwo" />
      <property role="memwX" value="40" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzk9" role="h4YwH">
        <property role="h4YG0" value="41" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzk$" role="j3bMi">
      <property role="TrG5h" value="MajorsABThree" />
      <property role="memwX" value="45" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzk_" role="h4YwH">
        <property role="h4YG0" value="46" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzl2" role="j3bMi">
      <property role="TrG5h" value="MajorsABFour" />
      <property role="memwX" value="50" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzl3" role="h4YwH">
        <property role="h4YG0" value="51" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzly" role="j3bMi">
      <property role="TrG5h" value="MajorsABFive" />
      <property role="memwX" value="55" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzlz" role="h4YwH">
        <property role="h4YG0" value="56" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzm4" role="j3bMi">
      <property role="TrG5h" value="MajorsABSix" />
      <property role="memwX" value="60" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzm5" role="h4YwH">
        <property role="h4YG0" value="61" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzmC" role="j3bMi">
      <property role="TrG5h" value="MajorsABSeven" />
      <property role="memwX" value="65" />
      <property role="memz3" value="195" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzmD" role="h4YwH">
        <property role="h4YG0" value="66" />
        <property role="h0cbi" value="196" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzne" role="j3bMi">
      <property role="TrG5h" value="MajorsABEight" />
      <property role="memwX" value="35" />
      <property role="memz3" value="190" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fznf" role="h4YwH">
        <property role="h4YG0" value="36" />
        <property role="h0cbi" value="191" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fznQ" role="j3bMi">
      <property role="TrG5h" value="MajorsABNine" />
      <property role="memwX" value="65" />
      <property role="memz3" value="190" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fznR" role="h4YwH">
        <property role="h4YG0" value="66" />
        <property role="h0cbi" value="191" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzow" role="j3bMi">
      <property role="TrG5h" value="MajorsABTen" />
      <property role="memwX" value="65" />
      <property role="memz3" value="185" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzox" role="h4YwH">
        <property role="h4YG0" value="66" />
        <property role="h0cbi" value="186" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzpc" role="j3bMi">
      <property role="TrG5h" value="MajorsABEleven" />
      <property role="memwX" value="65" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzpd" role="h4YwH">
        <property role="h4YG0" value="66" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzpU" role="j3bMi">
      <property role="TrG5h" value="MajorsABTwelve" />
      <property role="memwX" value="40" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzpV" role="h4YwH">
        <property role="h4YG0" value="41" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzsY" role="j3bMi">
      <property role="TrG5h" value="MajorsABThirteen" />
      <property role="memwX" value="45" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzsZ" role="h4YwH">
        <property role="h4YG0" value="46" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fztK" role="j3bMi">
      <property role="TrG5h" value="MajorsABFourteen" />
      <property role="memwX" value="50" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fztL" role="h4YwH">
        <property role="h4YG0" value="51" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzu$" role="j3bMi">
      <property role="TrG5h" value="MajorsABFifteen" />
      <property role="memwX" value="55" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzu_" role="h4YwH">
        <property role="h4YG0" value="56" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzvq" role="j3bMi">
      <property role="TrG5h" value="MajorsABSixteen" />
      <property role="memwX" value="60" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzvr" role="h4YwH">
        <property role="h4YG0" value="61" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzwi" role="j3bMi">
      <property role="TrG5h" value="MajorsABSeventeen" />
      <property role="memwX" value="65" />
      <property role="memz3" value="180" />
      <property role="m3A$7" value="5" />
      <property role="m3A$b" value="5" />
      <property role="m3wsY" value="5" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="52K8Ej3Gdk" resolve="MinorsBay" />
      <node concept="h4YGW" id="1$AaFX9fzwj" role="h4YwH">
        <property role="h4YG0" value="66" />
        <property role="h0cbi" value="181" />
        <ref role="h4YGu" to="lltn:34hhAWxKdrf" />
      </node>
    </node>
    <node concept="j3bLk" id="1$AaFX9fzxc" role="j3bMi">
      <property role="TrG5h" value="COVIDCohort" />
      <property role="memwX" value="40" />
      <property role="memz3" value="165" />
      <property role="m3A$7" value="10" />
      <property role="m3A$b" value="10" />
      <property role="m3wsY" value="10000" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="52K8Ej3GeZ" resolve="COVIDPositiveCohort" />
    </node>
    <node concept="j3bLk" id="1$AaFX9fzyc" role="j3bMi">
      <property role="TrG5h" value="FluCohort" />
      <property role="memwX" value="40" />
      <property role="memz3" value="153" />
      <property role="m3A$7" value="10" />
      <property role="m3A$b" value="10" />
      <property role="m3wsY" value="100000" />
      <property role="376uKC" value="6o2BuIx6R5m/RED" />
      <ref role="VgANK" node="52K8EjIB__" resolve="FluPositiveCohort" />
    </node>
    <node concept="j3bLk" id="1$AaFX9fzz9" role="j3bMi">
      <property role="TrG5h" value="GreenBay" />
      <property role="memwX" value="52" />
      <property role="memz3" value="165" />
      <property role="m3A$7" value="10" />
      <property role="m3A$b" value="10" />
      <property role="m3wsY" value="100000" />
      <property role="376uKC" value="6o2BuIx6R5n/GREEN" />
      <ref role="VgANK" node="7$JgZMbkJ3A" resolve="GreenBay" />
    </node>
    <node concept="j3bLk" id="1$AaFX9fz$5" role="j3bMi">
      <property role="TrG5h" value="SideRoom" />
      <property role="memwX" value="52" />
      <property role="memz3" value="151" />
      <property role="m3A$7" value="10" />
      <property role="m3A$b" value="10" />
      <property role="m3wsY" value="10000000" />
      <property role="376uKC" value="6o2BuIx6R5u/GRAY" />
      <ref role="VgANK" node="52K8Ej3GjE" resolve="SideRoom" />
    </node>
    <node concept="37mRI7" id="3ifWr0hNr7L" role="lGtFl">
      <node concept="37mRIm" id="3ifWr0hNr7M" role="37mRID">
        <property role="37mO49" value="306340436107853543" />
        <node concept="gqqVs" id="3ifWr0hNr7K" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr7O" role="37mRID">
        <property role="37mO49" value="1589537774398852794" />
        <node concept="gqqVs" id="3ifWr0hNr7N" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr7Q" role="37mRID">
        <property role="37mO49" value="1589537774398852795" />
        <node concept="gqqVs" id="3ifWr0hNr7P" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr7S" role="37mRID">
        <property role="37mO49" value="1589537774398852796" />
        <node concept="gqqVs" id="3ifWr0hNr7R" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr7U" role="37mRID">
        <property role="37mO49" value="1589537774398852797" />
        <node concept="gqqVs" id="3ifWr0hNr7T" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="212.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr7W" role="37mRID">
        <property role="37mO49" value="1589537774398852798" />
        <node concept="gqqVs" id="3ifWr0hNr7V" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr7Y" role="37mRID">
        <property role="37mO49" value="1589537774398852799" />
        <node concept="gqqVs" id="3ifWr0hNr7X" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="316.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr80" role="37mRID">
        <property role="37mO49" value="1589537774398852800" />
        <node concept="gqqVs" id="3ifWr0hNr7Z" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr82" role="37mRID">
        <property role="37mO49" value="1589537774398852801" />
        <node concept="gqqVs" id="3ifWr0hNr81" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr84" role="37mRID">
        <property role="37mO49" value="1589537774398852802" />
        <node concept="gqqVs" id="3ifWr0hNr83" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr86" role="37mRID">
        <property role="37mO49" value="1589537774398852803" />
        <node concept="gqqVs" id="3ifWr0hNr85" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr88" role="37mRID">
        <property role="37mO49" value="1589537774398852804" />
        <node concept="gqqVs" id="3ifWr0hNr87" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8a" role="37mRID">
        <property role="37mO49" value="1589537774398852805" />
        <node concept="gqqVs" id="3ifWr0hNr89" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8c" role="37mRID">
        <property role="37mO49" value="1589537774398852806" />
        <node concept="gqqVs" id="3ifWr0hNr8b" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8e" role="37mRID">
        <property role="37mO49" value="1589537774398852807" />
        <node concept="gqqVs" id="3ifWr0hNr8d" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8g" role="37mRID">
        <property role="37mO49" value="1589537774398852808" />
        <node concept="gqqVs" id="3ifWr0hNr8f" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8i" role="37mRID">
        <property role="37mO49" value="1589537774398852809" />
        <node concept="gqqVs" id="3ifWr0hNr8h" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="188.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8k" role="37mRID">
        <property role="37mO49" value="1589537774398852810" />
        <node concept="gqqVs" id="3ifWr0hNr8j" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="188.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8m" role="37mRID">
        <property role="37mO49" value="1589537774398852811" />
        <node concept="gqqVs" id="3ifWr0hNr8l" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="188.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8o" role="37mRID">
        <property role="37mO49" value="1589537774398852812" />
        <node concept="gqqVs" id="3ifWr0hNr8n" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="196.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8q" role="37mRID">
        <property role="37mO49" value="6755843002519053477" />
        <node concept="gqqVs" id="3ifWr0hNr8p" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="212.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8s" role="37mRID">
        <property role="37mO49" value="6755843002519053527" />
        <node concept="gqqVs" id="3ifWr0hNr8r" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="212.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8u" role="37mRID">
        <property role="37mO49" value="6755843002519053550" />
        <node concept="gqqVs" id="3ifWr0hNr8t" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8w" role="37mRID">
        <property role="37mO49" value="6755843002519053574" />
        <node concept="gqqVs" id="3ifWr0hNr8v" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8y" role="37mRID">
        <property role="37mO49" value="6755843002519053599" />
        <node concept="gqqVs" id="3ifWr0hNr8x" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="212.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8$" role="37mRID">
        <property role="37mO49" value="6755843002519053625" />
        <node concept="gqqVs" id="3ifWr0hNr8z" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8A" role="37mRID">
        <property role="37mO49" value="6755843002519053652" />
        <node concept="gqqVs" id="3ifWr0hNr8_" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8C" role="37mRID">
        <property role="37mO49" value="6755843002519053680" />
        <node concept="gqqVs" id="3ifWr0hNr8B" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8E" role="37mRID">
        <property role="37mO49" value="6755843002519053709" />
        <node concept="gqqVs" id="3ifWr0hNr8D" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8G" role="37mRID">
        <property role="37mO49" value="6755843002519053739" />
        <node concept="gqqVs" id="3ifWr0hNr8F" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8I" role="37mRID">
        <property role="37mO49" value="6755843002519053770" />
        <node concept="gqqVs" id="3ifWr0hNr8H" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8K" role="37mRID">
        <property role="37mO49" value="6755843002519053802" />
        <node concept="gqqVs" id="3ifWr0hNr8J" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8M" role="37mRID">
        <property role="37mO49" value="6755843002519053835" />
        <node concept="gqqVs" id="3ifWr0hNr8L" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8O" role="37mRID">
        <property role="37mO49" value="6755843002519053869" />
        <node concept="gqqVs" id="3ifWr0hNr8N" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8Q" role="37mRID">
        <property role="37mO49" value="6755843002519053904" />
        <node concept="gqqVs" id="3ifWr0hNr8P" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8S" role="37mRID">
        <property role="37mO49" value="6755843002519053940" />
        <node concept="gqqVs" id="3ifWr0hNr8R" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8U" role="37mRID">
        <property role="37mO49" value="6755843002519053977" />
        <node concept="gqqVs" id="3ifWr0hNr8T" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="260.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8W" role="37mRID">
        <property role="37mO49" value="6755843002519054015" />
        <node concept="gqqVs" id="3ifWr0hNr8V" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr8Y" role="37mRID">
        <property role="37mO49" value="6755843002519054054" />
        <node concept="gqqVs" id="3ifWr0hNr8X" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="276.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr90" role="37mRID">
        <property role="37mO49" value="6755843002519054094" />
        <node concept="gqqVs" id="3ifWr0hNr8Z" role="37mO4d">
          <property role="gqqTZ" value="0.0" />
          <property role="gqqTW" value="0.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr92" role="37mRID">
        <property role="37mO49" value="1758249876506198855" />
        <node concept="gqqVs" id="3ifWr0hNr91" role="37mO4d">
          <property role="gqqTZ" value="34.0" />
          <property role="gqqTW" value="98.0" />
          <property role="gqqTX" value="340.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3ifWr0hNr94" role="37mRID">
        <property role="37mO49" value="6755843002526591451" />
        <node concept="gqqVs" id="3ifWr0hNr93" role="37mO4d">
          <property role="gqqTZ" value="18.0" />
          <property role="gqqTW" value="298.0" />
          <property role="gqqTX" value="356.0" />
          <property role="gqqTy" value="172.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
    </node>
  </node>
  <node concept="VhMOw" id="2lOlAdP2IBt">
    <property role="TrG5h" value="Ward" />
    <property role="3GE5qa" value="ED Layout.RoomType" />
  </node>
  <node concept="VhMOw" id="EFW1mYOHdm">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="TriageDesk" />
  </node>
  <node concept="VhMOw" id="EFW1mYOHdw">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="MajorsBay" />
    <node concept="1kHjla" id="4Skof6wcCdG" role="3IeprG">
      <ref role="IYbFp" node="34hhAWxKdrf" />
    </node>
  </node>
  <node concept="VhMOw" id="EFW1mYOHdO">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="WaitingRoom" />
    <node concept="1kHjla" id="lSEs44UkB_" role="3IeprG">
      <ref role="IYbFp" node="lSEs44UkB0" />
    </node>
  </node>
  <node concept="VhMOw" id="EFW1mYOHez">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="MainEntrance" />
  </node>
  <node concept="VhMOw" id="2_JteYO1fw4">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="NonRespiratoryCohort" />
  </node>
  <node concept="VhMOw" id="2_JteYPiCGV">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="RespiratoryArea" />
  </node>
  <node concept="VhMOw" id="5Lup6bkgRsQ">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="NonRespiratoryArea" />
  </node>
  <node concept="VhMOw" id="52K8Ej3Gdk">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="MinorsBay" />
    <node concept="1kHjla" id="4Skof6wcCdx" role="3IeprG">
      <ref role="IYbFp" node="34hhAWxKdrf" />
    </node>
  </node>
  <node concept="VhMOw" id="52K8Ej3GeZ">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="COVIDPositiveCohort" />
    <node concept="1kHjla" id="sr1c8P7Yr$" role="3IeprG">
      <ref role="IYbFp" node="34hhAWxKdrf" />
    </node>
  </node>
  <node concept="VhMOw" id="52K8Ej3GjE">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="SideRoom" />
    <node concept="1kHjla" id="sr1c8P7Yqw" role="3IeprG">
      <ref role="IYbFp" node="34hhAWxKdrf" />
    </node>
  </node>
  <node concept="VhMOw" id="52K8Ejkjl6">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="Labaratory" />
  </node>
  <node concept="VhMOw" id="52K8EjIB__">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="FluPositiveCohort" />
  </node>
  <node concept="VhMOw" id="5R1$QENtegU">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="LIATBooth" />
  </node>
  <node concept="VhMOw" id="5R1$QENtehv">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="TaskRoom" />
  </node>
  <node concept="VhMOw" id="5R1$QENtej4">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="RadiologyRoom" />
  </node>
  <node concept="VhMOw" id="1xAzJ9NxGdM">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="ElectiveAttendanceArea" />
  </node>
  <node concept="VhMOw" id="7$JgZMbkJ3A">
    <property role="3GE5qa" value="ED Layout.RoomType" />
    <property role="TrG5h" value="GreenBay" />
    <node concept="1kHjla" id="sr1c8P7Yrp" role="3IeprG">
      <ref role="IYbFp" node="34hhAWxKdrf" />
    </node>
  </node>
  <node concept="2q6JFR" id="5R1$QENteu9">
    <property role="3GE5qa" value="ED Layout" />
    <node concept="2qS95e" id="5R1$QENteus" role="2q6JFM">
      <property role="2qS95d" value="0" />
      <property role="2qS95b" value="124" />
      <property role="2qS95m" value="110" />
      <property role="2qS95i" value="124" />
    </node>
    <node concept="2qS95e" id="5R1$QENteuy" role="2q6JFM">
      <property role="2qS95d" value="110" />
      <property role="2qS95b" value="80" />
      <property role="2qS95m" value="110" />
      <property role="2qS95i" value="125" />
    </node>
    <node concept="2qS95e" id="5R1$QENteu_" role="2q6JFM">
      <property role="2qS95d" value="105" />
      <property role="2qS95b" value="160" />
      <property role="2qS95m" value="156" />
      <property role="2qS95i" value="160" />
    </node>
    <node concept="2qS95e" id="5R1$QENteuD" role="2q6JFM">
      <property role="2qS95d" value="156" />
      <property role="2qS95b" value="160" />
      <property role="2qS95m" value="156" />
      <property role="2qS95i" value="200" />
    </node>
    <node concept="2qS95e" id="5R1$QENteuI" role="2q6JFM">
      <property role="2qS95d" value="115" />
      <property role="2qS95b" value="170" />
      <property role="2qS95m" value="156" />
      <property role="2qS95i" value="170" />
    </node>
    <node concept="2qS95e" id="5R1$QENteuO" role="2q6JFM">
      <property role="2qS95d" value="0" />
      <property role="2qS95b" value="0" />
      <property role="2qS95m" value="399" />
      <property role="2qS95i" value="0" />
    </node>
    <node concept="2qS95e" id="5R1$QENteuV" role="2q6JFM">
      <property role="2qS95d" value="0" />
      <property role="2qS95b" value="200" />
      <property role="2qS95m" value="399" />
      <property role="2qS95i" value="200" />
    </node>
    <node concept="2qS95e" id="5R1$QENtev3" role="2q6JFM">
      <property role="2qS95d" value="0" />
      <property role="2qS95b" value="0" />
      <property role="2qS95m" value="199" />
      <property role="2qS95i" value="0" />
    </node>
    <node concept="2qS95e" id="5R1$QENtevc" role="2q6JFM">
      <property role="2qS95d" value="399" />
      <property role="2qS95b" value="0" />
      <property role="2qS95m" value="399" />
      <property role="2qS95i" value="200" />
    </node>
    <node concept="2qS95e" id="5R1$QENtevm" role="2q6JFM">
      <property role="2qS95d" value="160" />
      <property role="2qS95b" value="80" />
      <property role="2qS95m" value="160" />
      <property role="2qS95i" value="140" />
    </node>
    <node concept="2qS95e" id="5R1$QENtevx" role="2q6JFM">
      <property role="2qS95d" value="160" />
      <property role="2qS95b" value="60" />
      <property role="2qS95m" value="160" />
      <property role="2qS95i" value="70" />
    </node>
    <node concept="2qS95e" id="5R1$QENtevH" role="2q6JFM">
      <property role="2qS95d" value="110" />
      <property role="2qS95b" value="90" />
      <property role="2qS95m" value="130" />
      <property role="2qS95i" value="90" />
    </node>
    <node concept="2qS95e" id="5R1$QENtevU" role="2q6JFM">
      <property role="2qS95d" value="140" />
      <property role="2qS95b" value="90" />
      <property role="2qS95m" value="160" />
      <property role="2qS95i" value="90" />
    </node>
    <node concept="2qS95e" id="5R1$QENtew8" role="2q6JFM">
      <property role="2qS95d" value="110" />
      <property role="2qS95b" value="60" />
      <property role="2qS95m" value="155" />
      <property role="2qS95i" value="60" />
    </node>
    <node concept="2qS95e" id="5R1$QENtewn" role="2q6JFM">
      <property role="2qS95d" value="175" />
      <property role="2qS95b" value="60" />
      <property role="2qS95m" value="175" />
      <property role="2qS95i" value="150" />
    </node>
    <node concept="2qS95e" id="5R1$QENtewB" role="2q6JFM">
      <property role="2qS95d" value="175" />
      <property role="2qS95b" value="160" />
      <property role="2qS95m" value="175" />
      <property role="2qS95i" value="200" />
    </node>
    <node concept="2qS95e" id="5R1$QENtewS" role="2q6JFM">
      <property role="2qS95d" value="175" />
      <property role="2qS95b" value="145" />
      <property role="2qS95m" value="305" />
      <property role="2qS95i" value="145" />
    </node>
    <node concept="2qS95e" id="5R1$QENtexa" role="2q6JFM">
      <property role="2qS95d" value="305" />
      <property role="2qS95b" value="145" />
      <property role="2qS95m" value="305" />
      <property role="2qS95i" value="200" />
    </node>
  </node>
  <node concept="IzEoG" id="34hhAWxKdrf">
    <property role="IzEow" value="Bed" />
  </node>
  <node concept="2GGxxg" id="2K0oNvtWdy4">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="WardNurse" />
    <property role="3ZUNkI" value="0" />
    <property role="1kBeqs" value="6o2BuIx6R5D/YELLOW" />
  </node>
  <node concept="2MhjZA" id="3i9haAIoNzA">
    <property role="3GE5qa" value="Action Cards" />
    <property role="TrG5h" value="TwoQuestionsTwoTriages" />
    <node concept="37mRI7" id="3i9haAIoNzG" role="lGtFl">
      <node concept="37mRIm" id="3i9haAIoNzH" role="37mRID">
        <property role="37mO49" value="3170643229266729078" />
        <node concept="gqqVs" id="3i9haAIoNzI" role="37mO4d">
          <property role="gqqTZ" value="106.0" />
          <property role="gqqTW" value="26.0" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3i9haAIoNzJ" role="37mRID">
        <property role="37mO49" value="3170643229266729100" />
        <node concept="gqqVs" id="3i9haAIoNzK" role="37mO4d">
          <property role="gqqTZ" value="66.0" />
          <property role="gqqTW" value="106.0" />
          <property role="gqqTX" value="182.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3i9haAIoNzL" role="37mRID">
        <property role="37mO49" value="3170643229266729144" />
        <node concept="gqqVs" id="3i9haAIoNzM" role="37mO4d">
          <property role="gqqTZ" value="106.0" />
          <property role="gqqTW" value="194.0" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3i9haAIoN$a" role="37mRID">
        <property role="37mO49" value="3785632457347512551" />
        <node concept="gqqVs" id="3i9haAIoN$9" role="37mO4d">
          <property role="gqqTZ" value="114.0" />
          <property role="gqqTW" value="22.0" />
          <property role="gqqTX" value="72.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3i9haAIoN$c" role="37mRID">
        <property role="37mO49" value="3785632457347512563" />
        <node concept="gqqVs" id="3i9haAIoN$b" role="37mO4d">
          <property role="gqqTZ" value="166.0" />
          <property role="gqqTW" value="217.0" />
          <property role="gqqTX" value="182.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="3i9haAIoN$e" role="37mRID">
        <property role="37mO49" value="3785632457347512573" />
        <node concept="gqqVs" id="3i9haAIoN$d" role="37mO4d">
          <property role="gqqTZ" value="206.0" />
          <property role="gqqTW" value="290.0" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="1BosAjLKieq" role="37mRID">
        <property role="37mO49" value="1862364223795962762" />
        <node concept="gqqVs" id="1BosAjLKiep" role="37mO4d">
          <property role="gqqTZ" value="254.0" />
          <property role="gqqTW" value="131.0" />
          <property role="gqqTX" value="127.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="351ASBMKApt" role="37mRID">
        <property role="37mO49" value="3549288998130160257" />
        <node concept="gqqVs" id="351ASBMKAps" role="37mO4d">
          <property role="gqqTZ" value="257.5797101449275" />
          <property role="gqqTW" value="8.202898550724637" />
          <property role="gqqTX" value="813.0" />
          <property role="gqqTy" value="48.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="351ASBMKTQ5" role="37mRID">
        <property role="37mO49" value="3549288998130392427" />
        <node concept="gqqVs" id="351ASBMKTQ4" role="37mO4d">
          <property role="gqqTZ" value="394.0" />
          <property role="gqqTW" value="225.0" />
          <property role="gqqTX" value="152.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="351ASBMKTRe" role="37mRID">
        <property role="37mO49" value="3549288998130392496" />
        <node concept="gqqVs" id="351ASBMKTRd" role="37mO4d">
          <property role="gqqTZ" value="422.0" />
          <property role="gqqTW" value="297.0" />
          <property role="gqqTX" value="108.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="4pv5aglQ7Co" role="37mRID">
        <property role="37mO49" value="5070794400416168431" />
        <node concept="gqqVs" id="4pv5aglQ7Cn" role="37mO4d">
          <property role="gqqTZ" value="241.00000000000006" />
          <property role="gqqTW" value="107.89156626506025" />
          <property role="gqqTX" value="184.0" />
          <property role="gqqTy" value="45.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="4pv5aglRnfj" role="37mRID">
        <property role="37mO49" value="5070794400416494507" />
        <node concept="gqqVs" id="4pv5aglRnfi" role="37mO4d">
          <property role="gqqTZ" value="430.0" />
          <property role="gqqTW" value="290.0" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="4pv5aglRngr" role="37mRID">
        <property role="37mO49" value="5070794400416494575" />
        <node concept="gqqVs" id="4pv5aglRngq" role="37mO4d">
          <property role="gqqTZ" value="118.0" />
          <property role="gqqTW" value="302.0" />
          <property role="gqqTX" value="118.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="4pv5aglRFTe" role="37mRID">
        <property role="37mO49" value="5070794400416579105" />
        <node concept="gqqVs" id="4pv5aglRFTd" role="37mO4d">
          <property role="gqqTZ" value="290.0" />
          <property role="gqqTW" value="309.0" />
          <property role="gqqTX" value="122.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b76G" role="37mRID">
        <property role="37mO49" value="5070794400416168496" />
        <node concept="2VclpC" id="6lG8bJ5b76F" role="37mO4d">
          <node concept="2VclrF" id="6lG8bJ5b76H" role="2Vcluh">
            <property role="2Vclpx" value="576.0" />
            <property role="2Vclpz" value="140.0120481927711" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b77L" role="37mRID">
        <property role="37mO49" value="7308252286154469840" />
        <node concept="gqqVs" id="6lG8bJ5b77K" role="37mO4d">
          <property role="gqqTZ" value="604.0" />
          <property role="gqqTW" value="195.0" />
          <property role="gqqTX" value="185.0" />
          <property role="gqqTy" value="56.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7c8" role="37mRID">
        <property role="37mO49" value="7308252286154470127" />
        <node concept="gqqVs" id="6lG8bJ5b7c7" role="37mO4d">
          <property role="gqqTZ" value="164.3493975903615" />
          <property role="gqqTW" value="293.7228915662651" />
          <property role="gqqTX" value="242.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7dd" role="37mRID">
        <property role="37mO49" value="7308252286154470189" />
        <node concept="gqqVs" id="6lG8bJ5b7dc" role="37mO4d">
          <property role="gqqTZ" value="10.90963855421684" />
          <property role="gqqTW" value="293.7228915662651" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7eX" role="37mRID">
        <property role="37mO49" value="7308252286154470294" />
        <node concept="gqqVs" id="6lG8bJ5b7eW" role="37mO4d">
          <property role="gqqTZ" value="556.5" />
          <property role="gqqTW" value="422.28915662650604" />
          <property role="gqqTX" value="271.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7gp" role="37mRID">
        <property role="37mO49" value="7308252286154470422" />
        <node concept="2VclpC" id="6lG8bJ5b7go" role="37mO4d">
          <node concept="2VclrF" id="6lG8bJ5b7gq" role="2Vcluh">
            <property role="2Vclpx" value="459.8674698795182" />
            <property role="2Vclpz" value="440.96385542168673" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7jk" role="37mRID">
        <property role="37mO49" value="7308252286154470609" />
        <node concept="gqqVs" id="6lG8bJ5b7jj" role="37mO4d">
          <property role="gqqTZ" value="676.0" />
          <property role="gqqTW" value="101.89156626506025" />
          <property role="gqqTX" value="212.0" />
          <property role="gqqTy" value="57.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7kI" role="37mRID">
        <property role="37mO49" value="7308252286154470124" />
        <node concept="2VclpC" id="6lG8bJ5b7kH" role="37mO4d">
          <node concept="2VclrF" id="6lG8bJ5b7kJ" role="2Vcluh">
            <property role="2Vclpx" value="366.39539267258937" />
            <property role="2Vclpz" value="204.61665552018178" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7mn" role="37mRID">
        <property role="37mO49" value="7308252286154470758" />
        <node concept="gqqVs" id="6lG8bJ5b7mm" role="37mO4d">
          <property role="gqqTZ" value="485.50000000000006" />
          <property role="gqqTW" value="293.72289156626505" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7o0" role="37mRID">
        <property role="37mO49" value="7308252286154470860" />
        <node concept="gqqVs" id="6lG8bJ5b7nZ" role="37mO4d">
          <property role="gqqTZ" value="633.0" />
          <property role="gqqTW" value="293.72289156626505" />
          <property role="gqqTX" value="118.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7pQ" role="37mRID">
        <property role="37mO49" value="7308252286154470975" />
        <node concept="gqqVs" id="6lG8bJ5b7pP" role="37mO4d">
          <property role="gqqTZ" value="801.4819277108434" />
          <property role="gqqTW" value="293.72289156626505" />
          <property role="gqqTX" value="127.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7qQ" role="37mRID">
        <property role="37mO49" value="7308252286154471091" />
        <node concept="2VclpC" id="6lG8bJ5b7qP" role="37mO4d">
          <node concept="2VclrF" id="6lG8bJ5b7qR" role="2Vcluh">
            <property role="2Vclpx" value="857.566265060241" />
            <property role="2Vclpz" value="230.12048192771084" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7sY" role="37mRID">
        <property role="37mO49" value="7308252286154471165" />
        <node concept="gqqVs" id="6lG8bJ5b7sX" role="37mO4d">
          <property role="gqqTZ" value="288.3493975903614" />
          <property role="gqqTW" value="422.28915662650604" />
          <property role="gqqTX" value="118.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7tZ" role="37mRID">
        <property role="37mO49" value="7308252286154471292" />
        <node concept="2VclpC" id="6lG8bJ5b7tY" role="37mO4d" />
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7HH" role="37mRID">
        <property role="37mO49" value="7308252286154472213" />
        <node concept="gqqVs" id="6lG8bJ5b7HG" role="37mO4d">
          <property role="gqqTZ" value="145.69879518072278" />
          <property role="gqqTW" value="422.28915662650604" />
          <property role="gqqTX" value="89.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7IM" role="37mRID">
        <property role="37mO49" value="7308252286154472367" />
        <node concept="2VclpC" id="6lG8bJ5b7IL" role="37mO4d">
          <node concept="2VclrF" id="6lG8bJ5b7IN" role="2Vcluh">
            <property role="2Vclpx" value="48.19277108433735" />
            <property role="2Vclpz" value="443.3734939759036" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1FS47K" id="351ASBMK1a1" role="1FS4Pn">
      <node concept="30deu6" id="6lG8bJ5b7Kl" role="1FS47L">
        <node concept="1FDPl8" id="6lG8bJ5b7KA" role="30dEsF">
          <node concept="1FPx23" id="6lG8bJ5b7KQ" role="1GBHi9" />
        </node>
        <node concept="1FDPl8" id="351ASBMK1a5" role="30dEs_">
          <node concept="1FPxa$" id="351ASBMK1ae" role="1GBHi9" />
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="4pv5aglQ7BJ" role="2MhjZp">
      <property role="TrG5h" value="Arrival_Checks" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="6lG8bJ5b76n" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCG6" resolve="TriageNurse" />
      </node>
      <node concept="1M3RjT" id="4pv5aglQ7Cd" role="1M293l">
        <property role="1M3RjU" value="2" />
      </node>
      <node concept="UeIYj" id="4pv5aglQ7Cg" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdm" resolve="TriageDesk" />
      </node>
      <node concept="2GGxJi" id="4pv5aglQ7CK" role="A3aay">
        <ref role="3tVEyn" node="4pv5aglQ7BJ" resolve="Arrival_Checks" />
        <ref role="2GGxGe" node="6lG8bJ5b7hd" resolve="Triage" />
      </node>
    </node>
    <node concept="1HTXKU" id="6lG8bJ5b7jh" role="1HTZI9">
      <ref role="1HTXKa" node="6lG8bJ5b7hc" resolve="EmergencyDepartmentTriage" />
    </node>
  </node>
  <node concept="1gZIpL" id="6lG8bJ5b7bg">
    <property role="3GE5qa" value="Diseases" />
    <property role="TrG5h" value="StrepA" />
  </node>
  <node concept="2MhjZA" id="6lG8bJ5b7hc">
    <property role="3GE5qa" value="Action Cards" />
    <property role="TrG5h" value="EmergencyDepartmentTriage" />
    <node concept="2MhjZa" id="6lG8bJ5b7hd" role="2MhjZp">
      <property role="TrG5h" value="Triage" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="6lG8bJ5b7hJ" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCG6" resolve="TriageNurse" />
      </node>
      <node concept="UeIYj" id="6lG8bJ5b7hM" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdm" resolve="TriageDesk" />
      </node>
      <node concept="2GGxJi" id="6lG8bJ5b7ix" role="A3aay">
        <ref role="3tVEyn" node="6lG8bJ5b7hd" resolve="Triage" />
        <ref role="2GGxGe" node="6lG8bJ5b7hQ" resolve="Checks" />
        <node concept="1FDPl8" id="i1eH3VeDM1" role="1hyIAf">
          <node concept="1FPxa$" id="i1eH3VeDMa" role="1GBHi9" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDMP" role="A3aay">
        <ref role="3tVEyn" node="6lG8bJ5b7hd" resolve="Triage" />
        <ref role="2GGxGe" node="i1eH3VeDMl" resolve="Checks" />
        <node concept="1FDPl8" id="i1eH3VeDMY" role="1hyIAf">
          <node concept="1FPx23" id="i1eH3VeDN7" role="1GBHi9" />
        </node>
      </node>
    </node>
    <node concept="37mRI7" id="6lG8bJ5b7hp" role="lGtFl">
      <node concept="37mRIm" id="6lG8bJ5b7hq" role="37mRID">
        <property role="37mO49" value="7308252286154470477" />
        <node concept="gqqVs" id="6lG8bJ5b7ho" role="37mO4d">
          <property role="gqqTZ" value="256.0" />
          <property role="gqqTW" value="-17.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7ir" role="37mRID">
        <property role="37mO49" value="7308252286154470518" />
        <node concept="gqqVs" id="6lG8bJ5b7iq" role="37mO4d">
          <property role="gqqTZ" value="117.0" />
          <property role="gqqTW" value="81.0" />
          <property role="gqqTX" value="166.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="6lG8bJ5b7iT" role="37mRID">
        <property role="37mO49" value="7308252286154470563" />
        <node concept="gqqVs" id="6lG8bJ5b7iS" role="37mO4d">
          <property role="gqqTZ" value="162.0" />
          <property role="gqqTW" value="220.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDMF" role="37mRID">
        <property role="37mO49" value="324605317389917333" />
        <node concept="gqqVs" id="i1eH3VeDME" role="37mO4d">
          <property role="gqqTZ" value="362.0" />
          <property role="gqqTW" value="81.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDNe" role="37mRID">
        <property role="37mO49" value="7308252286154470561" />
        <node concept="2VclpC" id="i1eH3VeDNd" role="37mO4d">
          <node concept="2VclrF" id="i1eH3VeDNf" role="2Vcluh">
            <property role="2Vclpx" value="219.0" />
            <property role="2Vclpz" value="52.0" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDNv" role="37mRID">
        <property role="37mO49" value="324605317389917365" />
        <node concept="2VclpC" id="i1eH3VeDNu" role="37mO4d">
          <node concept="2VclrF" id="i1eH3VeDNw" role="2Vcluh">
            <property role="2Vclpx" value="388.5" />
            <property role="2Vclpz" value="54.500000000000014" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQY" role="37mRID">
        <property role="37mO49" value="324605317389917627" />
        <node concept="gqqVs" id="i1eH3VeDQX" role="37mO4d">
          <property role="gqqTZ" value="4.0" />
          <property role="gqqTW" value="193.0" />
          <property role="gqqTX" value="140.0" />
          <property role="gqqTy" value="33.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDRk" role="37mRID">
        <property role="37mO49" value="324605317389917631" />
        <node concept="gqqVs" id="i1eH3VeDRj" role="37mO4d">
          <property role="gqqTZ" value="148.0" />
          <property role="gqqTW" value="194.0" />
          <property role="gqqTX" value="148.0" />
          <property role="gqqTy" value="33.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDRH" role="37mRID">
        <property role="37mO49" value="324605317389917653" />
        <node concept="gqqVs" id="i1eH3VeDRG" role="37mO4d">
          <property role="gqqTZ" value="313.0" />
          <property role="gqqTW" value="194.0" />
          <property role="gqqTX" value="132.0" />
          <property role="gqqTy" value="33.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDS9" role="37mRID">
        <property role="37mO49" value="324605317389917678" />
        <node concept="gqqVs" id="i1eH3VeDS8" role="37mO4d">
          <property role="gqqTZ" value="444.0" />
          <property role="gqqTW" value="194.0" />
          <property role="gqqTX" value="132.0" />
          <property role="gqqTy" value="33.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="6lG8bJ5b7hQ" role="2MhjZp">
      <property role="TrG5h" value="Checks" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDMi" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCG6" resolve="TriageNurse" />
      </node>
      <node concept="UeIYj" id="6lG8bJ5b7il" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdm" resolve="TriageDesk" />
      </node>
      <node concept="1M3RjT" id="i1eH3VeDMg" role="1M293l">
        <property role="1M3RjU" value="15" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDSB" role="A3aay">
        <ref role="3tVEyn" node="6lG8bJ5b7hQ" resolve="Checks" />
        <ref role="2GGxGe" node="i1eH3VeDCN" resolve="Treatment" />
        <node concept="1CySur" id="i1eH3VeDSH" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeD_w" />
          <node concept="MfZuW" id="i1eH3VeDT6" role="1CySjL" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDTf" role="A3aay">
        <ref role="3tVEyn" node="6lG8bJ5b7hQ" resolve="Checks" />
        <ref role="2GGxGe" node="i1eH3VeDIa" resolve="Treatment" />
        <node concept="1CySur" id="i1eH3VeDTo" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeD_w" />
          <node concept="MfZID" id="i1eH3VeDTA" role="1CySjL" />
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDMl" role="2MhjZp">
      <property role="TrG5h" value="Checks" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDMB" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCG6" resolve="TriageNurse" />
      </node>
      <node concept="1M3RjT" id="i1eH3VeDMz" role="1M293l">
        <property role="1M3RjU" value="15" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDM_" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdm" resolve="TriageDesk" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDTJ" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDMl" resolve="Checks" />
        <ref role="2GGxGe" node="i1eH3VeDNN" resolve="Treatment" />
        <node concept="1CySur" id="i1eH3VeDTP" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeD_w" />
          <node concept="MfZuW" id="i1eH3VeDU3" role="1CySjL" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDUc" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDMl" resolve="Checks" />
        <ref role="2GGxGe" node="i1eH3VeDPN" resolve="Treatment" />
        <node concept="1CySur" id="i1eH3VeDUl" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeD_w" />
          <node concept="MfZID" id="i1eH3VeDUz" role="1CySjL" />
        </node>
      </node>
    </node>
    <node concept="1HTXKU" id="i1eH3VeDQV" role="1HTZI9">
      <ref role="1HTXKa" node="i1eH3VeDCI" resolve="Majors_Emergency" />
    </node>
    <node concept="1HTXKU" id="i1eH3VeDQZ" role="1HTZI9">
      <ref role="1HTXKa" node="i1eH3VeDI9" resolve="Minors_Emeregency" />
    </node>
    <node concept="1HTXKU" id="i1eH3VeDRl" role="1HTZI9">
      <ref role="1HTXKa" node="i1eH3VeDNM" resolve="Majors_Elective" />
    </node>
    <node concept="1HTXKU" id="i1eH3VeDRI" role="1HTZI9">
      <ref role="1HTXKa" node="i1eH3VeDPM" resolve="Minors_Elective" />
    </node>
  </node>
  <node concept="2OfScj" id="6lG8bJ5b7xx">
    <property role="TrG5h" value="patient" />
    <node concept="1jfOK3" id="6lG8bJ5b7xy" role="2OfI9c">
      <node concept="1RmfTV" id="6lG8bJ5b7xz" role="1R9TjS">
        <property role="1C_jdu" value="nullInfectionStatus" />
        <ref role="1R9xXT" node="6lG8bJ5b7bg" resolve="StrepA" />
      </node>
      <node concept="1jfOKv" id="6lG8bJ5b7x$" role="1jfOML">
        <property role="3JlXGq" value="60" />
        <node concept="3IO8Df" id="6lG8bJ5b7x_" role="3JlXG4" />
      </node>
      <node concept="1jfOKv" id="6lG8bJ5b7xA" role="1jfOML">
        <property role="3JlXGq" value="30" />
        <node concept="3IO8Cx" id="6lG8bJ5b7xB" role="3JlXG4" />
      </node>
      <node concept="1jfOKv" id="6lG8bJ5b7xC" role="1jfOML">
        <property role="3JlXGq" value="10" />
        <node concept="3IO8Di" id="6lG8bJ5b7xD" role="3JlXG4" />
      </node>
    </node>
    <node concept="25k$Xo" id="6lG8bJ5b7xE" role="2OfIal">
      <node concept="c0n4t" id="6lG8bJ5b7xF" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xG" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xH" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xI" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xJ" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xK" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xL" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xM" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xN" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xO" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xP" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xQ" role="c0n7C">
        <property role="c0n49" value="3" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xR" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xS" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xT" role="c0n7C">
        <property role="c0n49" value="5" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xU" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xV" role="c0n7C">
        <property role="c0n49" value="5" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xW" role="c0n7C">
        <property role="c0n49" value="4" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xX" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xY" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7xZ" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7y0" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7y1" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="c0n4t" id="6lG8bJ5b7y2" role="c0n7C">
        <property role="c0n49" value="0" />
      </node>
      <node concept="UeIYj" id="6lG8bJ5b7y3" role="2PM4n5">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
    <node concept="1FPx23" id="lSEs44UkCS" role="1FYssH" />
  </node>
  <node concept="2GGxxg" id="i1eH3VeDCH">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="MinorsDoctor" />
    <property role="3ZUNkI" value="5" />
    <property role="1kBeqs" value="6o2BuIx6R5m/RED" />
  </node>
  <node concept="2MhjZA" id="i1eH3VeDCI">
    <property role="3GE5qa" value="Action Cards" />
    <property role="TrG5h" value="Majors_Emergency" />
    <node concept="2MhjZa" id="i1eH3VeDCN" role="2MhjZp">
      <property role="TrG5h" value="Treatment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDE5" role="2_8HaY">
        <ref role="2_8ZNy" node="av1M7vbJYz" resolve="MajorsDoctor" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDD5" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDD8" role="_GsXX">
          <property role="_GsXS" value="60" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDDc" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDE8" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDCN" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDDE" resolve="Wait" />
        <node concept="1CySur" id="i1eH3VeDFn" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAX" />
          <node concept="1FjjCm" id="i1eH3VeDFy" role="1CySjL" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDEI" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDCN" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDEa" resolve="AdditionalAssessment" />
        <node concept="1CySur" id="i1eH3VeDEY" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAX" />
          <node concept="1FjjCg" id="i1eH3VeDFd" role="1CySjL" />
        </node>
      </node>
    </node>
    <node concept="37mRI7" id="i1eH3VeDCS" role="lGtFl">
      <node concept="37mRIm" id="i1eH3VeDCT" role="37mRID">
        <property role="37mO49" value="324605317389916723" />
        <node concept="gqqVs" id="i1eH3VeDCR" role="37mO4d">
          <property role="gqqTZ" value="146.0" />
          <property role="gqqTW" value="37.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDDo" role="37mRID">
        <property role="37mO49" value="324605317389916750" />
        <node concept="gqqVs" id="i1eH3VeDDn" role="37mO4d">
          <property role="gqqTZ" value="154.0" />
          <property role="gqqTW" value="125.0" />
          <property role="gqqTX" value="166.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDDX" role="37mRID">
        <property role="37mO49" value="324605317389916778" />
        <node concept="gqqVs" id="i1eH3VeDDW" role="37mO4d">
          <property role="gqqTZ" value="98.0" />
          <property role="gqqTW" value="174.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDE$" role="37mRID">
        <property role="37mO49" value="324605317389916810" />
        <node concept="gqqVs" id="i1eH3VeDEz" role="37mO4d">
          <property role="gqqTZ" value="209.0" />
          <property role="gqqTW" value="109.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDGd" role="37mRID">
        <property role="37mO49" value="324605317389916904" />
        <node concept="gqqVs" id="i1eH3VeDGc" role="37mO4d">
          <property role="gqqTZ" value="223.0" />
          <property role="gqqTW" value="177.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDGZ" role="37mRID">
        <property role="37mO49" value="324605317389916955" />
        <node concept="gqqVs" id="i1eH3VeDGY" role="37mO4d">
          <property role="gqqTZ" value="224.0" />
          <property role="gqqTW" value="263.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDHR" role="37mRID">
        <property role="37mO49" value="324605317389917007" />
        <node concept="gqqVs" id="i1eH3VeDHQ" role="37mO4d">
          <property role="gqqTZ" value="88.0" />
          <property role="gqqTW" value="270.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDDE" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDDT" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCHe" resolve="MajorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDDN" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDDP" role="_GsXX">
          <property role="_GsXS" value="120" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDDR" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDI7" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDDE" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDHf" resolve="Discharge" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDEa" role="2MhjZp">
      <property role="TrG5h" value="AdditionalAssessment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDEw" role="2_8HaY">
        <ref role="2_8ZNy" node="52K8Ej3GgM" resolve="SeniorDoc" />
      </node>
      <node concept="1M3RjT" id="i1eH3VeDEr" role="1M293l">
        <property role="1M3RjU" value="15" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDEu" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDGp" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDEa" resolve="AdditionalAssessment" />
        <ref role="2GGxGe" node="i1eH3VeDFC" resolve="Wait" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDFC" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDG9" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCHe" resolve="MajorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDG2" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDG5" role="_GsXX">
          <property role="_GsXS" value="120" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDG7" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDHd" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDFC" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDGr" resolve="Discharge" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDGr" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDGT" role="2_8HaY">
        <ref role="2_8ZNy" node="av1M7vbJYz" resolve="MajorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDGW" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDHf" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDHN" role="2_8HaY">
        <ref role="2_8ZNy" node="av1M7vbJYz" resolve="MajorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDHL" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
  </node>
  <node concept="2MhjZA" id="i1eH3VeDI9">
    <property role="3GE5qa" value="Action Cards" />
    <property role="TrG5h" value="Minors_Emeregency" />
    <node concept="2MhjZa" id="i1eH3VeDIa" role="2MhjZp">
      <property role="TrG5h" value="Treatment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDK0" role="2_8HaY">
        <ref role="2_8ZNy" node="i1eH3VeDCH" resolve="MinorsDoctor" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDIc" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDId" role="_GsXX">
          <property role="_GsXS" value="20" />
          <property role="_GsXA" value="1" />
        </node>
        <node concept="_GsXV" id="i1eH3VeDKf" role="_GsXX">
          <property role="_GsXS" value="30" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDIe" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDIf" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDIa" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDI$" resolve="Wait" />
        <node concept="1CySur" id="i1eH3VeDIg" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAk" />
          <node concept="1FjjCm" id="i1eH3VeDIh" role="1CySjL" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDIi" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDIa" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDIE" resolve="AdditionalAssessment" />
        <node concept="1CySur" id="i1eH3VeDIj" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAk" />
          <node concept="1FjjCg" id="i1eH3VeDIk" role="1CySjL" />
        </node>
      </node>
    </node>
    <node concept="37mRI7" id="i1eH3VeDIl" role="lGtFl">
      <node concept="37mRIm" id="i1eH3VeDIm" role="37mRID">
        <property role="37mO49" value="324605317389916723" />
        <node concept="gqqVs" id="i1eH3VeDIn" role="37mO4d">
          <property role="gqqTZ" value="146.0" />
          <property role="gqqTW" value="37.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDIo" role="37mRID">
        <property role="37mO49" value="324605317389916750" />
        <node concept="gqqVs" id="i1eH3VeDIp" role="37mO4d">
          <property role="gqqTZ" value="154.0" />
          <property role="gqqTW" value="125.0" />
          <property role="gqqTX" value="166.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDIq" role="37mRID">
        <property role="37mO49" value="324605317389916778" />
        <node concept="gqqVs" id="i1eH3VeDIr" role="37mO4d">
          <property role="gqqTZ" value="98.0" />
          <property role="gqqTW" value="174.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDIs" role="37mRID">
        <property role="37mO49" value="324605317389916810" />
        <node concept="gqqVs" id="i1eH3VeDIt" role="37mO4d">
          <property role="gqqTZ" value="209.0" />
          <property role="gqqTW" value="109.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDIu" role="37mRID">
        <property role="37mO49" value="324605317389916904" />
        <node concept="gqqVs" id="i1eH3VeDIv" role="37mO4d">
          <property role="gqqTZ" value="223.0" />
          <property role="gqqTW" value="177.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDIw" role="37mRID">
        <property role="37mO49" value="324605317389916955" />
        <node concept="gqqVs" id="i1eH3VeDIx" role="37mO4d">
          <property role="gqqTZ" value="224.0" />
          <property role="gqqTW" value="263.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDIy" role="37mRID">
        <property role="37mO49" value="324605317389917007" />
        <node concept="gqqVs" id="i1eH3VeDIz" role="37mO4d">
          <property role="gqqTZ" value="88.0" />
          <property role="gqqTW" value="270.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJ2" role="37mRID">
        <property role="37mO49" value="324605317389917066" />
        <node concept="gqqVs" id="i1eH3VeDJ1" role="37mO4d">
          <property role="gqqTZ" value="12.000100000000003" />
          <property role="gqqTW" value="12.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJ4" role="37mRID">
        <property role="37mO49" value="324605317389917092" />
        <node concept="gqqVs" id="i1eH3VeDJ3" role="37mO4d">
          <property role="gqqTZ" value="225.0002983642578" />
          <property role="gqqTW" value="12.000000000000002" />
          <property role="gqqTX" value="50.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJ6" role="37mRID">
        <property role="37mO49" value="324605317389917098" />
        <node concept="gqqVs" id="i1eH3VeDJ5" role="37mO4d">
          <property role="gqqTZ" value="148.00029836425782" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJ8" role="37mRID">
        <property role="37mO49" value="324605317389917103" />
        <node concept="gqqVs" id="i1eH3VeDJ7" role="37mO4d">
          <property role="gqqTZ" value="394.0004967285156" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="50.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJa" role="37mRID">
        <property role="37mO49" value="324605317389917109" />
        <node concept="gqqVs" id="i1eH3VeDJ9" role="37mO4d">
          <property role="gqqTZ" value="486.0007103515625" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJc" role="37mRID">
        <property role="37mO49" value="324605317389917112" />
        <node concept="gqqVs" id="i1eH3VeDJb" role="37mO4d">
          <property role="gqqTZ" value="370.0004967285156" />
          <property role="gqqTW" value="12.000000000000004" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDJe" role="37mRID">
        <property role="37mO49" value="324605317389917074" />
        <node concept="2VclpC" id="i1eH3VeDJd" role="37mO4d">
          <node concept="2VclrF" id="i1eH3VeDJf" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="30.50005" />
          </node>
          <node concept="2VclrF" id="i1eH3VeDJg" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="85.50005" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDI$" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDK3" role="2_8HaY">
        <ref role="2_8ZNy" node="1xAzJ9NxGdV" resolve="MinorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDIA" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDIB" role="_GsXX">
          <property role="_GsXS" value="30" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDIC" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDID" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDI$" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDIS" resolve="Discharge" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDIE" role="2MhjZp">
      <property role="TrG5h" value="AdditionalAssessment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDIF" role="2_8HaY">
        <ref role="2_8ZNy" node="52K8Ej3GgM" resolve="SeniorDoc" />
      </node>
      <node concept="1M3RjT" id="i1eH3VeDIG" role="1M293l">
        <property role="1M3RjU" value="15" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDIH" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDII" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDIE" resolve="AdditionalAssessment" />
        <ref role="2GGxGe" node="i1eH3VeDIJ" resolve="Wait" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDIJ" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDK6" role="2_8HaY">
        <ref role="2_8ZNy" node="1xAzJ9NxGdV" resolve="MinorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDIL" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDIM" role="_GsXX">
          <property role="_GsXS" value="30" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDIN" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDIO" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDIJ" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDIP" resolve="Discharge" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDIP" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDKc" role="2_8HaY">
        <ref role="2_8ZNy" node="i1eH3VeDCH" resolve="MinorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDIR" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDIS" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDK9" role="2_8HaY">
        <ref role="2_8ZNy" node="i1eH3VeDCH" resolve="MinorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDIU" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
  </node>
  <node concept="2MhjZA" id="i1eH3VeDNM">
    <property role="3GE5qa" value="Action Cards" />
    <property role="TrG5h" value="Majors_Elective" />
    <node concept="2MhjZa" id="i1eH3VeDNN" role="2MhjZp">
      <property role="TrG5h" value="Treatment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDNO" role="2_8HaY">
        <ref role="2_8ZNy" node="av1M7vbJYz" resolve="MajorsDoctor" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDNP" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDNQ" role="_GsXX">
          <property role="_GsXS" value="60" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDNR" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDNS" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDNN" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDOd" resolve="Wait" />
        <node concept="1CySur" id="i1eH3VeDNT" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAX" />
          <node concept="1FjjCm" id="i1eH3VeDNU" role="1CySjL" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDNV" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDNN" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDOj" resolve="AdditionalAssessment" />
        <node concept="1CySur" id="i1eH3VeDNW" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAX" />
          <node concept="1FjjCg" id="i1eH3VeDNX" role="1CySjL" />
        </node>
      </node>
    </node>
    <node concept="37mRI7" id="i1eH3VeDNY" role="lGtFl">
      <node concept="37mRIm" id="i1eH3VeDNZ" role="37mRID">
        <property role="37mO49" value="324605317389916723" />
        <node concept="gqqVs" id="i1eH3VeDO0" role="37mO4d">
          <property role="gqqTZ" value="146.0" />
          <property role="gqqTW" value="37.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDO1" role="37mRID">
        <property role="37mO49" value="324605317389916750" />
        <node concept="gqqVs" id="i1eH3VeDO2" role="37mO4d">
          <property role="gqqTZ" value="154.0" />
          <property role="gqqTW" value="125.0" />
          <property role="gqqTX" value="166.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDO3" role="37mRID">
        <property role="37mO49" value="324605317389916778" />
        <node concept="gqqVs" id="i1eH3VeDO4" role="37mO4d">
          <property role="gqqTZ" value="98.0" />
          <property role="gqqTW" value="174.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDO5" role="37mRID">
        <property role="37mO49" value="324605317389916810" />
        <node concept="gqqVs" id="i1eH3VeDO6" role="37mO4d">
          <property role="gqqTZ" value="209.0" />
          <property role="gqqTW" value="109.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDO7" role="37mRID">
        <property role="37mO49" value="324605317389916904" />
        <node concept="gqqVs" id="i1eH3VeDO8" role="37mO4d">
          <property role="gqqTZ" value="223.0" />
          <property role="gqqTW" value="177.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDO9" role="37mRID">
        <property role="37mO49" value="324605317389916955" />
        <node concept="gqqVs" id="i1eH3VeDOa" role="37mO4d">
          <property role="gqqTZ" value="224.0" />
          <property role="gqqTW" value="263.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDOb" role="37mRID">
        <property role="37mO49" value="324605317389917007" />
        <node concept="gqqVs" id="i1eH3VeDOc" role="37mO4d">
          <property role="gqqTZ" value="88.0" />
          <property role="gqqTW" value="270.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUsz" role="37mRID">
        <property role="37mO49" value="324605317389917427" />
        <node concept="gqqVs" id="i1eH3VfUsy" role="37mO4d">
          <property role="gqqTZ" value="12.000100000000003" />
          <property role="gqqTW" value="12.0" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUs_" role="37mRID">
        <property role="37mO49" value="324605317389917453" />
        <node concept="gqqVs" id="i1eH3VfUs$" role="37mO4d">
          <property role="gqqTZ" value="225.0002983642578" />
          <property role="gqqTW" value="12.000000000000002" />
          <property role="gqqTX" value="52.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUsB" role="37mRID">
        <property role="37mO49" value="324605317389917459" />
        <node concept="gqqVs" id="i1eH3VfUsA" role="37mO4d">
          <property role="gqqTZ" value="148.00029836425782" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="212.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUsD" role="37mRID">
        <property role="37mO49" value="324605317389917464" />
        <node concept="gqqVs" id="i1eH3VfUsC" role="37mO4d">
          <property role="gqqTZ" value="394.0004967285156" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="52.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUsF" role="37mRID">
        <property role="37mO49" value="324605317389917470" />
        <node concept="gqqVs" id="i1eH3VfUsE" role="37mO4d">
          <property role="gqqTZ" value="486.0007103515625" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUsH" role="37mRID">
        <property role="37mO49" value="324605317389917473" />
        <node concept="gqqVs" id="i1eH3VfUsG" role="37mO4d">
          <property role="gqqTZ" value="370.0004967285156" />
          <property role="gqqTW" value="12.000000000000004" />
          <property role="gqqTX" value="102.0" />
          <property role="gqqTy" value="38.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VfUsJ" role="37mRID">
        <property role="37mO49" value="324605317389917435" />
        <node concept="2VclpC" id="i1eH3VfUsI" role="37mO4d">
          <node concept="2VclrF" id="i1eH3VfUsK" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="30.50005" />
          </node>
          <node concept="2VclrF" id="i1eH3VfUsL" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="85.50005" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDOd" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDOe" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCHe" resolve="MajorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDOf" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDOg" role="_GsXX">
          <property role="_GsXS" value="120" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDOh" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDOi" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDOd" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDOx" resolve="Discharge" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDOj" role="2MhjZp">
      <property role="TrG5h" value="AdditionalAssessment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDOk" role="2_8HaY">
        <ref role="2_8ZNy" node="52K8Ej3GgM" resolve="SeniorDoc" />
      </node>
      <node concept="1M3RjT" id="i1eH3VeDOl" role="1M293l">
        <property role="1M3RjU" value="15" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDOm" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDOn" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDOj" resolve="AdditionalAssessment" />
        <ref role="2GGxGe" node="i1eH3VeDOo" resolve="Wait" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDOo" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDOp" role="2_8HaY">
        <ref role="2_8ZNy" node="2_JteYPiCHe" resolve="MajorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDOq" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDOr" role="_GsXX">
          <property role="_GsXS" value="120" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDOs" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHdw" resolve="MajorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDOt" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDOo" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDOu" resolve="Discharge" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDOu" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDOv" role="2_8HaY">
        <ref role="2_8ZNy" node="av1M7vbJYz" resolve="MajorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDOw" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDOx" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDOy" role="2_8HaY">
        <ref role="2_8ZNy" node="av1M7vbJYz" resolve="MajorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDOz" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
  </node>
  <node concept="2MhjZA" id="i1eH3VeDPM">
    <property role="3GE5qa" value="Action Cards" />
    <property role="TrG5h" value="Minors_Elective" />
    <node concept="2MhjZa" id="i1eH3VeDPN" role="2MhjZp">
      <property role="TrG5h" value="Treatment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDPO" role="2_8HaY">
        <ref role="2_8ZNy" node="i1eH3VeDCH" resolve="MinorsDoctor" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDPP" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDPQ" role="_GsXX">
          <property role="_GsXS" value="20" />
          <property role="_GsXA" value="1" />
        </node>
        <node concept="_GsXV" id="i1eH3VeDPR" role="_GsXX">
          <property role="_GsXS" value="30" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDPS" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDPT" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDPN" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDQu" resolve="Wait" />
        <node concept="1CySur" id="i1eH3VeDPU" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAk" />
          <node concept="1FjjCm" id="i1eH3VeDPV" role="1CySjL" />
        </node>
      </node>
      <node concept="2GGxJi" id="i1eH3VeDPW" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDPN" resolve="Treatment" />
        <ref role="2GGxGe" node="i1eH3VeDQ$" resolve="AdditionalAssessment" />
        <node concept="1CySur" id="i1eH3VeDPX" role="1hyIAf">
          <ref role="1DsR7o" node="i1eH3VeDAk" />
          <node concept="1FjjCg" id="i1eH3VeDPY" role="1CySjL" />
        </node>
      </node>
    </node>
    <node concept="37mRI7" id="i1eH3VeDPZ" role="lGtFl">
      <node concept="37mRIm" id="i1eH3VeDQ0" role="37mRID">
        <property role="37mO49" value="324605317389916723" />
        <node concept="gqqVs" id="i1eH3VeDQ1" role="37mO4d">
          <property role="gqqTZ" value="146.0" />
          <property role="gqqTW" value="37.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQ2" role="37mRID">
        <property role="37mO49" value="324605317389916750" />
        <node concept="gqqVs" id="i1eH3VeDQ3" role="37mO4d">
          <property role="gqqTZ" value="154.0" />
          <property role="gqqTW" value="125.0" />
          <property role="gqqTX" value="166.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQ4" role="37mRID">
        <property role="37mO49" value="324605317389916778" />
        <node concept="gqqVs" id="i1eH3VeDQ5" role="37mO4d">
          <property role="gqqTZ" value="98.0" />
          <property role="gqqTW" value="174.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQ6" role="37mRID">
        <property role="37mO49" value="324605317389916810" />
        <node concept="gqqVs" id="i1eH3VeDQ7" role="37mO4d">
          <property role="gqqTZ" value="209.0" />
          <property role="gqqTW" value="109.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQ8" role="37mRID">
        <property role="37mO49" value="324605317389916904" />
        <node concept="gqqVs" id="i1eH3VeDQ9" role="37mO4d">
          <property role="gqqTZ" value="223.0" />
          <property role="gqqTW" value="177.0" />
          <property role="gqqTX" value="80.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQa" role="37mRID">
        <property role="37mO49" value="324605317389916955" />
        <node concept="gqqVs" id="i1eH3VeDQb" role="37mO4d">
          <property role="gqqTZ" value="224.0" />
          <property role="gqqTW" value="263.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQc" role="37mRID">
        <property role="37mO49" value="324605317389917007" />
        <node concept="gqqVs" id="i1eH3VeDQd" role="37mO4d">
          <property role="gqqTZ" value="88.0" />
          <property role="gqqTW" value="270.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQe" role="37mRID">
        <property role="37mO49" value="324605317389917066" />
        <node concept="gqqVs" id="i1eH3VeDQf" role="37mO4d">
          <property role="gqqTZ" value="12.000100000000003" />
          <property role="gqqTW" value="12.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQg" role="37mRID">
        <property role="37mO49" value="324605317389917092" />
        <node concept="gqqVs" id="i1eH3VeDQh" role="37mO4d">
          <property role="gqqTZ" value="225.0002983642578" />
          <property role="gqqTW" value="12.000000000000002" />
          <property role="gqqTX" value="50.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQi" role="37mRID">
        <property role="37mO49" value="324605317389917098" />
        <node concept="gqqVs" id="i1eH3VeDQj" role="37mO4d">
          <property role="gqqTZ" value="148.00029836425782" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQk" role="37mRID">
        <property role="37mO49" value="324605317389917103" />
        <node concept="gqqVs" id="i1eH3VeDQl" role="37mO4d">
          <property role="gqqTZ" value="394.0004967285156" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="50.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQm" role="37mRID">
        <property role="37mO49" value="324605317389917109" />
        <node concept="gqqVs" id="i1eH3VeDQn" role="37mO4d">
          <property role="gqqTZ" value="486.0007103515625" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQo" role="37mRID">
        <property role="37mO49" value="324605317389917112" />
        <node concept="gqqVs" id="i1eH3VeDQp" role="37mO4d">
          <property role="gqqTZ" value="370.0004967285156" />
          <property role="gqqTW" value="12.000000000000004" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VeDQq" role="37mRID">
        <property role="37mO49" value="324605317389917074" />
        <node concept="2VclpC" id="i1eH3VeDQr" role="37mO4d">
          <node concept="2VclrF" id="i1eH3VeDQs" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="30.50005" />
          </node>
          <node concept="2VclrF" id="i1eH3VeDQt" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="85.50005" />
          </node>
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMa" role="37mRID">
        <property role="37mO49" value="324605317389917555" />
        <node concept="gqqVs" id="i1eH3VgOM9" role="37mO4d">
          <property role="gqqTZ" value="12.000100000000003" />
          <property role="gqqTW" value="12.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMc" role="37mRID">
        <property role="37mO49" value="324605317389917598" />
        <node concept="gqqVs" id="i1eH3VgOMb" role="37mO4d">
          <property role="gqqTZ" value="225.0002983642578" />
          <property role="gqqTW" value="12.000000000000002" />
          <property role="gqqTX" value="50.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMe" role="37mRID">
        <property role="37mO49" value="324605317389917604" />
        <node concept="gqqVs" id="i1eH3VgOMd" role="37mO4d">
          <property role="gqqTZ" value="148.00029836425782" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="204.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMg" role="37mRID">
        <property role="37mO49" value="324605317389917609" />
        <node concept="gqqVs" id="i1eH3VgOMf" role="37mO4d">
          <property role="gqqTZ" value="394.0004967285156" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="50.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMi" role="37mRID">
        <property role="37mO49" value="324605317389917615" />
        <node concept="gqqVs" id="i1eH3VgOMh" role="37mO4d">
          <property role="gqqTZ" value="486.0007103515625" />
          <property role="gqqTW" value="67.0" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMk" role="37mRID">
        <property role="37mO49" value="324605317389917618" />
        <node concept="gqqVs" id="i1eH3VgOMj" role="37mO4d">
          <property role="gqqTZ" value="370.0004967285156" />
          <property role="gqqTW" value="12.000000000000004" />
          <property role="gqqTX" value="98.0" />
          <property role="gqqTy" value="37.0" />
          <property role="TgtnS" value="1.0;0.0;0.0;1.0;0.0;0.0" />
        </node>
      </node>
      <node concept="37mRIm" id="i1eH3VgOMm" role="37mRID">
        <property role="37mO49" value="324605317389917564" />
        <node concept="2VclpC" id="i1eH3VgOMl" role="37mO4d">
          <node concept="2VclrF" id="i1eH3VgOMn" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="30.50005" />
          </node>
          <node concept="2VclrF" id="i1eH3VgOMo" role="2Vcluh">
            <property role="2Vclpx" value="128.0001983642578" />
            <property role="2Vclpz" value="85.50005" />
          </node>
        </node>
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDQu" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDQv" role="2_8HaY">
        <ref role="2_8ZNy" node="1xAzJ9NxGdV" resolve="MinorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDQw" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDQx" role="_GsXX">
          <property role="_GsXS" value="30" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDQy" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDQz" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDQu" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDQM" resolve="Discharge" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDQ$" role="2MhjZp">
      <property role="TrG5h" value="AdditionalAssessment" />
      <property role="3lFixl" value="true" />
      <node concept="2_8ZN7" id="i1eH3VeDQ_" role="2_8HaY">
        <ref role="2_8ZNy" node="52K8Ej3GgM" resolve="SeniorDoc" />
      </node>
      <node concept="1M3RjT" id="i1eH3VeDQA" role="1M293l">
        <property role="1M3RjU" value="15" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDQB" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDQC" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDQ$" resolve="AdditionalAssessment" />
        <ref role="2GGxGe" node="i1eH3VeDQD" resolve="Wait" />
      </node>
    </node>
    <node concept="2MhjZa" id="i1eH3VeDQD" role="2MhjZp">
      <property role="TrG5h" value="Wait" />
      <node concept="2_8ZN7" id="i1eH3VeDQE" role="2_8HaY">
        <ref role="2_8ZNy" node="1xAzJ9NxGdV" resolve="MinorsNurse" />
      </node>
      <node concept="_GsXW" id="i1eH3VeDQF" role="1M293l">
        <node concept="_GsXV" id="i1eH3VeDQG" role="_GsXX">
          <property role="_GsXS" value="30" />
          <property role="_GsXA" value="1" />
        </node>
      </node>
      <node concept="UeIYj" id="i1eH3VeDQH" role="3lENdC">
        <ref role="Udx8D" node="52K8Ej3Gdk" resolve="MinorsBay" />
      </node>
      <node concept="2GGxJi" id="i1eH3VeDQI" role="A3aay">
        <ref role="3tVEyn" node="i1eH3VeDQD" resolve="Wait" />
        <ref role="2GGxGe" node="i1eH3VeDQJ" resolve="Discharge" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDQJ" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDQK" role="2_8HaY">
        <ref role="2_8ZNy" node="i1eH3VeDCH" resolve="MinorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDQL" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
    <node concept="1H2jYY" id="i1eH3VeDQM" role="2MhjZp">
      <property role="TrG5h" value="Discharge" />
      <node concept="2_8ZN7" id="i1eH3VeDQN" role="2_8HaY">
        <ref role="2_8ZNy" node="i1eH3VeDCH" resolve="MinorsDoctor" />
      </node>
      <node concept="UeIYj" id="i1eH3VeDQO" role="3lENdC">
        <ref role="Udx8D" node="EFW1mYOHez" resolve="MainEntrance" />
      </node>
    </node>
  </node>
  <node concept="2GGxxg" id="i1eH3VgOG6">
    <property role="3GE5qa" value="Staff" />
    <property role="TrG5h" value="GASNurse" />
    <property role="3ZUNkI" value="1" />
    <property role="1kBeqs" value="2blVuwUK9bq/ORANGE" />
    <node concept="UeIYj" id="i1eH3VgOGg" role="2iD$2b">
      <ref role="Udx8D" node="EFW1mYOHdO" resolve="WaitingRoom" />
    </node>
  </node>
  <node concept="IzEoG" id="lSEs44UkB0">
    <property role="IzEow" value="Seat" />
  </node>
  <node concept="3ZaQxz" id="lSEs44UkD4">
    <node concept="MfX2X" id="lSEs44UkDD" role="3ZaQxH">
      <property role="1C_jdu" value="PatientSeverity" />
      <node concept="MfZuW" id="lSEs44UkDE" role="1R9Jzl" />
      <node concept="MfZID" id="lSEs44UkDF" role="1R9Jzl" />
      <node concept="MfwqT" id="lSEs44UkDG" role="1R9Jzl" />
    </node>
    <node concept="1RmbmY" id="lSEs44UkEc" role="3ZaQxH" />
  </node>
</model>

