package Kyu6.T08_SudokuBoardValidator;

import java.util.HashSet;
import java.util.Set;

public class NewSudokuValidator {

    public static boolean validate(int[][] board) {
        Set<Integer> column = new HashSet<>();
        Set<Integer> row = new HashSet<>();
        Set<Integer> box = new HashSet<>();

        if (!validateColumnsAndRows(board, column, row)) {
            return false;
        }
        if (!validateBoxes(board, box)) {
            return false;
        }
        return true;
    }

    private static boolean validateBoxes(int[][] board, Set<Integer> box) {
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        box.add(board[i + k][j + l]);
                    }
                }
                if (!validateAndClearSet(box)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean validateColumnsAndRows(int[][] board, Set<Integer> column,
        Set<Integer> row) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                column.add(board[j][i]);
                row.add(board[i][j]);
            }
            if (!validateAndClearSet(column) || !validateAndClearSet(row)) {
                return false;
            }
        }
        return true;
    }

    private static boolean validateAndClearSet(Set<Integer> set) {
        set.remove(0);
        if (set.size() != 9) {
            return false;
        }
        set.clear();
        return true;
    }
}
