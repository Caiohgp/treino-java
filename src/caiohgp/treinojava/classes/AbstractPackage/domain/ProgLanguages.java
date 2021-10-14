package caiohgp.treinojava.classes.AbstractPackage.domain;

public enum ProgLanguages {
    JAVA(1,"Java"),
    PHP(2,"PHP"),
    PYTHON(3,"Python");

    private int idProgLanguage;
    private String progLanguage;

    ProgLanguages(int idProgLanguage, String progLanguage){
        this.idProgLanguage = idProgLanguage;
        this.progLanguage = progLanguage;
    }

    public int getIdProgLanguage() {
        return idProgLanguage;
    }

    public String getProgLanguage() {
        return progLanguage;
    }
}
