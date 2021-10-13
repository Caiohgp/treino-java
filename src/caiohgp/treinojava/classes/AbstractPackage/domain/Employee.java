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

    public int getId() {
        return idEmployee;
    }

    public void setId(int id) {
        this.idEmployee = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
