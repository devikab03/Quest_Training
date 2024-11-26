package com.quest.bookstore;

public class SpecialEditionBook extends Book {
    private String specialFeature;

    public SpecialEditionBook(String title, String author, double price, int stock, String specialFeature) {
        super(title, author, price, stock);
        this.specialFeature = specialFeature;

    }

    @Override
    public String toString() {
        return super.toString() +
                "specialFeature='" + specialFeature + '\'' +
                '}';
    }
}
