package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.DirectSignal;

public class PCRCompleteTwoSignal extends DirectSignal {
  public PCRCompleteTwoSignal() {
    this.setName("PCRCompleteTwo");
    this.setDescription("PCR test has finished");
    this.AddActor("Doctor");
    this.AddActor("Nurse");
    this.AddActor("MajorsABDoctor");
  }
}