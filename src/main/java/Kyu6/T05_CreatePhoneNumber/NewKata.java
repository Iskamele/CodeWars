package Kyu6.T05_CreatePhoneNumber;

import java.util.Arrays;

public class NewKata {

    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", Arrays.stream(numbers).boxed().toArray());
    }
}
