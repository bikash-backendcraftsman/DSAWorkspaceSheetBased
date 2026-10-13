package java8interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Interview_1_BetterApproach {
    public static void main(String[] arags) {
        //Find duplicates in a list using Streams
        List<String> names = Arrays.asList("apple", "banana", "apple", "mango", "banana");

        Set<String> seen = new HashSet<>();

        Set<String> collect = names.stream().filter(words -> !seen.add(words)).collect(Collectors.toSet());
        System.out.println(collect);
    }
}
