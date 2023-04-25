package codewars;

public class Sid {

    public String howMuchILoveYou(int nb_petals) {


        if (nb_petals == 1)
            return "i love you";
        if (nb_petals == 2)
            return "a little";
        if (nb_petals == 3)
            return "a lot";
        if (nb_petals == 4)
            return "passionately";
        if (nb_petals == 5)
            return "madly";
        if (nb_petals == 6)
            return "not at all";
        return "";
    }
}