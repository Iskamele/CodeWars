package T07_Isograms;

public class IsogramRegex {
    public static boolean isIsogram(String str) {
        return str.toLowerCase().matches("(?:([a-z])(?!.*\\1))*");
    }
}
