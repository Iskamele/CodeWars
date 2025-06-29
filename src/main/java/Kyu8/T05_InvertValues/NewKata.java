package Kyu8.T05_InvertValues;

import java.util.stream.IntStream;

public class NewKata {

    public static int[] invert(int[] array) {
        IntStream.range(0, array.length)
            .forEach(i -> array[i] = array[i] - array[i] * 2);

        return array;
    }
}
