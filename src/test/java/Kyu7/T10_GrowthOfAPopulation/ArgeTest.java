package Kyu7.T10_GrowthOfAPopulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArgeTest {

    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Arge.nbYear(1500, 5, 100, 5000), 15);
        testing(Arge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Arge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

    @Test
    public void test2() {
        System.out.println("Fixed Tests: nbYear");
        testing(ArgeStream.nbYear(1500, 5, 100, 5000), 15);
        testing(ArgeStream.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(ArgeStream.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

    @Test
    public void test3() {
        System.out.println("Fixed Tests: nbYear");
        testing(NewArge.nbYear(1500, 5, 100, 5000), 15);
        testing(NewArge.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(NewArge.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }
}
