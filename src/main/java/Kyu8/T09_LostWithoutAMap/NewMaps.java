package Kyu8.T09_LostWithoutAMap;

import java.util.Arrays;

public class NewMaps {

    // we can use IntStream, but this not good because we are changing original array. Only for "multiplyInPlace"
    // Arrays.stream can be helpful if we don't want to modify input data in func

    public static int[] map(int[] arr) {
        return Arrays.stream(arr)
            .map(i -> i * 2)
            .toArray();
    }
}
