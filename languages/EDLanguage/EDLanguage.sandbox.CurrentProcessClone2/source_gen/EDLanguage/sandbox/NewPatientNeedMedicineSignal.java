package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.ActorTypeSignal;

public class NewPatientNeedMedicineSignal extends ActorTypeSignal {
  public NewPatientNeedMedicineSignal() {
    this.setName("NewPatientNeedMedicine");
    this.setDescription("");
    this.AddActor("Nurse");
    this.AddActor("Doctor");
  }

}