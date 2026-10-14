package pattern.slidingWindow.medium;

public class MaximumSubArraySum_whenNo_DuplicatesInArray {
    public static void main(String[]args) {
        int[] nums = {1,2,3,4};
        int k = 3;
        int maxSum = findMaxSubArraySum(nums,k);
        System.out.println("Maximum Sum :" + maxSum);
    }

    private static int findMaxSubArraySum(int[] nums, int k) {
        int left = 0;
        int right = k -1;
        int sum = 0;
        int maxSum = 0;
        int maxval = 0;

        for(int i = 0; i < k ;i++){
            sum+= nums[i];
        }
        while(right < nums.length -1){
            left++;
            right++;
           sum -= nums[left -1];
           sum += nums[right];

           maxval = Math.max(sum, maxSum);
           maxSum = maxval;
        }
        return maxSum;
    }
}
