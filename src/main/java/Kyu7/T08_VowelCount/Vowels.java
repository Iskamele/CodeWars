package Kyu7.T08_VowelCount;

import java.util.function.Predicate;

public class Vowels {
    private static final Predicate<Character> isVowel = ch -> "aeiou".indexOf(ch) >= 0;

    public static int getCount(String str) {
        return (int) str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(isVowel)
                .count();
    }
}