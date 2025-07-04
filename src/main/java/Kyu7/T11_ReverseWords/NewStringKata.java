package Kyu7.T11_ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class NewStringKata {

    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
            .map(string -> new StringBuilder(string).reverse().toString())
            .collect(Collectors.joining());
    }
}
