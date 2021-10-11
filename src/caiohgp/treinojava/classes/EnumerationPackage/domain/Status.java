package caiohgp.treinojava.classes.EnumerationPackage.domain;

public enum Status {
    EQUIPAMENTO_ENTREGUE(1,"Equip. Entregue"),
    AGUARDANDO_ANALISE(2,"Ag. Análise"),
    AGURDANDO_REPARO(3,"Ag. Reparo");

    private int idStatus;
    private String nomeStatus;

    Status(int idStatus, String nomeStatus) {
        this.idStatus = idStatus;
        this.nomeStatus = nomeStatus;

    }
    public int getIdStatus() {
        return idStatus;
    }

    public String getNomeStatus() {
        return nomeStatus;
    }
}
