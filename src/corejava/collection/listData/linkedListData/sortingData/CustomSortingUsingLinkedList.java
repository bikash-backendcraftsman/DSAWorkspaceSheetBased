package corejava.collection.listData.linkedListData.sortingData;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CustomSortingUsingLinkedList {
    public static void main(String[] args) {
        List<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(101,1997));
        employeeList.add(new Employee(105,1989));
        employeeList.add(new Employee(190,2006));

        Collections.sort(employeeList);
        System.out.print(employeeList);
    }
}
