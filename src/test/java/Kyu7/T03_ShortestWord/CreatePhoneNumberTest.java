package Kyu7.T03_ShortestWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreatePhoneNumberTest {
    @Test
    public void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
    }

    @Test
    public void findShort2() {
        assertEquals(3, ShortestWordBest.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWordBest.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWordBest.findShort("Let's travel abroad shall we"));
    }

    @Test
    public void findShortNew() {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, Kata.findShort("Let's travel abroad shall we"));
    }
}
