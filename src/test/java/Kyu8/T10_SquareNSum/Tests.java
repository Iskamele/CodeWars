package Kyu8.T10_SquareNSum;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {
    @Test
    public void testBasic() {
        assertEquals(9, Kata.squareSum(new int[]{1, 2, 2}));
        assertEquals(5, Kata.squareSum(new int[]{1, 2}));
        assertEquals(50, Kata.squareSum(new int[]{5, -3, 4}));
        assertEquals(0, Kata.squareSum(new int[]{}));
    }
}