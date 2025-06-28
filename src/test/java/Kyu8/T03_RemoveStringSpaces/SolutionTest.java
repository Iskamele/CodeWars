package Kyu8.T03_RemoveStringSpaces;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("8j8mBliB8gimjB8B8jlB", Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", Kata.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", Kata.noSpace("8j aam"));

        assertEquals("8j8mBliB8gimjB8B8jlB", NewKata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        assertEquals("88Bifk8hB8BB8BBBB888chl8BhBfd", NewKata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        assertEquals("8aaaaaddddr", NewKata.noSpace("8aaaaa dddd r     "));
        assertEquals("jfBmgklf8hg88lbe8", NewKata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        assertEquals("8jaam", NewKata.noSpace("8j aam"));
    }
}