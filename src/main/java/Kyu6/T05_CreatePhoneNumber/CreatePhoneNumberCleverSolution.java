package Kyu6.T05_CreatePhoneNumber;

public class CreatePhoneNumberCleverSolution {
    public static String createPhoneNumber(int[] numbers) {
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d", java.util.stream.IntStream.of(numbers).boxed().toArray());
    }
}
