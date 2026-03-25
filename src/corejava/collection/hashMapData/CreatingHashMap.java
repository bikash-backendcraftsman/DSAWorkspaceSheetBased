package corejava.collection.hashMapData;

import java.util.HashMap;
import java.util.Map;

public class CreatingHashMap {
    public static void main(String[] args) {
        // There are four different constructors available to create a HashMap in Java.

        /**
         * Load factor is a number that defines when a Map should be resized.
         * If the load factor is 0.75, then it means that the Map should be resized when it is 75 percent full.
         */
        Map<String, Integer> map = new HashMap<>();

        map.putIfAbsent("1",null);
        map.put("3",3456);
        map.put("4",4567);

        System.out.println(map);
    }
}
