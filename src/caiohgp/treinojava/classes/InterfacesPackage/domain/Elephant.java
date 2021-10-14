package caiohgp.treinojava.classes.InterfacesPackage.domain;

public class Elephant extends Animal{

    public Elephant(int idAnimal, int paws, String specie) {
        super(idAnimal, paws, specie);
    }

    public void eat(){
        System.out.println("The elephant eats plants");
    }

    public void sleep(){
        System.out.println("The elephant sleep 10h a day");
    }
}
