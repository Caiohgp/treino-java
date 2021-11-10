package caiohgp.treinojava.classes.DatePackage.test;


import java.time.LocalDate;

public class DateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusMonths(4);

        System.out.println(localDate);

    }
}
