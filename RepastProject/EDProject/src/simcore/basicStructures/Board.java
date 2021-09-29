package simcore.basicStructures;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import simcore.Signals.ActorTypeSignal;
import simcore.Signals.DirectSignal;
import simcore.Signals.Signal;
import simcore.agents.Actor;

public class Board {
	
	public Set<Signal> board;
	
	public Board() {
		board = new HashSet<Signal>();
	}
	
	public void PushMission(Signal s) {
		board.add(s);
	}
	
//	// randomly take a mission and remove it from board
//	public Signal PullMission(Class c) {
//		Signal ans = null;
//		while(c != Actor.class){
//			for(Signal signal : board){
//				if(signal.CanBeActorOf(c)) {
//					ans = signal;
//					board.remove(signal);
//					return ans;
//				}
//			}
//			c = c.getSuperclass();
//		}
//		
//		return ans;
//	}
	
	public List<Signal> GetSignalListBySubject(Class c) {
		List<Signal> list = new ArrayList<Signal>();
		for(Signal signal : board){
			if(((signal instanceof ActorTypeSignal) && ((ActorTypeSignal)signal).CanBeActorOf(c)) || signal.getSubjects().isEmpty()) {
				list.add(signal);
			}
		}
		return list;
	}
	
	public List<Signal> GetDirectSignalsForMe(Actor a){
		List<Signal> list = new ArrayList<Signal>();
		for(Signal signal : board){
			if(signal instanceof DirectSignal && ((DirectSignal) signal).getTarget() == a) {
				list.add(signal);
			}
		}
		return list;
	}

}
