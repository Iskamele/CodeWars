/**
 * 5 kyu - Simple Pig Latin
 * <p>
 * https://www.codewars.com/kata/520b9d2ad5c005041100000f
 * <p>
 * Move the first letter of each word to the end of it,
 * then add "ay" to the end of the word. Leave punctuation marks untouched.
 */

package T12_SimplePigLatin;

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