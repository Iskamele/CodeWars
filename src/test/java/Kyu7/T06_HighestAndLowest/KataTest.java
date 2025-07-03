package Kyu7.T06_HighestAndLowest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class KataTest {

    @Test
    public void test1() {
        assertEquals("42 -9", Kata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test2() {
        assertEquals("3 1", Kata.highAndLow("1 2 3"));
    }

    @Test
    public void test3() {
        Assert.assertEquals("42 -9", KataStream.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test4() {
        Assert.assertEquals("3 1", KataStream.highAndLow("1 2 3"));
    }

    @Test
    public void test5() {
        assertEquals("42 -9", NewKata.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }

    @Test
    public void test6() {
        assertEquals("3 1", NewKata.highAndLow("1 2 3"));
    }
}
