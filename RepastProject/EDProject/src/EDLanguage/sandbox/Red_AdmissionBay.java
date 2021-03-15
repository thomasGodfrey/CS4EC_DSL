package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.AdmissionBay;
import repast.simphony.engine.schedule.ScheduledMethod;

public class Red_AdmissionBay extends AdmissionBay {
  private static Red_AdmissionBay instance;

  private Red_AdmissionBay() {
    super("Red", 1000);
  }

  public Red_AdmissionBay(int curOccupancy) {
    super("Red", 1000, curOccupancy);
  }


  public static Red_AdmissionBay getInstance() {
    if (instance == null) {
      instance = new Red_AdmissionBay();
    }
    return instance;
  }


  @ScheduledMethod(start = 1)
  public static void initialise() {
    instance = new Red_AdmissionBay(0);
  }
}