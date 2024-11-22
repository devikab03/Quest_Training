package com.quest.oops.generalconcepts;

public abstract class Vehicle {
    public String name;
    public abstract void move();
    public Vehicle(String name) {
        this.name = name;
        System.out.println("vehicle name: " + name);
    }
   public Vehicle() {
        System.out.println("vehicle constructor");
   }
}
