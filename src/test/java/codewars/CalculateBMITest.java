package codewars;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class CalculateBMITest {
    private CalculateBMI calculateBMI;

    @BeforeEach
    void setUp() {
        calculateBMI = new CalculateBMI();
    }

    @Test
    void should_calculate_bmi_for_Underweight_when_bmi_less_than_18_5() {

       String bmi = calculateBMI.bmi(80,1.80);
        assertThat(bmi).isEqualTo("Normal");

    }
}