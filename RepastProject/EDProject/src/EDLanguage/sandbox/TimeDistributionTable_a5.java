package EDLanguage.sandbox;

/*Generated by MPS */

import simcore.utilities.Distribution;
import java.util.HashMap;
import repast.simphony.engine.environment.RunEnvironment;
import java.util.Map;

public class TimeDistributionTable_a5 {
  protected Distribution<Integer> processingTimeDistribution;
  protected static TimeDistributionTable_a5 instance;

  private TimeDistributionTable_a5() {
    HashMap<Integer, Double> returnMap = new HashMap<Integer, Double>();
    double TotalOccurances = 4;
    returnMap.put(180 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick"), ((Double) (2 / TotalOccurances)));
    returnMap.put(300 / RunEnvironment.getInstance().getParameters().getInteger("SecondsPerTick"), ((Double) (1 / TotalOccurances)));

    processingTimeDistribution = new Distribution<Integer>((Map) returnMap);
  }

  public static TimeDistributionTable_a5 getInstance() {
    if (instance == null) {
      instance = new TimeDistributionTable_a5();
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
