package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.List;

public class ReArrangeElementsOptimized {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        reArrangeElementsWith_OptimizedApproch(nums);
    }

    private static void reArrangeElementsWith_OptimizedApproch(int[] nums) {

        int start = 0;
        int idx = 0;
        while (start < nums.length){
            if(nums[start] > 0 ){
                start++;
            }
        }
    }
}
