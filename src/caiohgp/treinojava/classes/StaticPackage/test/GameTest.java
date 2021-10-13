package caiohgp.treinojava.classes.StaticPackage.test;

import caiohgp.treinojava.classes.StaticPackage.domain.Game;

import java.time.LocalDate;

public class GameTest {
    public static void main(String[] args){
        String[] teams = {"Corinthians","Palmeiras"};
        String date = String.valueOf(LocalDate.now());
        Game game1 = new Game(teams, "Brasileirão", date);

        game1.setPlayers(22);
        game1.print();
    }
}
