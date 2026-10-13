package java8interview;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java8interview.Employee.getEmployyeData;

public class Interview4 {
    public static void main(String[] args) {
        //Question: Find the 2nd highest salary from a list of employees.
        List<Employee> employyeData = getEmployyeData();


        Double secondHighest = employyeData.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().orElseThrow();

        System.out.println(secondHighest);
    }
}
