package pattern.slidingWindow.medium;

import java.util.HashMap;
import java.util.Map;
//note i
public class LongestSubstring_without_Repeating_Character {
    public static void main(String[] args) {
        String s = "abcabcbb";
        int longestLength = findLengthOfLongestSubstring(s);
    }

    private static int findLengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;  // empty string → longest substring is 0
        }

        int left = 0;
        int maxLength = 0;

        // window state: character → count inside the current window
        Map<Character, Integer> window = new HashMap<>();

        // right pointer expands the window one character at a time
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            window.put(current, window.getOrDefault(current, 0) + 1);

            // duplicate exists when distinct chars < window length
            while (window.size() < right - left + 1) {
                char leaving = s.charAt(left);

                // decrease count of the char leaving the window
                window.put(leaving, window.get(leaving) - 1);

                // if count hits 0, remove the key entirely
                // (otherwise map.size() stays wrong!)
                if (window.get(leaving) == 0) {
                    window.remove(leaving);
                }

                left++;  // shrink window from the left
            }

            // window is valid here → update answer
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
