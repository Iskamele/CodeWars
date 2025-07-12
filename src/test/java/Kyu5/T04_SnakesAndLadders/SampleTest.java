package Kyu5.T04_SnakesAndLadders;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import org.junit.Test;

public class SampleTest {

    @Test
    public void exampleTests() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 38", game.play(1, 1));
        assertEquals("Player 1 is on square 44", game.play(1, 5));
        assertEquals("Player 2 is on square 31", game.play(6, 2));
        assertEquals("Player 1 is on square 25", game.play(1, 1));
    }

    @Test
    public void exampleTests2() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 6", game.play(2, 4));
        assertEquals("Player 2 is on square 6", game.play(3, 3));
    }

    @Test
    public void exampleTests3() {
        SnakesLadders game = new SnakesLadders();
        assertEquals("Player 1 is on square 12", game.play(6, 6));
        assertEquals("Player 1 is on square 42", game.play(6, 3));
        assertEquals("Player 2 is on square 31", game.play(5, 3));
        assertEquals("Player 1 is on square 11", game.play(2, 5));
        assertEquals("Player 2 is on square 35", game.play(2, 2));
        assertEquals("Player 2 is on square 44", game.play(5, 4));
        assertEquals("Player 1 is on square 42", game.play(5, 5));
        assertEquals("Player 1 is on square 52", game.play(5, 5));
        assertEquals("Player 1 is on square 55", game.play(2, 1));
        assertEquals("Player 2 is on square 54", game.play(4, 6));
        assertEquals("Player 1 is on square 61", game.play(2, 4));
        assertEquals("Player 2 is on square 61", game.play(3, 4));
        assertEquals("Player 1 is on square 91", game.play(6, 4));
        assertEquals("Player 2 is on square 66", game.play(3, 2));
        assertEquals("Player 1 is on square 80", game.play(6, 2));
        assertEquals("Player 2 is on square 70", game.play(2, 2));
    }
}
