package Kyu6.T10_ArrayDiff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NewKata {

    public static int[] arrayDiff(int[] a, int[] b) {
//        List<Integer> listA = new ArrayList<>();
//        Arrays.stream(a).forEach(listA::add);
//
//        List<Integer> listB = new ArrayList<>();
//        Arrays.stream(b).forEach(listB::add);
//
//        listA.removeAll(listB);
//
//        return listA.stream().mapToInt(i -> i).toArray();

        return Arrays.stream(a)
            .filter(i -> Arrays.stream(b).noneMatch(j -> j == i))
            .toArray();
    }
}
