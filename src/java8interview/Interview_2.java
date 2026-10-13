package java8interview;

import java.util.*;
import java.util.stream.Collectors;

public class Interview_2 {
    public static void main(String[] args) {

        // sort Map by its values
        Map<String, Integer> map = Map.of("A", 3, "B", 1, "C", 2);

        LinkedHashMap<String, Integer> collect = map.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(e -> e.getKey(),
                        e -> e.getValue(),
                        (a, b) -> a,
                        LinkedHashMap::new));

        System.out.println(collect);
    }
}
