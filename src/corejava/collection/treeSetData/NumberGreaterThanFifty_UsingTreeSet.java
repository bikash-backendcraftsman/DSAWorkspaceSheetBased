package corejava.collection.treeSetData;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NumberGreaterThanFifty_UsingTreeSet {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};
        TreeSet<Integer> setVal = new TreeSet<>();
        for(int val : numbers){
            setVal.add(val);
        }

       setVal.tailSet(50).stream().forEach(System.out::println);
    }
}
