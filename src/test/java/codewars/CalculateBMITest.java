package codewars;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


class CalculateBMITest {



    @Test
    void bayad_ghad_va_vazn_ro_begire_va_mizan_tanasob_ro_benvise() {

        CalculateBMI calculateBMI = new CalculateBMI();
       String bmi = calculateBMI.bmi(80,1.80);
        assertThat(bmi).isEqualTo("Normal");

    }
}