package T05_ShortestWord;

import java.util.stream.Stream;

public class ShortestWordBest {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}