public class FindNumber {
    public int find(int[] array) {

        int firstLargestIndex = 0;
        int secondLargestIndex = 0;

        int max = array[0];

        int[] treeLargerNumber = new int[3];

        for (int index = 1; index < array.length; index++) {
            if (max < array[index]) {
                max = array[index];
                firstLargestIndex = index;
                treeLargerNumber[0] = max;
            }
        }
        int max1 = array[0];
        for (int index = 1; index < array.length; index++) {
            if (max1 < array[index] && index != firstLargestIndex) {
                max1 = array[index];
                secondLargestIndex = index;
                treeLargerNumber[1] = max1;
            }
        }
        int max2 = array[0];
        for (int index = 1; index < array.length; index++) {
            if (max2 < array[index] && (index != firstLargestIndex && index != secondLargestIndex)) {
                max2 = array[index];
            }
            treeLargerNumber[2] = max2;
        }
        return treeLargerNumber[0];
    }
}
