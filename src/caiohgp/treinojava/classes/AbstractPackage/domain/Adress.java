package caiohgp.treinojava.classes.AbstractPackage.domain;

public class Adress {
    private int idAdress;
    private String adress;
    private int number;
    private Employee employee;

    public Adress(int idAdress,String adress, int number) {
        this.adress = adress;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "idAdress= " + idAdress +
                ", adress= '" + adress + '\'' +
                ", number= " + number +
                ", employee= " + employee.getName() +
                '}';
    }

    public int getIdAdress() {
        return idAdress;
    }

    public void setIdAdress(int idAdress) {
        this.idAdress = idAdress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
