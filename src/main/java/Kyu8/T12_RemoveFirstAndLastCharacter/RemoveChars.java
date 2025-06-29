package Kyu8.T12_RemoveFirstAndLastCharacter;

public class RemoveChars {
    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }
}