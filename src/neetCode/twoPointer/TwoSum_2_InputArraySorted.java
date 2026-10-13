package neetCode.twoPointer;

public class TwoSum_2_InputArraySorted {
    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] val = twoSum(numbers,target);
        for(int v : val){
            System.out.println(v);
        }
    }

    private static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start < end ){
            int sum = numbers[start] + numbers[end];

            if(sum == target){
                return new int[]{++start,++end};
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
