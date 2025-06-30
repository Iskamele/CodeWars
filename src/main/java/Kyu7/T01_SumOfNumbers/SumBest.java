package Kyu7.T01_SumOfNumbers;

public class SumBest {

    public int getSumBest(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
