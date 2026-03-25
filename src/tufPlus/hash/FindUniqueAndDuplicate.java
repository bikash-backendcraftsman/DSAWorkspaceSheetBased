package tufPlus.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueAndDuplicate {
    public static void main(String[] args) {
        int[] array = {13,13,4,5,45,1,5,13};
        finduniqueAndDuplicate(array);
    }

    private static void finduniqueAndDuplicate(int[] array) {
        List<Integer> unique = new ArrayList<>();

        List<Integer> duplicate = new ArrayList<>();

        // as have to count unique and duplicate, have to use HashMap
        //why HashMap : Hashmap can store in key and value pair, and provide count freq of each element in array

        HashMap<Integer,Integer> hashMap = new HashMap<>();

        int n = array.length;
        for(int i = 0;i<n;i++){

            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i],1);
            }else{
                hashMap.put(array[i],hashMap.get(array[i])+1);
            }
        }

       /* for(Map.Entry<Integer,Integer> entr : hashMap.entrySet()){
            if(entr.getValue() > 1){
                duplicate.add(entr.getKey());
            }else {
                unique.add(entr.getKey());
            }
        }*/

        hashMap.forEach((key,val) -> {
            if(val > 1){
                duplicate.add(key);
            }else{
                unique.add(key);
            }
        });

        System.out.println("Unique :"+ unique);
        System.out.println("Duplicate :"+duplicate);
    }
}
