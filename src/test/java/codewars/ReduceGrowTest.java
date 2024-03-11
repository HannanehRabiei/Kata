package codewars;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReduceGrowTest {
    @Test
    void should_give_two_digit_numbers_of_index_array_and_multiple_this_numbers() {
        ReduceGrow reduceGrow = new ReduceGrow();
        int[] ints = {20, 10, 10};
        int grow1 = reduceGrow.grow(ints);
        assertEquals(2000, grow1);
    }

    @Test
    void should_give_number_of_index_array_and_multiple_this_numbers() {

        ReduceGrow reduceGrow = new ReduceGrow();
        int[] ints = {1, 2, 3};
        int grow = reduceGrow.grow(ints);
        assertEquals(6, grow);

    }
}