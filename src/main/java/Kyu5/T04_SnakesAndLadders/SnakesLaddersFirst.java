package Kyu5.T04_SnakesAndLadders;

public class SnakesLaddersFirst {

    private int playerOne = 0;
    private int playerTwo = 0;
    boolean isPlayerOne = true;

    public SnakesLaddersFirst() {
    }

    public String play(int die1, int die2) {
        if (playerOne == 100 || playerTwo == 100) {
            return "Game over!";
        }

        boolean additionalTurn = die1 == die2;
        int steps = die1 + die2;
        int destination;

        if (isPlayerOne) {
            isPlayerOne = false;
            int value = playerOne + steps;
            destination = extractPortalRightSquareValue(value);

            playerOne = setDestination(destination, value);

            if (isPlayerWin(playerOne)) {
                return "Player 1 Wins!";
            }

            if (isPlayerBehindTheBoard(playerOne)) {
                playerOne = setReturnToBoardDestination(playerOne);
            }

            if (additionalTurn) {
                isPlayerOne = true;
            }
        } else {
            isPlayerOne = true;
            int value = playerTwo + steps;
            destination = extractPortalRightSquareValue(value);

            playerTwo = setDestination(destination, value);

            if (isPlayerWin(playerTwo)) {
                return "Player 2 Wins!";
            }

            if (isPlayerBehindTheBoard(playerTwo)) {
                playerTwo = setReturnToBoardDestination(playerTwo);
            }

            if (additionalTurn) {
                isPlayerOne = false;
            }

            return "Player 2 is on square " + playerTwo;
        }

        return "Player 1 is on square " + playerOne;
    }

    private int setReturnToBoardDestination(int player) {
        int destination = 100 - (player - 100);
        if (isPortal(destination)) {
            return extractPortalRightSquareValue(destination);
        }
        return destination;
    }

    private boolean isPlayerBehindTheBoard(int player) {
        return player > 100.0;
    }

    private boolean isPlayerWin(int player) {
        return player == 100.0;
    }

    private int setDestination(int destination, int value) {
        return destination == 0 ? extractLeftSquareValue(value) : destination;
    }

    private int extractLeftSquareValue(int value) {
        return (int) Math.floor(board[value]);
    }

    private int extractPortalRightSquareValue(int value) {
        return (int) Math.round((board[value] % 1) * 100);
    }

    private boolean isPortal(int value) {
        return extractPortalRightSquareValue(value) > 0;
    }

    private static double[] board = {
        0.0, 1.0, 2.38, 3.0, 4.0, 5.0, 6.0, 7.14, 8.31, 9.0, 10.0,
        11.0, 12.0, 13.0, 14.0, 15.26, 16.06, 17.0, 18.0, 19.0, 20.0,
        21.42, 22.0, 23.0, 24.0, 25.0, 26.0, 27.0, 28.84, 29.0, 30.0,
        31.0, 32.0, 33.0, 34.0, 35.0, 36.44, 37.0, 38.0, 39.0, 40.0,
        41.0, 42.0, 43.0, 44.0, 45.0, 46.25, 47.0, 48.0, 49.11, 50.0,
        51.67, 52.0, 53.0, 54.0, 55.0, 56.0, 57.0, 58.0, 59.0, 60.0,
        61.0, 62.19, 63.0, 64.60, 65.0, 66.0, 67.0, 68.0, 69.0, 70.0,
        71.91, 72.0, 73.0, 74.53, 75.0, 76.0, 77.0, 78.98, 79.0, 80.0,
        81.0, 82.0, 83.0, 84.0, 85.0, 86.0, 87.94, 88.0, 89.68, 90.0,
        91.0, 92.88, 93.0, 94.0, 95.75, 96.0, 97.0, 98.0, 99.80, 100.0,
        101.0, 102.0, 103.0, 104.0, 105.0, 106.0, 107.0, 108.0, 109.0,
        110.0, 111.0
    };
}
