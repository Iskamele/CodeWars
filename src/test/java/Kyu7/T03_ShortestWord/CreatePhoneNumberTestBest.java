package Kyu7.T03_ShortestWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Javatlacati on 01/03/2017.
 */
public class CreatePhoneNumberTestBest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, ShortestWordBest.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWordBest.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWordBest.findShort("Let's travel abroad shall we"));
    }

}