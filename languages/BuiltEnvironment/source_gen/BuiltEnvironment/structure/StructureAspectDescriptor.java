package BuiltEnvironment.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import jetbrains.mps.smodel.runtime.EnumerationDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import jetbrains.mps.smodel.runtime.DataTypeDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder2;
import jetbrains.mps.smodel.adapter.ids.PrimitiveTypeId;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  /*package*/ final ConceptDescriptor myConceptActorInstantiation = createDescriptorForActorInstantiation();
  /*package*/ final ConceptDescriptor myConceptAdmissionBay = createDescriptorForAdmissionBay();
  /*package*/ final ConceptDescriptor myConceptAdmissionBayList = createDescriptorForAdmissionBayList();
  /*package*/ final ConceptDescriptor myConceptArea = createDescriptorForArea();
  /*package*/ final ConceptDescriptor myConceptMapImporter = createDescriptorForMapImporter();
  /*package*/ final ConceptDescriptor myConceptResource = createDescriptorForResource();
  /*package*/ final ConceptDescriptor myConceptResourceAllocation = createDescriptorForResourceAllocation();
  /*package*/ final ConceptDescriptor myConceptResourceAvailabilityVariable = createDescriptorForResourceAvailabilityVariable();
  /*package*/ final ConceptDescriptor myConceptRoom = createDescriptorForRoom();
  /*package*/ final ConceptDescriptor myConceptRoomInstanceDefinition = createDescriptorForRoomInstanceDefinition();
  /*package*/ final ConceptDescriptor myConceptRoomType = createDescriptorForRoomType();
  /*package*/ final ConceptDescriptor myConceptScenarioBuilder = createDescriptorForScenarioBuilder();
  /*package*/ final ConceptDescriptor myConceptWallDefinition = createDescriptorForWallDefinition();
  /*package*/ final ConceptDescriptor myConceptWallInstanceDefinition = createDescriptorForWallInstanceDefinition();
  /*package*/ final EnumerationDescriptor myEnumerationDirection = new EnumerationDescriptor_Direction();
  /*package*/ final EnumerationDescriptor myEnumerationOccupiableTypes = new EnumerationDescriptor_OccupiableTypes();
  private final LanguageConceptSwitch myIndexSwitch;

  public StructureAspectDescriptor() {
    myIndexSwitch = new LanguageConceptSwitch();
  }


  @Override
  public void reportDependencies(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.Dependencies deps) {
    deps.extendedLanguage(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, "jetbrains.mps.lang.core");
    deps.extendedLanguage(0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, "org.iets3.core.expr.base");
    deps.aggregatedLanguage(0xd3a0fd26445a466cL, 0x900e10444ddfed52L, "com.mbeddr.mpsutil.filepicker");
    deps.aggregatedLanguage(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, "AgentLanguage");
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptActorInstantiation, myConceptAdmissionBay, myConceptAdmissionBayList, myConceptArea, myConceptMapImporter, myConceptResource, myConceptResourceAllocation, myConceptResourceAvailabilityVariable, myConceptRoom, myConceptRoomInstanceDefinition, myConceptRoomType, myConceptScenarioBuilder, myConceptWallDefinition, myConceptWallInstanceDefinition);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    switch (myIndexSwitch.index(id)) {
      case LanguageConceptSwitch.ActorInstantiation:
        return myConceptActorInstantiation;
      case LanguageConceptSwitch.AdmissionBay:
        return myConceptAdmissionBay;
      case LanguageConceptSwitch.AdmissionBayList:
        return myConceptAdmissionBayList;
      case LanguageConceptSwitch.Area:
        return myConceptArea;
      case LanguageConceptSwitch.MapImporter:
        return myConceptMapImporter;
      case LanguageConceptSwitch.Resource:
        return myConceptResource;
      case LanguageConceptSwitch.ResourceAllocation:
        return myConceptResourceAllocation;
      case LanguageConceptSwitch.ResourceAvailabilityVariable:
        return myConceptResourceAvailabilityVariable;
      case LanguageConceptSwitch.Room:
        return myConceptRoom;
      case LanguageConceptSwitch.RoomInstanceDefinition:
        return myConceptRoomInstanceDefinition;
      case LanguageConceptSwitch.RoomType:
        return myConceptRoomType;
      case LanguageConceptSwitch.ScenarioBuilder:
        return myConceptScenarioBuilder;
      case LanguageConceptSwitch.WallDefinition:
        return myConceptWallDefinition;
      case LanguageConceptSwitch.WallInstanceDefinition:
        return myConceptWallInstanceDefinition;
      default:
        return null;
    }
  }

  @Override
  public Collection<DataTypeDescriptor> getDataTypeDescriptors() {
    return Arrays.asList(myEnumerationDirection, myEnumerationOccupiableTypes);
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    return myIndexSwitch.index(c);
  }

  private static ConceptDescriptor createDescriptorForActorInstantiation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "ActorInstantiation", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x35463334ce2f7b02L);
    b.class_(false, false, false);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/3838812034270460674");
    b.version(2);
    b.property("number", 0x35463334ce306bc9L).type(PrimitiveTypeId.INTEGER).origin("3838812034270522313").done();
    b.associate("actorType", 0x35463334ce306bcbL).target(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x35463334ce2f6271L).optional(false).origin("3838812034270522315").done();
    b.alias("actor");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAdmissionBay() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "AdmissionBay", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0xc489c6b16b4a524L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/885129310534673700");
    b.version(2);
    b.property("capacity", 0xc489c6b16b4a527L).type(PrimitiveTypeId.INTEGER).origin("885129310534673703").done();
    b.property("startOccupancy", 0x637eade0e663665fL).type(PrimitiveTypeId.INTEGER).origin("7169358838269961823").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForAdmissionBayList() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "AdmissionBayList", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0xc489c6b16b4a529L);
    b.class_(false, false, true);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/885129310534673705");
    b.version(2);
    b.aggregate("admissionBays", 0xc489c6b16b4a52aL).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0xc489c6b16b4a524L).optional(true).ordered(true).multiple(true).origin("885129310534673706").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForArea() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "Area", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3c282c112f249082L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/4334763093661094018");
    b.version(2);
    b.aggregate("rooms", 0x3c282c112f249083L).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3c282c112f249045L).optional(true).ordered(true).multiple(true).origin("4334763093661094019").done();
    b.aggregate("resourceNumbers", 0x5966f1c0f4192c8bL).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07ef54c6b7L).optional(true).ordered(true).multiple(true).origin("6442102128031378571").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForMapImporter() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "MapImporter", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0xaabf015bed74217L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/768972137583559191");
    b.version(2);
    b.associate("targetContainer", 0xaabf015bed74236L).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3c282c112f249082L).optional(false).origin("768972137583559222").done();
    b.aggregate("sourceFile", 0xaabf015bf5fafbbL).target(0xd3a0fd26445a466cL, 0x900e10444ddfed52L, 0x14e00b5befb780d2L).optional(true).ordered(true).multiple(false).origin("768972137592500155").done();
    b.alias("Map Importer");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResource() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "Resource", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07f032c8d7L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/4321323723324049623");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResourceAllocation() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "ResourceAllocation", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07ef54c6b7L);
    b.class_(false, false, false);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/4321323723309500087");
    b.version(2);
    b.property("startingNumber", 0x3bf86d07ef54c6b8L).type(PrimitiveTypeId.INTEGER).origin("4321323723309500088").done();
    b.property("replenishFrequency", 0x3bf86d07f20f809aL).type(PrimitiveTypeId.INTEGER).origin("4321323723355291802").done();
    b.property("replenishAmount", 0x3bf86d07f20f809dL).type(PrimitiveTypeId.INTEGER).origin("4321323723355291805").done();
    b.associate("resource", 0x3bf86d07ef54c6baL).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07f032c8d7L).optional(false).origin("4321323723309500090").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForResourceAvailabilityVariable() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "ResourceAvailabilityVariable", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07f2b57f6bL);
    b.class_(false, false, false);
    b.super_("org.iets3.core.expr.base.structure.Expression", 0xcfaa4966b7d54b69L, 0xb66a309a6e1a7290L, 0x670d5e92f854a047L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/4321323723366170475");
    b.version(2);
    b.associate("resource", 0x3bf86d07f2b57f75L).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3bf86d07f032c8d7L).optional(false).origin("4321323723366170485").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRoom() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "Room", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3c282c112f249042L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/4334763093661093954");
    b.version(2);
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRoomInstanceDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "RoomInstanceDefinition", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3c282c112f249045L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/4334763093661093957");
    b.version(2);
    b.property("x", 0x497144425f482c7fL).type(PrimitiveTypeId.INTEGER).origin("5292086088994139263").done();
    b.property("y", 0x497144425f482c81L).type(PrimitiveTypeId.INTEGER).origin("5292086088994139265").done();
    b.property("width", 0x497144425f7f2d45L).type(PrimitiveTypeId.INTEGER).origin("5292086088997743941").done();
    b.property("height", 0x497144425f7f2d49L).type(PrimitiveTypeId.INTEGER).origin("5292086088997743945").done();
    b.property("capacity", 0x497144425f7f437cL).type(PrimitiveTypeId.INTEGER).origin("5292086088997749628").done();
    b.property("colour", 0x66029deba11b71c3L).type(MetaIdFactory.dataTypeId(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x66029deba11b7155L)).origin("7350611177167876547").done();
    b.property("seats", 0x757b60e1223559b9L).type(PrimitiveTypeId.INTEGER).origin("8465466444630809017").done();
    b.property("desks", 0x757b60e1223559c2L).type(PrimitiveTypeId.INTEGER).origin("8465466444630809026").done();
    b.property("beds", 0x22d5ede83b4138f3L).type(PrimitiveTypeId.INTEGER).origin("2510173949011245299").done();
    b.property("ID", 0xaabf015beeb4a25L).type(PrimitiveTypeId.INTEGER).origin("768972137584871973").done();
    b.associate("roomType", 0x5dafd33966edbfc9L).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x5dafd33966e8fe19L).optional(false).origin("6750846609945116617").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForRoomType() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "RoomType", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x5dafd33966e8fe19L);
    b.class_(false, false, true);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/6750846609944804889");
    b.version(2);
    b.alias("roomtype");
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForScenarioBuilder() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "ScenarioBuilder", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x35463334ce2f7b00L);
    b.class_(false, false, true);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/3838812034270460672");
    b.version(2);
    b.property("secondsPerTick", 0x6ca3e29db4c202b4L).type(PrimitiveTypeId.INTEGER).origin("7828349744270410420").done();
    b.property("runDuration", 0x4f82e3275d8c1a55L).type(PrimitiveTypeId.INTEGER).origin("5729391434181384789").done();
    b.aggregate("agents", 0x35463334ce306babL).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x35463334ce2f7b02L).optional(true).ordered(true).multiple(true).origin("3838812034270522283").done();
    b.aggregate("relationships", 0x78ac309637c9f4L).target(0x7dcff301ba01414eL, 0x8574a8f6da31876bL, 0x78ac3096379b5dL).optional(true).ordered(true).multiple(true).origin("33966321883924980").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWallDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "WallDefinition", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x109830a68a82ca51L);
    b.class_(false, false, true);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/1195759192913398353");
    b.version(2);
    b.aggregate("walls", 0x109830a68a82ca54L).target(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x109830a68a78a1e8L).optional(true).ordered(true).multiple(true).origin("1195759192913398356").done();
    return b.create();
  }
  private static ConceptDescriptor createDescriptorForWallInstanceDefinition() {
    ConceptDescriptorBuilder2 b = new ConceptDescriptorBuilder2("BuiltEnvironment", "WallInstanceDefinition", 0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x109830a68a78a1e8L);
    b.class_(false, false, false);
    b.parent(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L);
    b.origin("r:a5dee2a3-4fe9-4915-8278-24d412bcaf0e(BuiltEnvironment.structure)/1195759192912732648");
    b.version(2);
    b.property("xStart", 0x109830a68a78a1ebL).type(PrimitiveTypeId.INTEGER).origin("1195759192912732651").done();
    b.property("yStart", 0x109830a68a78a1edL).type(PrimitiveTypeId.INTEGER).origin("1195759192912732653").done();
    b.property("xEnd", 0x109830a68a78a1f0L).type(PrimitiveTypeId.INTEGER).origin("1195759192912732656").done();
    b.property("yEnd", 0x109830a68a78a1f4L).type(PrimitiveTypeId.INTEGER).origin("1195759192912732660").done();
    return b.create();
  }
}
