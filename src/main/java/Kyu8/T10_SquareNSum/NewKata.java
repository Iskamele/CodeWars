package Kyu8.T10_SquareNSum;

import java.util.Arrays;

public class NewKata {

    public static int squareSum(int[] n) {
        return Arrays.stream(n)
            .map(i -> i * i)
            .sum();
    }
}
