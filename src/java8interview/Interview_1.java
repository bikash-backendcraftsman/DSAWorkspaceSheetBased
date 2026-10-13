package java8interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Interview_1 {
    public static void main(String[] args) {

        //Find duplicates in a list using Streams
        List<String> names = Arrays.asList("apple", "banana", "apple", "mango", "banana");

        Set<String> list = names.stream().filter(words -> Collections.frequency(names,words) > 1).collect(Collectors.toSet());
        System.out.println(list);
    }
}
