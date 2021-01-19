package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.Test;

public class INOVA extends Test {
  private INOVA() {
    sensitivity = 0.008;
    specificity = 0.0091;
    processingTime = 10;
  }

  public static Test getInstance() {
    if (instance == null) {
      instance = new INOVA();
    }
    return instance;
  }
}
