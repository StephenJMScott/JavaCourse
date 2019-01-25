package com.company;

import java.sql.SQLOutput;

public class Motherboard {
    private String model;
    private String manufacteur;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacteur, int ramSlots, int cardSlots, String bios) {
        this.model = model;
        this.manufacteur = manufacteur;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios = bios;
    }

    public void loadPrograms(String ProgramName){
        System.out.println("Progam "+ ProgramName + " is now loading");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacteur() {
        return manufacteur;
    }

    public void setManufacteur(String manufacteur) {
        this.manufacteur = manufacteur;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public void setCardSlots(int cardSlots) {
        this.cardSlots = cardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }
}
