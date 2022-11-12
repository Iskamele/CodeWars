package T07_Isograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsRegex {
    @Test
    public void FixedTests() {
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram("Dermatoglyphics"));
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram("isogram"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("moose"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("isIsogram"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("aba"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("moOse"));
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram(""));
    }
}