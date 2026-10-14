package pattern.slidingWindow.medium;

import java.util.HashMap;
import java.util.Map;

public class Fruit_Into_Basket {
    public static void main(String[] args) {
        int[] fruits = {0,1,2,2};
       int total_count =  totalFruit(fruits);

        System.out.println("Total count :"+ total_count);
    }

    private static int totalFruit(int[] fruits) {
        //edge case
        if(fruits.length == 0){
            return 0;
        }
        int left = 0;
        int k = 2;
        int res = 0;
        Map<Integer,Integer> freqMap = new HashMap<>();

        for(int right = 0; right <fruits.length;right++){
            freqMap.put(fruits[right],freqMap.getOrDefault(fruits[right],0)+1);

            while (freqMap.size() > k){
                int leftFruit = fruits[left];
                freqMap.put(leftFruit,freqMap.get(leftFruit) - 1);

                if(freqMap.get(leftFruit) == 0){
                    freqMap.remove(leftFruit);
                }
                left++;
            }
            int length = right - left + 1;
            res =   Math.max(res,length);
        }

        return res;
    }
}
