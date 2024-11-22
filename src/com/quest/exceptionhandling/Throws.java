package com.quest.exceptionhandling;

public class Throws {
    static void process() throws ArithmeticException {
        System.out.println(50 / 0);
    }

    public static void main(String[] args) {
        try {
            process();
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
    }

}

