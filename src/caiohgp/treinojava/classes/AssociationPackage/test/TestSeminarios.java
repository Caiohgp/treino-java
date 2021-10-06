package caiohgp.treinojava.classes.AssociationPackage.test;

import caiohgp.treinojava.classes.AssociationPackage.domain.Estudante;
import caiohgp.treinojava.classes.AssociationPackage.domain.Local;
import caiohgp.treinojava.classes.AssociationPackage.domain.Professor;
import caiohgp.treinojava.classes.AssociationPackage.domain.Seminario;

public class TestSeminarios {
    public static void main(String[] args){
        Professor professor = new Professor("Kakashi","Luta");
        Estudante estudante1 = new Estudante("Naruto",15);
        Estudante estudante2 = new Estudante("Sasuke",15);
        Estudante estudante3 = new Estudante("Sakura",15);
        Local local = new Local("Konoha");
        Estudante[] estudantes = {estudante1,estudante2,estudante3};
        Seminario seminario = new Seminario("Exame Chunin",professor, estudantes,local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
