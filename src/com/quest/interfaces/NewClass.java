package com.quest.interfaces;

public class NewClass extends Vehicle2 implements Vehicle {
    @Override
    public void wheels() {
        System.out.println("Wheels are present");
    }

    @Override
    public void Engine() {
        System.out.println("Engine is present");
    }

    public static void main(String[] args) {
        NewClass newClass = new NewClass();
        newClass.wheels();
        newClass.Engine();
    }

    @Override
    void engine() {

    }

    @Override
    void lights() {

    }
}
