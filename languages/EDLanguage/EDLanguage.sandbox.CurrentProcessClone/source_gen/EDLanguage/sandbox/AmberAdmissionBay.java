package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class AmberAdmissionBay extends RoomType {
  private static AmberAdmissionBay instance;

  private AmberAdmissionBay() {
    super();
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new AmberAdmissionBay();
    }
    return instance;
  }
}
