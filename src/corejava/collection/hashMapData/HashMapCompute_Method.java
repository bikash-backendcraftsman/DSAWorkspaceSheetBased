package corejava.collection.hashMapData;

import java.util.HashMap;
import java.util.Map;

public class HashMapCompute_Method {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("India", 5);
        map.put("USA", 3);
        map.put("China", 5);
        map.put("Russia", 6);

        // This will increment the value of India by 1 as it is present in the Map
        map.compute("India", (k, v) -> v == null ? 10 : v + 1);

        // This will insert Vietnam in the Map with default value of 10.
        map.compute("Vietnam", (k, v) -> v == null ? 10 : v + 1);

        map.compute("Pakistan",(key,value) -> value == null ? 50 : value + 1);

        System.out.println(map);
    }
}
