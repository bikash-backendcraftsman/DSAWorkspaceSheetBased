package tufPlus.array.logicBuilding;

public class findMissingNumber {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 4, 5, 6};
        int val = findMissingNumberFromGivenArray(array);
        System.out.println(val);
    }

    private static int findMissingNumberFromGivenArray(int[] array) {
        //edge case
        if(array.length == 0){
            return -1;
        }

        //find missing no logic
        int n = array.length;
        int arraySum = 0;

        /**
         * Sum of 0→n  -  Sum of actual array  =  Missing number
         * That's the whole approach. The "sum of natural numbers" is just the
         * "what it should be" part — the perfect total if nothing was missing.
         */

        int sumOfNatural = n * (n + 1) / 2;

        for(int i = 0;i<n ;i++){
            arraySum+=array[i];
        }
        System.out.println("array total value:"+arraySum);
        return sumOfNatural - arraySum;
    }
}
