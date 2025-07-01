package Kyu7.T04_DisemvowelTrolls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void FixedTests() {
        assertEquals("Ths wbst s fr lsrs LL!", Troll.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", Troll.disemvowel(
                "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", Troll.disemvowel("What are you, a communist?"));
    }

    @Test
    public void FixedTests2() {
        assertEquals("Ths wbst s fr lsrs LL!", TrollCleverSolution.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", TrollCleverSolution.disemvowel(
            "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", TrollCleverSolution.disemvowel("What are you, a communist?"));
    }

    @Test
    public void FixedTests3() {
        assertEquals("Ths wbst s fr lsrs LL!", TrollSwitchCase.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", TrollSwitchCase.disemvowel(
            "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", TrollSwitchCase.disemvowel("What are you, a communist?"));
    }

    @Test
    public void FixedTests4() {
        assertEquals("Ths wbst s fr lsrs LL!", NewTroll.disemvowel("This website is for losers LOL!"));
        assertEquals("N ffns bt,\nYr wrtng s mng th wrst 'v vr rd", NewTroll.disemvowel(
            "No offense but,\nYour writing is among the worst I've ever read"));
        assertEquals("Wht r y,  cmmnst?", NewTroll.disemvowel("What are you, a communist?"));
    }
}
