package com.quest.oops.abstractionpractice;

public class Main  {

    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Animal[] animal={cat, dog};
        for (Animal a:animal){
            a.eat();
            a.sleep();
        }
    }
}
