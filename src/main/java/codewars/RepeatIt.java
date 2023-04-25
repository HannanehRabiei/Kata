package codewars;

public class RepeatIt {

    public String repeatString(final Object toRepeat, final int number) {

        if (!(toRepeat instanceof String))
            return "Not a string";
        if (number == 0)
            return "";
        String concat = (String) toRepeat;
        for (int index = 1; index < number; index++) {
            concat = ((String) toRepeat).concat(concat);
        }
        return concat;


    }
}
