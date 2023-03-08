package Kyu7.T11_ReverseWords;

public class Kata {
    public static String reverseWords(final String original) {
        StringBuilder builder = new StringBuilder();
        String[] words = original.split(" ");
        for (String word : words) {
            StringBuilder reverser = new StringBuilder(word);
            reverser.reverse();
            builder.append(reverser);
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}