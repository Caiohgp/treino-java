package caiohgp.treinojava.classes.dominio;

public class Employee {
    public String name;
    public int age;
    public double[] salarys;

    public void printEmployee(){
        System.out.println(this.name);
        System.out.println(this.age);
        for (int i = 0; i<this.salarys.length; i++){System.out.println(this.salarys[i]);}
        mediaSalary();

    }
    public void mediaSalary(){
        int salaryQuantity = this.salarys.length;
        double media = 0;
        for(double salary:this.salarys){
            media+=salary;
        }
        media /= salaryQuantity;
        System.out.println("Media = " + media);
    }
}
