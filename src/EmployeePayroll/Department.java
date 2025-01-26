package EmployeePayroll;

public class Department {
    int id;
    String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

  
    public String toString() {
        return "Department ID: " + id + ", Name: " + name;
    }
}
