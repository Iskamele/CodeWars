package T16_ConvertStringToCamelCase;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "The_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("TheStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
}