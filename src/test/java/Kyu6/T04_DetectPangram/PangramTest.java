package Kyu6.T04_DetectPangram;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class PangramTest {

    @Test
    public void test1() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test2() {
        String pangram2 = "You shall not pass!";
        PangramChecker pc = new PangramChecker();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void test3() {
        PangramChecker pc = new PangramChecker();
        assertEquals(true, pc.check(("npxdzfgiqhk wu emgoy ohauferjt ysv vck altb")));
        assertEquals(true, pc.check(("m rxqupjnlaswchgbi zoykvdet f")));
    }

    @Test
    public void test4() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerCharLoop pc = new PangramCheckerCharLoop();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test5() {
        String pangram2 = "You shall not pass!";
        PangramCheckerCharLoop pc = new PangramCheckerCharLoop();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void test6() {
        PangramCheckerCharLoop pc = new PangramCheckerCharLoop();
        assertEquals(true, pc.check(("npxdzfgiqhk wu emgoy ohauferjt ysv vck altb")));
        assertEquals(true, pc.check(("m rxqupjnlaswchgbi zoykvdet f")));
    }

    @Test
    public void test7() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        PangramCheckerCleverSolution pc = new PangramCheckerCleverSolution();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test8() {
        String pangram2 = "You shall not pass!";
        PangramCheckerCleverSolution pc = new PangramCheckerCleverSolution();
        assertEquals(false, pc.check(pangram2));
    }

    @Test
    public void test9() {
        PangramCheckerCleverSolution pc = new PangramCheckerCleverSolution();
        assertEquals(true, pc.check(("npxdzfgiqhk wu emgoy ohauferjt ysv vck altb")));
        assertEquals(true, pc.check(("m rxqupjnlaswchgbi zoykvdet f")));
    }

    @Test
    public void test10() {
        String pangram1 = "The quick brown fox jumps over the lazy dog.";
        NewPangramChecker pc = new NewPangramChecker();
        assertEquals(true, pc.check(pangram1));
    }

    @Test
    public void test11() {
        String pangram2 = "You shall not pass!";
        NewPangramChecker pc = new NewPangramChecker();
        assertEquals(false, pc.check(pangram2));
    }
}
