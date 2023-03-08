package Kyu7.T11_ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KataStreamWithRegex {
    public static String reverseWords(final String original) {
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());
    }
}