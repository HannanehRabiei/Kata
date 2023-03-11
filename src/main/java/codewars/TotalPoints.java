package codewars;

public class TotalPoints {

    public int points(String[] games) {
        int result = 0;

        for (int index = 0; index < games.length; index++) {

            String game = games[index];

            char ourTeam = game.charAt(0);
            char themTeam = game.charAt(2);

            if (ourTeam > themTeam)
                result = result + 3;

            if (ourTeam == themTeam)
                result = result + 1;
        }
        return result;
    }
}