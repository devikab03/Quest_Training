package com.quest.oops.inheritance;

public class Developer extends Employee{
    public Developer(String name, int age ) {
        super(name, age);

    }
    @Override
    public void work() {
        super.work();
        System.out.println("Developing the app");
    }

}
