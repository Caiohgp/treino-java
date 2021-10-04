package caiohgp.treinojava.classes.AnimePackage.test;

import caiohgp.treinojava.classes.AnimePackage.domain.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime1 = new Anime("One Piece","Shonen",100);
        Anime anime2 = new Anime("Cowboy Beebop","Seinen",12);

        anime1.imprimir();
        anime2.imprimir();

    }
}
