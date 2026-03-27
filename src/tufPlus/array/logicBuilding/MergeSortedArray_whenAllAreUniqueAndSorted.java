package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray_whenAllAreUniqueAndSorted {
    public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,7,8};
        int[] val = mergeArrayUsingTwoPointerWhenArrayIsUniqueAndSorted(array1,array2);
        List<Integer> intList = new ArrayList<>();
        for(int printVal : val){
            intList.add(printVal);
        }
        System.out.println(intList);
    }

    /**
     *
     * Bullet Points to focus
     * =====================
     * 1. Here Both are unique and Sorted.
     * 2. We just use two pointer approach here, as array is sorted [pattern recognisation : Used here Two Pointer Approch],
     *    we dont have to check the duplicate elements before storing into  the result array.
     * 3. With 2 pointer approach , just do the comparision [follow below code snippet : [array1[i] < array2[j]],evaluate smallest element and store
     *    to result array.
     *
     *        array1[i] < array2[j]
     *        The smaller part will be store in the resut array first and then move pointer any one one (i or j),
     *        and again do the comparision and find the smaller element from the comparision and store that element to
     *        result array.
     *
     */
    private static int[] mergeArrayUsingTwoPointerWhenArrayIsUniqueAndSorted(int[] array1, int[] array2) {

        int i = 0;int j = 0; int idx = 0;
        int[] result = new int[array1.length + array2.length];
        while(i < array1.length && j < array2.length){
            if(array1[i] < array2[j]){
                result[idx] = array1[i];
                i++;
                idx++;
            }else{
                result[idx] = array2[j];
                j++;
                idx++;
            }
        }
        while ( i < array1.length){
            result[idx] = array1[i];
            i++;
            idx++;
        }

        while (j < array2.length){
            result[idx] = array2[j];
            j++;
            idx++;
        }
        return result;
    }
}
