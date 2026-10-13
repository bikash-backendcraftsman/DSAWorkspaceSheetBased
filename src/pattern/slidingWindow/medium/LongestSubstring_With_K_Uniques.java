package pattern.slidingWindow.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import static java.lang.Math.max;

public class LongestSubstring_With_K_Uniques {
    public static void main(String[] args) {
        String s = "aabacbebebe"; // =>  subString : aab,aba,,acb,cbe,beb,
        int k = 3;

       int value = longestKSubstr( s, k);
        System.out.println("Value :"+ value);
    }

    private static int longestKSubstr(String s, int k) {
        //edge case
        if(Objects.isNull(s) || k == 0){
          return  -1;
        }

        int left  = 0;
        int maxlength = 0;
        Map<Character, Integer> fMap = new HashMap<>();
        for(int right = 0; right < s.length();right++){
            fMap.put(s.charAt(right), fMap.getOrDefault(s.charAt(right),0) + 1);

            while(fMap.size() > k){
              char leftChar = s.charAt(left);
              fMap.put(leftChar,fMap.get(leftChar) -1);

              if(fMap.get(leftChar) == 0){
                  fMap.remove(leftChar);
              }
              left++;
            }

            if(fMap.size() == k){
                 int val = Math.max(maxlength, right - left + 1);
                 maxlength = val;
            }
        }
        return maxlength;
    }
}
