package Kyu7.T02_GetTheMiddleCharacter;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MiddleExampleTests {
  @Test
  public void evenTests() {
    assertEquals("es", Main.getMiddle("test"));
    assertEquals("dd", Main.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", Main.getMiddle("testing"));
    assertEquals("A", Main.getMiddle("A"));
  }
}