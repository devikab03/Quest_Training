package com.quest.exceptionproblem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidInputException {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        Manager manager = null;
        while (employee == null) {
            try {
                System.out.println("Enter the Employee details:");
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Age");
                int age = sc.nextInt();
                System.out.println("Salary");
                double salary = sc.nextDouble();
                employee=new Employee(name, age, salary);
            } catch (InvalidInputException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter valid data");
            }

            while (manager == null) {
                try {
                    System.out.println("Enter the Manager details:");
                    System.out.println("Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();

                    System.out.println("Age");
                    int age = sc.nextInt();
                    System.out.println("Salary");
                    double salary = sc.nextDouble();
                    System.out.println("TeamSize:");
                    int teamSize1 = sc.nextInt();
                    manager=new Manager(name, age, salary, teamSize1);
                } catch (InvalidInputException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                } catch (InputMismatchException e) {
                    System.out.println("Enter valid data");
                }
                System.out.println("Employee details:");
                employee.display();
                System.out.println("Manager details:");
                manager.display();
            }
        }
    }
}
