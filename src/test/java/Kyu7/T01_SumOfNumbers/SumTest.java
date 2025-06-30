package Kyu7.T01_SumOfNumbers;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumTest {

    Sum sum = new Sum();

    @Test
    public void Test1() {
        assertEquals(-1, sum.getSum(0, -1));
        assertEquals(1, sum.getSum(0, 1));
        assertEquals(1, sum.getSum(1, 0));
        assertEquals(3, sum.getSum(1, 2));
        assertEquals(1, sum.getSum(0, 1));
        assertEquals(1, sum.getSum(1, 1));
        assertEquals(-1, sum.getSum(-1, 0));
        assertEquals(2, sum.getSum(-1, 2));
    }

    SumBest sumBest = new SumBest();

    @Test
    public void Test2() {
        assertEquals(-1, sumBest.getSumBest(0, -1));
        assertEquals(1, sumBest.getSumBest(0, 1));
        assertEquals(1, sumBest.getSumBest(1, 0));
        assertEquals(3, sumBest.getSumBest(1, 2));
        assertEquals(1, sumBest.getSumBest(0, 1));
        assertEquals(1, sumBest.getSumBest(1, 1));
        assertEquals(-1, sumBest.getSumBest(-1, 0));
        assertEquals(2, sumBest.getSumBest(-1, 2));
    }

    NewSum newSum = new NewSum();

    @Test
    public void Test3() {
        assertEquals(-1, newSum.getSum(0, -1));
        assertEquals(1, newSum.getSum(0, 1));
        assertEquals(1, newSum.getSum(1, 0));
        assertEquals(3, newSum.getSum(1, 2));
        assertEquals(1, newSum.getSum(0, 1));
        assertEquals(1, newSum.getSum(1, 1));
        assertEquals(-1, newSum.getSum(-1, 0));
        assertEquals(2, newSum.getSum(-1, 2));
    }

    New2Sum new2Sum = new New2Sum();

    @Test
    public void Test4() {
        assertEquals(-1, new2Sum.getSum(0, -1));
        assertEquals(1, new2Sum.getSum(0, 1));
        assertEquals(1, new2Sum.getSum(1, 0));
        assertEquals(3, new2Sum.getSum(1, 2));
        assertEquals(1, new2Sum.getSum(0, 1));
        assertEquals(1, new2Sum.getSum(1, 1));
        assertEquals(-1, new2Sum.getSum(-1, 0));
        assertEquals(2, new2Sum.getSum(-1, 2));
    }
}
