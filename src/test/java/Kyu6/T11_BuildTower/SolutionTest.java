package Kyu6.T11_BuildTower;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void basicTests() {
        assertEquals(String.join(",", "*"), String.join(",", KataStreamSolution.towerBuilder(1)));
        assertEquals(
            String.join(",", " * ", "***"),
            String.join(",", KataStreamSolution.towerBuilder(2))
        );
        assertEquals(
            String.join(",", "  *  ", " *** ", "*****"),
            String.join(",", KataStreamSolution.towerBuilder(3))
        );
    }

    @Test
    public void basicTests2() {
//        assertEquals(String.join(",", "*"), String.join(",", NewKata.towerBuilder(1)));
//        assertEquals(String.join(",", "ч * ", "***"), String.join(",", NewKata.towerBuilder(2)));
        assertEquals(
            String.join(",", "  *  ", " *** ", "*****"),
            String.join(",", NewKata.towerBuilder(3))
        );
    }
}
