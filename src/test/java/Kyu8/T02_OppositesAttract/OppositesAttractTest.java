package Kyu8.T02_OppositesAttract;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class OppositesAttractTest {

    @Test
    public void testOddAndEven() {
//        assertEquals(true, OppositesAttract.isLove(1, 4));
//        assertEquals(true, OppositesAttractCleverSolution.isLove(1, 4));
        assertEquals(true, NewOppositesAttract.isLove(1, 4));
    }

    @Test
    public void testEvenAndEven() {
//        assertEquals(false, OppositesAttract.isLove(2, 2));
//        assertEquals(false, OppositesAttractCleverSolution.isLove(2, 2));
        assertEquals(false, NewOppositesAttract.isLove(2, 2));
    }

    @Test
    public void testOddAndOdd() {
//        assertEquals(false, OppositesAttract.isLove(1, 1));
//        assertEquals(false, OppositesAttractCleverSolution.isLove(1, 1));
        assertEquals(false, NewOppositesAttract.isLove(1, 1));
    }

    @Test
    public void testEvenAndOdd() {
//        assertEquals(true, OppositesAttract.isLove(0, 1));
//        assertEquals(true, OppositesAttractCleverSolution.isLove(0, 1));
        assertEquals(true, NewOppositesAttract.isLove(0, 1));
    }

}