package Kyu6.T02_FindTheOddInt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.Test;

public class FindOddTest {

    @Test
    public void findTest() {
        assertEquals(
            5,
            FindOdd.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5})
        );
        assertEquals(-1, FindOdd.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        assertEquals(5, FindOdd.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(10, FindOdd.findIt(new int[]{10}));
        assertEquals(10, FindOdd.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, FindOdd.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
    }

    @Test
    public void findTest2() {

        assertEquals(
            5,
            FindOddCleverSolution.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1,
                -2, 5})
        );
        assertEquals(
            -1,
            FindOddCleverSolution.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5})
        );
        assertEquals(
            5,
            FindOddCleverSolution.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5})
        );
        assertEquals(10, FindOddCleverSolution.findIt(new int[]{10}));
        assertEquals(10, FindOddCleverSolution.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, FindOddCleverSolution.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
        assertEquals(4, FindOddCleverSolution.findIt(new int[]{4, 4, 4, 0, 0}));
        assertEquals(4, FindOddCleverSolution.findIt(new int[]{4, 4, 4, 2, 2}));
        assertEquals(3, FindOddCleverSolution.findIt(new int[]{2, 3, 3, 3, 2}));
    }

    @Test
    public void findTest3() {

        assertEquals(
            5,
            FindOddWithXor.findIt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2,
                5})
        );
        assertEquals(-1, FindOddWithXor.findIt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}));
        assertEquals(5, FindOddWithXor.findIt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}));
        assertEquals(10, FindOddWithXor.findIt(new int[]{10}));
        assertEquals(10, FindOddWithXor.findIt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}));
        assertEquals(1, FindOddWithXor.findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
        assertEquals(4, FindOddWithXor.findIt(new int[]{4, 4, 4, 0, 0}));
        assertEquals(4, FindOddWithXor.findIt(new int[]{4, 4, 4, 2, 2}));
        assertEquals(3, FindOddWithXor.findIt(new int[]{2, 3, 3, 3, 2}));
    }

    private static void doTest(int[] input, int expected) {
        String message = String.format("for array = %s\n", Arrays.toString(input));
        int actual = NewFindOdd.findIt(input);
        assertEquals(expected, actual, message);
    }

    @Test
    public void sampleTests4() {
        doTest(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}, 5);
        doTest(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}, -1);
        doTest(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}, 5);
        doTest(new int[]{10}, 10);
        doTest(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}, 10);
        doTest(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}, 1);
    }
}
