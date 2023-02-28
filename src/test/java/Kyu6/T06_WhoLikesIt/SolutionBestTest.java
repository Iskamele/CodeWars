package Kyu6.T06_WhoLikesIt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionBestTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", SolutionBest.whoLikesIt());
        assertEquals("Peter likes this", SolutionBest.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", SolutionBest.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", SolutionBest.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", SolutionBest.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}