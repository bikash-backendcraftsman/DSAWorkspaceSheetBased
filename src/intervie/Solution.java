package intervie;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {7,4,1,9,3,0};
        selectionSortImpl(nums);
    }

    private static void selectionSortImpl(int[] nums) {

        for(int i = 0;i<nums.length;i++){
            for(int j = i + 1;j<nums.length;j++){
                if(nums[i] > nums[j]){
                    int swap = nums[j];
                    nums[j] = nums[i];
                    nums[i] = swap;
                }
            }
        }

        for(int val : nums){
            System.out.print(" "+val);
        }
    }
}
