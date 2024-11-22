package com.quest.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

    static String name;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //arithmetic exception

        System.out.println("Enter the number 1:");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = sc.nextInt();
        try {
            System.out.println("Divide:" + num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        } catch (InputMismatchException e) {
            System.out.println("Invalid input");
        }


//Array Index out of bound exception
        int[] a = {10, 2, 3, 5, 6};
        try {
            System.out.println("Enter an array index");
            int num4 = sc.nextInt();
            System.out.println(a[num4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }

        //Null pointer exception

        try {
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Value is not assigned");
        }
//InputMismatchException

        try{
            System.out.println("Enter an integer value");
            int num3 = sc.nextInt();
            System.out.println("Number is:"+num3);
        }catch (InputMismatchException e){
            System.out.println("Wrong input. Please try again");
        }

        //finally block
        finally {
            System.out.println("Exception handling complete");
        }

    }
}
