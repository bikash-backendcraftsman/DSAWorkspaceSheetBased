package leetcode.medium;

public class MaxProductSubArray {
   public static void main(String[] args) {
       int[] nums = {-2,0,-1};
      int productVal = maxProduct(nums);
       System.out.println(productVal);
    }

    private static int maxProduct(int[] nums) {
       //edge case
        if(nums.length == 0){
            return  -1;
        }
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int result = nums[0];

        for(int i = 1;i< nums.length;i++){
            int v1 = nums[i];
            int v2 = minEnding * nums[i];
            int v3 = maxEnding * nums[i];
            maxEnding = Math.max(v1, Math.max(v2,v3));
            minEnding = Math.min(v1,Math.min(v2,v3));
            result = Math.max(result, Math.max(maxEnding,minEnding));
        }
       return result;
    }
}
