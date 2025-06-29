package Kyu8.T05_InvertValues;


public class New2Kata {

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] - array[i] * 2;
        }
        return array;
    }
}
