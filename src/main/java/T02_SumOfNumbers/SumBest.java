package T02_SumOfNumbers;

public class SumBest {
    public int GetSumBest(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}