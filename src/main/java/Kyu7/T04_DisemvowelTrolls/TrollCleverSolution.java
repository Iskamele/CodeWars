package Kyu7.T04_DisemvowelTrolls;

public class TrollCleverSolution {
    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
