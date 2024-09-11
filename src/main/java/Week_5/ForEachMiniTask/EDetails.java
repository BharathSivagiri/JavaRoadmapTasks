package Week_5.ForEachMiniTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EDetails
{
    public static void main(String[] args)
    {
        List<Employee> LEmployee = new ArrayList<>();
        LEmployee.add(new Employee("Diana", 110000));
        LEmployee.add(new Employee("Fiona", 105000));
        LEmployee.add(new Employee("Alice", 75000));
        LEmployee.add(new Employee("Charlie", 95000));
        LEmployee.add(new Employee("Hannah", 78000));
        LEmployee.add(new Employee("Julia", 98000));
        LEmployee.add(new Employee("Ian", 115000));
        LEmployee.add(new Employee("George", 92000));
        LEmployee.add(new Employee("Ethan", 88000));
        LEmployee.add(new Employee("Bob", 82000));

        System.out.println("Employees 10% salary hike:");
        LEmployee.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(emp ->
                {
                    emp.setSalary(emp.getSalary() * 1.1f);
                    System.out.println(emp);
                });
    }
}
