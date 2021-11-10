package caiohgp.treinojava.classes.colections;

import caiohgp.treinojava.classes.colections.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {

        Smartphone smartphone1 = new Smartphone("Galaxy-S7","Samsung");
        Smartphone smartphone2 = new Smartphone("Galaxy-S7","Samsung");

        System.out.println(smartphone1.equals(smartphone2));
        System.out.println(smartphone1.hashCode());

    }
}
