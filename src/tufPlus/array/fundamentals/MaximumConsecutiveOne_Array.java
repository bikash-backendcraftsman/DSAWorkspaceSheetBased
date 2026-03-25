package tufPlus.array.fundamentals;

public class MaximumConsecutiveOne_Array {
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 0, 1, 1, 1, 0};
        int val = findMaxConsucutiiveOne(nums);
        System.out.println("Max Count Value :"+val);
    }

    private static int findMaxConsucutiiveOne(int[] nums) {
        if(nums.length == 0){
            return - 1;
        }

        int maxCount= 0;
        int countConsecutive = 0;

        for(int i = 0;i<nums.length ;i++){

            if(nums[i] == 1){
                countConsecutive ++;
                maxCount = Math.max(countConsecutive,maxCount);
            }else {
                countConsecutive = 0;
            }
        }

        return maxCount;
    }
}
