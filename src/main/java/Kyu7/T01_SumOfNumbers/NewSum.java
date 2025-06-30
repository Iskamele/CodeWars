package Kyu7.T01_SumOfNumbers;

public class NewSum {

    public int getSum(int a, int b) {
        if (a == b) {
            return a;
        }

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int sum = min;

        int i = sum + 1;

        do {
            sum+=i;
            i++;
        } while (i <= max);

        return sum;
    }
}
