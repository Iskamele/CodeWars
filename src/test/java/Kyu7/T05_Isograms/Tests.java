package Kyu7.T05_Isograms;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Tests {

    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moOse"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
    }

    @Test
    public void FixedTests2() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moOse"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
    }

    @Test
    public void FixedTests3() {
        assertEquals(true, IsogramCleverSolution.isIsogram("Dermatoglyphics"));
        assertEquals(true, IsogramCleverSolution.isIsogram("isogram"));
        assertEquals(false, IsogramCleverSolution.isIsogram("moose"));
        assertEquals(false, IsogramCleverSolution.isIsogram("isIsogram"));
        assertEquals(false, IsogramCleverSolution.isIsogram("aba"));
        assertEquals(false, IsogramCleverSolution.isIsogram("moOse"));
        assertEquals(true, IsogramCleverSolution.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsogramCleverSolution.isIsogram(""));
    }

    @Test
    public void FixedTests4() {
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram("Dermatoglyphics"));
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram("isogram"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("moose"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("isIsogram"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("aba"));
        assertEquals(false, IsogramBestSolutionWithNull.isIsogram("moOse"));
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsogramBestSolutionWithNull.isIsogram(""));
    }

    @Test
    public void FixedTests5() {
        assertEquals(true, IsogramNew.isIsogram("Dermatoglyphics"));
        assertEquals(true, IsogramNew.isIsogram("isogram"));
        assertEquals(false, IsogramNew.isIsogram("moose"));
        assertEquals(false, IsogramNew.isIsogram("isIsogram"));
        assertEquals(false, IsogramNew.isIsogram("aba"));
        assertEquals(false, IsogramNew.isIsogram("moOse"));
        assertEquals(true, IsogramNew.isIsogram("thumbscrewjapingly"));
        assertEquals(true, IsogramNew.isIsogram(""));
    }
}
