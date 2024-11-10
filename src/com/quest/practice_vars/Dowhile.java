package com.quest.practice_vars;

public class Dowhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Hello World");
            i++;
        } while (i < 5);

        anotherProgram();
        program();
        prgm();
    }


    static void anotherProgram() {
        int x = 5;
        int sum = 0;
        do {
            sum = sum + x;
            x++;
        } while (x < 10);
        System.out.println("Sum is: " + sum);
    }


    static void program() {
        do {
            System.out.println("Hello World");
        } while (true);  //Infinite loop
    }

    static void prgm() {
        int i = 0;
        do {
            System.out.println(i);//prints the nos upto 10
            i++;
        } while (i <= 10);
    }
}