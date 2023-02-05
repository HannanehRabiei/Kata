package kata;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConditionTest {

    private Condition condition;

    @BeforeEach
    void setUp() {
        condition=new Condition();

    }
    @Test
    void should_find_max_number() {

        int max = condition.findMax(4, 7, 1);
        Assertions.assertThat(max).isEqualTo(7);

        int max1 = condition.findMax(6, 3, 8);
        Assertions.assertThat(max1).isEqualTo(8);

    }
}