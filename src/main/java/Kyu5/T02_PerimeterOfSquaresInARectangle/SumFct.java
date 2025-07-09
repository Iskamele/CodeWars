package Kyu5.T02_PerimeterOfSquaresInARectangle;

import java.math.BigInteger;

public class SumFct {

    public static BigInteger perimeter(BigInteger n) {
        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ZERO; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            sum = sum.add(current);
            BigInteger next = previous.add(current);
            previous = current;
            current = next;
        }

        return sum.multiply(BigInteger.valueOf(4));
    }
}
