package T11_CreatePhoneNumber;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder builder = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            switch (i) {
                case 3 -> {
                    builder.append(") ");
                    builder.append(numbers[i]);
                }
                case 6 -> {
                    builder.append("-");
                    builder.append(numbers[i]);
                }
                default -> builder.append(numbers[i]);
            }
        }
        return builder.toString();
    }
}
