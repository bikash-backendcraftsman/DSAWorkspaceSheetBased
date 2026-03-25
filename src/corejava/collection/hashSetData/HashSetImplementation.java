package corejava.collection.hashSetData;

import java.util.HashSet;
import java.util.Set;

public class HashSetImplementation {
    public static void main(String[] args) {
        Set<Integer> hashSetImpl = new HashSet<>();
        hashSetImpl.add(20);
        hashSetImpl.add(10);
        hashSetImpl.add(30);

        System.out.println(hashSetImpl);

        System.out.println(hashSetImpl.contains(20));
    }
}
