import java.util.Arrays;

public class Array {

    public static void main(String[] args) {

       int[] array = {1 , 2 , 3};
       int elementTwo = array[0];
       array[0]= array[2];
       array[2]=elementTwo;
        System.out.println(Arrays.toString(array));
    }
}
 // https://www.codewars.com/kata/6344701cd748a12b99c0dbc4/train/java