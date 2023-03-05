package Kyu8.T08_ConvertAStringToANumber;

public class StringToNumber {
    public static int stringToNumber(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException NFE) {
            throw NFE;
        }
    }
}