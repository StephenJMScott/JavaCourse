package com.stephen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Location> locations = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> tempExit = new HashMap<>();

        locations.put(0, new Location(0, "You are sitting infront of a laptop", tempExit));

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 5);
        locations.put(1, new Location(1, "You are standing at the end of a road infront of a wall", tempExit));;

        tempExit = new HashMap<>();
        tempExit.put("N", 5);
        locations.put(2, new Location(2, "You are at the top of a hill", tempExit));;

        tempExit = new HashMap<>();
        tempExit.put("W", 1);
        locations.put(3, new Location(3, "You are inside a building, a well house by a spring", tempExit));;

        tempExit = new HashMap<>();
        tempExit.put("W", 2);
        tempExit.put("N", 2);
        locations.put(4, new Location(4, "You are in a valley, by a stream", tempExit));;

        tempExit = new HashMap<>();
        tempExit.put("S", 1);
        tempExit.put("W", 2);
        locations.put(5, new Location(5, "You are in a forest", tempExit));;

        Map<String, String> vocab = new HashMap<>();
        vocab.put("QUIT", "Q");
        vocab.put("NORTH", "N");
        vocab.put("SOUTH", "S");
        vocab.put("EAST", "E");
        vocab.put("WEST", "W");



        int loc =1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if(loc==0){
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are :");
            for(String exit : exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length()>1){
                String[] words = direction.split(" ");
                for(String word : words){
                    if(vocab.containsKey(word)){
                        direction =vocab.get(word);
                        break;
                    }
                }
            }
            if(exits.containsKey(direction)) {
                loc = exits.get(direction);
            }else{
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
