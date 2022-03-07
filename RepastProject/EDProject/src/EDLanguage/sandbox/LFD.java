package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.utilities.Distribution;
import java.util.HashMap;
import java.util.Map;

public class LFD {
  protected Distribution<Integer> processingTimeDistribution;
  protected static LFD instance;

  private LFD() {
    HashMap<Integer, Double> returnMap = new HashMap<Integer, Double>();
    double TotalOccurances = 2;
    returnMap.put(15, ((Double) (1 / TotalOccurances)));
    processingTimeDistribution = new Distribution<Integer>((Map) returnMap);
  }

  public static LFD getInstance() {
    if (instance == null) {
      instance = new LFD();
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
