package corejava.collection.listData;

import java.util.Iterator;
import java.util.List;

public class ArrayList_IterationTechnique {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");

        System.out.println(strings.contains("2"));
        iterationUsingLoop(strings);
        System.out.println("======================");
        iterateUsingEnhancedForLoop(strings);
        System.out.println("======================");
        iterateUsingIterator(strings);
    }

    static void iterationUsingLoop(List<String> stringList){
        //To fetch the value from list we can use get() method
        for(int i = 0;i<stringList.size();i++){
            System.out.print(" "+stringList.get(i));
        }
    }

    static void iterateUsingEnhancedForLoop(List<String> stringList){
        for(String val : stringList){
            System.out.println(" "+val);
        }
    }

    static void iterateUsingIterator(List<String> stringList){
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
