package Kyu6.T11_BuildTower;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void basicTests() {
    assertEquals(String.join(",", "*"), String.join(",", KataStreamSolution.towerBuilder(1)));
    assertEquals(String.join(",", " * ", "***"), String.join(",", KataStreamSolution.towerBuilder(2)));
    assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", KataStreamSolution.towerBuilder(3)));
  }
}