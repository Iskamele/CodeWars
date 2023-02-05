package T15_VowelCount;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelsVariantOne {
    private static final Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static int getCount(String str) {
        return (int) str.chars()
                .mapToObj(c -> (char) c)
                .filter(VOWELS::contains)
                .count();
    }
}