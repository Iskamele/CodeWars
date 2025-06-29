package Kyu8.T12_RemoveFirstAndLastCharacter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveCharsTest {

    @Test
    public void testRemoval() {
        assertEquals("loquen", RemoveChars.remove("eloquent"));
        assertEquals("ountr", RemoveChars.remove("country"));
        assertEquals("erso", RemoveChars.remove("person"));
        assertEquals("lac", RemoveChars.remove("place"));
    }

    @Test
    public void testRemoval2() {
        assertEquals("loquen", NewRemoveChars.remove("eloquent"));
        assertEquals("ountr", NewRemoveChars.remove("country"));
        assertEquals("erso", NewRemoveChars.remove("person"));
        assertEquals("lac", NewRemoveChars.remove("place"));
    }
}
