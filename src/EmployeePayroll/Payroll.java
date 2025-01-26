package EmployeePayroll;

public class Payroll {
    public double calculateSalary(double baseSalary, double bonus) {
        return baseSalary + bonus;
    }

    public double calculateBonus(double baseSalary, double bonusPercentage) {
        return baseSalary * (bonusPercentage / 100);
    }
}
