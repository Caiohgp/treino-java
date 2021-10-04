package caiohgp.treinojava.classes.EmployeePackage.test;

import caiohgp.treinojava.classes.EmployeePackage.domain.Employee;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();

        employee1.name = "Caio";
        employee1.age = 18;
        employee1.salarys = new double[]{2000, 2500, 4000};

        employee1.printEmployee();
    }
}
