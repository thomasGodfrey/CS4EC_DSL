package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.Signal;

public class StartPatientLIATTestSignal extends Signal {

  public StartPatientLIATTestSignal() {
    this.setName("StartPatientLIATTest");
    this.setDescription("Start the LIAT test for this patient");
    this.AddActor("LIATMachine");
  }
}
