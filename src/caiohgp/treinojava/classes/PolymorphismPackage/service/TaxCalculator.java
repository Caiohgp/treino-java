package caiohgp.treinojava.classes.PolymorphismPackage.service;

import caiohgp.treinojava.classes.PolymorphismPackage.domain.Product;

public class TaxCalculator {
    public static void taxCalculator(Product product){
        System.out.println("-------------------------------");
        System.out.println("Tax Report");
        double tax = product.calculateTaxes();
        double total = tax + product.getValue();
        System.out.println("Name = " + product.getName());
        System.out.println("Value = " + product.getValue());
        System.out.println("Tax = " + tax);
        System.out.println("Value + Taxes = " + total);
    }
}
