package T01_TakeATenMinutesWalk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTestBest {
  @Test
  public void Test() {
    assertEquals("Should return true", true, TenMinWalkBest.isValid(new char[] {'n','s','n','s','n','s','n','s','n','s'}));
    assertEquals("Should return false", false, TenMinWalkBest.isValid(new char[] {'w','e','w','e','w','e','w','e','w','e','w','e'}));
    assertEquals("Should return false", false, TenMinWalkBest.isValid(new char[] {'w'}));
    assertEquals("Should return false", false, TenMinWalkBest.isValid(new char[] {'n','n','n','s','n','s','n','s','n','s'}));
  }
}