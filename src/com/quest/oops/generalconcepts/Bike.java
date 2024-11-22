package com.quest.oops.generalconcepts;

public class Bike extends Vehicle implements Human {

    //parameterized constructor
    public Bike(String name) {
        super(name);
    }
    //Non parameterized constructor
   public Bike() {
   }
    @Override
    public void move() {
        System.out.println("Bike is moving");
    }


    @Override
    public String toString() {
        return "Explicitly calling toString()";
    }

    @Override
    public void ride() {
        System.out.println("Rides the bike");
    }
    public static void main(String[] args) {
        Bike bike = new Bike("Hero");
        System.out.println(bike.toString());
        bike.move();
        bike.ride();
    }
}
