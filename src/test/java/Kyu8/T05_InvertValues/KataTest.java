package Kyu8.T05_InvertValues;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Tests")
public class KataTest {

    @Test
    public void testSomething() {
        int[] input = new int[]{-1, -2, -3, -4, -5};
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{-1, 2, -3, 4, -5};
        expected = new int[]{1, -2, 3, -4, 5};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{};
        expected = new int[]{};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));

        input = new int[]{0};
        expected = new int[]{0};
        assertEquals(Arrays.toString(expected), Arrays.toString(Kata.invert(input)));
    }

    private void runTest(int[] expected, int[] input) {
        assertArrayEquals(
            expected,
            NewKata.invert(input),
            () -> String.format("Input: %s", Arrays.toString(input))
        );
    }

    private void runTest2(int[] expected, int[] input) {
        assertArrayEquals(
            expected,
            New2Kata.invert(input),
            () -> String.format("Input: %s", Arrays.toString(input))
        );
    }

    @Test
    @DisplayName("Sample Tests")
    public void sampleTests() {
        runTest(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5});
        runTest(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5});
        runTest(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5});
        runTest(new int[]{}, new int[]{});
        runTest(new int[]{0}, new int[]{0});

        runTest2(new int[]{-1, -2, -3, -4, -5}, new int[]{1, 2, 3, 4, 5});
        runTest2(new int[]{-1, 2, -3, 4, -5}, new int[]{1, -2, 3, -4, 5});
        runTest2(new int[]{1, 2, 3, 4, 5}, new int[]{-1, -2, -3, -4, -5});
        runTest2(new int[]{}, new int[]{});
        runTest2(new int[]{0}, new int[]{0});
    }
}