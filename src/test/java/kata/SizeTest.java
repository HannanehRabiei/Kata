package kata;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SizeTest {
    private Size size;

    @BeforeEach
    void setUp() {
        size=new Size();
    }

    @Test
    void name() {
        int text = size.getSize("hana");
        Assertions.assertThat(text).isEqualTo(4);

    }
}