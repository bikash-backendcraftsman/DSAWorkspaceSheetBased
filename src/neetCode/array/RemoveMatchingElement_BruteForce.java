package neetCode.array;

import java.util.ArrayList;
import java.util.List;

public class RemoveMatchingElement_BruteForce {

    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        int val = 1;
        int i = removeElementBruteForce(nums, val);
        System.out.println(i);
    }

    private static int removeElementBruteForce(int[] nums, int val) {
        if(nums == null || nums.length == 0 || val == 0){
            return  -1;
        }

        //solve using brute force approch
        List<Integer> tempList = new ArrayList<>();
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != val){
                tempList.add(nums[i]);
                j++;
            }
        }


        for (int i = 0;i<tempList.size();i++){
            nums[i] =tempList.get(i);
        }

        return tempList.size();
    }
}
