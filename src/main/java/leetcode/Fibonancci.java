package leetcode;

    public class Fibonancci {

        static int fib(int n) {

            if (n == 0 || n == 1) {
                return n;
            }
            int fn1 = fib(n - 1);
            int fn2 = fib(n - 2);
            return fn1 + fn2;
        }
    }
