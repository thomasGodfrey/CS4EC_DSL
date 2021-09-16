package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class TriageSideRoom extends RoomType {
  private static TriageSideRoom instance;

  private TriageSideRoom() {
    super();
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new TriageSideRoom();
    }
    return instance;
  }
}