package Kyu7.T09_Fibonacci;

public class New2Fibonacci {

    public static long fib(int n) {
        if (n <= 1) {
            return n;
        }

        /* fib(5)

        previous = 0
        current = 1
        next

        Iteration 1 (i = 2):
            i = 2, check: 2 <= 5? YES
            next = previous + current = 0 + 1 = 1
            previous = current = 1
            current = next = 1

        Iteration 2 (i = 3):
            i = 3, check: 3 <= 5? YES
            next = previous + current = 1 + 1 = 2
            previous = current = 1
            current = next = 2

        Iteration 3 (i = 4):
            i = 4, check: 4 <= 5? YES
            next = previous + current = 1 + 2 = 3
            previous = current = 2
            current = next = 3

        Iteration 4 (i = 5):
            i = 5, check: 5 <= 5? YES
            next = previous + current = 2 + 3 = 5
            previous = current = 3
            current = next = 5

        Iteration 5 (i = 6):
            i = 6, check: 6 <= 5? NO
            end
         */

        int previous = 0;
        int current = 1;

        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }

        return current;
    }
}
