package codewars;

public class Scuaresum {

    public int  sum (int[] number){
        int pow=1;
        int sum=0;

        for (int index=0 ; index<number.length; index++) {

            pow = number[index] * number[index];
              sum=sum+pow;

        }
        return sum;
    }
}