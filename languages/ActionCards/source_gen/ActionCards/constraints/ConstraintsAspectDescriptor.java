package ActionCards.constraints;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseConstraintsAspectDescriptor;
import jetbrains.mps.smodel.runtime.ConstraintsDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.runtime.base.BaseConstraintsDescriptor;
import jetbrains.mps.lang.smodel.ConceptSwitchIndex;
import jetbrains.mps.lang.smodel.ConceptSwitchIndexBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;

public class ConstraintsAspectDescriptor extends BaseConstraintsAspectDescriptor {
  public ConstraintsAspectDescriptor() {
  }

  @Override
  public ConstraintsDescriptor getConstraints(SAbstractConcept concept) {
    SAbstractConcept cncpt = concept;
    switch (conceptIndex.index(cncpt)) {
      case 0:
        return new ActionCard_Constraints();
      case 1:
        return new ActionCardCondition_Constraints();
      case 2:
        return new ActionStep_Constraints();
      case 3:
        return new AttendanceRoute_Constraints();
      case 4:
        return new AttendanceRouteCondition_Constraints();
      case 5:
        return new BooleanExpression_Constraints();
      case 6:
        return new Branch_Constraints();
      case 7:
        return new DiagnosticCondition_Constraints();
      case 8:
        return new ElectiveAttendanceRoute_Constraints();
      case 9:
        return new EmergencyAttendanceRoute_Constraints();
      case 10:
        return new FullyVaccinated_Constraints();
      case 11:
        return new InfectionStatusCondition_Constraints();
      case 12:
        return new No_Constraints();
      case 13:
        return new PartiallyVaccinated_Constraints();
      case 14:
        return new PatientPropertyConditional_Constraints();
      case 15:
        return new RecentCOVIDContactCondition_Constraints();
      case 16:
        return new Unvaccinated_Constraints();
      case 17:
        return new VaccinationStatus_Constraints();
      case 18:
        return new VaccineStatusCondition_Constraints();
      case 19:
        return new Yes_Constraints();
      default:
    }
    return new BaseConstraintsDescriptor(concept);
  }
  private static final ConceptSwitchIndex conceptIndex = new ConceptSwitchIndexBuilder().put(MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x2ef557ae9cb06848L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef27386cf02L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3455bL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef273b09a5dL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef273c1dbbaL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732bb4e3L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x4f415ebce3f3456eL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x29f0721df36170cL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef273b09e71L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef273b09c56L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fc61137L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef27101e2faL), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732bb4e4L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fc61154L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef270ed0969L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732bde64L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fc61167L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26fc61141L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef26f431e45L), MetaIdFactory.conceptId(0xb3cac82cd02446bcL, 0xb485624ad80c3cc2L, 0x18668ef2732bb4e2L)).seal();
}
