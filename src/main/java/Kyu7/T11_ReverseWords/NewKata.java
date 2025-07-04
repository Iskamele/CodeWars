package Kyu7.T11_ReverseWords;

public class NewKata {

    public static String reverseWords(final String original) {
        StringBuilder stringBuilder = new StringBuilder();

        String[] stringArray = original.split(" ");

        for (String string : stringArray) {
            stringBuilder.append(new StringBuilder(string).reverse()).append(" ");
        }

        return stringBuilder.toString().trim();
    }
}
