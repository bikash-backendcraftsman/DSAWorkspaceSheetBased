package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedArray_OptimalApproch {
    public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2,2,6,7,8,9};
       int[] returnedVal =  mergeSortedArray_Optimize_TwoPonter(array1,array2);
        List<Integer> intList = new ArrayList<>();
        for(int val :returnedVal){
            intList.add(val);
        }

        System.out.println(intList);
    }

    /**
     *
     * Bullet Points to Focus
     * ======================
     * 1.Here we are using optimal Approch
     * 2.I am using two pointer approach , as both array is sorted
     * 3.well in this problem we are solving two type of array case
     *
     *    case 1 : when both array have duplicate elements but, array is sorted
     *    int[] array1 = [1,2,3,4,5]
     *    int[] array2 = [1,2,7]
     *
     *    case 2 : When both array sorted, but from them one array contain
     *    unique elements and another element contain duplicate elements, both both
     *    are sorted.
     *    int[] array1 = [1,3,5]
     *    int[] array2 = [2,2,5,6,7,8,9]
     *
     *    For this Both cases we are handling if below if condition logic
     *
     *    if(idx == 0 || result[idx - 1] != val){
     *                 result[idx] = val;
     *                 idx++;
     *             }
     *     -> in the if Condition we are evaluating result array index value with sorted values
     *     from array and hence unique elements stored in result array.
     *
     * 4. when array contain any duplicate values we have to handel this way.
     * 5. There is another acse to focus, if all the elements are are sorted in both array
     *    and all contain unique elements, we dont need to validate duplicate elements and can store
     *    directly in the result array. [For this i have coded :[Class name : MergeSortedArray_whenAllAreUniqueAndSorted]]
     */
    private static int[] mergeSortedArray_Optimize_TwoPonter(int[] array1, int[] array2) {

        int[] result = new int[array1.length + array2.length];
        int idx = 0;

        int i = 0;
        int j = 0;

        while(i < array1.length && j< array2.length){
            int val;
            if(array1[i] < array2[j]){
                val = array1[i];
                i++;
            }else{
              val = array2[j];
              j++;
            }

            if(idx == 0 || result[idx - 1] != val){
                result[idx] = val;
                idx++;
            }
        }

        while(i < array1.length){
            if(idx == 0 || result[idx - 1] != array1[i]){
                result[idx] = array1[i];
                i++;
                idx++;
            }
        }

        while(j < array2.length){
           if(idx == 0 || result[idx - 1] != array2[j]){
               result[idx] = array2[j];
               j++;
               idx++;
           }
        }
        //return result;
        return java.util.Arrays.copyOf(result, idx);
    }
}
