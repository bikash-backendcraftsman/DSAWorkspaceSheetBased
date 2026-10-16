package neetCode.array;

public class RemoveDuplicateSortedArrray_Optimized {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        int  val =  removeDuplicatesFromSortedArray_Optimized(nums);
        System.out.println(val);
    }

    private static int removeDuplicatesFromSortedArray_Optimized(int[] nums) {
        //edge case
         if(nums.length == 0){
             return  -1;
         }

         //using two pointer approch
        int start = 0;
         int end = start +1;

         while(end < nums.length){
             if(nums[end] != nums[start]){
                 start++;
                 nums[start] = nums[end];
             }
             end++;
         }
        return start + 1;
    }
}
