package codewars;

public class RockPaperScissors {

    public  String rps(String player1, String player2) {


        if (player1.equals("scissors") && player2.equals("paper"))
            return "Player 1 won!";

        if (player1.equals("rock") && player2.equals("scissors"))
            return "Player 1 won!";

        if (player1.equals("paper") && player2.equals("rock"))
            return "Player 1 won!";

        if (player1.equals("scissors") && player2.equals("rock"))
            return "Player 2 won!";

        if (player1.equals("paper") && player2.equals("scissors"))
            return "Player 2 won!";

        if (player1.equals("rock") && player2.equals("paper"))
            return "Player 2 won!";

        if (player1.equals(player2))
            return "Draw!";

        else return "";
    }
}