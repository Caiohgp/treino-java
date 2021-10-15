package caiohgp.treinojava.classes.InterfacesPackage.domain;

public class Tiger extends Animal{
    public Tiger(int idAnimal, int paws, String specie) {
        super(idAnimal, paws, specie);
    }

    @Override
    public void eat() {
        System.out.println("The tiger eats meat");
    }

    @Override
    public void sleep() {
        System.out.println("The tiger sleeps 5h a day");
    }

    public void print(){
        System.out.println("Specie: " + super.getSpecie());
        System.out.println("Nº of paws : " + super.getPaws());
    }
}
