//package codewars;
//
//public class ReduceButGrow {
//    public  int dontGiveMeFive(int start, int end) {
//        int count = 0;
//        for (int index = start; index <= end; index++) {
//            if (!hasFive(index))
//                count++;
//
//        }
//        return count;
//
//    }
//
//    private boolean hasFive(int number) {
//        number = Math.abs(number);
//        System.out.println();
//        while (number > 0) {
//            if (number % 10 == 5)
//                return true;
//
//            number = number / 10;
//        }
//        return false;
//    }
//}
