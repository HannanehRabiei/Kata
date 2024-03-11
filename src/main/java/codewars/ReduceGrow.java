package codewars;

public class ReduceGrow {
    public int grow(int[] array) {

        int result = 1;

        for (int index = 0; index < array.length; index++) {
            result *= array[index];
        }
        return result;

    }
}
