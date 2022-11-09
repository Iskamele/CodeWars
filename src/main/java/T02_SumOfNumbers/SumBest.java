package T02_SumOfNumbers;

public class SumBest {
    // comm
    public int GetSumBest(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}