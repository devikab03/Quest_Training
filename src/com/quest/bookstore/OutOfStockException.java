package com.quest.bookstore;

public class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }

}
