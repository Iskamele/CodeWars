package Kyu5.T03_DirectionsReduction;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class DirReduction {
    private static final String NORTH = "NORTH";
    private static final String SOUTH = "SOUTH";
    private static final String WEST = "WEST";
    private static final String EAST = "EAST";

    private static final Map<String, String> OPPOSITES = Map.of(
        NORTH, SOUTH,
        SOUTH, NORTH,
        WEST, EAST,
        EAST, WEST
    );

    public static String[] dirReduc(String[] arr) {
        Stack<String> stack = new Stack<>();

        for (String string : arr) {
            if (!stack.isEmpty() && isPair(stack.peek(), string)) {
                stack.pop();
            } else {
                stack.push(string);
            }
        }

        String[] array = stack.toArray(new String[0]);
        Collections.reverse(Arrays.asList(array));
        return array;
    }

    private static boolean isPair(String first, String second) {
        return Objects.equals(OPPOSITES.get(first), second);
    }
}
