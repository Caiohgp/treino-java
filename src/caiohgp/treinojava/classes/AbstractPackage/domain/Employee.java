package caiohgp.treinojava.classes.AbstractPackage.domain;

public abstract class Employee {
    private int idEmployee;
    private String name;
    private Adress adress;

    public Employee(int idEmployee, String name, Adress adress) {
        this.idEmployee = idEmployee;
        this.name = name;
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "idEmployee=" + idEmployee +
                ", name='" + name + '\'' +
                ", adress=" + adress.getAdress() + ", nº: " + adress.getNumber()+
                '}';
    }

    public String getName() {
        return name;
    }

}
