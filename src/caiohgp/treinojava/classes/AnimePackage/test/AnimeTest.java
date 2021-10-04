package caiohgp.treinojava.classes.AnimePackage.test;

import caiohgp.treinojava.classes.AnimePackage.domain.Anime;

public class AnimeTest {
    public static void main(String[] args){
        Anime anime1 = new Anime();
        Anime anime2 = new Anime();

        anime1.setName("One Piece");
        anime1.setGenre("Shonen");
        anime1.setEpisodes(100);

        anime2.setName("Cowboy Beebop");
        anime2.setGenre("Seinen");
        anime2.setEpisodes(24);

        System.out.println(anime1.getName());
        System.out.println(anime1.getGenre());
        System.out.println(anime1.getEpisodes());

        System.out.println(anime2.getName());
        System.out.println(anime2.getGenre());
        System.out.println(anime2.getEpisodes());
    }
}
