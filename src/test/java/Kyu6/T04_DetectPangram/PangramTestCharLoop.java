package Kyu6.T04_DetectPangram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PangramTestCharLoop {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerCharLoop pc = new PangramCheckerCharLoop();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramCheckerCharLoop pc = new PangramCheckerCharLoop();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void test3() {
        PangramCheckerCharLoop pc = new PangramCheckerCharLoop();
        assertEquals(true, pc.check(("npxdzfgiqhk wu emgoy ohauferjt ysv vck altb")));
        assertEquals(true, pc.check(("m rxqupjnlaswchgbi zoykvdet f")));
    }
}