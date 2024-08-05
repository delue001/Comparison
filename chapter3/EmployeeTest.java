package chapter3;

import chapter3.Employee;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Babatunde", "Felix", 100);
        Employee employee2 = new Employee("Jose", "Mourinho", 200);

        Employee(employee1);
        Employee(employee2);

        System.out.printf("%s %s Ten percent SalaryRaise: $%.2f%n", employee1.getFirstname(),
                employee1.getLastname(), employee1.getSalaryRaise());

        System.out.printf("%s %s Ten percent SalaryRaise: $%.2f%n%n", employee2.getFirstname(),
                employee2.getLastname(), employee2.getSalaryRaise());

        System.out.printf("%s %s Yearly salary: $%.2f%n", employee1.getFirstname(),
                employee1.getLastname(), employee1.getYearlySalary());

        System.out.printf("%s %s Yearly salary: $%.2f", employee2.getFirstname(),
                employee2.getLastname(), employee2.getYearlySalary());

    }
    public static void Employee(Employee employee){
        System.out.printf("%s %s Salary: $%.2f%n", employee.getFirstname(), employee.getLastname(), employee.getSalary());

    }
}
