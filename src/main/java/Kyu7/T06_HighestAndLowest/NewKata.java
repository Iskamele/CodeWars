package Kyu7.T06_HighestAndLowest;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class NewKata {

    public static String highAndLow(String numbers) {
        // split → parse → sort → create array → access elements
        int[] array = Arrays.stream(numbers.split(" "))
            .mapToInt(Integer::parseInt)
            .sorted() // O(n log n)
            .toArray(); // O(n)
//        return array[array.length - 1] + " " + array[0];

        // split → parse → calculate statistics → get min/max
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(numbers.split(" "))
            .mapToInt(Integer::parseInt) // O(n) - single pass through the stream
            .summaryStatistics(); // O(1) - only stores statistics, not the entire array
        return intSummaryStatistics.getMax() + " " + intSummaryStatistics.getMin();

        // how statistics works
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for (int value : stream) {
//            min = Math.min(min, value);
//            max = Math.max(max, value);
//        }
    }
}
