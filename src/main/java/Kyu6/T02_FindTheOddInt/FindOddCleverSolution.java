package Kyu6.T02_FindTheOddInt;


import java.util.HashMap;
import java.util.Map;

public class FindOddCleverSolution {
    public static int findIt(int[] a) {
        Map<Integer, Integer> counts = new HashMap<>(a.length);
        for (int i : a) {
            if (!counts.containsKey(i)) counts.put(i, 1);
            else counts.put(i, counts.get(i) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : counts.entrySet())
            if (entry.getValue() % 2 == 1) return entry.getKey();
        return 0;
    }
}
