package caiohgp.treinojava.classes.test;

import caiohgp.treinojava.classes.dominio.Carro;

public class Test {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat Uno";
        carro1.modelo = "ELX";
        carro1.ano = 1997;

        carro2.nome = "Opala";
        carro2.modelo = "Diplomata";
        carro2.ano = 1990;

        System.out.println(carro1.nome + " " + carro1.modelo + " " + carro1.ano);
        System.out.println(carro2.nome + " " + carro2.modelo + " " + carro2.ano);

    }
}
