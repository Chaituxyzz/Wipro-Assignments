package EmployeePayroll;

public class Employee {
    int id;
    String name;
    int departmentId;
    double baseSalary;

    public Employee(int id, String name, int departmentId, double baseSalary) {
        this.id = id;
        this.name = name;
        this.departmentId = departmentId;
        this.baseSalary = baseSalary;
    }

  
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name + ", Department ID: " + departmentId + ", Base Salary: " + baseSalary;
    }
}
