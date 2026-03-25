package tufPlus.recursion;

public class CountdownRecursion {
    public static void main(String[] args) {
        int n = 3;
        countDown(n);
    }

    private static void countDown(int n){
       /* if(n == 0){
            System.out.println("Done!");
            return;
        }*/
        System.out.println(n);
        System.out.println("Count Down value "+ n);
        System.out.println(" ");
        countDown(n - 1);
    }

    /*
     * =========================================================================
     * HOW RECURSION WORKS - THE CALL STACK
     * =========================================================================
     *
     * When a function calls itself:
     * 1. Each function call is added to the CALL STACK
     * 2. When a base case is reached, functions start returning
     * 3. The stack unwinds from top to bottom
     *
     * Example: countdown(3)
     *
     * Call Stack:
     * countdown(3) → prints 3 → calls countdown(2)
     *   countdown(2) → prints 2 → calls countdown(1)
     *     countdown(1) → prints 1 → calls countdown(0)
     *       countdown(0) → prints "Done!" → returns
     *     returns to countdown(1)
     *   returns to countdown(2)
     * returns to countdown(3)
     */

    /*
     * =========================================================================
     * BASE CASE AND RECURSIVE CASE
     * =========================================================================
     *
     * BASE CASE:
     * - The condition that stops recursion
     * - Prevents infinite recursion
     * - Every recursive function MUST have at least one base case
     *
     * RECURSIVE CASE:
     * - The part where function calls itself
     * - Must move towards the base case
     * - Each call should solve a smaller version of the problem
     */


}
