package T06_DisemvowelTrolls;

public class Troll {
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
