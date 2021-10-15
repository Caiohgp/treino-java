package caiohgp.treinojava.classes.InterfacesPackage.test;

import caiohgp.treinojava.classes.InterfacesPackage.domain.Animal;
import caiohgp.treinojava.classes.InterfacesPackage.domain.Elephant;
import caiohgp.treinojava.classes.InterfacesPackage.domain.Tiger;

public class AnimalTest {
    public static void main(String[] args) {
        Animal tiger = new Tiger(1,4,"Tiger");
        Animal elephant = new Elephant(2,4,"Elephant");

        tiger.print();
        tiger.eat();
        tiger.sleep();
        System.out.println("--------------------------------");
        elephant.print();
        elephant.eat();
        elephant.sleep();
    }
}
