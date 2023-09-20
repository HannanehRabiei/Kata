package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void dont_give_me_five() {
        Kata kata = new Kata();

        assertEquals(8, kata.dontGiveMeFive(1,9));
        assertEquals(12, kata.dontGiveMeFive(4,17));
    }
}