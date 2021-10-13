package caiohgp.treinojava.classes.HeritagePackage.domain;

public class Person {
    private String name;
    private String document;
    private int age;

    public Person(String name, String document, int age){
        this.name = name;
        this.document = document;
        this.age = age;
    }
    public Person(){

    }

    public void print(){
        System.out.println("Name: " + this.name);
        System.out.println("Document: " + this.document);
        System.out.println("Age: " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
