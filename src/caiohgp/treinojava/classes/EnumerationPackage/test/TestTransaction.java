package caiohgp.treinojava.classes.EnumerationPackage.test;

import caiohgp.treinojava.classes.EnumerationPackage.domain.Status;
import caiohgp.treinojava.classes.EnumerationPackage.domain.Transaction;

public class TestTransaction {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(1,"SPEC", Status.AGUARDANDO_ANALISE);
        Transaction transaction2 = new Transaction(2,"ATLAS", Status.AGURDANDO_REPARO);
        Transaction transaction3 = new Transaction(3,"OTIS", Status.EQUIPAMENTO_ENTREGUE);

        System.out.println(transaction1);
        System.out.println(transaction2);
        System.out.println(transaction3);
    }
}
