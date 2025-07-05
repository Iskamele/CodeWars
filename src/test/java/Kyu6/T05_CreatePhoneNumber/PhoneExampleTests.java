package Kyu6.T05_CreatePhoneNumber;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhoneExampleTests {

    @Test
    public void tests() {
        assertEquals(
            "(123) 456-7890",
            CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    @Test
    public void tests2() {
        assertEquals(
            "(123) 456-7890",
            CreatePhoneNumberFormatter.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    @Test
    public void tests3() {
        assertEquals(
            "(123) 456-7890",
            CreatePhoneNumberBest.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }

    @Test
    public void tests4() {
        assertEquals(
            "(123) 456-7890",
            CreatePhoneNumberCleverSolution.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,
                0})
        );
    }

    @Test
    public void tests5() {
        assertEquals(
            "(123) 456-7890",
            NewKata.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0})
        );
    }
}
