package caiohgp.treinojava.classes.AssociationPackage.domain;

public class Seminario {
    private String titulo;
    private Professor professor;
    private Estudante[] estudantes;
    private Local local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, Professor professor) {
        this.titulo = titulo;
        this.professor = professor;
    }

    public Seminario(String titulo, Professor professor, Estudante[] estudantes) {
        this.titulo = titulo;
        this.professor = professor;
        this.estudantes = estudantes;
    }

    public Seminario(String titulo, Professor professor, Estudante[] estudantes, Local local) {
        this.titulo = titulo;
        this.professor = professor;
        this.estudantes = estudantes;
        this.local = local;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
