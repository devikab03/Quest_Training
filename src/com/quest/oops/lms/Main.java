package com.quest.oops.lms;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryImplementation libraryImplementation = new LibraryImplementation();

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1.Add Book:");
            System.out.println("2.Add Member:");
            System.out.println("3.Borrow Book:");
            System.out.println("4.Return Book:");
            System.out.println("5.display all Books:");
            System.out.println("6.display all Members:");
            System.out.println("7.Calculate late fee:");
            System.out.println("8.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    libraryImplementation.addBook();
                    break;
                case 2:
                    libraryImplementation.addMember();
                    break;
                case 3:
                    libraryImplementation.borrowBook();
                    break;
                case 4:
                    libraryImplementation.returnBook();
                    break;
                case 5:
                    libraryImplementation.displayAllBooks();
                    break;
                case 6:
                    libraryImplementation.displayMembers();
                    break;
                case 7:
                    libraryImplementation.lateFees();
                    break;
                case 8:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }

}
