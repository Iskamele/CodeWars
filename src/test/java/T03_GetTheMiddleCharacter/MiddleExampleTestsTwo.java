package T03_GetTheMiddleCharacter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MiddleExampleTestsTwo {
  @Test
  public void evenTests() {
    assertEquals("es", MainTwo.getMiddle("test"));
    assertEquals("dd", MainTwo.getMiddle("middle"));
  }
  
  @Test
  public void oddTests() {
    assertEquals("t", MainTwo.getMiddle("testing"));
    assertEquals("A", MainTwo.getMiddle("A"));
  }
}