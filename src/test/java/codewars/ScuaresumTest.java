package codewars;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScuaresumTest {

    private Scuaresum scuaresum;

    @BeforeEach
    void setUp() {
        scuaresum = new Scuaresum();
    }

    @Test
    void should_give_1_when_() {

        int[] array = new int[1];
        array[0] = 1;
        int sum = scuaresum.sum(array);
        assertThat(sum).isEqualTo(1);

        array[0] = 5;
        int sum2 = scuaresum.sum(array);
        assertThat(sum2).isEqualTo(25);
    }

    @Test
    void should_given_number_of_array_and_pow_and_sum_numbers() {

        int[] array = new int[2];
        array[0] = 1;
        array[1] = 2;
        int sum = scuaresum.sum(array);
        assertThat(sum).isEqualTo(5);
    }
}