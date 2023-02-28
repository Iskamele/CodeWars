package Kyu7.T05_Isograms;

public class Isogram {
    public static boolean isIsogram(String str) {
        char[] uniqueLetter = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < uniqueLetter.length; j++) {
                if (uniqueLetter[j] == str.toLowerCase().charAt(i)) {
                    return false;
                }
            }
            uniqueLetter[i] = str.charAt(i);
        }
        return true;
    }
}