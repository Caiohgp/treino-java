package caiohgp.treinojava.classes.DatePackage.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusMonths(4);

        System.out.println(localDate);

    }
}
