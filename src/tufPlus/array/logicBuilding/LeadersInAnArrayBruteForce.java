package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInAnArrayBruteForce {
    public static void main(String[] args) {
        //int[] nums = {1,2,5,3,1,2};
        int[] nums = {0,0,0,0,0};
        List<Integer> intList = findLeaderArray(nums);
        System.out.println(intList);

    }

    private static List<Integer> findLeaderArray(int[] nums) {
        //edge case
        if(nums == null || nums.length == 0){
            return Collections.emptyList();
        }

        List<Integer> result = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            boolean isleader = true;
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] <= nums[j]){
                    isleader = false;
                    break;
                }
            }
            if(isleader){
                result.add(nums[i]);
            }
        }
        return result;
    }
}
