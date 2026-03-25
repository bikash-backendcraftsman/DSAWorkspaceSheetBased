package tufPlus.recursion;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        int n = 3;
       long val  = findFactorial(n);
        System.out.println(val);
    }

    private static long findFactorial(int n) {

        //base case
        if(n == 0 || n == 1){
            return 1;
        }

        return (long) n * findFactorial(n - 1);
    }
}
