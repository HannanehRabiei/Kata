package codewars;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RockPaperScissorsTest {

    private RockPaperScissors rockPaperScissors;

    @BeforeEach
    void setUp() {
        rockPaperScissors=new RockPaperScissors();
    }

    @Test
    void should_return_won_when_give_rock_paper_and_scissors_for_palyer_1() {

        extracted("rock", "scissors", "Player 1 won!", "scissors", "paper", "paper", "rock");
    }
    @Test
    void should_return_won_when_give_rock_paper_and_scissors_for_palyer_2() {

        extracted("scissors", "rock", "Player 2 won!", "paper", "scissors", "rock", "paper");
    }
    @Test
    void should_return_won_when_give_rock_paper_and_scissors() {

        extracted("paper", "paper", "Draw!", "rock", "rock", "scissors", "scissors");
    }

    private void extracted(String paper, String paper1, String expected, String rock, String rock1, String scissors, String scissors1) {
        String result = rockPaperScissors.rps(paper, paper1);
        Assertions.assertThat(result).isEqualTo(expected);

        String result1 = rockPaperScissors.rps(rock, rock1);
        Assertions.assertThat(result1).isEqualTo(expected);

        String result2 = rockPaperScissors.rps(scissors, scissors1);
        Assertions.assertThat(result2).isEqualTo(expected);
    }
}