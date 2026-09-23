package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.List;

public class SortZero_One_Two_BestApproch {
    public static void main(String[] args) {
        int[] array = {1,0,1,1,1,0,0,1,2};
        sortZeroOneTwo(array);

        List<Integer> alList = new ArrayList<>();
        for(Integer myVal : array){
            alList.add(myVal);
        }
        System.out.println(alList);

    }

    private static void sortZeroOneTwo(int[] nums) {
        //edgs case
        if(nums == null || nums.length == 0){
            return;
        }

        int countZero = 0;
        int countOne= 0;
        int countTwo = 0;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0){
                countZero++;
            } else if(nums[i] == 1){
                countOne++;
            }else {
                countTwo++;
            }
        }



        for(int i = 0;i<countZero;i++){
            nums[i] = 0;
        }
        for(int i = countZero;i<countZero+countOne;i++){
            nums[i] = 1;
        }

        for(int i = countZero + countOne;i< nums.length;i++){
            nums[i] = 2;
        }
    }
}
