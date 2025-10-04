package crio101.twopointer;

public class TwoSum167LeetCode {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] ints = twoSum(numbers, target);
        for(int val : ints){
            System.out.print(val+" ");
        }
    }

    /**
     * Note : Here we have used Two pointer approach.
     * I have to do the revesion on the concept and question on 5th Sepetem 2025 Again.
     * @param numbers
     * @param target
     * @return
     *
     * https://leetcode.com/discuss/post/1688903/solved-all-two-pointers-problems-in-100-z56cn/ : Solve
     * the question from here. It contains all Pattern of Two Pointer questions.
     */
    private static int[] twoSum(int[] numbers, int target) {
        int start = 0; int end = numbers.length - 1;
        while(start < end){
            int sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{start + 1, end + 1};
            }else if(sum > target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1,-1};
    }
}
