package codewars;

import codewars.ReverseWord;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ReverseWordTest {

    private ReverseWord text ;

    @BeforeEach
    void setUp() {
        text = new ReverseWord();
    }

    @ParameterizedTest
    @ValueSource(strings = {"H" , "R"})

    void should_reverse_Text(String value) {

        String actual = text.reverseText(value);
        Assertions.assertThat(actual).isEqualTo(value);

        // class revereseText : return text;

    }

    @Test
    void should_reverse_word () {
        String actual = text.reverseText("RH");
        Assertions.assertThat(actual).isEqualTo("HR");
    }

    @Test
    void reverse_word (){

        String actual = text.reverseText("ABC");
        Assertions.assertThat(actual).isEqualTo("CBA");

    }
}