package T08_FindTheOddInt;

public class FindOddWithXor {
    public static int findIt(int[] a) {
        int xor = 0;
        for (int j : a) {
            xor ^= j;
        }
        return xor;
    }
}
