package T15_VowelCount;

public class VowelsBestSolution {
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}