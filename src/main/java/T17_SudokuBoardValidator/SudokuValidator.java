package T17_SudokuBoardValidator;

import java.util.HashSet;

public class SudokuValidator {

    public static boolean validate(int[][] board) {
        final int BOARD_SIZE = board.length;
        final int BOX_SIZE = 3;

        HashSet<Integer>[] horizontalNumbers = new HashSet[BOARD_SIZE];
        HashSet<Integer>[] verticalNumbers = new HashSet[BOARD_SIZE];
        HashSet<Integer>[] boxes = new HashSet[BOARD_SIZE];

        for (int i = 0; i < BOARD_SIZE; i++) {
            horizontalNumbers[i] = new HashSet<>();
            verticalNumbers[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                int num = board[i][j];
                if (num == 0) {
                    return false;
                }
                int boxIndex = (i / BOX_SIZE) * BOX_SIZE + j / BOX_SIZE;
                if (horizontalNumbers[i].contains(num) || verticalNumbers[j].contains(num) || boxes[boxIndex].contains(num)) {
                    return false;
                }
                horizontalNumbers[i].add(num);
                verticalNumbers[j].add(num);
                boxes[boxIndex].add(num);
            }
        }
        return true;
    }
}