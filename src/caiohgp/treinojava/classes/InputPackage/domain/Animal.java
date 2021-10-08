package caiohgp.treinojava.classes.InputPackage.domain;

public class Animal {
    private String name;
    private String specie;

    public Animal(String name, String specie){
        this.name = name;
        this.specie = specie;
    }

    public String getName(){
        return this.name;
    }

    public void setName (String name){
        this.name = name;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }
}
