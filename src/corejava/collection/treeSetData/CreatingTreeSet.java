package corejava.collection.treeSetData;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CreatingTreeSet {
    public static void main(String[] args) {
        /**
         * To insert a single element, we can use the add(E e) method.
         * This method returns true if the element is inserted, and it returns false if the element is already present.
         */
        Set<Integer> set = new TreeSet<>();
        set.add(21);
        set.add(32);
        set.add(44);
        set.add(11);
        set.add(54);
        System.out.println("TreeSet elements in ascending order " + set);

        // This TreeSet will store the elements in reverse order.
        TreeSet<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(21);
        reverseSet.add(32);
        reverseSet.add(44);
        reverseSet.add(11);
        reverseSet.add(54);
        System.out.println("TreeSet elements in descending order " + reverseSet);
    }
}
