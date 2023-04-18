package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class MajorsCWaitingRoom extends RoomType {
  private static RoomType instance;

  private MajorsCWaitingRoom() {
    super();
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new MajorsCWaitingRoom();
    }
    return instance;
  }
}