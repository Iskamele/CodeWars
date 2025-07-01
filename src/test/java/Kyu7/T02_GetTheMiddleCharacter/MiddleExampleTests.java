package Kyu7.T02_GetTheMiddleCharacter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MiddleExampleTests {

    @Test
    public void evenTests() {
        assertEquals("es", Main.getMiddle("test"));
        assertEquals("dd", Main.getMiddle("middle"));
    }

    @Test
    public void oddTests() {
        assertEquals("t", Main.getMiddle("testing"));
        assertEquals("A", Main.getMiddle("A"));
    }

    @Test
    public void evenTestsBest() {
        assertEquals("es", MainBest.getMiddle("test"));
        assertEquals("dd", MainBest.getMiddle("middle"));
    }

    @Test
    public void oddTestsBest() {
        assertEquals("t", MainBest.getMiddle("testing"));
        assertEquals("A", MainBest.getMiddle("A"));
    }

    @Test
    public void evenTestsTwo() {
        assertEquals("es", MainTwo.getMiddle("test"));
        assertEquals("dd", MainTwo.getMiddle("middle"));
    }

    @Test
    public void oddTestsTwo() {
        assertEquals("t", MainTwo.getMiddle("testing"));
        assertEquals("A", MainTwo.getMiddle("A"));
    }

    @Test
    public void evenTestsNew() {
        assertEquals("es", NewMain.getMiddle("test"));
        assertEquals("dd", NewMain.getMiddle("middle"));
    }

    @Test
    public void oddTestsNew() {
        assertEquals("t", NewMain.getMiddle("testing"));
        assertEquals("A", NewMain.getMiddle("A"));
    }
}
