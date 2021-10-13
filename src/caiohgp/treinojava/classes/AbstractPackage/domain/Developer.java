package caiohgp.treinojava.classes.AbstractPackage.domain;

public class Developer extends Employee{
    private String progLanguage;

    public Developer(int idEmployee, String name, Adress adress, String progLanguage) {
        super(idEmployee, name, adress);
        this.progLanguage = progLanguage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Prog Language= " + this.progLanguage;
    }

    public String getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(String progLanguage) {
        this.progLanguage = progLanguage;
    }
}
