package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonancciTest {

    @Test
    public void negativeInput(){

        assertEquals(1, Fibonancci.fib(1));
        assertEquals(1, Fibonancci.fib(2));
        assertEquals(2, Fibonancci.fib(3));
    }
}