package Kyu6.T03_SplitStrings;

import java.util.stream.IntStream;

public class NewStringSplit {

    public static String[] solution(String s) {
        String oddString = s.length() % 2 != 0 ? s + "_" : s;
        return IntStream.range(0, oddString.length() / 2)
            .mapToObj(i -> oddString.substring(i * 2, i * 2 + 2))
            .toArray(String[]::new);
    }
}
