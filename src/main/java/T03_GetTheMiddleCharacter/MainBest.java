package T03_GetTheMiddleCharacter;

public class MainBest {
    public static String getMiddle(String word) {
        int l = word.length();
        return word.substring(l / 2 - (1 - l % 2), l / 2 + 1);
    }
}
