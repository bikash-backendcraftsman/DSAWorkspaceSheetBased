package corejava.collection.listData.linkedListData.sortingData;

public class Employee implements Comparable<Employee> {
    private int employeeId;
    private int joinedYear;

    public Employee(int employeeId, int joinedYear) {
        this.employeeId = employeeId;
        this.joinedYear = joinedYear;
    }


    @Override
    public int compareTo(Employee o) {
        return this.joinedYear - o.joinedYear;
    }

    @Override
    public String toString(){
        return "Joined Year :"+joinedYear+"========"+"employee Id :"+employeeId;
    }
}
