package com.quest.oops.librarymanagement;

public class Book {
    private String bookNo;
    private String title;
    private String author;
    private int publication_year;
    private boolean available;

    public Book(String bookNo, String title, String author, int publication_year) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.publication_year = publication_year;
        this.available = true;
    }

    public void setBookNo(int bookNon) {
        this.bookNo = bookNo;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublication_year(int publication_year) {
        this.publication_year = publication_year;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getBookNo() {
        return bookNo;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublication_year() {
        return publication_year;
    }

    public boolean isAvailable() {
        return available;
    }


}
