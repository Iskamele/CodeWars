package Kyu8.T07_SchoolPaperwork;

import static java.lang.Math.max;

public class Paper {

    public static int paperWork(int n, int m) {
//        return (n > 0 || m > 0) ? 0 : n * m;  // Old solution doesn't work

        // Replaced by clever ones from CW
        // max returns the larger of two numbers
        return max(n, 0) * max(m, 0);
    }
}
