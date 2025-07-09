package Kyu6.T13_DoesMyNumberLookBigInThis;

import java.util.Arrays;

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
//        int[] digits = String.valueOf(number).chars().map(c -> c - '0').toArray();
//        double result = 0;
//        for (int digit : digits) {
//            result += Math.pow(digit, digits.length);
//        }
//        return result == number;

        int length = String.valueOf(number).length();
        return number == Arrays.stream(String.valueOf(number).split(""))
            .mapToInt(Integer::parseInt)
            .mapToDouble(num -> Math.pow(num, length))
            .sum();
    }
}
