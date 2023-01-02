package T13_HighestAndLowest;

import static java.util.Arrays.stream;

public class KataStream {
  public static String highAndLow(String numbers) {
    var stats = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
    return stats.getMax() + " " + stats.getMin();
  }
}