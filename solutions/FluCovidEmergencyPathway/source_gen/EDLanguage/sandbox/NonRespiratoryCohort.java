package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.basicStructures.RoomType;

public class NonRespiratoryCohort extends RoomType {
  private static NonRespiratoryCohort instance;

  private NonRespiratoryCohort() {
    super();
  }

  public static RoomType getInstance() {
    if (instance == null) {
      instance = new NonRespiratoryCohort();
    }
    return instance;
  }
}
