package T07_Isograms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsCleverSolution {
    @Test
    public void FixedTests() {
        assertEquals(true, IsogramCleverSolution.isIsogram("Dermatoglyphics"));
        assertEquals(true, IsogramCleverSolution.isIsogram("isogram"));
        assertEquals(false, IsogramCleverSolution.isIsogram("moose"));
        assertEquals(false, IsogramCleverSolution.isIsogram("isIsogram"));
        assertEquals(false, IsogramCleverSolution.isIsogram("aba"));
        assertEquals(false, IsogramCleverSolution.isIsogram("moOse"));
        assertEquals(true, IsogramCleverSolution.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsogramCleverSolution.isIsogram(""));
    }
}