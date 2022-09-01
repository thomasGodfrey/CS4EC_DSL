package BuiltEnvironment.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBehaviorAspectDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.BHDescriptor;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public final class BehaviorAspectDescriptor extends BaseBehaviorAspectDescriptor {
  private final BHDescriptor myOccupiableDefinition__BehaviorDescriptor = new OccupiableDefinition__BehaviorDescriptor();
  private final BHDescriptor myRoomType__BehaviorDescriptor = new RoomType__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return myOccupiableDefinition__BehaviorDescriptor;
      case 1:
        return myRoomType__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x3111466f1f9fe043L), MetaIdFactory.conceptId(0x1a0150acdda54129L, 0x824e01dce96fdea4L, 0x5dafd33966e8fe19L)).seal();
}
