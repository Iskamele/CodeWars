package Kyu7.T08_VowelCount;

public class VowelsBestSolution {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}