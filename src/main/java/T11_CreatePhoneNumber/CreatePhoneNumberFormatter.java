package T11_CreatePhoneNumber;

public class CreatePhoneNumberFormatter {
    public static String createPhoneNumber(int[] numbers) {
        String phoneNumber = new String("(xxx) xxx-xxxx");
        for (int i : numbers) {
            phoneNumber = phoneNumber.replaceFirst("x", Integer.toString(i));
        }
        return phoneNumber;
    }
}
