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
import simcore.basicStructures.PatientAdder;
import repast.simphony.valueLayer.GridValueLayer;
import simcore.basicStructures.Room;
import java.awt.Color;
import repast.simphony.space.continuous.NdPoint;
import java.util.HashMap;
import simcore.utilities.PatientArrivalStore;
import java.util.Map;
import simcore.basicStructures.Wall;

public class EDBuilder implements ContextBuilder<Object> {

  public Context build(Context<Object> context) {

    context.setId("EDProject");

    Parameters params = RunEnvironment.getInstance().getParameters();

    Double pPercentageSymptomatic = params.getDouble("PercentageSymptomatic");
    Double pPercentageAsymptomatic = params.getDouble("PercentageAsymptomatic");

    Boolean pBool = params.getBoolean("UsePathFinding");
    ModelParameterStore.UsePathFinding = pBool;

    RunEnvironment.getInstance().endAt(86400);

    CreatePatientArrivalMap();

    ContinuousSpaceFactory spaceFactory = ContinuousSpaceFactoryFinder.createContinuousSpaceFactory(null);
    ContinuousSpace<Object> space = spaceFactory.createContinuousSpace("space", context, new StaffAdder<Object>(), new StrictBorders(), 400, 400);

    GridFactory gridFactory = GridFactoryFinder.createGridFactory(null);
    Grid<Object> grid = gridFactory.createGrid("grid", context, new GridBuilderParameters<Object>(new repast.simphony.space.grid.StrictBorders(), new SimpleGridAdder<Object>(), true, 400, 400));

    context.add(new Board());
    context.add(new PatientAdder(space, grid).WithTimeSpan(480).WithPercentageCOVIDSymptomatic(pPercentageSymptomatic).WithPercentageCOVIDAsymptomatic(pPercentageAsymptomatic).WithPercentageHighSeverity(0.6).WithPercentageMediumSeverity(0.4));

    // add Agents 
    for (int i = 0; i < 6; i++) {
      context.add(new Doctor(space, grid));
    }
    for (int i = 0; i < 5; i++) {
      context.add(new Nurse(space, grid));
    }
    for (int i = 0; i < 3; i++) {
      context.add(new Receptionist(space, grid));
    }
    for (int i = 0; i < 3; i++) {
      context.add(new MajorsTriageNurse(space, grid));
    }
    for (int i = 0; i < 7; i++) {
      context.add(new MajorsABNurse(space, grid));
    }
    for (int i = 0; i < 4; i++) {
      context.add(new MajorsABDoctor(space, grid));
    }
    for (int i = 0; i < 50; i++) {
      context.add(new LFDDevice(space, grid));
    }
    for (int i = 0; i < 10; i++) {
      context.add(new LIATMachine(space, grid));
    }
    for (int i = 0; i < 10; i++) {
      context.add(new LabTech(space, grid));
    }


    GridValueLayer vl = new GridValueLayer("cellbox", true, new repast.simphony.space.grid.StrictBorders(), 400, 400);
    context.addValueLayer(vl);

    // add Locations here 
    Room Pediatrics_a = new Room("Pediatrics", context, space, grid, 5, 145, 50, 50, 1, 40, office.getInstance(), Color.BLACK);
    Room Lab_b = new Room("Lab", context, space, grid, 5, 5, 30, 30, 1, 50, Lab.getInstance(), Color.YELLOW);
    Room MainReception_c = new Room("MainReception", context, space, grid, 55, 125, 20, 20, 1, 40, office.getInstance(), Color.GREEN);
    Room Triage_d = new Room("Triage", context, space, grid, 105, 160, 10, 10, 1, 15, office.getInstance(), Color.GREEN);
    Room TriageSideRoom1_e = new Room("TriageSideRoom1", context, space, grid, 116, 160, 5, 5, 1, 3, TriageSideRoom.getInstance(), Color.GRAY);
    Room TriageSideRoom2_f = new Room("TriageSideRoom2", context, space, grid, 116, 165, 5, 5, 1, 3, TriageSideRoom.getInstance(), Color.GRAY);
    Room TriageSideRoom3_g = new Room("TriageSideRoom3", context, space, grid, 121, 165, 5, 5, 1, 3, TriageSideRoom.getInstance(), Color.GRAY);
    Room MajorsTriage_h = new Room("MajorsTriage", context, space, grid, 110, 100, 10, 10, 1, 15, office.getInstance(), Color.GREEN);
    Room LiatBooth1_i = new Room("LiatBooth1", context, space, grid, 111, 92, 5, 5, 1, 8, LIATBooth.getInstance(), Color.RED);
    Room MajorsWaitingRoom_j = new Room("MajorsWaitingRoom", context, space, grid, 140, 90, 20, 40, 1, 20, WaitingRoom.getInstance(), Color.BLUE);
    Room DoctorOffice1_k = new Room("DoctorOffice1", context, space, grid, 110, 80, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice3_l = new Room("DoctorOffice3", context, space, grid, 110, 60, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice2_m = new Room("DoctorOffice2", context, space, grid, 120, 80, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice6_n = new Room("DoctorOffice6", context, space, grid, 120, 60, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice4_o = new Room("DoctorOffice4", context, space, grid, 140, 80, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice7_p = new Room("DoctorOffice7", context, space, grid, 130, 60, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice5_q = new Room("DoctorOffice5", context, space, grid, 150, 80, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice8_r = new Room("DoctorOffice8", context, space, grid, 140, 60, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room DoctorOffice9_s = new Room("DoctorOffice9", context, space, grid, 150, 60, 10, 10, 1, 3, DoctorOffice.getInstance(), Color.GRAY);
    Room TaskRoom1_t = new Room("TaskRoom1", context, space, grid, 120, 155, 5, 5, 1, 3, TaskRoom.getInstance(), Color.YELLOW);
    Room TaskRoom2_u = new Room("TaskRoom2", context, space, grid, 125, 155, 5, 5, 1, 3, TaskRoom.getInstance(), Color.YELLOW);
    Room TaskRoom3_v = new Room("TaskRoom3", context, space, grid, 130, 155, 5, 5, 1, 3, TaskRoom.getInstance(), Color.YELLOW);
    Room Entrance_w = new Room("Entrance", context, space, grid, 95, 197, 10, 2, 1, 100000, Entrance.getInstance(), Color.GRAY);
    Room XRay1_x = new Room("XRay1", context, space, grid, 140, 155, 5, 5, 1, 3, Radiology.getInstance(), Color.YELLOW);
    Room XRay2_y = new Room("XRay2", context, space, grid, 145, 155, 5, 5, 1, 3, Radiology.getInstance(), Color.YELLOW);
    Room TriageWaitingRoom_z = new Room("TriageWaitingRoom", context, space, grid, 105, 170, 50, 20, 1, 12, WaitingRoom.getInstance(), Color.BLUE);
    Room MajorsABReception_ab = new Room("MajorsABReception", context, space, grid, 200, 168, 20, 10, 1, 15, office.getInstance(), Color.BLACK);
    Room LIATBooth2_bb = new Room("LIATBooth2", context, space, grid, 220, 169, 5, 5, 1, 8, LIATBooth.getInstance(), Color.RED);
    Room MajorsBayA_cb = new Room("MajorsBayA", context, space, grid, 205, 190, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayB_db = new Room("MajorsBayB", context, space, grid, 220, 190, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayC_eb = new Room("MajorsBayC", context, space, grid, 235, 190, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayD_fb = new Room("MajorsBayD", context, space, grid, 235, 175, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayE_gb = new Room("MajorsBayE", context, space, grid, 235, 160, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayF_hb = new Room("MajorsBayF", context, space, grid, 235, 145, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayG_ib = new Room("MajorsBayG", context, space, grid, 220, 145, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayH_jb = new Room("MajorsBayH", context, space, grid, 205, 145, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayI_kb = new Room("MajorsBayI", context, space, grid, 190, 145, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayJ_lb = new Room("MajorsBayJ", context, space, grid, 175, 175, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayK_mb = new Room("MajorsBayK", context, space, grid, 175, 190, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room MajorsBayL_nb = new Room("MajorsBayL", context, space, grid, 190, 190, 10, 10, 1, 3, MajorsABBay.getInstance(), Color.GRAY);
    Room Exit_ob = new Room("Exit", context, space, grid, 162, 60, 10, 2, 1, 1000000, Exit.getInstance(), Color.GRAY);
    try {
      Pediatrics_a.setSeats(4);
      Lab_b.setSeats(0);
      MainReception_c.setSeats(0);
      Triage_d.setSeats(0);
      TriageSideRoom1_e.setSeats(0);
      TriageSideRoom2_f.setSeats(0);
      TriageSideRoom3_g.setSeats(0);
      MajorsTriage_h.setSeats(0);
      LiatBooth1_i.setSeats(0);
      MajorsWaitingRoom_j.setSeats(20);
      DoctorOffice1_k.setSeats(0);
      DoctorOffice3_l.setSeats(0);
      DoctorOffice2_m.setSeats(0);
      DoctorOffice6_n.setSeats(0);
      DoctorOffice4_o.setSeats(0);
      DoctorOffice7_p.setSeats(0);
      DoctorOffice5_q.setSeats(0);
      DoctorOffice8_r.setSeats(0);
      DoctorOffice9_s.setSeats(0);
      TaskRoom1_t.setSeats(0);
      TaskRoom2_u.setSeats(0);
      TaskRoom3_v.setSeats(0);
      Entrance_w.setSeats(0);
      XRay1_x.setSeats(0);
      XRay2_y.setSeats(0);
      TriageWaitingRoom_z.setSeats(20);
      MajorsABReception_ab.setSeats(0);
      LIATBooth2_bb.setSeats(0);
      MajorsBayA_cb.setSeats(0);
      MajorsBayB_db.setSeats(0);
      MajorsBayC_eb.setSeats(0);
      MajorsBayD_fb.setSeats(0);
      MajorsBayE_gb.setSeats(0);
      MajorsBayF_hb.setSeats(0);
      MajorsBayG_ib.setSeats(0);
      MajorsBayH_jb.setSeats(0);
      MajorsBayI_kb.setSeats(0);
      MajorsBayJ_lb.setSeats(0);
      MajorsBayK_mb.setSeats(0);
      MajorsBayL_nb.setSeats(0);
      Exit_ob.setSeats(0);
      Pediatrics_a.setDesks(2);
      Lab_b.setDesks(20);
      MainReception_c.setDesks(0);
      Triage_d.setDesks(3);
      TriageSideRoom1_e.setDesks(1);
      TriageSideRoom2_f.setDesks(1);
      TriageSideRoom3_g.setDesks(1);
      MajorsTriage_h.setDesks(3);
      LiatBooth1_i.setDesks(0);
      MajorsWaitingRoom_j.setDesks(0);
      DoctorOffice1_k.setDesks(1);
      DoctorOffice3_l.setDesks(1);
      DoctorOffice2_m.setDesks(1);
      DoctorOffice6_n.setDesks(1);
      DoctorOffice4_o.setDesks(1);
      DoctorOffice7_p.setDesks(1);
      DoctorOffice5_q.setDesks(1);
      DoctorOffice8_r.setDesks(1);
      DoctorOffice9_s.setDesks(1);
      TaskRoom1_t.setDesks(0);
      TaskRoom2_u.setDesks(0);
      TaskRoom3_v.setDesks(0);
      Entrance_w.setDesks(0);
      XRay1_x.setDesks(1);
      XRay2_y.setDesks(1);
      TriageWaitingRoom_z.setDesks(0);
      MajorsABReception_ab.setDesks(11);
      LIATBooth2_bb.setDesks(0);
      MajorsBayA_cb.setDesks(1);
      MajorsBayB_db.setDesks(1);
      MajorsBayC_eb.setDesks(1);
      MajorsBayD_fb.setDesks(1);
      MajorsBayE_gb.setDesks(1);
      MajorsBayF_hb.setDesks(1);
      MajorsBayG_ib.setDesks(1);
      MajorsBayH_jb.setDesks(1);
      MajorsBayI_kb.setDesks(1);
      MajorsBayJ_lb.setDesks(1);
      MajorsBayK_mb.setDesks(1);
      MajorsBayL_nb.setDesks(1);
      Exit_ob.setDesks(0);
    } catch (NumberFormatException e) {
    }

    createWallBetween(0, 124, 110, 124, context, space, grid);
    createWallBetween(110, 80, 110, 125, context, space, grid);
    createWallBetween(105, 160, 156, 160, context, space, grid);
    createWallBetween(115, 170, 156, 170, context, space, grid);
    createWallBetween(156, 160, 156, 200, context, space, grid);
    createWallBetween(0, 0, 399, 0, context, space, grid);
    createWallBetween(0, 200, 399, 200, context, space, grid);
    createWallBetween(0, 0, 199, 0, context, space, grid);
    createWallBetween(399, 0, 399, 200, context, space, grid);
    createWallBetween(160, 80, 160, 140, context, space, grid);
    createWallBetween(160, 60, 160, 70, context, space, grid);
    createWallBetween(110, 90, 130, 90, context, space, grid);
    createWallBetween(140, 90, 160, 90, context, space, grid);
    createWallBetween(110, 60, 175, 60, context, space, grid);
    createWallBetween(175, 60, 175, 150, context, space, grid);
    createWallBetween(175, 165, 175, 200, context, space, grid);
    createWallBetween(175, 145, 245, 145, context, space, grid);
    createWallBetween(245, 145, 245, 200, context, space, grid);

    for (Object obj : context) {
      NdPoint pt = space.getLocation(obj);
      grid.moveTo(obj, (int) pt.getX(), (int) pt.getY());
    }

    return context;
  }

  public void CreatePatientArrivalMap() {
    HashMap ArrivalPerHour = new HashMap();
    ArrivalPerHour.put(1, 4);
    ArrivalPerHour.put(2, 6);
    ArrivalPerHour.put(3, 6);
    ArrivalPerHour.put(4, 3);
    ArrivalPerHour.put(5, 3);
    ArrivalPerHour.put(6, 7);
    ArrivalPerHour.put(7, 2);
    ArrivalPerHour.put(8, 2);
    ArrivalPerHour.put(9, 5);
    ArrivalPerHour.put(10, 10);
    ArrivalPerHour.put(11, 10);
    ArrivalPerHour.put(12, 13);
    ArrivalPerHour.put(13, 13);
    ArrivalPerHour.put(14, 14);
    ArrivalPerHour.put(15, 15);
    ArrivalPerHour.put(16, 16);
    ArrivalPerHour.put(17, 14);
    ArrivalPerHour.put(18, 13);
    ArrivalPerHour.put(19, 9);
    ArrivalPerHour.put(20, 7);
    ArrivalPerHour.put(21, 8);
    ArrivalPerHour.put(22, 7);
    ArrivalPerHour.put(23, 10);
    ArrivalPerHour.put(24, 3);
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
