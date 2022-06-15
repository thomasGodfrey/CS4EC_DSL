package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.ActorTypeSignal;
import repast.simphony.context.Context;
import simcore.basicStructures.ToolBox;
import java.util.function.Predicate;
import simcore.basicStructures.Room;

public class CheckSymptomsTrigger_bSignal extends ActorTypeSignal {
  public CheckSymptomsTrigger_bSignal() {
    this.setName("CheckSymptomsTrigger_b");
    this.setDescription("SecondPlaceholderSignal");
    this.AddActor("CubicleNurse");
  }

  public boolean checkPreCondition(Context context) {
    if (new ToolBox(context).ReadMap().FindInstancesOfRoomType(NonRespiratoryCubicle.getInstance()).stream().filter(new Predicate<Room>() {
      public boolean test(Room r) {
        return !(r.isFull());
      }
    }).findAny().isPresent()) {
      return true;
    } else {
      return false;
    }
  }
}
