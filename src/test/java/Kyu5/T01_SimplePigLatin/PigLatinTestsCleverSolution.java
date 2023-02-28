package Kyu5.T01_SimplePigLatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTestsCleverSolution {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatinCleverSolution.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatinCleverSolution.pigIt("This is my string"));
    }
}