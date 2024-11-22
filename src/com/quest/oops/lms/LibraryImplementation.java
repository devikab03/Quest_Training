package com.quest.oops.lms;

import java.util.Scanner;

public class LibraryImplementation {
    Scanner sc = new Scanner(System.in);

    private Book[] bookArray = new Book[10];
    private Member[] memberArray = new Member[10];
    private int bookCount = 0;
    private int memberCount = 0;

    public void addBook() {
        if (bookCount < bookArray.length) {
            System.out.println("Enter the Isbn:");
            String isbn = sc.nextLine();
            System.out.println("Enter the Title:");
            String title = sc.nextLine();
            System.out.println("Enter the Author:");
            String author = sc.nextLine();
            bookArray[bookCount] = new Book(isbn, title, author);
            bookCount++;
            System.out.println("Book Added");
        } else {
            System.out.println("Not added");

        }
    }

    public void addMember() {
        if (memberCount < memberArray.length) {
            System.out.println("Enter the Name:");
            String name = sc.nextLine();
            System.out.println("Enter the Id:");
            String id = sc.nextLine();
            System.out.println("Enter the Membership Type(Regular/Premium):");
            String memberType = sc.nextLine();
            if (memberType.equals("Regular")) {
                memberArray[memberCount] = new Member(name, id, memberType);
                memberCount++;
                System.out.println("Regular Member Added");
            } else {
                memberArray[memberCount] = new PremiumMember(name, id, memberType);
                memberCount++;
                System.out.println("Premium Member Added");
            }

        }
    }

    public void borrowBook() {
        Member borrowedMember = findMember();
        Book borrowedBook = findBook();
        if (borrowedMember != null && borrowedBook != null) {
            borrowedMember.borrowBook(borrowedBook);
        } else {
            System.out.println("Book not found");
        }
    }

    public void returnBook() {
        Member returnMember = findMember();
        Book returnBook = findBook();
        if (returnMember != null && returnBook != null) {
            returnMember.returnBook(returnBook);
        } else {
            System.out.println("INot Avaliable");
        }
    }

    public Member findMember() {
        System.out.println("Enter member id:");
        String memberId = sc.nextLine();
        for (Member member : memberArray) {
            if (memberId.equals(member.getId())) {
                return member;
            }
        }
        System.out.println("Member not found");
        return null;

    }

    public Book findBook() {
        System.out.println("Enter book id:");
        String bookId = sc.nextLine();
        for (Book book : bookArray) {
            if (bookId.equals(book.getIsbn())) {
                return book;
            }
        }
        System.out.println("Book not found");
        return null;
    }

    public void displayAllBooks() {
        for (Book book : bookArray) {
            if (book != null) {
                System.out.println(book);
            }
        }
    }

    public void displayMembers() {
        for (Member member : memberArray) {
            if (member != null) {
                System.out.println(member);
            }
        }
    }

    public void lateFees() {
        Member feemember = findMember();
        if (feemember != null) {
            System.out.println("Enter no:of days Late");
            int noOfDays = sc.nextInt();
            double fees = feemember.calculateFees(noOfDays);
            System.out.println("Fees: " + fees);
        } else {
            System.out.println("Invalid");
        }

    }

}
