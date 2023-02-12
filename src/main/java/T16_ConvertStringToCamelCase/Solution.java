package T16_ConvertStringToCamelCase;

import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {

    static String toCamelCase(String s) {
        String[] words = s.split("[\\W_]");
        return words[0] + Arrays.stream(words, 1, words.length)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining());
    }
}