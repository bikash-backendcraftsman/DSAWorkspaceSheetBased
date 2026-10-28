package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber_LeetCode136 {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
      int val =   singleNumber(nums);
        System.out.println(val);
    }

    private static int singleNumber(int[] nums) {
        //edge case
        if(nums.length == 0){
            return  0;
        }
        Map<Integer, Integer> hmap = new HashMap<>();

        for(int i = 0;i< nums.length;i++){
            hmap.put(nums[i], hmap.getOrDefault(nums[i],0)+ 1);
        }

        // Phase 2: AFTER the loop, find the entry with count == 1
        for (Map.Entry<Integer, Integer> entry : hmap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return 0;
    }
}
