package caiohgp.treinojava.classes.EnumerationPackage.domain;

public class Transaction {
    private int idTransaction;
    private String client;
    private Status status;

    public Transaction(int idTransaction, String client, Status status) {
        this.idTransaction = idTransaction;
        this.client = client;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idTransaction=" + idTransaction +
                ", client='" + client + '\'' +
                ", status=" + status.getNomeStatus() +
                ", status=" + status.getIdStatus() +
                '}';
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(int idTransaction) {
        this.idTransaction = idTransaction;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
