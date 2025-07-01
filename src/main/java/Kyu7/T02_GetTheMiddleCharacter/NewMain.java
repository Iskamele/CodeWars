package Kyu7.T02_GetTheMiddleCharacter;

public class NewMain {

    public static String getMiddle(String word) {
        int halfLength = word.length() / 2;

        return word.length() % 2 == 0 ?
            word.substring(halfLength - 1, halfLength + 1)
            : word.substring(halfLength, halfLength + 1);
    }
}
