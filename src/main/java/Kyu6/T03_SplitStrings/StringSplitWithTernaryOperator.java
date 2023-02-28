package Kyu6.T03_SplitStrings;

public class StringSplitWithTernaryOperator {
    public static String[] solution(String s) {
        return (s + (s.length() % 2 > 0 ? "_" : "")).split("(?<=\\G.{2})");
    }
}