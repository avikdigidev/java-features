package java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.*;

public class TopSalariedEmployee {

    public static void main(String[] args) {
        List<Employee> allEmployees = new ArrayList<>();
        Map<String, Employee> topEmployees =
                allEmployees.stream()
                        .collect(groupingBy(
                                e -> e.getDepartment(),
                                collectingAndThen(maxBy(comparingInt(e -> e.getSalary())), Optional::get)
                        ));
    }
}
class Employee{
    private int salary;
    private String department;

    public Employee(int salary, String department) {
        this.salary = salary;
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
