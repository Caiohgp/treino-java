package caiohgp.treinojava.classes.PolymorphismPackage.domain;

public class Computer extends Product {

    public static final double TAX = 0.5;

    public Computer(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculateTaxes() {
        System.out.println("Calculating Computer Tax");
        return super.getValue() * TAX;
    }
}
