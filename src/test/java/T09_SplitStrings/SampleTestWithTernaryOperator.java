package T09_SplitStrings;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

public class SampleTestWithTernaryOperator {
    @Test
    public void testEvenString() {
       String s = "abcdef";
       String s1 = "HelloWorld";
       assertEquals("Should handle even string","[ab, cd, ef]", Arrays.toString(StringSplitWithTernaryOperator.solution(s)));
       assertEquals("Should handle even string","[He, ll, oW, or, ld]", Arrays.toString(StringSplitWithTernaryOperator.solution(s1)));
    }
    
    @Test
    public void testOddString() {
       String s = "abcde";
       String s1 = "LovePizza";
       assertEquals("Should handle odd string","[ab, cd, e_]", Arrays.toString(StringSplitWithTernaryOperator.solution(s)));
       assertEquals("Should handle odd string","[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplitWithTernaryOperator.solution(s1)));
    }
}