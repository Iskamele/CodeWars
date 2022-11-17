package T10_DetectPangram;

import T10_DetectPangram.PangramChecker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


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
}