package codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class QuarterOfYearTest {

    private QuarterOfYear quarterOfYear;

    @BeforeEach
    void setUp() {
        quarterOfYear=new QuarterOfYear();
    }

    @Test
    void should_give_number_of_month_and_return_quarter_of_year() {
        quarterOfYear=new QuarterOfYear();
        int month = 1;

       int partOfYear= quarterOfYear.quarterOf(month);

        Assertions.assertThat(partOfYear).isEqualTo(1);
    }
}