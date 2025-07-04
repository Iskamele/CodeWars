package Kyu7.T11_ReverseWords;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void exampleCases() {
//        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", Kata.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
//        assertEquals("elppa", Kata.reverseWords("apple"), "Input: \"apple\"");
//        assertEquals("a b c d", Kata.reverseWords("a b c d"), "Input: \"a b c d\"");
//        assertEquals("  elbuod  decaps  sdrow  ", Kata.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }

    @Test
    public void exampleCases2() {
//        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", KataStreamNotWorkingOnPlatform.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
//        assertEquals("elppa", KataStreamNotWorkingOnPlatform.reverseWords("apple"), "Input: \"apple\"");
//        assertEquals("a b c d", KataStreamNotWorkingOnPlatform.reverseWords("a b c d"), "Input: \"a b c d\"");
//        assertEquals("  elbuod  decaps  sdrow  ", KataStreamNotWorkingOnPlatform.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }

    @Test
    public void exampleCases3() {
//        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", KataStreamWithRegex.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
//        assertEquals("elppa", KataStreamWithRegex.reverseWords("apple"), "Input: \"apple\"");
//        assertEquals("a b c d", KataStreamWithRegex.reverseWords("a b c d"), "Input: \"a b c d\"");
//        assertEquals("  elbuod  decaps  sdrow  ", KataStreamWithRegex.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }

    @Test
    public void exampleCases4() {
//        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", NewKata.reverseWords("The quick brown fox jumps over the lazy dog."), "Input: \"The quick brown fox jumps over the lazy dog.\"");
//        assertEquals("elppa", NewKata.reverseWords("apple"), "Input: \"apple\"");
//        assertEquals("a b c d", NewKata.reverseWords("a b c d"), "Input: \"a b c d\"");
//        assertEquals("  elbuod  decaps  sdrow  ", NewKata.reverseWords("  double  spaced  words  "), "Input: \"  double  spaced  words  \"");
    }

    @Test
    public void exampleCases5() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", NewStringKata.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", NewStringKata.reverseWords("apple"));
        assertEquals("a b c d", NewStringKata.reverseWords("a b c d"));
        assertEquals("  elbuod  decaps  sdrow  ", NewStringKata.reverseWords("  double  spaced  words  "));
    }
}
