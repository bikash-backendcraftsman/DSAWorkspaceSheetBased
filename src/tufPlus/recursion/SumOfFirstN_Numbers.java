package tufPlus.recursion;

public class SumOfFirstN_Numbers {
    public static void main(String[] args) {
        int n = 4;
       int val =  sumUsingRecursion(n);
        System.out.println(val);
    }

    private static int sumUsingRecursion(int n) {
        if(n == 0){
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }
}
