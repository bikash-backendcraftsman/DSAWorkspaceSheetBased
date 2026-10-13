package java8interview;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private String dept;
    private double salary;

    public Employee(){

    }
    public Employee(int id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getSalary() { return salary; }

    @Override
    public String toString() {
        return name + " (" + dept + ", " + salary + ")";
    }

    public static List<Employee> getEmployyeData (){
        return Arrays.asList(
                new Employee(1, "Aarav",   "Engineering", 90000),
                new Employee(2, "Diya",    "Engineering", 120000),
                new Employee(3, "Rohan",   "Engineering", 85000),
                new Employee(4, "Sneha",   "HR",          60000),
                new Employee(5, "Karan",   "HR",          75000),
                new Employee(6, "Priya",   "Sales",       95000),
                new Employee(7, "Arjun",   "Sales",       95000),  // ⚠️ tie with Priya!
                new Employee(8, "Isha",    "Marketing",   70000),
                new Employee(9, "Vikram",  "Marketing",   55000)
        );
    }
}
