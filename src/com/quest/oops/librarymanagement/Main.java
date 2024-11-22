package com.quest.oops.librarymanagement;

import java.lang.reflect.Member;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LibraryClass library = new Operations();

        System.out.println("Library Management System");
        while (true) {
            System.out.println("\n1.Add Book");
            System.out.println("\n2.Add Member");
            System.out.println("\n3.Searching a Book");
            System.out.println("\n4.Borrow a Book");
            System.out.println("\n5.Return a Book");
            System.out.println("\n6.Display Available Books");
            System.out.println("\n7.Display All Members");
            System.out.println("\n8.Exit");
            System.out.println("\nEnter your choice");
            int choice = sc.nextInt();
            LibraryMemberClass member = null;
            switch (choice) {
                case 1:
                    System.out.println("Add a Book");
                    System.out.println("Enter BookNo:");
                    String bookNo = sc.next();
                    System.out.println("Enter Title:");
                    String title = sc.next();
                    System.out.println("Enter Author:");
                    String author = sc.next();
                    System.out.println("Enter Year:");
                    int year = sc.nextInt();
                    Book book = new Book(bookNo, title, author, year);
                    library.addBook(book);
                    break;
                case 2:
                    System.out.println("Add a Member");
                    System.out.print("Enter Member ID: ");
                    String memberId = sc.next();
                    System.out.print("Enter Member Name: ");
                    String memberName = sc.next();
                    System.out.print("Enter Member Address: ");
                    String memberAddress = sc.next();
                    member = new LibraryMemberClass(memberId, memberName, memberAddress);
                    library.addMember(member);
                    break;
                case 3:
                    System.out.println("Searching a book");
                    System.out.println("Enter BookNo:");
                    String bookNo2 = sc.next();
                    library.searchBook(bookNo2);
                    break;

                case 4:
                    System.out.println("Borrow a Book");
                    System.out.println("Enter the Member ID: ");
                    String memberId1 = sc.next();
                    System.out.println("Enter BookNo to Borrow:");
                    String bookNo3 = sc.next();
                    Book b = library.searchBook(bookNo3);
                    library.borrowBook(member, b);
                    break;
                case 5:
                    System.out.println("Return a Book");
                    System.out.println("Enter Member ID:");
                    String memberId2 = sc.next();
                    System.out.println("Enter BookNo to Return:");
                    String bookNo4 = sc.next();
                    Book b1 = library.searchBook(bookNo4);
                    library.returnBook(member, b1);
                    break;

                case 6:
                    System.out.println("Display Available Books");
                    library.displayAvailableBook();
                    break;
                case 7:
                    System.out.println("Display All Members");
                    library.displayAllMembers();
                    break;
                case 8:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice");


            }
        }
    }

}
