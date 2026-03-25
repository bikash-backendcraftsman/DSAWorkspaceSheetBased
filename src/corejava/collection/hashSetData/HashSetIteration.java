package corejava.collection.hashSetData;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteration {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(20);
        set.add(30);
        set.add(50);

        iterateHashSetUsing_ForEachLoop(set);

        System.out.println();
        printHashSetUsingIterator(set);
        System.out.println();

        printHashSetUsingForEach(set);
    }

    static void iterateHashSetUsing_ForEachLoop(Set<Integer> val){
        for(int i : val){
            System.out.println(i);
        }
    }

    static void printHashSetUsingIterator(Set<Integer> myVal){
        if(!myVal.isEmpty()){
            Iterator<Integer> iterator = myVal.iterator();
            while (iterator.hasNext()){
                int val = iterator.next();
                System.out.print(" "+val);
            }
        }
    }

    static void printHashSetUsingForEach(Set<Integer> val){
        if(!val.isEmpty()){
            val.stream().forEach((print) -> System.out.println(print));
        }
    }

}
