package tufPlus.array.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] nums = {0 ,0, 0, 1, 3, -2};
        moveZeroes(nums);
    }

    public static void moveZeroes(int[] nums) {

        int[] result = new int[nums.length];
        int idx = 0;

        List<Integer> al = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                result[idx] = nums[i];
                idx++;
               // System.out.println(idx);
            }
        }

        System.out.println(idx);
        for(int i = idx;i<result.length;i++){
            result[idx] = 0;
        }

        for(int i = 0;i< result.length;i++){
           al.add(result[i]);
        }

        System.out.println(al);
    }
}
