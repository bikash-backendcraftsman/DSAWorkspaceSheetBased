package corejava.collection.hashMapData;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapOperation {
    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle",5000);
        stockPrice.put("American Express",70000);
        stockPrice.put("MotherSun",1500);
        stockPrice.putIfAbsent("Oracle",9000);

        System.out.println(stockPrice);
        int val = fetchValueFromHashMap(stockPrice);
        System.out.println(val);

        System.out.println("============");
        int stockPricePrint = fetchValueFromHashMapUsingGetOrDefaultMethod(stockPrice);
        System.out.println(stockPricePrint);
        System.out.println(stockPrice);

    }

    /**
     * Using the get() method
     * The get(Object key) method takes a key as a parameter and returns the value corresponding to that key.
     * If the key is not present, it returns null.
     * @param price
     * @return
     */
    static int fetchValueFromHashMap(Map<String,Integer> price){
        return price.get("MotherSun");
    }

    /**
     * The getOrDefault(Object key, V defaultValue) method is useful if are not sure whether a key is present in the Map or not.
     * If the key is present then this method returns the value corresponding to the key and if the key
     * is not present then the default value is returned.
     * @param price
     * @return
     */
    static int fetchValueFromHashMapUsingGetOrDefaultMethod(Map<String,Integer> price){

        return price.getOrDefault("Apple",20000);
    }


}

