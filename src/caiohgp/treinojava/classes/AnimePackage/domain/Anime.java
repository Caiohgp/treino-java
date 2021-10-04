package caiohgp.treinojava.classes.AnimePackage.domain;

public class Anime {
    private String name;
    private String genre;
    private int episodes;

    public Anime(String name, String genre, int episodes) {
        this.name = name;
        this.genre = genre;
        this.episodes = episodes;
    }

    public Anime(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}

