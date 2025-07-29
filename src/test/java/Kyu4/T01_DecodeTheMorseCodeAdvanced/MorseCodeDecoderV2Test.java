package Kyu4.T01_DecodeTheMorseCodeAdvanced;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MorseCodeDecoderV2Test {

    @Test
    public void testExampleFromDescription() throws Exception {
        assertThat(
            MorseCodeDecoderV2.decodeMorse(MorseCodeDecoderV2.decodeBits(
                "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")),
            is("HEY JUDE")
        );
    }
}
