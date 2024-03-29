package Kyu7.T01_SumOfNumbers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest {
    Sum s = new Sum();

    @Test
    public void Test1() {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(1, s.GetSum(1,0 ));
        assertEquals(3, s.GetSum(1, 2));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(1, s.GetSum(1, 1));
        assertEquals(-1, s.GetSum(-1, 0));
        assertEquals(2, s.GetSum(-1, 2));
    }
}