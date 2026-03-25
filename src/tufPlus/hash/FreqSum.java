package tufPlus.hash;

public class FreqSum {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,3};
        //int[] array = {4,4,5,5,6};
        int sumVal = sumFrequencyElements(array);
        System.out.println("Max Freq Element :"+sumVal);
    }


    private static int sumFrequencyElements(int[] nums) {
        if(nums.length == 0){
            return -1;
        }
        int maxFreq = 0;
        int minFreq = nums.length;
        int sum = 0;
        boolean[] visited = new boolean[nums.length + 1];

        for(int i = 0;i<nums.length;i++){
            if(visited[i]) continue;
            int freq = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j] == nums[i]){
                    freq++;
                    visited[j] = true;
                }
            }

            if(freq >= maxFreq){
                maxFreq = freq;
            }
            if(freq < minFreq){
                minFreq = freq;
            }

        }


        System.out.println("Max Freq :"+maxFreq);
        System.out.println("Min Freq :"+minFreq);
        sum = maxFreq + minFreq;
        return sum;
    }
}
