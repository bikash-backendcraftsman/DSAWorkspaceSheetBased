package tufPlus.array.fundamentals;

public class SecondLargestElementInArray {
    public static void main(String[] args) {
       int[] nums = {8, 8, 7, 6, 5};
       //int[] nums = {5,5,7,1,3};
       int val = secondLargestElementInArray(nums);
        System.out.println("Second Largest Element :" + val);
    }

    private static int secondLargestElementInArray(int[] nums) {
        //edge case
        if(nums.length == 0){
            return -1;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > largest){
                secondLargest = largest;
                largest = nums[i];
            }else if(nums[i] < largest && nums[i] > secondLargest){
                secondLargest = nums[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE || secondLargest == largest) {
            return -1;
        }
        return secondLargest;
    }
}
