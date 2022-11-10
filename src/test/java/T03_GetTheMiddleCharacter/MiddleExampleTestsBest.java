package T03_GetTheMiddleCharacter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleExampleTestsBest {
  @Test
  public void evenTests() {
    assertEquals("es", MainBest.getMiddle("test"));
    assertEquals("dd", MainBest.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", MainBest.getMiddle("testing"));
    assertEquals("A", MainBest.getMiddle("A"));
  }
}