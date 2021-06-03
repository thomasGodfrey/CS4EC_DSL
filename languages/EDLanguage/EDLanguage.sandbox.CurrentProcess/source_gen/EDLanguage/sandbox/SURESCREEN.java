package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.Test;

public class SURESCREEN extends Test {
  private static SURESCREEN instance;
  private SURESCREEN() {
    sensitivity = 0.6990000000000001;
    specificity = 0.99;
    processingTime = 900;
    name = "SURESCREEN";

  }

  public static Test getInstance() {
    if (instance == null) {
      instance = new SURESCREEN();
    }
    return instance;
  }

}
