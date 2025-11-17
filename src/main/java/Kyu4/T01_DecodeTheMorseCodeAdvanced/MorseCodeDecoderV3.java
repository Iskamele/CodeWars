package Kyu4.T01_DecodeTheMorseCodeAdvanced;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoderV3 {

    private static String getWordFromLibrary(String key) {
        Map<String, String> library = new HashMap<String, String>();
        library.put(".-", "A");
        library.put("-...", "B");
        library.put("-.-.", "C");
        library.put("-..", "D");
        library.put(".", "E");
        library.put("..-.", "F");
        library.put("--.", "G");
        library.put("....", "H");
        library.put("..", "I");
        library.put(".---", "J");
        library.put("-.-", "K");
        library.put(".-..", "L");
        library.put("--", "M");
        library.put("-.", "N");
        library.put("---", "O");
        library.put(".--.", "P");
        library.put("--.-", "Q");
        library.put(".-.", "R");
        library.put("...", "S");
        library.put("-", "T");
        library.put("..-", "U");
        library.put("...-", "V");
        library.put(".--", "W");
        library.put("-..-", "X");
        library.put("-.--", "Y");
        library.put("--..", "Z");

        library.put(".----", "1");
        library.put("..---", "2");
        library.put("...--", "3");
        library.put("....-", "4");
        library.put(".....", "5");
        library.put("-....", "6");
        library.put("--...", "7");
        library.put("---..", "8");
        library.put("----.", "9");
        library.put("-----", "0");

        return library.get(key);
    }

    private static final String WORD_SEPARATOR = "\\s{3}";
    private static final String LETTER_SEPARATOR = "\\s{1}";

    public static String decodeMorse(String morseCode) {
        String[] words = morseCode.trim().split(WORD_SEPARATOR);
        StringBuilder builder = new StringBuilder();
        processWords(words, builder);

        return builder.toString().trim();
    }

    private static void processWords(String[] words, StringBuilder builder) {
        for (String word : words) {
            decodeLetters(word, builder);
            builder.append(" ");
        }
    }

    private static void decodeLetters(String word, StringBuilder builder) {
        for (String letter : word.split(LETTER_SEPARATOR)) {
            builder.append(getWordFromLibrary(letter));
        }
    }

    public static String decodeBits(String bits) {
        int minZero = Integer.MAX_VALUE;
        int maxZero = 0;
        int minOne = Integer.MAX_VALUE;
        int maxOne = 0;

        String[] split = bits.split("(?<=(.))(?!\\1)");

        for (String group : split) {
            if (!group.isEmpty()) {
                if (group.charAt(0) == '0') {
                    minZero = Math.min(minZero, group.length());
                    maxZero = Math.max(maxZero, group.length());
                }
                if (group.charAt(0) == '1') {
                    minOne = Math.min(minOne, group.length());
                    maxOne = Math.max(maxOne, group.length());
                }
            }
        }

        StringBuilder result = new StringBuilder();

        for (String group : split) {
            if (!group.isEmpty()) {
                if (group.charAt(0) == '0') {
                    if (group.length() > minZero && group.length() < maxZero) {
                        result.append(" ");
                    } else if (group.length() >= maxZero) {
                        result.append("   ");
                    }
                }
                if (group.charAt(0) == '1') {
                    if (group.length() >= minOne && group.length() < maxOne) {
                        result.append(".");
                    } else if (group.length() <= maxOne && group.length() > minOne) {
                        result.append("-");
                    }
                }
            }
        }

        return result.toString();
    }
}
