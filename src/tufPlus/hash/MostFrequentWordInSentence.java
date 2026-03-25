package tufPlus.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MostFrequentWordInSentence {
    public static void main(String[] args) {
        String word = "Time is precious because time teaches time to value time.";
        //String val = "";
        String frequentWord = mostFrequentInArray(word);
        System.out.println(frequentWord);
    }

    private static String mostFrequentInArray(String word) {
        if(word.length() == 0) return Optional.ofNullable("String is empty").get().toString();

        int maxCount = 0;
        String maxString = null;
        Map<String,Integer> frequencyMap = new HashMap();
        String[] split = word.toLowerCase().split(" ");

        for(String wordArray : split){
            if(frequencyMap.containsKey(wordArray)){
                frequencyMap.put(wordArray,frequencyMap.get(wordArray) + 1);
            }else {
                if(!frequencyMap.containsKey(wordArray)){
                    frequencyMap.put(wordArray,1);
                }
            }
        }

        for(Map.Entry<String,Integer> entry :frequencyMap.entrySet()){
            int count = entry.getValue();
            if(count > maxCount){
                maxCount = count;

                maxString = entry.getKey().toLowerCase();
            }

        }
        System.out.println("MAx count :"+ maxCount);
        return maxString;
    }
}
