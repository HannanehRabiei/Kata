package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeekDaysTest {

    private WeekDays weekDays;

    @BeforeEach
    void setUp() {
        weekDays = new WeekDays();
    }

        @Test
        void name() {
            int days = weekDays.days(0 , 1 , 2 , 3 , 4 , 5 , 6 );
            Assertions.assertThat(days).isEqualTo(4);
        }
    }