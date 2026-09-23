package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortIntegerUsing_TwoApproch {
    public static void main(String[] args) {
        int[] array = {0,1,1,1,0,1};
        sortUsingTwoPointer(array);
        List<Integer> intList = new ArrayList<>();

        for(Integer val : array){
            intList.add(val);
        }
        System.out.println(intList);

    }

    private static void sortUsingTwoPointer(int[] array) {
        //edge case
        if(array== null || array.length == 0){
            return;
        }

        int left = 0;
        int right = array.length - 1;

        while(left < right){

            if(array[left] == 1 && array[right] == 0){
                int swap = array[left];
                array[left] = array[right];
                array[right] = swap;
            }
            else if(array[left] == 0){
                left++;

            }else {
                right--;
            }
        }
    }
}
