package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.Signals.ActorTypeSignal;
import repast.simphony.context.Context;
import simcore.agents.Actor;
import simcore.basicStructures.ToolBox;
import java.util.function.Predicate;
import simcore.basicStructures.Room;
import simcore.agents.Agent;
import repast.simphony.space.graph.Network;

public class SeniorDocReviewTrigger_iSignal extends ActorTypeSignal {
  public SeniorDocReviewTrigger_iSignal() {
    this.setName("SeniorDocReviewTrigger_i");
    this.setDescription("SecondPlaceholderSignal");
    this.AddActor("SeniorDoc");
  }

  public boolean checkPreCondition(Context context, final Actor receiver) {
    if (new ToolBox(context).ReadMap().FindInstancesOfRoomType(MajorsBay.getInstance()).stream().filter(new Predicate<Room>() {
      public boolean test(Room r) {
        return r.hasCapacity() || r.getOccupiers().stream().anyMatch(new Predicate<Agent>() {
          public boolean test(Agent actor) {
            return actor.getClass() == patient.class && ((Network) context.getProjection("CurrentPatientAllocations")).getEdge(receiver, actor) != null;
          }
        });
      }
    }).findAny().isPresent()) {
      return true;
    } else {
      return false;
    }
  }
}
