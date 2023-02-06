package leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void name() {
        String divisible = fizzBuzz.divisible(3);
        Assertions.assertThat(divisible).isEqualTo("Fizz");
    }

    @Test
    void name1() {
        String divisible1 = fizzBuzz.divisible(5);
        Assertions.assertThat(divisible1).isEqualTo("Buzz");

    }

    @Test
    void name2() {
        String divisible1 = fizzBuzz.divisible(15);
        Assertions.assertThat(divisible1).isEqualTo("FizzBuzz");
    }
}