package Kyu6.T14_DecodeTheMorseCode;

import java.util.HashMap;
import java.util.Map;

public class MorseCodeDecoder {
    private static final String WORD_SEPARATOR = "\\s{3}";
    private static final String LETTER_SEPARATOR = "\\s{1}";


    public static String decode(String morseCode) {
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
}
