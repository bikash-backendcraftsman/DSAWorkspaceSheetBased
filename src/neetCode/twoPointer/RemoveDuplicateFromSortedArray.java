package neetCode.twoPointer;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromSortedArray {
    public static void main(String args[]) {

        int[] nums = {1,1,2,3,4};
       int k =  removeDuplicatesFromSortedArrayUsingHashSet(nums);
        System.out.println(k);
    }

    private static int removeDuplicatesFromSortedArrayUsingHashSet(int[] nums) {
        //edge case
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> hs = new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        return hs.size();
    }

    /**
     * Well this logic did not work  for this https://neetcode.io/problems/remove-duplicates-from-sorted-array/question?list=allNC.
     *
     * will see and debug why it did not work for this.
     *
     * now solving it uisng two pointer approch.
     */
}
