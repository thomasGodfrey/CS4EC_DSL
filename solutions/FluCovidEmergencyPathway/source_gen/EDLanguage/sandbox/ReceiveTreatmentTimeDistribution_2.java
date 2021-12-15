package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.utilities.Distribution;
import java.util.HashMap;
import java.util.Map;

public class ReceiveTreatmentTimeDistribution_2 {
  protected Distribution<Integer> processingTimeDistribution;
  protected static ReceiveTreatmentTimeDistribution_2 instance;

  private ReceiveTreatmentTimeDistribution_2() {
    HashMap<Integer, Double> returnMap = new HashMap<Integer, Double>();
    double TotalOccurances = 3;
    returnMap.put(261000, ((Double) (1 / TotalOccurances)));
    returnMap.put(1296000, ((Double) (1 / TotalOccurances)));
    processingTimeDistribution = new Distribution<Integer>((Map) returnMap);
  }

  public static ReceiveTreatmentTimeDistribution_2 getInstance() {
    if (instance == null) {
      instance = new ReceiveTreatmentTimeDistribution_2();
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
