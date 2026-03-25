package tufPlus.string;

import java.util.*;

public class SortCharacterFrequencyUsing_HashMap {
    public static void main(String[] args) {
        String s = "tree";
        List<Character> chList = sortCharacterUsingHashMap(s);
        System.out.println(chList);
    }

    private static List<Character> sortCharacterUsingHashMap(String s) {
        //edge cases
        if(s == null || s.length() == 0)
            return Collections.emptyList();

        // find frequency
        Map<Character,Integer> freqCount = new HashMap<>();
        List<Character> val = null;
        for(char v : s.toCharArray()){
            freqCount.put(v, freqCount.getOrDefault(v,0) + 1);
        }

          return  freqCount.keySet()
                    .stream()
                    .sorted((a, b) -> {
                        int freqDiff = freqCount.get(b) - freqCount.get(a);
                        if (freqDiff != 0) return freqDiff;
                        return Character.compare(a, b);
                    })
                    .toList();

    }
}
