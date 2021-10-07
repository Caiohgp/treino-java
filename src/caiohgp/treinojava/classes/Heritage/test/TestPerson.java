package caiohgp.treinojava.classes.Heritage.test;

import caiohgp.treinojava.classes.Heritage.domain.Person;
import caiohgp.treinojava.classes.Heritage.domain.Teacher;

public class TestPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Caio","1245",23);
        Teacher teacher1 = new Teacher();

        teacher1.setName("Jiraya");
        teacher1.setDocument("4567132");
        teacher1.setAge(60);
        teacher1.setSalary(8514.5);

        teacher1.print();
        person1.print();
    }
}
