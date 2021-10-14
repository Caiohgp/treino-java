package caiohgp.treinojava.classes.InterfacesPackage.domain;

public abstract class Animal implements Food, Sleep {
    private int idAnimal;
    private int paws;
    private String specie;

    public Animal(int idAnimal, int paws, String specie) {
        this.idAnimal = idAnimal;
        this.paws = paws;
        this.specie = specie;
    }
}
