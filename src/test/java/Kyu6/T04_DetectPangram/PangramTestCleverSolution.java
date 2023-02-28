package Kyu6.T04_DetectPangram;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PangramTestCleverSolution {
    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerCleverSolution pc = new PangramCheckerCleverSolution();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramCheckerCleverSolution pc = new PangramCheckerCleverSolution();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void test3() {
        PangramCheckerCleverSolution pc = new PangramCheckerCleverSolution();
        assertEquals(true, pc.check(("npxdzfgiqhk wu emgoy ohauferjt ysv vck altb")));
        assertEquals(true, pc.check(("m rxqupjnlaswchgbi zoykvdet f")));

    }
}