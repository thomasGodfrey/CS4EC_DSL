package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class Ward extends RoomType {
  private static RoomType instance;

  private Ward() {
    super();
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new Ward();
    }
    return instance;
  }
}
