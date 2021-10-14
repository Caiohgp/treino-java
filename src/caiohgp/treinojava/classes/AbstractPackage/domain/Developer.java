package caiohgp.treinojava.classes.AbstractPackage.domain;

public class Developer extends Employee{
    private ProgLanguages progLanguage;

    public Developer(int idEmployee, String name, Adress adress, ProgLanguages progLanguage) {
        super(idEmployee, name, adress);
        this.progLanguage = progLanguage;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Prog Language= " + this.progLanguage.getProgLanguage() +
                '}';
    }

    public void imprime() {
        System.out.println("Name: " + super.getName());
        System.out.println("Adress: " + super.getAdress().getAdress() + ", nº: " + super.getAdress().getNumber());
        System.out.println("Working in: " + this.progLanguage.getProgLanguage());

    }

}
