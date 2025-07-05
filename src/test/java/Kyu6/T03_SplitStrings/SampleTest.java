package Kyu6.T03_SplitStrings;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;
import org.junit.Test;

public class SampleTest {
    @Test
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string", "[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
        assertEquals("Should handle even string", "[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
    }

    @Test
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string", "[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
        assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
    }

    @Test
    public void testEvenString2() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("Should handle even string", "[ab, cd, ef]", Arrays.toString(StringSplitWithTernaryOperator.solution(s)));
        assertEquals("Should handle even string", "[He, ll, oW, or, ld]", Arrays.toString(StringSplitWithTernaryOperator.solution(s1)));
    }

    @Test
    public void testOddString2() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("Should handle odd string", "[ab, cd, e_]", Arrays.toString(StringSplitWithTernaryOperator.solution(s)));
        assertEquals("Should handle odd string", "[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplitWithTernaryOperator.solution(s1)));
    }

    @Test
    public void testEvenString3() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertArrayEquals(new String[]{"ab", "cd", "ef"}, NewStringSplit.solution(s), "Should handle even string");
        assertArrayEquals(new String[]{"He", "ll", "oW", "or", "ld"}, NewStringSplit.solution(s1), "Should handle even string");
    }

    @Test
    public void testOddString3() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertArrayEquals(new String[]{"ab", "cd", "e_"}, NewStringSplit.solution(s), "Should handle odd string");
        assertArrayEquals(new String[]{"Lo", "ve", "Pi", "zz", "a_"}, NewStringSplit.solution(s1), "Should handle odd string");
    }
}
