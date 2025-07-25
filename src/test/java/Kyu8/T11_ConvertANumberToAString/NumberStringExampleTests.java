package Kyu8.T11_ConvertANumberToAString;

import static junit.framework.TestCase.assertEquals;

import org.junit.Test;

public class NumberStringExampleTests {

    @Test
    public void tests() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("123", Kata.numberToString(123));
        assertEquals("999", Kata.numberToString(999));
    }

    @Test
    public void tests2() {
        assertEquals("67", NewKata.numberToString(67));
        assertEquals("123", NewKata.numberToString(123));
        assertEquals("999", NewKata.numberToString(999));
    }
}
