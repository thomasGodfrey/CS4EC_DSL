package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class MajorsAB_Cubicle extends RoomType {
  private static RoomType instance;

  private MajorsAB_Cubicle() {
    super();
    actorAllocationLimit.put(patient.class, 1);
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new MajorsAB_Cubicle();
    }
    return instance;
  }
}
