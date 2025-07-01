package Kyu7.T03_ShortestWord;

import java.util.Arrays;

public class Kata {

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).toList().stream() // Better Stream.of(s.split(" "))
            .mapToInt(String::length)
            .min()
            .getAsInt();
    }
}
