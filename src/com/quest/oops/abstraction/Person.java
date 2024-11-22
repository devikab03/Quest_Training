package com.quest.oops.abstraction;

public class Person {
    protected  String name="RON";

    public class Human{
        Person person = new Person();

            void displayName(){
                System.out.println(name);
            }
        }
        String getName(){
        return name;
        }
    public static void main(String[] args) {
     Person p = new Person();
     Person.Human h=p.new Human();
     h.displayName();
        System.out.println(p.getName());
    }
}


