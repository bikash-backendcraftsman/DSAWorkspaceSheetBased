package corejava.collection.hashSetData;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateusingHashSet {
    public static void main(String[] args) {
        int[] data = {12, 34, 1, 56, 43, 34, 65};
        int duplicate;

        Set<Integer> uniqueElement = new HashSet<>();
        Set<Integer> dupliCate = new HashSet<>();

        for(int i : data){
            if (!uniqueElement.add(i)) {
                dupliCate.add(i);
            }
        }

        if (dupliCate.isEmpty()) {
            System.out.println("No duplicates found in the array.");
        } else {
            System.out.println("Duplicate elements are: " + dupliCate);
        }

    }
}
