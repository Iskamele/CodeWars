package Kyu7.T04_DisemvowelTrolls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestsCleverSolution {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", TrollCleverSolution.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", TrollCleverSolution.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", TrollCleverSolution.disemvowel("What are you, a communist?"));
    }
}