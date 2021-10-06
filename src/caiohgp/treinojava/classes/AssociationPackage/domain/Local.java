package caiohgp.treinojava.classes.AssociationPackage.domain;

public class Local {
    private String endereco;
    private Seminario seminario;

    public Local(String endereco) {
        this.endereco = endereco;
    }

    public Local(String endereco, Seminario seminario) {
        this.endereco = endereco;
        this.seminario = seminario;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
