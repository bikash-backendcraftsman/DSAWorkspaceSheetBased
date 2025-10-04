package crio101.twopointer;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates26LeetCode {
    public static void main(String[] args) {
        int[] array = {0,0,1,2,2,5};
       int printVal = removeDuplicates(array);
        System.out.println(printVal);
    }

    private static int removeDuplicates(int[] nums) {
        int start = 0; int end = nums.length - 1;
         while(start < end){
             if(nums[start] != nums[end]){
                 start ++;
                 nums[start] = nums[end];
                 end --;
                 start++;
             }
         }
        return start + 1;
    }
}
