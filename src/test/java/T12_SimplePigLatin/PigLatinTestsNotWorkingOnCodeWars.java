package T12_SimplePigLatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTestsNotWorkingOnCodeWars {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatinNotWorkingOnCodeWars.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatinNotWorkingOnCodeWars.pigIt("This is my string"));
    }
}