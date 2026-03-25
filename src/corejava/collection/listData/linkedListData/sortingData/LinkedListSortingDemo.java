package corejava.collection.listData.linkedListData.sortingData;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSortingDemo {
    public static void main(String[] args) {
        List<Integer> listDemo = new LinkedList<>();

        listDemo.add(20);
        listDemo.add(2);
        listDemo.add(12);
        listDemo.add(40);
        listDemo.add(76);
        listDemo.add(41);
        listDemo.add(53);

        Collections.sort(listDemo);

        System.out.println(listDemo);
    }
}
