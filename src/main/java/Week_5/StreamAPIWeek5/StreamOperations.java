package Week_5.StreamAPIWeek5;

import java.util.ArrayList;
import java.util.List;

public class StreamOperations
{

    public static class Employee
    {
        private String name;
        private int age;
        private double salary;


        public Employee(String name, int age, double salary)
        {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {return name;}

        public void setName(String name) {this.name = name;}

        public int getAge() {return age;}

        public void setAge(int age) {this.age = age;}

        public double getSalary() {return salary;}

        public void setSalary(double salary) {this.salary = salary;}

        public String toString()
        {
            return "Employee name='" + name + '\'' +
                    ", Employee age=" + age +
                    ", Employee salary=" + salary;
        }
    }

    public static void main(String[] args)
    {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Akash", 30, 50000));
        employees.add(new Employee("Siddharth", 35, 60000));
        employees.add(new Employee("Mike", 28, 45000));
        employees.add(new Employee("Emily", 22, 75000));

    }
}
