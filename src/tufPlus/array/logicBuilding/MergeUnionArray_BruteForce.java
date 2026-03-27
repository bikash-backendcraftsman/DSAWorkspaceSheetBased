package tufPlus.array.logicBuilding;

import java.util.Arrays;

public class MergeUnionArray_BruteForce {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5};
        int[] nums2 = {1,2,7};

        int[] result = mergeArrayBrurteForce(nums1,nums2);

        for(int i = 0;i<result.length;i++){
            System.out.print(" "+result[i]);
        }
    }

    /**
     * Q > what is this approach?
     * Ans> This a brute force approch to solve two given sorted arrays to merge together.
     *
     * Q >  what pattern it solves?
     * Ans > Merge + Sort
     *      1. Take a result array
     *      2.Read both arrays one by one
     *      3.Store them in the result array
     *      4. Sort the result array
     *      5.Return the Result array.
     *
     * Q > Why  we choose this approach and what other scenarios we can choose this?
     * Ans > if any question given that we have to merge the elements then we can
     * think of using this brute force pattern.
     *
     * Note : If question given if we have to merge and sort and keep only unique values by using any data structure
     * we can think of using Set Data structure. [TreeSet]
     * @param nums1
     * @param nums2
     * @return
     */
    private static int[] mergeArrayBrurteForce(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] result = new int[n1 + n2];
        int idx = 0;

        for(int i = 0;i<n1;i++){
            result[idx] = nums1[i];
            idx++;
        }

        for(int i = 0;i<n2;i++){
            result[idx] = nums2[i];
            idx++;
        }
        Arrays.sort(result);
        return result;
    }
}
