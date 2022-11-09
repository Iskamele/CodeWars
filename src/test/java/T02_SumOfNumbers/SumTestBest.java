package T02_SumOfNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTestBest {
    SumBest s = new SumBest();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSumBest(0, -1));
        assertEquals(1, s.GetSumBest(0, 1));
        assertEquals(1, s.GetSumBest(1, 0));
        assertEquals(3, s.GetSumBest(1, 2));
        assertEquals(1, s.GetSumBest(0, 1));
        assertEquals(1, s.GetSumBest(1, 1));
        assertEquals(-1, s.GetSumBest(-1, 0));
        assertEquals(2, s.GetSumBest(-1, 2));
    }
}