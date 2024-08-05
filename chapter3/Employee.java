package chapter3;

public class Employee {
    private String firstname;
    private String lastname;
    private double salary;

    public Employee(String firstname, String lastname, double salary){
        this.firstname = firstname;
        this.lastname = lastname;

        if(salary > 0.0)
            this.salary = salary;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public String getFirstname(){
        return firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }
    public String getLastname(){
        return lastname;
    }
    public void setSalary(double salary){
        if(salary > 0.0)
            this.salary = salary;
    }
    public double getSalary(){
        return salary;
    }
    public double getSalaryRaise(){
        return salary * 10 / 100 + salary;
    }
    public double getYearlySalary(){
        return salary * 12;
    }
}
