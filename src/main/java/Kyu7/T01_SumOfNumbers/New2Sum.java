package Kyu7.T01_SumOfNumbers;

import java.util.stream.IntStream;

public class New2Sum {

    public int getSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }
}
