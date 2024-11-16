package com.quest.practice_vars;

import java.util.Scanner;

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking  user input for  no:of products
        int n;
        while (true) {
            System.out.print("Enter the number of Products (between 1 and 100): ");
            n = scanner.nextInt();

            // Validate that the number of products is between 1 and 100
            if (n >= 1 && n <= 100) {
                break; // Exit the loop if a valid number is entered
            } else {
                System.out.println("Invalid number. Please enter a number between 1 and 100.");
            }
        }
        // Define arrays for the products, inventory, and quantities sold
        String[] products = new String[n];
        int[][] inventory = new int[n][2]; //n =no:products ; size 2 means each product have quantity and price
        int[] quantitiesSold = new int[n];

        scanner.nextLine();
        //Passing products to string array
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of product " + (i + 1) + ": ");
            products[i] = scanner.nextLine();

            System.out.println("Enter the stock quantity for " + products[i] + ": ");
            inventory[i][0] = scanner.nextInt();//rows`changing columns remains constant
            scanner.nextLine();
            // Validate the price to be greater than 0
            while (true) {
                System.out.println("Enter the price for " + products[i] + ": ");
                int price = scanner.nextInt();
                scanner.nextLine();
                if (price <= 0) {
                    System.out.println("Invalid price. Please enter a positive number");
                } else {
                    inventory[i][1] = price;
                    break;
                }
            }
            //sold quantity
            System.out.println("Enter the quantity sold for " + products[i] + ": ");
            quantitiesSold[i] = scanner.nextInt();
            scanner.nextLine();

        }
        //call a method that give the sales report
        generateSalesReport(products, quantitiesSold, inventory);
        //method for checking the availability of stocks
        inventoryShortageCheck(products, quantitiesSold, inventory);
        //method for restocking products
        restockProduct(products, quantitiesSold, inventory);
        //method for sales summary printing
        salesSummary(products, quantitiesSold, inventory);
        //method for tracking out of stock element
        outOfStock(products, quantitiesSold, inventory);

    }

    // Task 1: Generate Sales Report
    private static void generateSalesReport(String[] products, int[] quantitiesSold, int[][] inventory) {
        double totalRevenue = 0;
        int i = 0;
        //traversing to products array
        for (i = 0; i < products.length; i++) {
            int revenue = quantitiesSold[i] * inventory[i][1];//multiply sold quantity and price
            totalRevenue += revenue;
            System.out.println(products[i] + " sold " + quantitiesSold[i] + " units,Revenue:$" + revenue);
        }
        System.out.println("TotalRevenue generated from all products:" + totalRevenue);//Prints the totalRevenue
    }

    //Task 2: Inventory Shortage Check
    private static void inventoryShortageCheck(String[] products, int[] quantitiesSold, int[][] inventory) {
        System.out.println("Shortage check");
        for (int i = 0; i < products.length; i++) {
            int quantitySold = quantitiesSold[i];
            int stock = inventory[i][0];

            if (quantitySold > stock) {
                System.out.println("Warning: Insufficient stock for " + products[i] + ". Sold " + quantitiesSold[i] + " units, but only " + inventory[i][0] + " units were available.");
            } else
                System.out.println("No shortage is reported");
        }
    }

    //Restock Inventory
    private static void restockProduct(String[] products, int[] quantitiesSold, int[][] inventory) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Restocking  product");
        System.out.print("\nEnter the name of the product to restock: ");
        String productToRestock = scanner.nextLine();
        boolean productFound = false; // Flag to track if the product is found
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(productToRestock)) {
                System.out.printf("\nCurrent stock for %s: %d units.", products[i], inventory[i][0]); // Print current stock
                System.out.println("Enter the restock amount: ");
                int restockAmount = scanner.nextInt();

                inventory[i][0] += restockAmount; // Update the stock
                System.out.printf("\nRestocking %s with %d units.\nUpdated stock for %s: %d units.",
                        productToRestock, restockAmount, productToRestock, inventory[i][0]);
                productFound = true; // Product found, set flag to true
                break;
            }
        }
        // Print only if the product is not found
        if (!productFound) {
            System.out.println("Product not found for restocking.");
        }

    }

    //Generate Sales Summary Based on Price Range
    private static void salesSummary(String[] products, int[] quantitiesSold, int[][] inventory) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.println("Enter the maximum price: ");
        double maxPrice = scanner.nextDouble();
        System.out.println("Products in the price range $" + minPrice + "to $" + maxPrice);
        boolean productFound = false; // Flag to check if any products are in the price range
        for (int i = 0; i < products.length; i++) {
            double price = inventory[i][1];
            if (price >= minPrice && price <= maxPrice) {
                double revenue = quantitiesSold[i] * price;
                System.out.println(products[i] + ": Revenue = $" + revenue);
                productFound = true;//Set true it product has been found
                break;
            }
        }
// Print message if no products were found
        if (!productFound) {
            System.out.println("No products found in the price range $" + minPrice + " to $" + maxPrice);
        }

    }

    //Track Out-of-Stock Products
    private static void outOfStock(String[] products, int[] quantitiesSold, int[][] inventory) {
        System.out.println("Products out of stock:");
        boolean outOfStockFound = false; // Flag to track if any product is out of stock
        for (int i = 0; i < products.length; i++) {
            if (inventory[i][0] == 0) {
                System.out.println(products[i]);
                outOfStockFound = true;
            }
        }
        if (!outOfStockFound) {
            System.out.println("Product not found.");
        }
    }


}



