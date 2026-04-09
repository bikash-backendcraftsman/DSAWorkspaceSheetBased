package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReArrangeElements_BruteForce {
    public static void main(String[] args) {
        int[] nums = {2, 4, 5, -1, -3, -4};
        int[] ints = reArrangeElementsBruteForce(nums);
        List<Integer> intList = new ArrayList<>();
        for(int val : ints){
            intList.add(val);
        }

        System.out.println(intList);
    }

    private static int[] reArrangeElementsBruteForce(int[] nums) {
        int[] positive = new int[3];
        int[] negative = new int[3];

        int[] resultArray = new int[nums.length];
        int resultArrayIdx = 0;


        int idxPos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                positive[idxPos] = nums[i];
                idxPos++;
            }
        }

        int idxNeg = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < 0){
                negative[idxNeg] = nums[i];
                idxNeg++;
            }
        }

        int start = 0;
        int end = 0;
        int i = 0;
        while(start < positive.length && end < negative.length){
            resultArray[i] = positive[start];
            i++;
            start++;

            resultArray[i] = negative[end];
            i++;
            end++;
        }
        return resultArray;
    }
}
