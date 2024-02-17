public class MinAndMaxNumber {

    public int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;

    }

    public int max(int[] array) {

        int max1 = array[0];
        int max2 = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max1) {
                max1 = array[i];
            }
            if (array[i] < max2) {
                max2 = array[i];
            }
        }
        return max1 + max2;
    }
}
