package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.utilities.Distribution;
import java.util.HashMap;
import java.util.Map;

public class LabPCRExecutionTimeMap {
  protected Distribution<Integer> processingTimeDistribution;
  protected static LabPCRExecutionTimeMap instance;

  private LabPCRExecutionTimeMap() {
    HashMap<Integer, Double> returnMap = new HashMap<Integer, Double>();
    double TotalOccurances = 1521;
    returnMap.put(18000, ((Double) (15 / TotalOccurances)));
    returnMap.put(25200, ((Double) (220 / TotalOccurances)));
    returnMap.put(32400, ((Double) (490 / TotalOccurances)));
    returnMap.put(39600, ((Double) (390 / TotalOccurances)));
    returnMap.put(46800, ((Double) (160 / TotalOccurances)));
    returnMap.put(54000, ((Double) (40 / TotalOccurances)));
    returnMap.put(61200, ((Double) (55 / TotalOccurances)));
    returnMap.put(68400, ((Double) (95 / TotalOccurances)));
    returnMap.put(75600, ((Double) (55 / TotalOccurances)));

    processingTimeDistribution = new Distribution<Integer>((Map) returnMap);
  }

  public static LabPCRExecutionTimeMap getInstance() {
    if (instance == null) {
      instance = new LabPCRExecutionTimeMap();
    }
    return instance;
  }

  public Integer getProcessingTime() {
    if (processingTimeDistribution == null) {
      return 0;
    } else {
      return processingTimeDistribution.sample();
    }
  }

}
