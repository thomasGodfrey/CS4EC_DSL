package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.ActorTypeSignal;

public class ConductLIATTrackAndTraceSignal extends ActorTypeSignal {
  public ConductLIATTrackAndTraceSignal() {
    this.setName("ConductLIATTrackAndTrace");
    this.setDescription("do a LIAT PCR test for discharged patient");
    this.AddActor("LIATMachine");
  }

}
