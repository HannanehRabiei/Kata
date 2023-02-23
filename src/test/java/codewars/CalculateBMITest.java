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
    void bayad_ghad_va_vazn_ro_begire_va_mizan_tanasob_ro_benvise() {

       String bmi = calculateBMI.bmi(80,1.80);
        assertThat(bmi).isEqualTo("Normal");

    }
}