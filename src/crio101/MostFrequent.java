package crio101;

import java.util.HashMap;
import java.util.Map;

public class MostFrequent {
    public static void main(String[] args) {
        String s = "a,a,a,a,A,A,A,A";
        Object[] mostFrequent = findMostFrequent(s);
        System.out.println(mostFrequent[0]+" "+mostFrequent[1]);


    }

    private static Object[] findMostFrequent(String s) {
        char[] charArray = s.toCharArray();
        Map<Character,Integer> coutFreq = new HashMap<>();
        for(Character ch :s.toCharArray()){
            int freq = coutFreq.getOrDefault(ch,0);
            coutFreq.put(ch,freq+1);
        }
        int maxCount = 0;
        Character ans = '0';

        for(Character ch : coutFreq.keySet()){
            int count = coutFreq.get(ch);
            if(count > maxCount){
                maxCount = count;
            }else if(count == maxCount){
                if(ch < maxCount)
                    ans = ch;
            }
        }
        Object[] ibjArr = {ans,maxCount};
       return ibjArr;
    }
}
