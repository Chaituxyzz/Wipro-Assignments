package EmployeePayroll;

import java.util.ArrayList;
import java.util.Scanner;

public class PayrollSystem {

    private ArrayList<Employee> employees = new ArrayList<>();
    
    private ArrayList<Department> departments = new ArrayList<>();
    
    private Payroll payroll = new Payroll();

    public void addEmployee(int id, String name, int departmentId, double baseSalary) {
        employees.add(new Employee(id, name, departmentId, baseSalary));
        
        System.out.println("Employee added successfully.");
    }

    public void addDepartment(int id, String name) {
        departments.add(new Department(id, name));
        System.out.println("Department added successfully.");
    }

    public void generateSalaryReport() {
        System.out.println("Employee Salary Report:");
        for (Employee employee : employees) {
        	
            double bonus = payroll.calculateBonus(employee.baseSalary, 10); 
            
            double totalSalary = payroll.calculateSalary(employee.baseSalary, bonus);
            System.out.println("Employee ID: " + employee.id + ", Name: " + employee.name + 
                               ", Total Salary: " + totalSalary);
        }
    }

    public void listEmployees() {
        System.out.println("Employees:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public void listDepartments() {
        System.out.println("Departments:");
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public static void main(String[] args) {
        PayrollSystem system = new PayrollSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nEmployee Payroll System");
            System.out.println("1. Add Department");
            System.out.println("2. Add Employee");
            System.out.println("3. Generate Salary Report");
            System.out.println("4. List Employees");
            System.out.println("5. List Departments");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Department ID: ");
                    int departmentId = scanner.nextInt();
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Department Name: ");
                    String departmentName = scanner.nextLine();
                    system.addDepartment(departmentId, departmentName);
                    break;

                case 2:
                    System.out.print("Enter Employee ID: ");
                    int employeeId = scanner.nextInt();
                    
                    scanner.nextLine(); 
                    
                    System.out.print("Enter Employee Name: ");
                    
                    String employeeName = scanner.nextLine();
                    System.out.print("Enter Department ID: ");
                    departmentId = scanner.nextInt();
                    
                    System.out.print("Enter Base Salary: ");
                    double baseSalary = scanner.nextDouble();
                    
                    system.addEmployee(employeeId, employeeName, departmentId, baseSalary);
                    break;

                case 3:
                    system.generateSalaryReport();
                    break;

                case 4:
                    system.listEmployees();
                    break;

                case 5:
                    system.listDepartments();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

