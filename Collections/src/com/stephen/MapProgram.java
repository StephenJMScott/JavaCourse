package com.stephen;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "A compiled high level, object oriented, platform independent language");
        languages.put("Python", "My first language");
        languages.put("Algol", "No idea!");
        System.out.println(languages.put("Basic", "An olllllld code"));
        System.out.println(languages.put("Lisp", "Therein lie madness"));

//        System.out.println(languages.get("Java"));

        System.out.println(languages.put("Java", "This course is about Java"));
        System.out.println(languages.get("Java"));

//        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")){
            System.out.println("Java already in map");

        }else{
            languages.put("Java", "This course is about Java");
        }
        System.out.println("==================================");


        for (String key : languages.keySet()) {
            System.out.println(key + " : "+ languages.get(key));
        }

        languages.remove("Lisp");
        if (languages.remove("Algol", "some incorrect stuff")) {
            System.out.println("Algol removed");
        }else{
            System.out.println("Key/Value pair not found");
        }

        System.out.println("=======================");
        for (String key : languages.keySet()) {
            System.out.println(key + " : "+ languages.get(key));
        }

        System.out.println(languages.replace("Lisp", "Some stuff about lisp"));
        System.out.println(languages.replace("Java", "We work in Java"));

        if (languages.replace("Java", "We work in Java", "We still work in Java")) {
            System.out.println("Java updated");

        }else{
            System.out.println("Not successful");
        }

        System.out.println(languages.get("Java"));
    }
}
