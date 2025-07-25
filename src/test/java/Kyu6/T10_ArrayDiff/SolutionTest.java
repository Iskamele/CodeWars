package Kyu6.T10_ArrayDiff;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void sampleTests() {
        assertArrayEquals(new int[]{2}, Kata.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, Kata.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, Kata.arrayDiff(new int[]{}, new int[]{1, 2}));
    }

    @Test
    public void sampleTest2() {
        assertArrayEquals(new int[]{2}, NewKata.arrayDiff(new int[]{1, 2}, new int[]{1}));
        assertArrayEquals(new int[]{2, 2}, NewKata.arrayDiff(new int[]{1, 2, 2}, new int[]{1}));
        assertArrayEquals(new int[]{1}, NewKata.arrayDiff(new int[]{1, 2, 2}, new int[]{2}));
        assertArrayEquals(new int[]{1, 2, 2}, NewKata.arrayDiff(new int[]{1, 2, 2}, new int[]{}));
        assertArrayEquals(new int[]{}, NewKata.arrayDiff(new int[]{}, new int[]{1, 2}));
    }
}
