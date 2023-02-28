package Kyu6.T03_SplitStrings;

public class StringSplit {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s = s + "_";
        }
        return s.split("(?<=\\G..)");
    }
}