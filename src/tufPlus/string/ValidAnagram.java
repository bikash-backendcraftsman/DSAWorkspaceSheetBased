package tufPlus.string;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "tea";
        String t = "eat";

        boolean val = validAnagramCheck(s,t);
        System.out.println(val);
    }

    private static boolean validAnagramCheck(String s, String t){
        //edge case
        if(s == null && t == null || s.length() == 0 && t.length() == 0){
            return false;
        }

        //actual code part

        //first find freq
        Map<Character,Integer> counterFreqMap = new HashMap<>();

        for(int i = 0;i < s.length();i++){
            if(counterFreqMap.isEmpty()) {
                for (char c : s.toCharArray()) {
                    counterFreqMap.put(c, counterFreqMap.getOrDefault(c, 0) + 1);
                }
            }
        }

        // want to check if String t , containing character should equal to match with the character in the hashmap key [oder is not important] and length of both string should be equal
        for(char ct : t.toCharArray()){
            if(!counterFreqMap.containsKey(ct)){
                return false;
            }
        }

        return false;
    }
}
