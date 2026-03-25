package tufPlus.string;

import java.util.*;

public class SortCharacterByFrequency_UsingHashSet {

    public static void main(String[] args) {
        String s = "cccbbbbaaa";
        List<Character>  listData = sortCharacterUsingHashSet(s);
        System.out.println(listData);
    }

    private static List<Character> sortCharacterUsingHashSet(String s) {

        //edge cases
        if(s == null || s.length() == 0){
            List<Character> characters = Collections.emptyList();
            return characters;
        }

        //use Hashset to find the unique

        Set<Character> data = new HashSet<>();

        for(char c : s.toCharArray()){
            data.add(c);
        }

        List<Character> list = data.stream().toList().stream().sorted().toList();
        return list;
    }
}
