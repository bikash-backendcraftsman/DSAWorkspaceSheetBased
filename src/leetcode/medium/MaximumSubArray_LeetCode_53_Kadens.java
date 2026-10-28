package leetcode.medium;

public class MaximumSubArray_LeetCode_53_Kadens {
    public static void main(String[] args) {
        int[] array = {-1,2,6,0};
        int maxSubArray = findMaxSubArray(array);
        System.out.println(maxSubArray);
    }

    private static int findMaxSubArray(int[] array) {
        //edge case
        if(array.length == 0){
            return 0;
        }

        //Approch - 2
        //{-1,2,6,0}
        int max = Integer.MIN_VALUE;
        int previousSum = 0;
        for(int i = 0;i<array.length;i++){
            previousSum+=array[i];
            max = Math.max(max,previousSum);
            if(previousSum<0){
                previousSum = 0;
            }
        }

        //Approach -1
       /* int declaredBest = array[0];
        int ans = array[0];
        for(int i = 1;i < array.length;i++){
            int v1 = declaredBest + array[i];
            int v2 = array[i];
            declaredBest = Math.max(v1,v2);
            ans = Math.max(ans,declaredBest);
        }*/
        return max;
    }
}
