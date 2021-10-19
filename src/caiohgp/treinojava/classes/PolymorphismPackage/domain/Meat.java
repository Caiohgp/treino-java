package caiohgp.treinojava.classes.PolymorphismPackage.domain;

public class Meat extends Product{

    public static final double TAX = 0.1;

    public Meat(String name, double value){
        super(name,value);
    }

    public double calculateTaxes(){
        return super.getValue() * TAX;
    }

}
