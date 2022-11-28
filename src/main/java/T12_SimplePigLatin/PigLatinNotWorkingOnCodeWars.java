package T12_SimplePigLatin;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PigLatinNotWorkingOnCodeWars {
    public static String pigIt(String str) {
        return Stream.of(str.split(" "))
                .map(e -> e + e.charAt(0))
                .map(e -> e.substring(1))
                .map(e -> e + "ay ")
                .collect(Collectors.joining()).stripTrailing();

    }
}