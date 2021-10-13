package caiohgp.treinojava.classes.AbstractPackage.test;

import caiohgp.treinojava.classes.AbstractPackage.domain.Adress;
import caiohgp.treinojava.classes.AbstractPackage.domain.Developer;
import caiohgp.treinojava.classes.AbstractPackage.domain.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Adress adress = new Adress(1,"R. Alvaro Borges dos Reis",105);
        Developer developer = new Developer(1,"Caio",adress,"Java");
        adress.setEmployee(developer);
        System.out.println(developer);
        System.out.println(adress);
    }
}
