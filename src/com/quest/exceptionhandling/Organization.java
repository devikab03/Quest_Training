package com.quest.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Organization extends Student {
    private String nameOfOrganization;


    public Organization(int id, String name,int[]marks) {
        super(id, name,marks);
    }

    public static void main(String[] args){

        Organization organization = new Organization(1, "Abc",new int []{50,40,60,80,15});
        System.out.println("Student_id:" + organization.getId());
        System.out.println("Name:" + organization.getName());
        try {
            System.out.println("Name of Organization:" + organization.nameOfOrganization.length());
        } catch (NullPointerException e) {
            System.out.println("Value is not assigned");
        }
        try {
            display();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input ");
        }
        try{
            organization.element(7);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No element is present at this index ");
        }
//        finally {
//            System.exit(0);//it will stops the rest of the execution
//            System.out.println("Execution completes");
//        }

    }

    static void display()throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the id:");
            int id = sc.nextInt();
            System.out.println("Id is:"+id);
        }



}



