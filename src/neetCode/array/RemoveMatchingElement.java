package neetCode.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveMatchingElement {
   public static void main(String[] args) {
       int[] nums = {0,1,2,2,3,0,4,2};
       int val = 2;
       int i = removeElement(nums, val);
       System.out.println(i);
   }

    public static int removeElement(int[] nums, int val) {
        //edge case

        if(nums == null || nums.length == 0 || val == 0){
            return -1;
        }

        List<Integer> intList = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            if(nums[i] != val){
                intList.add(nums[i]);
            }
            i++;
        }

        System.out.println(intList);
        int size = intList.size();

        return size;
    }
}
