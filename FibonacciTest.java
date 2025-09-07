import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void testFibOne() {
        assertEquals(0, Fibonacci.fib(1));
    }
    @Test
    void testFibTwo() {
        assertEquals(1, Fibonacci.fib(2));
    }
    @Test
    void testFibTen() {
        assertEquals(34, Fibonacci.fib(10));
    }
    @Test
    void testInvalidInput() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fib(0));
    }
}