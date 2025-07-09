package Kyu5.T01_SimplePigLatin;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PigLatinTests {
    @Test
    public void FixedTests() {
        assertEquals("igPay atinlay siay oolcay", PigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", PigLatin.pigIt("Hello world !"));
    }

    @Test
    public void FixedTests2() {
        assertEquals("igPay atinlay siay oolcay", PigLatinCleverSolution.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatinCleverSolution.pigIt("This is my string"));
        assertEquals("elloHay orldway !", PigLatinCleverSolution.pigIt("Hello world !"));
    }

    @Test
    public void FixedTests3() {
        assertEquals("igPay atinlay siay oolcay", PigLatinNotWorkingOnCodeWars.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", PigLatinNotWorkingOnCodeWars.pigIt("This is my string"));
//        assertEquals("elloHay orldway !", PigLatinNotWorkingOnCodeWars.pigIt("Hello world !"));
    }

    @Test
    public void FixedTests4() {
        assertEquals("igPay atinlay siay oolcay", NewPigLatin.pigIt("Pig latin is cool"));
        assertEquals("hisTay siay ymay tringsay", NewPigLatin.pigIt("This is my string"));
        assertEquals("elloHay orldway !", NewPigLatin.pigIt("Hello world !"));
    }
}