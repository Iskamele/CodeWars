package Kyu7.T08_VowelCount;

public class NewVowels {

    public static int getCount(String str) {
        return str.toLowerCase().replaceAll("[^euioa]", "").length();
    }
}
