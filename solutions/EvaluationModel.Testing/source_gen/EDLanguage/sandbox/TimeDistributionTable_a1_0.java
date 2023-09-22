package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.utilities.Distribution;
import java.util.HashMap;
import java.util.Map;

public class TimeDistributionTable_a1_0 {
  protected Distribution<Integer> processingTimeDistribution;
  protected static TimeDistributionTable_a1_0 instance;

  private TimeDistributionTable_a1_0() {
    HashMap<Integer, Double> returnMap = new HashMap<Integer, Double>();
    double TotalOccurances = 7;
    returnMap.put(10, ((Double) (1 / TotalOccurances)));
    returnMap.put(15, ((Double) (3 / TotalOccurances)));
    returnMap.put(20, ((Double) (2 / TotalOccurances)));

    processingTimeDistribution = new Distribution<Integer>((Map) returnMap);
  }

  public static TimeDistributionTable_a1_0 getInstance() {
    if (instance == null) {
      instance = new TimeDistributionTable_a1_0();
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
