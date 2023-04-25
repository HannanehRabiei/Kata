package codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatePowOfArrayTest {

    @Test
    void should_give_number_of_index_array_and_calculate_pow_of_this_number() {

        CalculatePowOfArray calculate = new CalculatePowOfArray();
        int[] arrayNumbers = {1 , 2 , 3 , 4};
        int pow = calculate.calculate(arrayNumbers, 2);
        Assertions.assertThat(pow).isEqualTo(9);

    }
}