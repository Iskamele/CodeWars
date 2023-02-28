package Kyu5.T01_SimplePigLatin;

public class PigLatinCleverSolution {
    public static String pigIt(String str) {
        return str.replaceAll("(\\w)(\\w*)", "$2$1ay");
    }
}