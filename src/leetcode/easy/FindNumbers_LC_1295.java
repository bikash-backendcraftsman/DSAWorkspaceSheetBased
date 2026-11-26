package leetcode.easy;

/**
 * LC 1295. Find Numbers with Even Number of Digits.
 * Count how many numbers in the array have an even count of digits.
 *
 * Pattern: digit counting (a property of one number, not a pair or a window).
 * Keywords to spot it: even number of digits, digit count, number of digits,
 * length % 2, log10, convert to string, parity of digits.
 *
 * Why this works:
 * "Even number of digits" means the decimal length is even.
 *   2 digits  -> 10 to 99
 *   4 digits  -> 1000 to 9999
 *   6 digits  -> 100000 (the upper limit of this problem)
 * A one-digit number has length 1, so it is never counted.
 * For a non-negative integer, String.valueOf(num).length() is that digit count,
 * because Java does not keep leading zeros. length % 2 == 0 is the even check.
 *
 * Approaches:
 * 1) Convert to String and check length % 2 == 0. Used below.
 *    Time O(n * digits), extra space is the temporary string.
 * 2) Count digits by dividing by 10 until the number becomes 0.
 *    Same idea, no String. See countDigits below.
 * 3) Range check, valid here because 1 <= nums[i] <= 10^5:
 *    even digits when the number is in [10, 99], [1000, 99999], or equals 100000.
 *    Fast, but the ranges change if the constraint on nums[i] changes.
 *
 * Edge cases:
 * - empty array -> 0
 * - every value is a single digit (2, 6) -> 0
 * - boundaries: 9 skip, 10 count, 99 count, 100 skip, 999 skip, 1000 count
 * - 100000 has 6 digits, so it counts
 * - 0 has 1 digit, so it does not count
 */
public class FindNumbers_LC_1295 {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int val = findNumbers(nums);
        System.out.println(val);
    }

    private static int findNumbers(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            // Approach 1: digit count from the decimal string
            int length = String.valueOf(nums[i]).length();
            // Approach 2: int length = countDigits(nums[i]);
            if (length % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    // Approach 2: each / 10 drops one digit. 0 is a special case (1 digit).
    private static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }
        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        return digits;
    }
}
