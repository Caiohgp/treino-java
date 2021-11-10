package caiohgp.treinojava.classes.colections.domain;

public class Smartphone {
    private String serialNumber;
    private String marca;

    public Smartphone(String serialName, String marca) {
        this.serialNumber = serialName;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    @Override
    public int hashCode() {
        return this.serialNumber == null ? 1: this.serialNumber.hashCode();
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
