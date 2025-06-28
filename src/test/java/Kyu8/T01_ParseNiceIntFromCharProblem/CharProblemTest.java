package Kyu8.T01_ParseNiceIntFromCharProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharProblemTest {

    @Test
    public void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
        assertEquals(5, CharProblemBest.howOld("5 years old"));
        assertEquals(5, NewCharProblem.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
        assertEquals(9, CharProblemBest.howOld("9 years old"));
        assertEquals(9, NewCharProblem.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
        assertEquals(1, CharProblemBest.howOld("1 year old"));
        assertEquals(1, NewCharProblem.howOld("1 year old"));
    }
}