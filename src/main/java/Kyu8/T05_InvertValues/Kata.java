package Kyu8.T05_InvertValues;

import java.util.Arrays;

public class Kata {
    public static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(i -> -i)
                .toArray();
    }
}