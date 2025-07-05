package Kyu6.T07_ConvertStringToCamelCase;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSomeUnderscoreLowerStart() {
        String input = "The_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("TheStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }

    @Test
    public void testSomeUnderscoreLowerStart2() {
        String input = "the_Stealth_Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", NewSolution.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart2() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: " + input);
        assertEquals("theStealthWarrior", NewSolution.toCamelCase(input));
    }

    @Test
    public void testSomeDashLowerStart3() {
        assertEquals("TheStealthWarrior", Solution.toCamelCase("The-Stealth-Warrior"));
        assertEquals("TheStealthWarrior", NewSolution.toCamelCase("The-Stealth-Warrior"));
    }
}
