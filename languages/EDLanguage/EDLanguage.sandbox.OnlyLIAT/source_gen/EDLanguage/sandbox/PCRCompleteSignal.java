package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.DirectSignal;

public class PCRCompleteSignal extends DirectSignal {
  public PCRCompleteSignal() {
    this.setName("PCRComplete");
    this.setDescription("PCR test has finished");
    this.AddActor("Doctor");
    this.AddActor("Nurse");
    this.AddActor("MajorsABDoctor");
  }
}