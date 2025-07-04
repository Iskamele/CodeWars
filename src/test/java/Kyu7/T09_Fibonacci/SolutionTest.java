package Kyu7.T09_Fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void sampleTests() {
        assertEquals(1, Fibonacci.fib(1), "fib(1)");
        assertEquals(1, Fibonacci.fib(2), "fib(2)");
        assertEquals(2, Fibonacci.fib(3), "fib(3)");
        assertEquals(3, Fibonacci.fib(4), "fib(4)");
        assertEquals(5, Fibonacci.fib(5), "fib(5)");
    }

    @Test
    void sampleTests2() {
        assertEquals(1, NewFibonacci.fib(1), "fib(1)");
        assertEquals(1, NewFibonacci.fib(2), "fib(2)");
        assertEquals(2, NewFibonacci.fib(3), "fib(3)");
        assertEquals(3, NewFibonacci.fib(4), "fib(4)");
        assertEquals(5, NewFibonacci.fib(5), "fib(5)");
    }

    @Test
    void sampleTests3() {
        assertEquals(1, New2Fibonacci.fib(1), "fib(1)");
        assertEquals(1, New2Fibonacci.fib(2), "fib(2)");
        assertEquals(2, New2Fibonacci.fib(3), "fib(3)");
        assertEquals(3, New2Fibonacci.fib(4), "fib(4)");
        assertEquals(5, New2Fibonacci.fib(5), "fib(5)");
    }
}
