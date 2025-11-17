package Kyu4.T01_DecodeTheMorseCodeAdvanced;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MorseCodeDecoderV4 {

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
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile("(.)\\1*");
        Matcher matcher = pattern.matcher(bits);

        while (matcher.find()) {
            list.add(matcher.group());
        }

        if (list.isEmpty()) {
            return "";
        }

        while (list.get(0).charAt(0) == '0') {
            list.remove(0);
        }
        while (list.get(list.size() - 1).charAt(0) == '0') {
            list.remove(list.size() - 1);
        }

        AtomicInteger unit = new AtomicInteger(list.get(0).length());
        list.stream()
            .map(String::length)
            .forEach(length -> unit.set(BigInteger.valueOf(unit.intValue()).gcd(BigInteger.valueOf(length)).intValue()));

        StringBuilder result = new StringBuilder();
        int intUnit = unit.intValue();
        for (String group : list) {
            if (group.charAt(0) == '0') {
                if (group.length() / intUnit == 3) {
                    result.append(" ");
                }
                if (group.length() / intUnit == 7) {
                    result.append("   ");
                }
            }
            if (group.charAt(0) == '1') {
                if (group.length() / intUnit == 1) {
                    result.append(".");
                }
                if (group.length() / intUnit == 3) {
                    result.append("-");
                }
            }
        }


        return result.toString();
    }

//    private static int gcd(int unit, Integer length) {
//        while (length != 0) {
//            int temp = length;
//            length = unit % length;
//            unit = temp;
//        }
//        return unit;
//    }


}
