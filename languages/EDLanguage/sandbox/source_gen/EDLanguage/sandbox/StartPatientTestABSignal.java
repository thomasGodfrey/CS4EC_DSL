package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.Signal;

public class StartPatientTestABSignal extends Signal {

  public StartPatientTestABSignal() {
    this.setName("StartPatientTestAB");
    this.setDescription("Start a test on a patient");
    this.AddActor("testingDevice");
  }
}
