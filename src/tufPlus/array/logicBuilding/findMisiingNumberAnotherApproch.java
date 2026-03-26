package tufPlus.array.logicBuilding;

public class findMisiingNumberAnotherApproch {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
       int val =  missingNumber(nums);
        System.out.println(val);
    }
    public static int missingNumber(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int absolutesum = nums.length;

        /**
         * Let me trace through this with nums = {0, 1, 2, 4}, n = 4:
         * absolutesum starts = 4 (nums.length)
         *
         * i=0 → absolutesum = 4+0 = 4
         * i=1 → absolutesum = 4+1 = 5
         * i=2 → absolutesum = 5+2 = 7
         * i=3 → absolutesum = 7+3 = 10
         * So it gives 10 — which is correct!
         *
         * But ask yourself why it works:
         * absolutesum = n + (0+1+2+...+(n-1))
         *            = 4 + (0+1+2+3)
         *            = 4 + 6
         *            = 10
         * Which is same as 0+1+2+3+4 = sum of 0 to n. ✅
         *
         * However this approach has a problem — you are mixing two responsibilities inside one loop:
         * javasum += nums[i];   // computing actual array sum
         * absolutesum += i; // computing expected sum
         * This works but is confusing to read. The cleaner approach is:
         * javaint absolutesum = n * (n + 1) / 2; // done before the loop
         * for(int i = 0; i < n; i++){
         *     sum += nums[i];                 // loop only does one job
         * }
         * One loop, one job. Easier to understand and debug.
         */

        for(int i=0;i<n;i++){
            sum += nums[i];
            absolutesum+=i;
        }

        System.out.println(absolutesum);
        return absolutesum - sum;
    }
}
