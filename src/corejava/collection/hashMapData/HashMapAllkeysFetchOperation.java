package corejava.collection.hashMapData;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapAllkeysFetchOperation {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);

        //Fetching all the keys from HashMap
        Set<String> uniQuekeys = stockPrice.keySet();
        for(String key :uniQuekeys){
            System.out.println(" "+key);
        }

        System.out.println("=========================");

        //Fetching all the values from HashMap
        if(stockPrice.isEmpty()){
            System.out.println("HashMap is Empty");
        }else {
            Collection<Integer> values = stockPrice.values();
            for(Integer val : values){
                System.out.println(val);
            }
        }
    }
}
