package leetcode.medium;

import java.util.Arrays;

/**
 * LC 189. Rotate Array — rotate the array to the right by k steps.
 *
 * Pattern: in-place reversal (array rotation / cyclic shift).
 * Keywords to spot it: rotate array, right rotate, cyclic shift, reverse,
 * k % n, in-place, O(1) extra space.
 *
 * Why the reverse approach works:
 * A right rotation by k moves the last k elements to the front and keeps
 * their relative order. Three reverses rebuild that order without extra memory:
 *   1) reverse the whole array  -> the last k items sit at the front, but reversed
 *   2) reverse the first k items -> those k items are back in original order
 *   3) reverse the remaining tail -> the rest are back in original order
 *
 * Example: [1,2,3,4,5,6,7], k = 3
 *   reverse all      -> [7,6,5,4,3,2,1]
 *   reverse first 3  -> [5,6,7,4,3,2,1]
 *   reverse the rest -> [5,6,7,1,2,3,4]
 *
 * k % n is required because a full cycle of n steps returns the original array.
 * Rotating by k and by k % n is the same move.
 *
 * Approaches:
 * 1) Extra array: place nums[i] at index (i + k) % n. Time O(n), space O(n).
 * 2) Three reverses (used below). Time O(n), space O(1). Use this when the
 *    array must be modified in place.
 * 3) Cycle replacement: start at i and jump to (i + k) % n until you return.
 *    Time O(n), space O(1). More than one cycle exists when gcd(k, n) > 1,
 *    so this version is easier to get wrong.
 *
 * Edge cases:
 * - null or empty array -> nothing to rotate
 * - length 1 -> already in place
 * - k == 0, or k is a multiple of n (k % n == 0) -> array does not change
 * - k > n -> reduce with k % n before any reverse
 */
public class ArrayRotation_LC_189 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        rotateArray(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotateArray(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int n = nums.length;
        k = k % n;
        if (k == 0) {
            return;
        }

        reverseArray(nums, 0, n - 1);
        reverseArray(nums, 0, k - 1);
        reverseArray(nums, k, n - 1);
    }

    private static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;
            start++;
            end--;
        }
    }
}
