package codewars;

public class Dinglemouse7 {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {

        if (catYears < 15 && dogYears < 15)
            return new int[]{0, 0};

        int humanAgeOfCat = calculateAgeOfHumanBasedAgeCat(catYears);

        int humanAgeOfDog = calculateAgeOfHumanBasedAgeDog(dogYears);

        return new int[]{humanAgeOfCat, humanAgeOfDog};
    }

    private static int calculateAgeOfHumanBasedAgeDog(int dogAge) {

        if (dogAge < 15)
            return 0;
        if (dogAge < 24)
            return 1;
        int age = 1;
        for (int index = 24; index <= dogAge; index += 5) {
            age++;
        }
        return age;

    }

    private static int calculateAgeOfHumanBasedAgeCat(int catAge) {

        if (catAge < 15)
            return 0;
        if (catAge < 24)
            return 1;
        int age = 1;
        for (int index = 24; index <= catAge; index += 4) {
            age++;
        }
        return age;

    }
}


//        int humanOfCat = calculateAgeOfHumanBasedAgeCat(catYears);
//        int humanOfDog = calculateAgeOfHumanBasedAgeDog(dogYears);
//
//        return new int[]{humanOfCat,humanOfDog};
//
//    }
//
//    private  int calculateAgeOfHumanBasedAgeCat(int catAge)
//    {
//
//                if (catAge<15)
//                    return 0;
//
//                if (catAge<24)
//                    return 1;
//
//                if (catAge<28)
//                    return 2;
//
//                if (catAge<32)
//                    return 3;
//
//                if (catAge<36)
//                    return 4;
//
//                if (catAge<40)
//                  return 5;
//
//                return 0;
//    }
//    private  int calculateAgeOfHumanBasedAgeDog(int dogAge) {
//
//        if (dogAge<15)
//            return 0;
//
//        if (dogAge<24)
//            return 1;
//
//        if (dogAge<29)
//            return 2;
//
//        if (dogAge<34)
//            return 3;
//
//        if (dogAge<39)
//            return 4;
//
//        if (dogAge<44)
//            return 5;
//
//        return 0;

