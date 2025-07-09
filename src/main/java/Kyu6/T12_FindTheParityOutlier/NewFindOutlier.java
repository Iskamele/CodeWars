package Kyu6.T12_FindTheParityOutlier;

import java.util.Arrays;

public class NewFindOutlier {

    static int find(int[] integers) {
        boolean isEvenArray = (integers[0] & 1) + (integers[1] & 1) + (integers[2] & 1) <= 1;
        return Arrays.stream(integers)
            .filter(i -> isEvenArray == (i % 2 != 0))
            .findFirst()
            .orElse(0);
    }
}
