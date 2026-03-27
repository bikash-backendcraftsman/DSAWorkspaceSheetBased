package tufPlus.array.logicBuilding;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MergeTwoSortedArray_UsingTreeSet {

    public static void main (String args[]){
        int[] nums1 = {1,2,2,3};
        int[] nums2 = {4,5,7};

        int[] result = mergeSortUsingHashSet(nums1,nums2);
        List<Integer> intList = new ArrayList<>();
        for(int val : result){
            intList.add(val);
        }
        System.out.println(intList);
    }

    private static int[] mergeSortUsingHashSet(int[] nums1, int[] nums2) {
        TreeSet<Integer> treeSEt = new TreeSet<>();
        /*
        Why TreeSet ?
        Ans > TreeSEt does tw things.
            1. REmove the duplicates
            2.It maintains the insertion Order.

            TreeSet uses:
            👉 Balanced Binary Search Tree (Red-Black Tree)

            So:

            Insert → O(log n)
            Sorted order maintained automatically
            */

        /**
         * Note : This another way to solve this type of question.
         *
         * TC : O((n1 + n2) log(n1 + n2))
         * SC :O(n1 + n2)
         *
         * 👉 Similar to your brute force — but logic is different
         *
         * This is better approch but not optimal approch. To solve this type of problem we can go
         * for optimal approach, which we can solve in O(n) [O(n) : Two Pointer]
         */

        for(int val : nums1){
            treeSEt.add(val);
        }

        for(int val : nums2){
            treeSEt.add(val);
        }

        int[] result = new int[treeSEt.size()];
        int idx = 0;

        for(int val : treeSEt){
            result[idx] = val;
            idx++;
        }
        return result;
    }
}
