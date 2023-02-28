package Kyu7.T02_GetTheMiddleCharacter;

public class Main {
    public static String getMiddle(String word) {
        /*
        StringBuilder builder = new StringBuilder();
        if (word.length() % 2 == 0){
            builder.append(word.charAt(word.length() / 2 -1));
            builder.append(word.charAt(word.length() / 2));
        }
        return (word.length() % 2 == 0) ? builder.toString() : Character.toString(word.charAt(word.length() / 2));
        */
        return (word.length() % 2 == 0) ?
                Character.toString((word.charAt(word.length() / 2 - 1)))
                        + ((word.charAt(word.length() / 2)))
                : Character.toString(word.charAt(word.length() / 2));
    }
}
