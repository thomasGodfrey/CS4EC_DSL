package simcore.basicStructures;

import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

import repast.simphony.context.Context;
import repast.simphony.engine.environment.RunEnvironment;
import repast.simphony.engine.schedule.ISchedule;
import repast.simphony.engine.schedule.ScheduleParameters;
import repast.simphony.engine.schedule.ScheduledMethod;
import repast.simphony.engine.watcher.Watch;
import repast.simphony.engine.watcher.WatcherTriggerSchedule;
import repast.simphony.random.RandomHelper;
import repast.simphony.space.continuous.ContinuousSpace;
import repast.simphony.space.continuous.NdPoint;
import repast.simphony.space.graph.Network;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridDimensions;
import repast.simphony.space.grid.GridPoint;
import repast.simphony.ui.probe.ProbeID;
import repast.simphony.util.ContextUtils;
import repast.simphony.valueLayer.GridValueLayer;
import simcore.agents.Agent;
import simcore.agents.Patient;
import simcore.utilities.Cellbox;

public class Room extends Locatable{
	private String locName;
	private int colorID;
	private RoomType roomType;
	private Color roomColour;
	private GridPoint entry;
	private Integer maxCap;
	private Integer curCap;
	private Queue<Agent> waitList;
	protected Set<Agent> contentPeople;

	// Alternative constructor omitting the roomType (while roomType functionality
	// is in development)
	public Room(String name, Context<Object> context, ContinuousSpace<Object> space, Grid<Object> grid, int x,
			int y, int w, int h, int colorID, Integer capacity, Color pColor) {
		this(name, context, space, grid, x, y, w, h, colorID, capacity, null, pColor);
	}

	public Room(String name, Context<Object> context, ContinuousSpace<Object> space, Grid<Object> grid, int x,
			int y, int w, int h, int colorID, Integer capacity, RoomType pRoomType, Color pColor) {
		super(context, space, grid, x, y, w, h, Color.GRAY);

		this.locName = name;
		this.roomType = pRoomType;
		this.colorID = colorID;
		this.roomColour = pColor;

		this.maxCap = capacity;
		this.curCap = 0;

		// create entry Grid Point based on given position
		int midw = (width / 2);
		int midh = (height / 2);

		this.entry = new GridPoint(locX + midw, locY + midh);

		waitList = new LinkedList<Agent>();
		contentPeople = new HashSet<Agent>();

		// call function to create layout style for this location
		createLayoutStyle();
	}

	@ProbeID
	public String name() {
		return locName + " cap: " + (maxCap - curCap) + " width: " + width;
	}

	// every tick check for agent at entry point
	@ScheduledMethod(start = 1, interval = 1)
	public void step() {
		contentPeople = new HashSet<>();
		curCap = 0;
		
		ArrayList<Agent> plstPeople = new ArrayList<>();
		context.getObjects(Agent.class).forEach(p -> plstPeople.add((Agent)p));
		
		for (Agent person : plstPeople) {
			if(person.ImAt(this)) {
				person.SetInside(this);
				contentPeople.add(person);
				curCap++;
			}
		}
	}

	private void createLayoutStyle() {

		// loc box filled
		for (int x = locX; x < locX + (width); x++) {
			for (int y = locY; y < locY + (height); y++) {
				new Cellbox(context, x, y, colorID);
			}
		}

		// add special cellbox as entry of location
		GridValueLayer vl = (GridValueLayer) context.getValueLayer("cellbox");
		vl.set(4, entry.getX(), entry.getY());

		// add location to context and grid
		context.add(this);
		grid.moveTo(this, locX, locY + height);
		space.moveTo(this, locX + width / 2, locY + height / 2);
	}

	// get the entry or exit pos
	public GridPoint getEntryPoint() {
		return this.entry;
	}

	public void Write(String content) throws IOException {
		File file = new File("Location.txt");

		if (!file.exists()) {
			file.createNewFile();
		}

		FileWriter fileWritter = new FileWriter(file.getName(), true);

		fileWritter.write(content);
		fileWritter.write("\n");

		fileWritter.close();
	}

	// called by Agents,
	// e.g. Nurse: if(pharmacy.WithInside(this)) do something
	public boolean WithInside(Object o) {
		return contentPeople.contains(o);
	}

	// Agent already in queue
	public boolean WithInQueue(Object o) {
		return waitList.contains(o);
	}

	// check if loc is full
	public boolean isFull() {
		return curCap == maxCap;
	}

	// check if loc is empty
	public boolean isEmpty() {
		return curCap == 0;
	}

	public String GetName() {
		return this.locName;
	}

	public int getX() {
		return this.locX;
	}

	public int getY() {
		return this.locY;
	}

	public int getW() {
		return this.width;
	}

	public int getH() {
		return this.height;
	}

	public RoomType getRoomType() {
		return this.roomType;
	}

	public Color getColour() {
		return this.roomColour;
	}

	@Override
	public String toString() {
		return name();
	}
}


//package simcore.basicStructures;
//
//import java.awt.Color;
//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Set;
//import java.util.Stack;
//
//import repast.simphony.context.Context;
//import repast.simphony.engine.environment.RunEnvironment;
//import repast.simphony.engine.schedule.ISchedule;
//import repast.simphony.engine.schedule.ScheduleParameters;
//import repast.simphony.engine.schedule.ScheduledMethod;
//import repast.simphony.random.RandomHelper;
//import repast.simphony.space.continuous.ContinuousSpace;
//import repast.simphony.space.continuous.NdPoint;
//import repast.simphony.space.graph.Network;
//import repast.simphony.space.grid.Grid;
//import repast.simphony.space.grid.GridDimensions;
//import repast.simphony.space.grid.GridPoint;
//import repast.simphony.ui.probe.ProbeID;
//import repast.simphony.util.ContextUtils;
//import repast.simphony.valueLayer.GridValueLayer;
//import simcore.agents.Agent;
//import simcore.utilities.Cellbox;
//
//public class Location {
//	private String locName;
//	private int locX;
//	private int locY;
//	private Context<Object> context;
//	private int height;
//	private int width;
//	private int colorID;
//	private Grid<Object> grid;
//	private RoomType roomType;
//	private Color roomColour;
//
//	private ContinuousSpace<Object> space;
//
//	private GridPoint entry;
//	private String entryPoint;
//
//	private Integer maxCap;
//	private Integer curCap;
//
//	private Queue<Agent> waitList;
//	protected Set<Agent> contentPeople;
//
//	// Alternative constructor omitting the roomType (while roomType functionality
//	// is in development)
//	public Location(String name, Context<Object> context, ContinuousSpace<Object> space, Grid<Object> grid, int x,
//			int y, int w, int h, int colorID, Integer capacity, String entryPoint, Color pColor) {
//		this(name, context, space, grid, x, y, w, h, colorID, capacity, entryPoint, null, pColor);
//	}
//
//	public Location(String name, Context<Object> context, ContinuousSpace<Object> space, Grid<Object> grid, int x,
//			int y, int w, int h, int colorID, Integer capacity, String entryPoint, RoomType pRoomType, Color pColor) {
//		this.locName = name;
//		this.locX = x;
//		this.locY = y;
//		this.height = h;
//		this.width = w;
//		this.context = context;
//		this.roomType = pRoomType;
//
//		this.space = space;
//		this.grid = grid;
//
//		this.colorID = colorID;
//		this.roomColour = pColor;
//
//		this.maxCap = capacity;
//		this.curCap = 0;
//
//		// entryPoint = Top, Bottom, Left, Right
//		this.entryPoint = entryPoint;
//		// create entry Grid Point based on given position
//		int midw = (width / 2);
//		int midh = (height / 2);
//
//		this.entry = new GridPoint(locX + midw, locY + midh);
//
//		/**
//		 * switch(entryPoint) { case "Top": this.entry = new GridPoint(locX+midw,
//		 * locY+height-1); break; case "Bottom": this.entry = new GridPoint(locX+midw,
//		 * locY); break; case "Left": this.entry = new GridPoint(locX, locY+midh);
//		 * break; default: // right or unspecified this.entry = new
//		 * GridPoint(locX+width-1, locY+midh); break; }
//		 */
//
//		waitList = new LinkedList<Agent>();
//		contentPeople = new HashSet<Agent>();
//
//		// call function to create layout style for this location
//		createLayoutStyle();
//	}
//
//	@ProbeID
//	public String name() {
//		return locName + " cap: " + (maxCap - curCap) + " width: " + width;
//	}
//
//	// every tick check for agent at entry point
//	@ScheduledMethod(start = 1, interval = 1)
//	public void step() {
//		if (this.entry != null) {
//			checkEnter();
//		}
//	}
//
//	private void createLayoutStyle() {
//
//		// loc box filled
//		for (int x = locX; x < locX + (width); x++) {
//			for (int y = locY; y < locY + (height); y++) {
//				new Cellbox(context, x, y, colorID);
//			}
//		}
//
//		// add special cellbox as entry of location
//		GridValueLayer vl = (GridValueLayer) context.getValueLayer("cellbox");
//		vl.set(4, entry.getX(), entry.getY());
//
//		// add location to context and grid
//		context.add(this);
//		grid.moveTo(this, locX, locY + height);
//		space.moveTo(this, locX + width / 2, locY + height / 2);
//	}
//
//	// get the entry or exit pos
//	public GridPoint getEntryPoint() {
//		return this.entry;
//	}
//
//	public void checkEnter() {
//		// if the room is currently full, do nothing
//		if (this.isFull()) {
//			return;
//		}
//
//		// if it is not full and someone is waiting in the head of queue, let this
//		// person enter room
//		if (!waitList.isEmpty()) {
//			LetInPerson(waitList.poll());
//		}
//	}
//
//	// called by Agents: 
//	public void TakePerson(Agent a) {
//		System.out.println("ask received: take agent " + a);
//
//		//if the room is full, add this person into queue
//		if (this.isFull()) {
//			System.out.println("but is full: wait");
//			waitList.add(a);
//		// Otherwise, take the person in
//		} else {
//			LetInPerson(a);
//		}
//	}
//
//	// implement all the consequences of a person entering a room
//	public void LetInPerson(Agent a) {
//		contentPeople.add(a);
//		curCap++;
//		a.SetInside(this);
//
//		System.out.println("Location: " + this.GetName() + " let inside: " + a);
//		System.out.println("is inside: " + WithInside(a));
//	}
//
//	public void Write(String content) throws IOException {
//		File file = new File("Location.txt");
//
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//
//		FileWriter fileWritter = new FileWriter(file.getName(), true);
//
//		fileWritter.write(content);
//		fileWritter.write("\n");
//
//		fileWritter.close();
//	}
//
//	public void LetOutPerson(Agent a) {
//		contentPeople.remove(a);
//		curCap--;
//		a.SetInside(null);
//		
//		if(this instanceof WaitingRoomLocation) {
//			Seat pMySeat = ((WaitingRoomLocation)this).getMySeat(a);
//			if(pMySeat != null) {
//				pMySeat.eject(a);
//			}
//		}
//
//		System.out.println("Location: " + this.GetName() + " let outside: " + a);
//		System.out.println("is inside: " + WithInside(a));
//
//		// TODO: Choose a door to let person go out from
//
////		switch(this.entryPoint) {
////		case "Top":
////			grid.moveTo(ag, entry.getX(), entry.getY()+1);
////			break;
////		case "Bottom":
////			grid.moveTo(ag, entry.getX(), entry.getY()-1);
////			break;
////		case "Left":
////			grid.moveTo(ag, entry.getX()-1, entry.getY());
////			break;
////		default:
////			// right or unspecified
////			grid.moveTo(ag, entry.getX()+1, entry.getY());
////			break;
////		}
//
//	}
//
//	// called by Agents,
//	// e.g. Nurse: if(pharmacy.WithInside(this)) do something
//	public boolean WithInside(Object o) {
//		return contentPeople.contains(o);
//	}
//
//	// Agent already in queue
//	public boolean WithInQueue(Object o) {
//		return waitList.contains(o);
//	}
//
//	// check if loc is full
//	public boolean isFull() {
//		return curCap == maxCap;
//	}
//
//	// check if loc is empty
//	public boolean isEmpty() {
//		return curCap == 0;
//	}
//
//	// Discard: we don't need it because each agent stays for diiferent time span
//
//	// location class call this to exit earliest agent that came in first
////	public void exit() {
////		System.out.println(this.locName + " exit "+ this.entryPoint);
////		agentStaff ag = agentList.poll();
////		context.add(ag);
////		
////		switch(this.entryPoint) {
////		case "Top":
////			grid.moveTo(ag, entry.getX(), entry.getY()+1);
////			break;
////		case "Bottom":
////			grid.moveTo(ag, entry.getX(), entry.getY()-1);
////			break;
////		case "Left":
////			grid.moveTo(ag, entry.getX()-1, entry.getY());
////			break;
////		default:
////			// right or unspecified
////			grid.moveTo(ag, entry.getX()+1, entry.getY());
////			break;
////		}
////		
////		locCap++;
////		
////		//System.out.println(this.locName + " exit cap: " + this.locCap);
////	}
//
//	public String GetName() {
//		return this.locName;
//	}
//
//	public int getX() {
//		return this.locX;
//	}
//
//	public int getY() {
//		return this.locY;
//	}
//
//	public int getW() {
//		return this.width;
//	}
//
//	public int getH() {
//		return this.height;
//	}
//
//	public RoomType getRoomType() {
//		return this.roomType;
//	}
//
//	public Color getColour() {
//		return this.roomColour;
//	}
//
//	@Override
//	public String toString() {
//		return name();
//	}
//}
