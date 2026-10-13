package pattern.slidingWindow.medium;

import java.util.HashSet;
import java.util.Set;

public class MaximumSumOf_Distinct_SubArray {
    public static void main(String[] args) {
        int[] nums = {1,5,4,2,9,9,9};
        int k = 3;
       long maxSum =  findMaximumSubArraySum(nums,k);
        System.out.println("Maximum Sum of Sub Array :"+maxSum);
    }

    private static long findMaximumSubArraySum(int[] nums, int k) {
        //edge case
        if(nums.length == 0 || k == 0){
            return -1;
        }

        int n = nums.length -1;
        //find the first maximum sum

        Set<Integer> valueSet = new HashSet<>();
        int sum = 0;
        long maxSum = 0;

        // array [1,1,4,2,9,9,9] k == 3  ==> [1,1,4]
        for(int i = 0;i < k ;i++){
            valueSet.add(nums[i]);
                sum+=nums[i];
        }

        if(valueSet.size() == k){
            maxSum = sum;
        }

        int start = 0;
        int end = k - 1;

        while(end < nums.length - 1){
            sum -= nums[start];
            valueSet.remove(nums[start]);

            //slide pointers
            start++;
            end++;
            sum+=nums[end];
            valueSet.add(nums[end]);
            if(valueSet.size() == k){
                maxSum= Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
