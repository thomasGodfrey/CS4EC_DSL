package EDLanguage.sandbox;

/*Generated by MPS */

import repast.simphony.dataLoader.ContextBuilder;
import repast.simphony.context.Context;
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
import simcore.basicStructures.PatientAdder;
import repast.simphony.valueLayer.GridValueLayer;
import simcore.basicStructures.Room;
import java.awt.Color;
import simcore.basicStructures.WaitingRoomLocation;
import repast.simphony.space.continuous.NdPoint;
import simcore.basicStructures.Wall;

public class EDBuilder implements ContextBuilder<Object> {

  public Context build(Context<Object> context) {

    context.setId("EDProject");


    ContinuousSpaceFactory spaceFactory = ContinuousSpaceFactoryFinder.createContinuousSpaceFactory(null);
    ContinuousSpace<Object> space = spaceFactory.createContinuousSpace("space", context, new StaffAdder<Object>(), new StrictBorders(), 400, 200);

    GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);
    Grid<Object> grid = gridFactory.createGrid("grid", context, new GridBuilderParameters<Object>(new repast.simphony.space.grid.StrictBorders(), new SimpleGridAdder<Object>(), true, 400, 200));

    context.add(new Board());
    context.add(new PatientAdder(space, grid).WithTimeSpan(15));


    // add Agents 
    for (int i = 0; i < 5; i++) {
      context.add(new Doctor(space, grid));
    }
    for (int i = 0; i < 7; i++) {
      context.add(new Nurse(space, grid));
    }
    for (int i = 0; i < 3; i++) {
      context.add(new ENP(space, grid));
    }
    for (int i = 0; i < 3; i++) {
      context.add(new MajorsTriageNurse(space, grid));
    }


    GridValueLayer vl = new GridValueLayer("cellbox", true, new repast.simphony.space.grid.StrictBorders(), 400, 200);
    context.addValueLayer(vl);

    // add Locations here 
    Room Pediatrics_a = new Room("Pediatrics", context, space, grid, 5, 145, 50, 50, 1, 40, Color.BLUE);
    Room MainReception_b = new Room("MainReception", context, space, grid, 55, 125, 20, 20, 1, 40, Color.GREEN);
    Room Triage_c = new Room("Triage", context, space, grid, 105, 150, 20, 20, 1, 15, Color.GREEN);
    Room MajorsTriage_d = new Room("MajorsTriage", context, space, grid, 120, 80, 20, 20, 1, 15, Color.GREEN);
    Room MajorsConsultationRooms_f = new Room("MajorsConsultationRooms", context, space, grid, 120, 50, 50, 10, 1, 50, Color.YELLOW);
    Room TaskRoom_g = new Room("TaskRoom", context, space, grid, 130, 125, 20, 20, 1, 15, Color.YELLOW);
    Room Entrance_h = new Room("Entrance", context, space, grid, 95, 192, 10, 2, 1, 100000, Color.GRAY);
    Room XRayRoom1_i = new Room("XRayRoom1", context, space, grid, 155, 125, 20, 20, 1, 10, Color.YELLOW);

    WaitingRoomLocation MajorsWaitingRoom_e = new WaitingRoomLocation("MajorsWaitingRoom", context, space, grid, 150, 60, 20, 50, 1, 20, Color.GRAY);
    WaitingRoomLocation TriageWaitingRoom_j = new WaitingRoomLocation("TriageWaitingRoom", context, space, grid, 105, 170, 50, 20, 1, 12, Color.GRAY);


    createWallBetween(0, 124, 75, 124, context, space, grid);
    createWallBetween(75, 0, 75, 125, context, space, grid);
    createWallBetween(105, 149, 180, 149, context, space, grid);
    createWallBetween(125, 150, 125, 170, context, space, grid);
    createWallBetween(125, 170, 155, 170, context, space, grid);
    createWallBetween(155, 170, 155, 200, context, space, grid);
    createWallBetween(0, 0, 399, 0, context, space, grid);
    createWallBetween(0, 199, 399, 199, context, space, grid);
    createWallBetween(0, 0, 199, 0, context, space, grid);
    createWallBetween(399, 0, 399, 199, context, space, grid);
    createWallBetween(152, 125, 152, 149, context, space, grid);



    for (Object obj : context) {
      NdPoint pt = space.getLocation(obj);
      grid.moveTo(obj, (int) pt.getX(), (int) pt.getY());
    }


    return context;
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
