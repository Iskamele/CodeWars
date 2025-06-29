package Kyu8.T08_ConvertAStringToANumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToNumberWithoutExceptionTest {
    @Test
    public void test1() {
        assertEquals("stringToNumber(1234)", 1234, StringToNumber.stringToNumber("1234"));
        assertEquals("stringToNumber(1234)", 1234, StringToNumberWithoutException.stringToNumber("1234"));
        assertEquals("stringToNumber(1234)", 1234, NewStringToNumber.stringToNumber("1234"));
    }

    @Test
    public void test2() {
        assertEquals("stringToNumber(605)", 605, StringToNumber.stringToNumber("605"));
        assertEquals("stringToNumber(605)", 605, StringToNumberWithoutException.stringToNumber("605"));
        assertEquals("stringToNumber(605)", 605, NewStringToNumber.stringToNumber("605"));
    }

    @Test
    public void test3() {
        assertEquals("stringToNumber(1405)", 1405, StringToNumber.stringToNumber("1405"));
        assertEquals("stringToNumber(1405)", 1405, StringToNumberWithoutException.stringToNumber("1405"));
        assertEquals("stringToNumber(1405)", 1405, NewStringToNumber.stringToNumber("1405"));
    }

    @Test
    public void test4() {
        assertEquals("stringToNumber(-7)", -7, StringToNumber.stringToNumber("-7"));
        assertEquals("stringToNumber(-7)", -7, StringToNumberWithoutException.stringToNumber("-7"));
        assertEquals("stringToNumber(-7)", -7, NewStringToNumber.stringToNumber("-7"));
    }
}