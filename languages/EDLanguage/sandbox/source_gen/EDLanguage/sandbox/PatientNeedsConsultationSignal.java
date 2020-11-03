package EDLanguage.sandbox;

/*Generated by MPS */

import edHello.Signals.Signal;

public class PatientNeedsConsultationSignal extends Signal {

  public PatientNeedsConsultationSignal() {
    this.setName("PatientNeedsConsultation");
    this.setDescription("This patient's case requires a consultation with a Doctor");
    this.AddActor("Doctor");
  }
}
