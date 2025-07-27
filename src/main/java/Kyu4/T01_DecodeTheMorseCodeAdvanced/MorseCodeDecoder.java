package Kyu4.T01_DecodeTheMorseCodeAdvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class MorseCodeDecoder {

    private static final String WORD_SEPARATOR = "\\s{3}";
    private static final String LETTER_SEPARATOR = "\\s{1}";

    public static String decodeBits(String bits) {
        Integer[] array = Arrays.stream(bits.chars().toArray()).boxed().toArray(Integer[]::new);

        List<Integer> first = new ArrayList<>();
        first.add(array[0]);
        first.add(1);

        List<List<Integer>> list = new ArrayList<>();
        list.add(first);

        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (Objects.equals(array[i], list.get(index).get(0))) {
                List<Integer> list1 = list.get(index);
                list.remove(list.size() - 1);
                Integer last = list1.get(1);
                last++;
                list1.remove(list1.size() - 1);
                list1.add(last);
                list.add(list1);
            } else {
                ArrayList<Integer> newItem = new ArrayList<>();
                newItem.add(array[i]);
                newItem.add(1);
                list.add(newItem);
                index++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (List<Integer> integers : list) {
            if (integers.get(0) == 49) {
                if (integers.get(1) == 2) {
                    builder.append(".");
                }
                if (integers.get(1) == 6) {
                    builder.append("-");
                }
            }

            if (integers.get(0) == 48) {
                if (integers.get(1) == 6) {
                    builder.append(" ");
                }
                if (integers.get(1) > 6) {
                    builder.append("   ");
                }
            }
        }
        return builder.toString();
    }

    public static String decodeMorse(String morseCode) {
        return decode(morseCode);
    }

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
