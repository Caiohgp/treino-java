package caiohgp.treinojava.classes.PolymorphismPackage.test;

import caiohgp.treinojava.classes.PolymorphismPackage.domain.Computer;
import caiohgp.treinojava.classes.PolymorphismPackage.domain.Meat;
import caiohgp.treinojava.classes.PolymorphismPackage.domain.Product;
import caiohgp.treinojava.classes.PolymorphismPackage.service.TaxCalculator;

public class ProductTest {
    public static void main(String[] args) {
        Product computer = new Computer("Samsung",7000);
        Product meat = new Meat("Ribs",50);

        TaxCalculator.taxCalculator(computer);
        TaxCalculator.taxCalculator(meat);
    }
}
