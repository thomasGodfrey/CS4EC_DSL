package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.utilities.Distribution;
import java.util.HashMap;
import java.util.Map;

public class CepheidExecutionTimeMap {
  protected Distribution<Integer> processingTimeDistribution;
  protected static CepheidExecutionTimeMap instance;

  private CepheidExecutionTimeMap() {
    HashMap<Integer, Double> returnMap = new HashMap<Integer, Double>();
    double TotalOccurances = 3;
    returnMap.put(1500, ((Double) (1 / TotalOccurances)));
    returnMap.put(1800, ((Double) (1 / TotalOccurances)));

    processingTimeDistribution = new Distribution<Integer>((Map) returnMap);
  }

  public static CepheidExecutionTimeMap getInstance() {
    if (instance == null) {
      instance = new CepheidExecutionTimeMap();
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