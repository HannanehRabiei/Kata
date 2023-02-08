package leetcode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_fizz_given_3 () {
        String divisible = fizzBuzz.divisible(3);
        assertThat(divisible).isEqualTo("Fizz");
    }

    @Test
    void should_return_fizz_given_6() {
        String divisible = fizzBuzz.divisible(6);
        assertThat(divisible).isEqualTo("Fizz");
    }

    @Test
    void should_return_fizz_given_9() {
        String divisible = fizzBuzz.divisible(9);
        assertThat(divisible).isEqualTo("Fizz");
    }

    @Test
    void should_return_buzz_given_5() {
        String divisible = fizzBuzz.divisible(5);
        assertThat(divisible).isEqualTo("Buzz");

    }

    @Test
    void should_return_buzz_given_10() {
        String divisible = fizzBuzz.divisible(10);
        assertThat(divisible).isEqualTo("Buzz");

    }

    @Test
    void should_return_buzz_given_25() {
        String divisible = fizzBuzz.divisible(25);
        assertThat(divisible).isEqualTo("Buzz");

    }

    @Test
    void should_return_fizzbuzz_given_15() {
        String divisible = fizzBuzz.divisible(15);
        assertThat(divisible).isEqualTo("FizzBuzz");
    }

    @Test
    void should_return_fizzbuzz_given_30() {
        String divisible = fizzBuzz.divisible(30);
        assertThat(divisible).isEqualTo("FizzBuzz");
    }
}