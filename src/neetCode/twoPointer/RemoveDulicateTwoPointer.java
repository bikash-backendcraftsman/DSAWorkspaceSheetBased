package neetCode.twoPointer;

public class RemoveDulicateTwoPointer {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,4};
        int k =  removeDuplicatesFromSortedArrayUsingTwoPointer(nums);
        System.out.println(k);
    }

    private static int removeDuplicatesFromSortedArrayUsingTwoPointer(int[] nums) {
        // edge case
        if(nums.length == 0){
            return -1;
        }

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
                j++;
            }else if(nums[j] == nums[i]){
               j++;
            }
        }
        return i + 1;
    }
}
