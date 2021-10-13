package caiohgp.treinojava.classes.StaticPackage.domain;

public class Game {
    private String[] teams;
    private String league;
    private String date;
    private static int players;

    public Game(String[] teams, String league, String date){
        this.teams = teams;
        this.league = league;
        this.date = date;
    }

    public Game(){
    }

    public void print(){
        System.out.println("------- Teams -------");
        for(String teams : this.teams){
            System.out.println(teams);
        }
        System.out.println("---------------------");
        System.out.println("League - " + this.league);
        System.out.println("Date and time - " + this.date);

    }

    public String[] getTeams() {
        return teams;
    }

    public void setTeams(String[] teams) {
        this.teams = teams;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static int getPlayers() {
        return players;
    }

    public static void setPlayers(int players) {
        Game.players = players;
    }
}
