package Kyu7.T05_Isograms;

public class IsogramBestSolutionWithNull {
    // Clever solution is good implementation, but it lacks of null-safetiness. NullPointerException when you put null as str argument.
    public static boolean isIsogram(String str) {
        if (str == null) {
            return false;
        }
        if (str.isEmpty()) {
            return true;
        }
        return str.length() == str.toLowerCase().chars().distinct().count();
    }
}
