package Kyu6.T01_TakeATenMinutesWalk;

public class TenMinWalkBest {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int x = 0, y = 0;
        for (char c : walk) {
            switch (c) {
                case 'n' -> y++;
                case 'e' -> x++;
                case 's' -> y--;
                case 'w' -> x--;
            }
        }
        return x == 0 && y == 0;
    }
}