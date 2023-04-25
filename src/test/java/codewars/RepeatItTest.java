package codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class RepeatItTest {

    private RepeatIt repeatIt;

    @BeforeEach
    void setUp() {
        repeatIt=new RepeatIt();
    }

    @Test
    void should_Give_Message_When_To_Repeat_Is_Not_String() {


        RepeatIt repeat = new RepeatIt();

        String message = repeat.repeatString("hi", 2);

        Assertions.assertThat(message).isEqualTo("hihi");

        String text = repeat.repeatString("*", 3);

        Assertions.assertThat(text).isEqualTo("***");

        String test = repeat.repeatString("Hi", 0);

        Assertions.assertThat(test).isEmpty();
    }
}
