package Kyu7.T11_ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class KataStreamNotWorkingOnPlatform {
    public static String reverseWords(final String original) {
        return Arrays.stream(original.split(" "))
                .filter(str -> !str.isEmpty())
                .map(str -> new StringBuilder(str).reverse().append(" ").toString())
                .collect(Collectors.joining())
                .trim();
    }
}