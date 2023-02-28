package Kyu5.T01_SimplePigLatin;

import java.util.regex.Pattern;

public class PigLatin {
    public static String pigIt(String str) {
        final String[] words = str.split("\\s");
        final StringBuilder builder = new StringBuilder();
        for (String word : words) {
            if (Pattern.matches("\\p{IsPunctuation}", word)) {
                builder.append(word)
                        .append(" ");
            } else {
                builder.append(word.substring(1))
                        .append(word.charAt(0))
                        .append("ay ");
            }
        }
        while (builder.charAt(builder.length() - 1) == ' ') {
            builder.setLength(builder.length() - 1);
        }
        return new String(builder);
    }
}