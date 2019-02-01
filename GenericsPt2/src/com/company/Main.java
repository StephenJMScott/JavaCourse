package com.company;

public class Main {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer becks = new SoccerPlayer("Becks");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(becks);
        //BY using Generics, with <> we can validate the player type

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseBallPlayer> baseBallTeam = new Team<>("Chicago Cubs");
        baseBallTeam.addPlayer(pat);

        //demonstrate current error that will run at this point but throw error.

//        Team<String> brokenTeam = new Team<>("Wont work");
//        brokenTeam.addPlayer("no one");

        Team<SoccerPlayer> brokenTeam = new Team<>("Wont work");
//        brokenTeam.addPlayer("no-one"); this won't work
        brokenTeam.addPlayer(becks); //this will work


        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResults(fremantle, 1, 0);
        hawthorn.matchResults(adelaideCrows, 3, 8);

        adelaideCrows.matchResults(fremantle, 2, 1);
//        adelaideCrows.matchResults(baseBallTeam, 1, 1); This no longer works cos we put a generic parameter in
        //

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(fremantle.compareTo(melbourne));
    }
}
