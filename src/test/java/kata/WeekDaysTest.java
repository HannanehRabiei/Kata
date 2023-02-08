package kata;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WeekDaysTest {

    private WeekDays weekDays;

    @BeforeEach
    void setUp() {
        weekDays = new WeekDays();
    }

    @Test
    void should_show_saturday() {
        weekDays.days(0);
        //        Assertions.assertThat(days).isEqualTo(4);
    }

    @Test
    void should_show_sunday() {
        weekDays.days(1);
    }

    @Test
    void should_show_monday() {
        weekDays.days(2);
    }

    @Test
    void should_show_tuesday() {
        weekDays.days(3);
    }

    @Test
    void should_show_wednesday() {
        weekDays.days(4);
    }

    @Test
    void should_show_thursday() {
        weekDays.days(5);
    }

    @Test
    void should_show_friday() {
        weekDays.days(6);
    }
}