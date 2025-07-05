package Kyu6.T06_WhoLikesIt;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void staticTests() {
        assertEquals("no one likes this", Solution.whoLikesIt());
        assertEquals("Peter likes this", Solution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", Solution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", Solution.whoLikesIt("Max", "John", "Mark"));
        assertEquals(
            "Alex, Jacob and 2 others like this",
            Solution.whoLikesIt("Alex", "Jacob", "Mark", "Max")
        );
    }

    @Test
    public void staticTests2() {
        assertEquals("no one likes this", SolutionBest.whoLikesIt());
        assertEquals("Peter likes this", SolutionBest.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", SolutionBest.whoLikesIt("Jacob", "Alex"));
        assertEquals(
            "Max, John and Mark like this",
            SolutionBest.whoLikesIt("Max", "John", "Mark")
        );
        assertEquals(
            "Alex, Jacob and 2 others like this",
            SolutionBest.whoLikesIt("Alex", "Jacob", "Mark", "Max")
        );
    }

    @Test
    public void staticTests3() {
        assertEquals("no one likes this", NewSolution.whoLikesIt());
        assertEquals("Peter likes this", NewSolution.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", NewSolution.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", NewSolution.whoLikesIt("Max", "John", "Mark"));
        assertEquals(
            "Alex, Jacob and 2 others like this",
            NewSolution.whoLikesIt("Alex", "Jacob", "Mark", "Max")
        );
    }
}
