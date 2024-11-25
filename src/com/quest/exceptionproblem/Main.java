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
                new Employee(name, age, salary);
            } catch (InvalidInputException | IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (InputMismatchException e) {
                System.out.println("Enter valid data");
            }

            while (manager == null) {
                try {
                    System.out.println("Enter the Manager details:");
                    System.out.println("Name: ");
                    String name1 = sc.nextLine();
                    System.out.println("Age");
                    int age1 = sc.nextInt();
                    System.out.println("Salary");
                    double salary1 = sc.nextDouble();
                    System.out.println("TeamSize:");
                    int teamSize1 = sc.nextInt();
                    new Manager(name1, age1, salary1, teamSize1);
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
