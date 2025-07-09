package Kyu5.T01_SimplePigLatin;

public class NewPigLatin {

    public static String pigIt(String str) {
        String[] split = str.split("(?<=\\s)|(?=\\s+)");
        for (int i = 0; i < split.length; i++) {
            if (split[i].matches("\\w+")) {
                split[i] = new StringBuilder(split[i])
                    .insert(split[i].length(), split[i].charAt(0))
                    .substring(1, split[i].length() + 1) + "ay";
            }
        }

        return String.join("", split);
    }
}
