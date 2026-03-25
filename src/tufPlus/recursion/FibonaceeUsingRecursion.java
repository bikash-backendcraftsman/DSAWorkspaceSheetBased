package tufPlus.recursion;

public class FibonaceeUsingRecursion {
    public static void main(String[] args) {
        int ans = 4;

            ans = fibe(ans);
        System.out.println(ans);
    }

    private static int fibe(int n) {
        // base case to stop recursion
        if(n < 2){
            return n;
        }

        return fibe(n - 1) + fibe(n -  2);
    }
}
