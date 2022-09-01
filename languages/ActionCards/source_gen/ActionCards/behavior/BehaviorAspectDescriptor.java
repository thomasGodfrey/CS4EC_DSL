package ActionCards.behavior;

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
  private final BHDescriptor myPatientProfile__BehaviorDescriptor = new PatientProfile__BehaviorDescriptor();
  private final BHDescriptor myIPatientProperty__BehaviorDescriptor = new IPatientProperty__BehaviorDescriptor();
  private final BHDescriptor myInfectionStatusProperty__BehaviorDescriptor = new InfectionStatusProperty__BehaviorDescriptor();
  private final BHDescriptor myVaccineStatusProperty__BehaviorDescriptor = new VaccineStatusProperty__BehaviorDescriptor();
  private final BHDescriptor myVaccinationStatus__BehaviorDescriptor = new VaccinationStatus__BehaviorDescriptor();
  private final BHDescriptor myPatientPropertyConditional__BehaviorDescriptor = new PatientPropertyConditional__BehaviorDescriptor();
  private final BHDescriptor myRecentCovidContactProperty__BehaviorDescriptor = new RecentCovidContactProperty__BehaviorDescriptor();
  private final BHDescriptor myRecentCOVIDContactCondition__BehaviorDescriptor = new RecentCOVIDContactCondition__BehaviorDescriptor();
  private final BHDescriptor myImmunosuppressedProperty__BehaviorDescriptor = new ImmunosuppressedProperty__BehaviorDescriptor();
  private final BHDescriptor myImmunocompromisedCondition__BehaviorDescriptor = new ImmunocompromisedCondition__BehaviorDescriptor();
  private final BHDescriptor myAction__BehaviorDescriptor = new Action__BehaviorDescriptor();
  private final BHDescriptor myRoomSelectionRule__BehaviorDescriptor = new RoomSelectionRule__BehaviorDescriptor();
  private final BHDescriptor myActionCardElement__BehaviorDescriptor = new ActionCardElement__BehaviorDescriptor();
  private final BHDescriptor myDiseaseSymptom__BehaviorDescriptor = new DiseaseSymptom__BehaviorDescriptor();

  public BehaviorAspectDescriptor() {
  }

  @Nullable
  public BHDescriptor getDescriptor(@NotNull SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return myAction__BehaviorDescriptor;
      case 1:
        return myActionCardElement__BehaviorDescriptor;
      case 2:
        return myDiseaseSymptom__BehaviorDescriptor;
      case 3:
        return myIPatientProperty__BehaviorDescriptor;
      case 4:
        return myImmunocompromisedCondition__BehaviorDescriptor;
      case 5:
        return myImmunosuppressedProperty__BehaviorDescriptor;
      case 6:
        return myInfectionStatusProperty__BehaviorDescriptor;
      case 7:
        return myPatientProfile__BehaviorDescriptor;
      case 8:
        return myPatientPropertyConditional__BehaviorDescriptor;
      case 9:
        return myRecentCOVIDContactCondition__BehaviorDescriptor;
      case 10:
        return myRecentCovidContactProperty__BehaviorDescriptor;
      case 11:
        return myRoomSelectionRule__BehaviorDescriptor;
      case 12:
        return myVaccinationStatus__BehaviorDescriptor;
      case 13:
        return myVaccineStatusProperty__BehaviorDescriptor;
      default:
    }
    return null;
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06864L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x348ff1b011fd1debL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x6ca3e29db4791132L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f3e3b4cL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2755ea288L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2755e811eL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f3e7089L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0xaabf015be947306L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732bde64L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732b9054L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x334005c766547220L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fc61141L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f40915dL)).seal();
}
