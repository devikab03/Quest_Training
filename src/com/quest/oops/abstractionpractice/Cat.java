package com.quest.oops.abstractionpractice;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping");

    }
}
