package Kyu6.T01_TakeATenMinutesWalk;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExampleTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true, TenMinWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'w'}));
        assertEquals("Should return false", false, TenMinWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
    @Test
    public void Test2() {
        assertEquals("Should return true", true, TenMinWalkBest.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals("Should return false", false, TenMinWalkBest.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals("Should return false", false, TenMinWalkBest.isValid(new char[]{'w'}));
        assertEquals("Should return false", false, TenMinWalkBest.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }
}
