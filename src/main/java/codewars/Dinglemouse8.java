package codewars;

public class Dinglemouse8 {

    private static final int HUMAN_ONE_YEAR = 1;
    private static final int DOG_AND_CAT_ONE = 15;
    private static final int HUMAN_TOW = 2;
    public static final int DOG_AND_CAT_TWO = 24;
    public static final int right=0;


    public  int[] humanYearsCatYearsDogYears( final int humanYears) {

        if (humanYears == HUMAN_ONE_YEAR)
            return new int[]{HUMAN_ONE_YEAR, DOG_AND_CAT_TWO, DOG_AND_CAT_TWO};

        if (humanYears == HUMAN_TOW)
            return new int[]{HUMAN_TOW, DOG_AND_CAT_TWO, DOG_AND_CAT_TWO};


        int ageOfCat = 0;
        int ageOfDog;
        if (humanYears > 2)
            ageOfCat = DOG_AND_CAT_TWO;
            ageOfDog = DOG_AND_CAT_TWO;
        for (int index = 3; index <= humanYears; index++) {
            ageOfCat += 4;
            ageOfDog += 5;
        }
        return new int[]{humanYears, ageOfCat, ageOfDog};

    }


//        if (humanYears==3)
//            return new int[]{3,28,29};
//
//        if (humanYears==4)
//            return new int[]{4,32,34};
//
//        if (humanYears==5)
//            return new int[]{5,36,39};


    }