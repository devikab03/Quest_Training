package com.quest.oops.lms;

public class Member implements LibraryOperations {
    private String name;
    private String id;
    private String memberShipType;
    private Book[] borrowedBooks = new Book[10];
    private int borrowedBooksCount = 0;

    public Member(String name, String id, String memberShipType) {
        this.name = name;
        this.id = id;
        this.memberShipType = memberShipType;
        this.borrowedBooksCount = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getMemberShipType() {
        return memberShipType;
    }

    public void setMemberShipType(String memberShipType) {
        this.memberShipType = memberShipType;
    }


    @Override
    public void borrowBook(Book book) {

        if (borrowedBooksCount < borrowedBooks.length) {
            int index = borrowedBooksCount;
            borrowedBooks[index] = book;
            borrowedBooksCount++;
            System.out.println("Book Borrowed by: " + getName());
        } else {
            System.out.println("Not applicable");
        }
    }

    @Override
    public void returnBook(Book book) {
        if (borrowedBooksCount == 0) {
            System.out.println("No books to return");
            return;
        }
        for (int i = 0; i < borrowedBooksCount; i++) {
            if (borrowedBooks[i] != null && borrowedBooks[i].equals(book)) {
                borrowedBooks[i] = null;
                System.out.println("Book Returned by: " + getName());
                borrowedBooksCount--;
                return;
            }
        }
        System.out.println("Not borrowed any books");

    }

    @Override
    public String toString() {
        return "Member{" + "name=" + name + ", id=" + id + ", memberShip=" + +'}';

    }

    public double calculateFees(int noOfDays) {
        double fee = 1.0 * noOfDays;
        return fee;
    }

}

