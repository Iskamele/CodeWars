package T06_DisemvowelTrolls;

public class TrollSwitchCase {
    public static String disemvowel(String str) {
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i <= builder.length() - 1; i++) {
            switch (builder.charAt(i)) {
                case 'i', 'I', 'a', 'A', 'u', 'U', 'o', 'O', 'e', 'E' -> {
                    builder.deleteCharAt(i);
                    i--;
                }
            }
        }
        return builder.toString();
    }
}
