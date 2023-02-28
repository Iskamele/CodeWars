package Kyu7.T05_Isograms;

public class IsogramCleverSolution {
    public static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}