package com.company;

public class Main {

    public static void main(String[] args) {
        League<Team<FootballPlayer>> footyLeague = new League<>("AFL");
        Team<FootballPlayer> adelaideCrows = new Team<>("Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbs");
        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Cubs");

        footyLeague.add(adelaideCrows);
        footyLeague.add(melbourne);
        footyLeague.add(hawthorn);
        footyLeague.add(fremantle);
//        footyLeague.add(baseBallPlayerTeam); //not working successfully;

        footyLeague.showLeagueTable();
        System.out.println("Games begin!");
        hawthorn.matchResults(fremantle, 1, 0);
        hawthorn.matchResults(adelaideCrows, 3, 8);
        adelaideCrows.matchResults(fremantle, 2, 1);
        System.out.println("Current Standings");
        footyLeague.showLeagueTable();
    }
}
