package com.quest.oops.librarymanagement;

public abstract class LibraryClass {
    public abstract void addBook(Book book);

    public abstract void addMember(LibraryMemberClass member);

    public abstract Book searchBook(String search);

    public abstract void displayAvailableBook();

    public abstract void displayAllMembers();

    public abstract void borrowBook(LibraryMemberClass member, Book book);

    public abstract void returnBook(LibraryMemberClass member, Book book);



}
