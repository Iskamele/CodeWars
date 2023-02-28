package Kyu6.T02_FindTheOddInt;

public class FindOdd {
    public static int findIt(int[] a) {
        int[] unique = new int[a.length];
        int[] counts = new int[a.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            int element = a[i];

            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                int number = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (element == a[j]) {
                        number++;
                    }
                }
                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }

        int result = 0;
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] % 2 != 0) {
                result = unique[i];
            }
        }
        return result;
    }
}
