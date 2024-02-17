public class FindNum {
    public int[] getThreeMaxIntegers(int[] array) {

        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max3) {
                max1 = max2;
                max2 = max3;
                max3 = array[i];
            }
            else if (array[i] > max2)
            {
                max1 = max2;
                max2 = array[i];
            }
            else if (array[i] > max1)
                max1 = array[i];
        }
        return new int[]{max1, max2, max3};
    }
}
