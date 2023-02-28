package Kyu8.T01_ParseNiceIntFromCharProblem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharProblemTestBest {
    @Test
    public void test1() {
      assertEquals(5, CharProblemBest.howOld("5 years old"));
      }
    @Test
    public void test2() {  
      assertEquals(9, CharProblemBest.howOld("9 years old"));
      }
   @Test
   public void test3() {
      assertEquals(1, CharProblemBest.howOld("1 year old"));
      }
}