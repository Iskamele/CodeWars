package Kyu4.T01_DecodeTheMorseCodeAdvanced;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class MorseCodeDecoderTest {

    @Test
    public void testExampleFromDescription() throws Exception {
        assertThat(
            MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(
                "1100110011001100000011000000111111001100111111001111110000000000000011001111110011111100111111000000110011001111110000001111110011001100000011")),
            is("HEY JUDE")
        );
    }

    @Test
    public void testHey() throws Exception {
        assertThat(
            MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(
                "110011001100110000001100000011111100110011111100111111")),
            is("HEY")
        );
    }

    @Test
    public void testMultipleBitsPerDotHandling() throws Exception {
        // Pattern that might break time unit detection
        String bits = "10101010";  // Alternating pattern
        String result = MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(bits));
        assertThat(result, is("E")); // Should decode as dots
    }

    @Test
    public void testLongMessagesHandling() throws Exception {
        // Try an actual encoded message that might break
        // "SOS" = "... --- ..." - classic test case
        String bits = "101010000011101110111000010101"; // SOS with 1-bit time units
        String result = MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(bits));
        assertThat(result, is("SOS"));
    }

    // Additional edge cases that might match website tests:

    @Test
    public void testSingleBit() throws Exception {
        // Minimal input
        String bits = "1";
        String result = MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(bits));
        assertThat(result, is("E"));
    }

    @Test
    public void testOnlyOnes() throws Exception {
        // All ones - should be a long dash
        String bits = "1111111111";
        String result = MorseCodeDecoder.decodeMorse(MorseCodeDecoder.decodeBits(bits));
        assertThat(result, is("T")); // Single dash
    }
}
