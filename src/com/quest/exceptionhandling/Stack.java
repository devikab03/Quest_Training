package com.quest.exceptionhandling;

public class Stack {
    public static void main(String[] args) {
        stackOverFlow(5);
        causeOutOfMemory();

    }

    public static void stackOverFlow(int number) {
        System.out.println(number);
        stackOverFlow(number);
    }

    public static void causeOutOfMemory() {
        int number = 1;
        while (true) {
            number = number * 3;
            int[] numbers = new int[number];
            System.out.println(number);
        }
    }
}
