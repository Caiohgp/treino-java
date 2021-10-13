package caiohgp.treinojava.classes.HeritagePackage.domain;

public class Teacher extends Person{

    private double salary;

    public void print() {
        super.print();
        System.out.println("Salary: " + this.salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
}
