package pattern.slidingWindow.easy;

public class maximumAverageSubArray {
    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        double averageVal = findMaxAverage(nums, k);
        System.out.println("Max Average :"+ averageVal);
    }

    private static double findMaxAverage(int[] nums, int k) {
        //edge case
        if(nums.length == 0 || k == 0){
            return 0.0;
        }

        int left = 0;
        int right = k - 1;

        double average = 0.0;
        int sum = 0;
        double maxAvrage;
        double finalMaxAverage = 0.0;
        for(int i = 0;i < k ;i++){
            sum+=nums[i];
        }
        average = (double)sum / k;
        finalMaxAverage = average;
        while(right < nums.length -1){
            left++;
            right++;

            sum-=nums[left -1];
            sum+=nums[right];

            maxAvrage = (double) sum / k;
            finalMaxAverage = Math.max(finalMaxAverage, maxAvrage);

        }
        return finalMaxAverage;
    }
}
