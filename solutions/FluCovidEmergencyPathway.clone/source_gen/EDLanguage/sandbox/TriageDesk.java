package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class TriageDesk extends RoomType {
  private static TriageDesk instance;

  private TriageDesk() {
    super();
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new TriageDesk();
    }
    return instance;
  }
}
