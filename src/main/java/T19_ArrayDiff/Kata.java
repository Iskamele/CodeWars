package T19_ArrayDiff;

import java.util.Arrays;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        return Arrays.stream(a)
                .filter(x -> Arrays.stream(b).noneMatch(y -> y == x))
                .toArray();
    }
}