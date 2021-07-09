package com.stradtman.objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("We are making a new pez dispenser!");
        System.out.printf("There are %d allowed in every pez dispenser. %n", PezDispenser.MAX_PEZ);
        PezDispenser dispenser = new PezDispenser("Yoda");
        System.out.printf("The dispenser is %s %n", dispenser.getCharacterName());
        if(dispenser.isEmpty()) {
            System.out.println("Dispenser is empty");
        }
        System.out.println("Filling the dispenser with PEZ...");
        dispenser.fill();
        if(!dispenser.isEmpty()) {
            System.out.println("Dispenser is full");
        }
        while(dispenser.dispense()) {
            System.out.println("Chomp!");
        }
        if(dispenser.isEmpty()) {
            System.out.println("Ate all the PEZ");
        }
        dispenser.fill(4);
        dispenser.fill(2);
        while(dispenser.dispense()) {
            System.out.println("Chomp!!!");
        }
        try {
            dispenser.fill(400);
            System.out.println("This will never happen");
        } catch (IllegalArgumentException iae) {
            System.out.printf("There was an error:  %s", iae.getMessage());
        }
    }
}
