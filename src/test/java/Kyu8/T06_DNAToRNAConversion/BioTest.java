package Kyu8.T06_DNAToRNAConversion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BioTest {

    @Test
    public void testDna() {
        Bio b = new Bio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna2() {
        Bio b = new Bio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }

    @Test
    public void testDna3() {
        NewBio b = new NewBio();
        assertEquals("UUUU", b.dnaToRna("TTTT"));
    }

    @Test
    public void testDna4() {
        NewBio b = new NewBio();
        assertEquals("GCAU", b.dnaToRna("GCAT"));
    }
}