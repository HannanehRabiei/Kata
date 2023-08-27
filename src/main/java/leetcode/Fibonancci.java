package leetcode;

    public class Fibonancci {

        static int fib(int n) {

            if(n==0||n==1){
                return n;
            }
            int fn1=fib(n-1);
            int fn2=fib(n-2);
            return fn1+fn2;
        }

        public static void main(String[] args) {
            int N =10;
            for (int i = 0 ; i<N ; i++)
            System.out.println(fib(i) + "");
        }
    }
