package Kyu6.T02_FindTheOddInt;

import java.util.Arrays;

public class NewFindOdd {

    public static int findIt(int[] a) {
        if (a.length == 1) {
            return a[0];
        }

        int[] sortAndDistinctNumbers = Arrays.stream(a).distinct().sorted().toArray();

        for (int sortAndDistinctNumber : sortAndDistinctNumbers) {
            int oddCount = 0;
            for (int number : a) {
                if (sortAndDistinctNumber == number) {
                    oddCount++;
                }
            }
            if (oddCount % 2 != 0) {
                return sortAndDistinctNumber;
            }
        }

        return a[0];
    }
}
