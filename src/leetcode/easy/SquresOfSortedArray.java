package leetcode.easy;

import java.util.Arrays;
import java.util.List;

public class SquresOfSortedArray {
    public static void main(String[] args) {
       // int[] nums ={-4,-1,0,3,10};
        int[] nums = {-7,-3,2,3,11};
        int[] arrayVal = squreSorted(nums);
        for(int i = 0;i<arrayVal.length;i++){
            System.out.print(" "+arrayVal[i]);
        }
    }

    private static int[] squreSorted(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0){
            return new int[] {-1};
        }
        int[] result = new int[nums.length];
        //find the squre of each element in nums Array
        for(int i = 0;i<nums.length;i++){
            result[i] = nums[i] * nums[i];
        }

        // now sort the result array
        Arrays.sort(result);
        return result;
    }
}
