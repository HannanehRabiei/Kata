package codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SidTest {

    private Sid sid;

    @BeforeEach
    void setUp() {

        sid = new Sid();
    }

    @Test
    void name() {

        String howMuchILoveYou = sid.howMuchILoveYou(1);
        Assertions.assertThat(howMuchILoveYou).isEqualTo("i love you");

        String howMuchILoveYou1 = sid.howMuchILoveYou(2);
        Assertions.assertThat(howMuchILoveYou1).isEqualTo("a little");

        String howMuchILoveYou2 = sid.howMuchILoveYou(3);
        Assertions.assertThat(howMuchILoveYou2).isEqualTo("a lot");

        String howMuchILoveYou3 = sid.howMuchILoveYou(4);
        Assertions.assertThat(howMuchILoveYou3).isEqualTo("passionately");

        String howMuchILoveYou4 = sid.howMuchILoveYou(5);
        Assertions.assertThat(howMuchILoveYou4).isEqualTo("madly");

        String howMuchILoveYou5 = sid.howMuchILoveYou(6);
        Assertions.assertThat(howMuchILoveYou5).isEqualTo("not at all");
    }
}