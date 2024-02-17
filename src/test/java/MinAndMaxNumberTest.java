import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinAndMaxNumberTest {
    @Test
    void should_find_max_number_in_array() {

        MinAndMaxNumber MaxNumber = new MinAndMaxNumber();
        int[] arrayNumbers = {1, 2, 3, 4};
        int max = MaxNumber.max(arrayNumbers);
        Assertions.assertEquals(4, max);
    }
        @Test
        void should_find_min_number_in_array(){
            MinAndMaxNumber minNumber = new MinAndMaxNumber();
            int[] arrayNumbers = {1, 2, 3, 4};
            int min = minNumber.min(arrayNumbers);
            Assertions.assertEquals(1, min);
        }
    }
