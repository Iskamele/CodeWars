package Kyu6.T12_FindTheParityOutlier;

public class FindOutlier {
    static int find(int[] integers) {
        int first = integers[0];
        int second = integers[1];
        int third = integers[2];
        int odd = integers[0];

        if (first % 2 == 0 && second % 2 == 0
                || first % 2 == 0 && third % 2 == 0
                || second % 2 == 0 && third % 2 == 0) {
            for (int integer : integers) {
                if (integer % 2 != 0) {
                    odd = integer;
                }
            }
        } else {
            for (int integer : integers) {
                if (integer % 2 == 0) {
                    odd = integer;
                }

            }
        }
        return odd;
    }
}