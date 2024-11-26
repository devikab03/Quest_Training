package com.quest.bookstore;

import com.quest.file.Stream;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double DISCOUNT_PERCENTAGE = 5.0;
        Scanner sc = new Scanner(System.in);

        Book[] books = new Book[5];
        books[0] = new Book("ABC", "RAM", 10.0, 5);
        books[1] = new Book("DEF", "SHYAM", 25.0, 10);
        books[2] = new Book("GHI", "PRIYA", 35.0, 6);
        books[3] = new SpecialEditionBook("pqr", "disha", 62.0, 5, "X mas special");
        books[4] = new Book("LMK", "MARK", 41.0, 12);

        //displaying the available books
        System.out.println("Available books:");
        for (Book b : books) {
            System.out.println(b);
        }

        //Purchase Book

        System.out.println("Enter the name of the book: ");
        String bookName = sc.nextLine();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equalsIgnoreCase(bookName)) {
                System.out.println("Enter the Quantity");
                int quantity = sc.nextInt();
                try {
                    books[i].productPurchase(quantity);
                } catch (OutOfStockException e) {
                    System.out.println(e.getMessage());
                }
            }
        }

        //discount
        System.out.println("\nDiscount Books:");
        for (Book b : books) {
            double discountedPrice = b.getPrice() * (1 - DISCOUNT_PERCENTAGE / 100);
            System.out.printf("\nTitle:" + b.getTitle() + "\nOriginal Price: " + b.getPrice() +
                    "\nDiscounted Price: " + discountedPrice);
            System.out.println("________________");
        }
//display book titles using lambda expression
        System.out.println("\nBook title with price above 35");
        Arrays.stream(books)
                .filter(book -> book.getPrice() > 35)
                .forEach(book -> System.out.println(book.getTitle()));


    }
}
