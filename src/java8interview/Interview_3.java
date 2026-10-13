package java8interview;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import static java8interview.Employee.getEmployyeData;

public class Interview_3 {
    public static void main(String[] args) {

        //Group employees by department, then find max salary per department

        List<Employee> employyeData = getEmployyeData();
        Map<String, Employee> collect = employyeData.stream()
                .collect(Collectors.
                        groupingBy(Employee::getDept,
                                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)), Optional::get)));

        System.out.println(collect);
    }
}
