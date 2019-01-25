package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,15);
	    Case theCase = new Case("220B", "Dell", "240", dimensions);
	    Monitor theMonitor = new Monitor("27 Inch Beast", "Acer", 27, new Resolution(2540,1440)); //look at this, if we are just going to pass it to a method we can create an instance of a claass without a variable
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherBoard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"Green"); //this is one way to get at a Composites methods
//        thePC.getMotherBoard().loadPrograms("Windows1.0");
//        thePC.getTheCase().pressPowerButton(); these will no longer work, proved their point

        thePC.powerUp();


        Wall wall1 =new Wall("West");
        Wall wall2 =new Wall("North");
        Wall wall3 =new Wall("East");
        Wall wall4 =new Wall("South");

        Ceiling ceiling = new Ceiling(12,"Green");

        Bed bed = new Bed("Double",12,24,3,1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom  = new Bedroom("Myroom",wall1,wall2,wall3,wall4,ceiling,bed, lamp)
        ;

        bedroom.makeBed();
        bedroom.getLamp();
    }
}
