package caiohgp.treinojava.classes.AbstractPackage.domain;

public class Marketing extends Employee{

    private WorkingSocialMedia workingSocialMedia;

    public Marketing(int idEmployee, String name, Adress adress, WorkingSocialMedia workingSocialMedia) {
        super(idEmployee, name, adress);
        this.workingSocialMedia = workingSocialMedia;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", Working in = " + this.workingSocialMedia.getSocialMedia() +
                '}';
    }

    @Override
    public void imprime() {
        System.out.println("Name: " + super.getName());
        System.out.println("Adress: " + super.getAdress().getAdress() + ", nº: " + super.getAdress().getNumber());
        System.out.println("Working in: " + this.workingSocialMedia.getSocialMedia());

    }
}
