package leetcode.easy;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        //int[] nums = {};
        final boolean b = containsDuplicate(nums);
        System.out.println("Val :"+b);
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean flag = false;
        if(nums.length == 0){
            return flag;
        }
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
            if(count >= 2){
                flag = true;
            }
        }
        return flag;
    }
}
