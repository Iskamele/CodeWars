package Kyu6.T14_DecodeTheMorseCode;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() {
        assertThat(MorseCodeDecoder.decode(".... . -.--   .--- ..- -.. ."), is("HEY JUDE"));
        assertThat(MorseCodeDecoder.decode(" ."), is("E"));
    }
}
