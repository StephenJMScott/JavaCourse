package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringing", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy Man", 4.3);
        album.addSong("Hold On", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High Ball Shooter", 4.27);
        album.addSong("The Gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);


        album = new Album("For those about to rock", "AC/DC");
        album.addSong("Track 1", 5.00);
        album.addSong("Track 2", 4.20);
        album.addSong("Track 3", 3.45);
        album.addSong("Track 4", 2.13);
        album.addSong("Track 5", 0.30);
        album.addSong("Track 6", 6.56);
        album.addSong("Track 7", 19.16);
        albums.add(album);

        // this is ok, using 'album' twice as its two seperate objects

        List<Song> playList = new ArrayList<>();
        albums.get(0).addToPlayList("You can't do it right",playList);
        albums.get(0).addToPlayList("Holy Man",playList);
        albums.get(0).addToPlayList("Yeah yeah",playList);
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(1,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(9,playList);

        play(playList);


    }

    private static void play(List<Song>playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit=false;
        boolean forward=true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0) {
            System.out.println("No Songs in Playlist");
            return;
        }else{
            System.out.println("Now Playing "+listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    quit=true;
                    break;
                case 1:
                    if(!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now Playing "+ listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of our playlist");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now Playing "+ listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+ listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+ listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now Playing "+listIterator.next());
                        }else if(listIterator.hasPrevious()){
                            System.out.println("Now Playing "+listIterator.previous());
                        }else{
                            System.out.println("Playlist now empty");
                        }
                    }
                    break;
            }

        }
    }
    private static void printMenu(){
        System.out.println("Available actions:\nPRESS:");
        System.out.println("\t0- Quit\n" +
                           "\t1- Next Song\n" +
                            "\t2- Previous Song\n" +
                            "\t3- Replay Song\n" +
                            "\t4- List Songs in Playlist\n" +
                            "\t5- Print Menu\n" +
                            "\t6- Delete Current Song");


    }

    private static void printList(List<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("=======================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("=======================");

    }

    private static void repeatSong(){

    }
}
