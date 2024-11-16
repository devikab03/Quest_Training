package com.quest.oops.inheritance;

public class PracticeMain {
    public static void main(String[] args) {
        Developer developer = new Developer("Ram",21);
        System.out.println("Name:"+developer.name);
        System.out.println("Age:"+developer.age);
        developer.work();

    }
}
