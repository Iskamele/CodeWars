package Kyu7.T04_DisemvowelTrolls;

public class NewTroll {

    public static String disemvowel(String str) {
        return str.replaceAll("[eEuUiIoOaA]", "");
    }
}
