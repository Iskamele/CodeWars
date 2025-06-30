package Kyu7.T01_SumOfNumbers;

public class Sum {

    public int getSum(int a, int b) {
        int result = 0;
        if (a == b) {
            return a;
        }
        while (a != b) {
            if (a < b) {
                result += a;
                a++;
            } else {
                result +=a;
                a--;
            }
        }
        result +=a;
        return result;
    }
}
