package T03_GetTheMiddleCharacter;

public class MainTwo {
    public static String getMiddle(String word) {
        int l = word.length();
        return (word.length() % 2 == 0) ? word.substring(l / 2 - 1, l / 2 + 1) : Character.toString(word.charAt(l / 2));
    }
}
