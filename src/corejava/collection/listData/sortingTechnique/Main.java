package corejava.collection.listData.sortingTechnique;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.sort;

public class Main {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList(List.of(new Employee(3, "Ravi", 30),
                new Employee(1, "Amit", 25),
                new Employee(2, "Neha", 28)));

        Collections.sort(empList);
        System.out.println(empList);
    }
}
