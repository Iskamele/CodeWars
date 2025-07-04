package Kyu6.T01_TakeATenMinutesWalk;

public class NewTenMinWalk {

    public static boolean isValid(char[] walk) {
        int capacity = 10;
        if (walk.length < capacity || walk.length > capacity) {
            return false;
        }
        int x = 0; // west-east
        int y = 0; // north-south
        for (char direction : walk) {
            switch (direction) {
                case 'n' -> y--;
                case 's' -> y++;
                case 'w' -> x--;
                case 'e' -> x++;
            }
        }
        return x == 0 && y == 0;
    }
}
