package caiohgp.treinojava.classes.AbstractPackage.test;

import caiohgp.treinojava.classes.AbstractPackage.domain.*;

public class TestEmployee {
    public static void main(String[] args) {
        Adress adress = new Adress(1,"R. Abra Kadabra",105);
        Adress adress2 = new Adress(2,"R. Bla Bla Bla",50);

        Developer developer = new Developer(1,"Caio",adress, ProgLanguages.JAVA);
        Marketing marketing = new Marketing(2,"Mateus",adress2, WorkingSocialMedia.INSTAGRAM);

        adress.setEmployee(developer);
        adress2.setEmployee(marketing);

        developer.imprime();
        System.out.println("------------------------------");
        marketing.imprime();
    }
}
