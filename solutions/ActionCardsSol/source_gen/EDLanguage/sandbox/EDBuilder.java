package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.context.Context;
import repast.simphony.parameter.Parameters;
import repast.simphony.engine.environment.RunEnvironment;
import simcore.utilities.ModelParameterStore;
import repast.simphony.context.space.continuous.ContinuousSpaceFactory;
import repast.simphony.context.space.continuous.ContinuousSpaceFactoryFinder;
import repast.simphony.space.continuous.ContinuousSpace;
import simcore.utilities.StaffAdder;
import repast.simphony.space.continuous.StrictBorders;
import repast.simphony.context.space.grid.GridFactory;
import repast.simphony.context.space.grid.GridFactoryFinder;
import repast.simphony.space.grid.Grid;
import repast.simphony.space.grid.GridBuilderParameters;
import repast.simphony.space.grid.SimpleGridAdder;
import simcore.basicStructures.Board;
import repast.simphony.valueLayer.GridValueLayer;
import simcore.basicStructures.Room;
import java.awt.Color;
import repast.simphony.space.continuous.NdPoint;
import repast.simphony.context.space.graph.NetworkBuilder;
import java.util.HashMap;
import simcore.utilities.PatientArrivalStore;
import java.util.Map;
import simcore.basicStructures.Wall;

public class EDBuilder implements ContextBuilder<Object> {

  public Context build(Context<Object> context) {

    context.setId("EDProject");
    int mapWidth = 924;
    int mapHeight = 636;

    Parameters params = RunEnvironment.getInstance().getParameters();

    Double pPrev = params.getDouble("Prevalence");
    Double pProportionSymptomatic = params.getDouble("PercentagePrevSymptomatic");

    Boolean pBool = params.getBoolean("UsePathFinding");
    ModelParameterStore.UsePathFinding = pBool;

    RunEnvironment.getInstance().endAt(86400);

    CreatePatientArrivalMap();

    ContinuousSpaceFactory spaceFactory = ContinuousSpaceFactoryFinder.createContinuousSpaceFactory(null);
    ContinuousSpace<Object> space = spaceFactory.createContinuousSpace("space", context, new StaffAdder<Object>(), new StrictBorders(), mapWidth, mapHeight);

    GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);
    Grid<Object> grid = gridFactory.createGrid("grid", context, new GridBuilderParameters<Object>(new repast.simphony.space.grid.StrictBorders(), new SimpleGridAdder<Object>(), true, mapWidth, mapHeight));

    context.add(new patientGenerator(space, grid, context));
    context.add(new Board());

    // add Agents 
    for (int i = 0; i < 2; i++) {
      context.add(new Doc(space, grid, context));
    }


    GridValueLayer vl = new GridValueLayer("cellbox", true, new repast.simphony.space.grid.StrictBorders(), mapWidth, mapHeight);
    context.addValueLayer(vl);

    // add Locations here 
    Room Lab_a = new Room("Lab", context, space, grid, 98, 503, 233, 115, 1, 0, Lab.getInstance(), Color.BLUE);
    Room Triage_b = new Room("Triage", context, space, grid, 312, 95, 101, 57, 1, 0, TriageDesk.getInstance(), Color.BLUE);
    Room MajorsCBay_c = new Room("MajorsCBay", context, space, grid, 583, 585, 75, 41, 1, 0, MajorsCBay.getInstance(), Color.BLUE);
    Room MajorsCBay_d = new Room("MajorsCBay", context, space, grid, 581, 463, 73, 41, 1, 0, MajorsCBay.getInstance(), Color.BLUE);
    Room MajorsCBay_e = new Room("MajorsCBay", context, space, grid, 842, 466, 72, 41, 1, 0, MajorsCBay.getInstance(), Color.BLUE);
    Room MajorsCBay_f = new Room("MajorsCBay", context, space, grid, 461, 464, 71, 39, 1, 0, MajorsCBay.getInstance(), Color.BLUE);
    Room MajorsCBay_g = new Room("MajorsCBay", context, space, grid, 464, 584, 70, 39, 1, 0, MajorsCBay.getInstance(), Color.BLUE);
    Room MajorsCBay_h = new Room("MajorsCBay", context, space, grid, 843, 585, 70, 38, 1, 0, MajorsCBay.getInstance(), Color.BLUE);
    Room MainEntrance_i = new Room("MainEntrance", context, space, grid, 264, 21, 47, 19, 1, 0, MainEntrance.getInstance(), Color.BLUE);
    Room AmberBay1_j = new Room("AmberBay1", context, space, grid, 250, 150, 20, 20, 1, 30, AmberBay.getInstance(), Color.ORANGE);
    try {
      Lab_a.setSeats(0);
      Triage_b.setSeats(0);
      MajorsCBay_c.setSeats(0);
      MajorsCBay_d.setSeats(0);
      MajorsCBay_e.setSeats(0);
      MajorsCBay_f.setSeats(0);
      MajorsCBay_g.setSeats(0);
      MajorsCBay_h.setSeats(0);
      MainEntrance_i.setSeats(0);
      AmberBay1_j.setSeats(0);
      Lab_a.setDesks(0);
      Triage_b.setDesks(0);
      MajorsCBay_c.setDesks(0);
      MajorsCBay_d.setDesks(0);
      MajorsCBay_e.setDesks(0);
      MajorsCBay_f.setDesks(0);
      MajorsCBay_g.setDesks(0);
      MajorsCBay_h.setDesks(0);
      MainEntrance_i.setDesks(0);
      AmberBay1_j.setDesks(0);
      Lab_a.setBeds(0);
      Triage_b.setBeds(0);
      MajorsCBay_c.setBeds(0);
      MajorsCBay_d.setBeds(0);
      MajorsCBay_e.setBeds(0);
      MajorsCBay_f.setBeds(0);
      MajorsCBay_g.setBeds(0);
      MajorsCBay_h.setBeds(0);
      MainEntrance_i.setBeds(0);
      AmberBay1_j.setBeds(40);
    } catch (NumberFormatException e) {
    }


    for (Object obj : context) {
      NdPoint pt = space.getLocation(obj);
      grid.moveTo(obj, (int) pt.getX(), (int) pt.getY());
    }

    new NetworkBuilder("CurrentPatientAllocations", context, true).buildNetwork();
    new NetworkBuilder("HistoricalPatientAllocations", context, true).buildNetwork();

    return context;
  }

  public void CreatePatientArrivalMap() {
    HashMap ArrivalPerHour = new HashMap();
    ArrivalPerHour.put(1, 5);
    ArrivalPerHour.put(2, 4);
    ArrivalPerHour.put(3, 5);
    ArrivalPerHour.put(4, 6);
    ArrivalPerHour.put(5, 5);
    ArrivalPerHour.put(6, 4);
    ArrivalPerHour.put(7, 5);
    ArrivalPerHour.put(8, 6);
    ArrivalPerHour.put(9, 7);
    ArrivalPerHour.put(10, 3);
    ArrivalPerHour.put(11, 8);
    ArrivalPerHour.put(12, 4);
    ArrivalPerHour.put(13, 6);
    ArrivalPerHour.put(14, 3);
    ArrivalPerHour.put(15, 3);
    ArrivalPerHour.put(16, 3);
    ArrivalPerHour.put(17, 6);
    ArrivalPerHour.put(18, 3);
    ArrivalPerHour.put(19, 4);
    ArrivalPerHour.put(20, 5);
    ArrivalPerHour.put(21, 6);
    ArrivalPerHour.put(22, 7);
    ArrivalPerHour.put(23, 3);
    ArrivalPerHour.put(24, 4);
    PatientArrivalStore.Initialise((Map<Integer, Integer>) ArrivalPerHour);
  }

  private void createWallBetween(int x1, int y1, int x2, int y2, Context<Object> context, ContinuousSpace<Object> space, Grid<Object> grid) {
    if (x1 == x2) {
      for (int i = y1; i < y2; i++) {
        Wall pWall = new Wall("", context, space, grid, x1, i);
      }
    } else {
      float ratio = (y2 - y1) / (x2 - x1);
      int width = x2 - x1;
      for (int i = 0; i < width; i++) {
        float x = x1 + i;
        float y = y1 + (ratio * i);
        Wall pWall = new Wall("", context, space, grid, ((int) x), ((int) y));
      }

    }
  }
}
