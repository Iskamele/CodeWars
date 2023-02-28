package Kyu6.T08_SudokuBoardValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import org.junit.jupiter.api.Test;

public class SudokuValidatorSampleTest2 {

    private final int[][] firstBoard = { // false
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {5, 5, 5, 5, 5, 5, 5, 5, 5}}; // A board full of fives

    private final int[][] secondBoard = { // false
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9}}; // All rows are 1..9

    private final int[][] thirdBoard = { // true
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}};

    private final int[][] fourthBoard = { // true
            {1, 3, 2, 5, 7, 9, 4, 6, 8},
            {4, 9, 8, 2, 6, 1, 3, 7, 5},
            {7, 5, 6, 3, 8, 4, 2, 1, 9},
            {6, 4, 3, 1, 5, 8, 7, 9, 2},
            {5, 2, 1, 7, 9, 3, 8, 4, 6},
            {9, 8, 7, 4, 2, 6, 5, 3, 1},
            {2, 1, 4, 9, 3, 5, 6, 8, 7},
            {3, 6, 5, 8, 1, 7, 9, 2, 4},
            {8, 7, 9, 6, 4, 2, 1, 5, 3}};

    private final int[][] fifthBoard = { // true
            {7, 8, 4, 1, 5, 9, 3, 2, 6},
            {5, 3, 9, 6, 7, 2, 8, 4, 1},
            {6, 1, 2, 4, 3, 8, 7, 5, 9},
            {9, 2, 8, 7, 1, 5, 4, 6, 3},
            {3, 5, 7, 8, 4, 6, 1, 9, 2},
            {4, 6, 1, 9, 2, 3, 5, 8, 7},
            {8, 7, 6, 3, 9, 4, 2, 1, 5},
            {2, 4, 3, 5, 6, 1, 9, 7, 8},
            {1, 9, 5, 2, 8, 7, 6, 3, 4}};

    private final int[][] sixthBoard = { // true
            {9, 2, 6, 5, 8, 3, 4, 7, 1},
            {7, 1, 3, 4, 2, 6, 9, 8, 5},
            {8, 4, 5, 9, 7, 1, 3, 6, 2},
            {3, 6, 2, 8, 5, 7, 1, 4, 9},
            {4, 7, 1, 2, 6, 9, 5, 3, 8},
            {5, 9, 8, 3, 1, 4, 7, 2, 6},
            {6, 5, 7, 1, 3, 8, 2, 9, 4},
            {2, 8, 4, 7, 9, 5, 6, 1, 3},
            {1, 3, 9, 6, 4, 2, 8, 5, 7}};

    private final int[][] seventhBoard = { // true
            {7, 1, 5, 6, 2, 3, 8, 4, 9},
            {6, 2, 4, 8, 1, 9, 3, 7, 5},
            {3, 9, 8, 7, 4, 5, 6, 2, 1},
            {5, 3, 9, 2, 7, 6, 4, 1, 8},
            {4, 6, 2, 1, 9, 8, 5, 3, 7},
            {8, 7, 1, 5, 3, 4, 9, 6, 2},
            {2, 5, 3, 9, 6, 7, 1, 8, 4},
            {1, 8, 6, 4, 5, 2, 7, 9, 3},
            {9, 4, 7, 3, 8, 1, 2, 5, 6}};

    private final int[][] eightBoard = { // true
            {7, 8, 3, 4, 5, 6, 1, 2, 9},
            {6, 9, 2, 1, 8, 7, 3, 4, 5},
            {1, 4, 5, 2, 3, 9, 6, 7, 8},
            {8, 1, 7, 3, 6, 2, 9, 5, 4},
            {5, 6, 4, 7, 9, 8, 2, 1, 3},
            {3, 2, 9, 5, 4, 1, 8, 6, 7},
            {4, 7, 6, 8, 2, 3, 5, 9, 1},
            {9, 3, 1, 6, 7, 5, 4, 8, 2},
            {2, 5, 8, 9, 1, 4, 7, 3, 6}};

    private final int[][] ninthBoard = { // true
            {1, 7, 3, 2, 6, 8, 9, 5, 4},
            {4, 2, 5, 1, 9, 3, 7, 6, 8},
            {8, 6, 9, 7, 4, 5, 1, 2, 3},
            {6, 1, 2, 8, 3, 7, 4, 9, 5},
            {3, 9, 8, 4, 5, 6, 2, 1, 7},
            {5, 4, 7, 9, 1, 2, 3, 8, 6},
            {9, 5, 4, 3, 8, 1, 6, 7, 2},
            {2, 3, 6, 5, 7, 9, 8, 4, 1},
            {7, 8, 1, 6, 2, 4, 5, 3, 9}};

    private final int[][] tenthBoard = { // true
            {8, 4, 7, 2, 6, 5, 1, 9, 3},
            {1, 3, 6, 7, 9, 8, 2, 4, 5},
            {9, 5, 2, 1, 4, 3, 8, 6, 7},
            {4, 2, 9, 6, 7, 1, 5, 3, 8},
            {6, 7, 8, 5, 3, 2, 9, 1, 4},
            {3, 1, 5, 4, 8, 9, 7, 2, 6},
            {5, 6, 4, 9, 1, 7, 3, 8, 2},
            {7, 8, 1, 3, 2, 4, 6, 5, 9},
            {2, 9, 3, 8, 5, 6, 4, 7, 1}};

    private final int[][] eleventhBoard = { // false
            {8, 4, 7, 2, 6, 5, 1, 0, 3},
            {1, 3, 6, 7, 0, 8, 2, 4, 5},
            {0, 5, 2, 1, 4, 3, 8, 6, 7},
            {4, 2, 0, 6, 7, 1, 5, 3, 8},
            {6, 7, 8, 5, 3, 2, 0, 1, 4},
            {3, 1, 5, 4, 8, 0, 7, 2, 6},
            {5, 6, 4, 0, 1, 7, 3, 8, 2},
            {7, 8, 1, 3, 2, 4, 6, 5, 0},
            {2, 0, 3, 8, 5, 6, 4, 7, 1}}; // a valid board, but with 0 instead of 9    };

    private final int[][] twelfthBoard = { // false
            {1, 3, 2, 5, 7, 9, 4, 6, 8},
            {4, 9, 8, 2, 6, 1, 3, 7, 5},
            {7, 5, 6, 3, 8, 4, 2, 1, 9},
            {6, 4, 3, 1, 5, 8, 7, 9, 2},
            {5, 2, 1, 7, 9, 3, 8, 4, 6},
            {9, 8, 7, 4, 2, 6, 5, 3, 1},
            {2, 1, 4, 9, 3, 5, 6, 8, 7},
            {3, 6, 5, 8, 1, 7, 9, 2, 4},
            {8, 7, 9, 6, 4, 2, 1, 3, 5}}; // duplicated '3' in eighth column

    private final int[][] thirteenthBoard = { // false
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {2, 3, 4, 5, 6, 7, 8, 9, 1},
            {3, 4, 5, 6, 7, 8, 9, 1, 2},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {5, 6, 7, 8, 9, 1, 2, 3, 4},
            {6, 7, 8, 9, 1, 2, 3, 4, 5},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {8, 9, 1, 2, 3, 4, 5, 6, 7},
            {9, 1, 2, 3, 4, 5, 6, 7, 8}}; // valid rows and cols, but invalid boxes

    private final int[][] fourteenthBoard = { // false
            {0, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}};

    private final int[][] fifteenthBoard = {  // false
            {1, 2, 3, 4, 5, 6, 6, 9, 9},
            {4, 5, 6, 6, 9, 9, 1, 2, 3},
            {6, 9, 9, 1, 2, 3, 4, 5, 6},
            {2, 3, 4, 5, 6, 6, 9, 9, 1},
            {5, 6, 6, 9, 9, 1, 2, 3, 4},
            {9, 9, 1, 2, 3, 4, 5, 6, 6},
            {3, 4, 5, 6, 6, 9, 9, 1, 2},
            {6, 6, 9, 9, 1, 2, 3, 4, 5},
            {9, 1, 2, 3, 4, 5, 6, 6, 9}};

    private final int[][] sixteenthBoard = { // false
            {1, 2, 3, 1, 2, 3, 1, 2, 3},
            {4, 5, 6, 4, 5, 6, 4, 5, 6},
            {7, 8, 9, 7, 8, 9, 7, 8, 9},
            {2, 3, 1, 2, 3, 1, 2, 3, 1},
            {5, 6, 4, 5, 6, 4, 5, 6, 4},
            {8, 9, 7, 8, 9, 7, 8, 9, 7},
            {3, 1, 2, 3, 1, 2, 3, 1, 2},
            {6, 4, 5, 6, 4, 5, 6, 4, 5},
            {9, 7, 8, 9, 7, 8, 9, 7, 8}};

    private final int[][] seventeenthBoard = { // false
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {4, 5, 6, 7, 8, 9, 1, 2, 3},
            {7, 8, 9, 1, 2, 3, 4, 5, 6}}; // valid boxes and rows, repeats in cols

    private int[][] clone(int[][] board) {
        return Arrays.stream(board).map(row -> Arrays.copyOf(row, row.length)).toArray(int[][]::new);
    }

    private String stringify(int[][] board) {
        Function<int[], String> stringifyRow = row ->
                String.format("%d%d%d|%d%d%d|%d%d%d",
                        row[0], row[1], row[2],
                        row[3], row[4], row[5],
                        row[6], row[7], row[8]);
        List<String> rows = Arrays.stream(board).map(stringifyRow).toList();
        return String.join("\n", rows.subList(0, 3)) +
                "\n---+---+---\n" +
                String.join("\n", rows.subList(3, 6)) +
                "\n---+---+---\n" +
                String.join("\n", rows.subList(6, 9));
    }

    @Test
    void firstBoard_false() {
        int[][] input = firstBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void secondBoard_false() {
        int[][] input = secondBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void thirdBoard_true() {
        int[][] input = thirdBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void fourthBoard_true() {
        int[][] input = fourthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void fifthBoard_true() {
        int[][] input = fifthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void sixthBoard_true() {
        int[][] input = sixthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void seventhBoard_true() {
        int[][] input = seventhBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void eightBoard_true() {
        int[][] input = eightBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void ninthBoard_true() {
        int[][] input = ninthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void tenthBoard_true() {
        int[][] input = tenthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertTrue(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void eleventhBoard_false() {
        int[][] input = eleventhBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void twelfthBoard_false() {
        int[][] input = twelfthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void thirteenthBoard_false() {
        int[][] input = thirteenthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void fourteenthBoard_false() {
        int[][] input = fourteenthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void fifteenthBoard_false() {
        int[][] input = fifteenthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void sixteenthBoard_false() {
        int[][] input = sixteenthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }

    @Test
    void seventeenthBoard_false() {
        int[][] input = seventeenthBoard.clone();
        boolean actual = SudokuValidator.validate(input);
        assertFalse(actual, String.format("Incorrect answer for board:\n\n%s\n", stringify(input)));
    }
}