package tufPlus.hash;

import java.util.*;
import java.util.stream.Stream;

public class FreqOfAllWordsInSentense {
    public static void main(String[] args) {
        String content = "Bollyword and TollyWood movies are not same when compare to movie creation creativity";
      freqOfAllWords(content);
    }

    private static void freqOfAllWords(String content) {

        Map<String, Integer> hmap = new HashMap<>();

        String[] s = content.toLowerCase().split(" ");
        int count = 1;
        for(String val : s){
            if(hmap.containsKey(val)){
                hmap.put(val,count++);
            } else{
                if(!hmap.containsKey(val)){
                    hmap.put(val, 1);
                }
            }
        }

        for(Map.Entry<String,Integer> entry : hmap.entrySet()){
            System.out.print(entry.getKey()+" : "+entry.getValue());
        }
    }
}
