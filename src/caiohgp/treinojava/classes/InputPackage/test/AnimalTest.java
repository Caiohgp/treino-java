package caiohgp.treinojava.classes.InputPackage.test;

import caiohgp.treinojava.classes.InputPackage.domain.Animal;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o nome do animal");
        String name = input.nextLine();
        System.out.println("Insira a espécie do animal");
        String specie = input.nextLine();
        Animal animal = new Animal(name,specie);

        System.out.println(animal.getName() + " é um " + animal.getSpecie());

    }
}
