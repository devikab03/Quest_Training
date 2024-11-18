package com.quest.oops;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the details of Equity Stock:");
        System.out.println(" Stock Name:");
        String stockName = sc.nextLine();
        System.out.println("Stock Symbol:");
        String stockSymbol = sc.nextLine();
        System.out.println("Stock Sector:");
        String stockSector = sc.nextLine();
        System.out.println("Number of Days:");
        int numberOfDays = sc.nextInt();
        System.out.println("Enter prices:");
        int[] prices = new int[numberOfDays];
        for (int i = 0; i < numberOfDays; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Enter CommodityStock Analzer");
        System.out.println("Commodity Name:");
        String commodityName = sc.nextLine();
        System.out.println("Commodity Type:");
        String commodityType = sc.nextLine();
        System.out.println("Stock symbol:");
        String commoditySymbol = sc.nextLine();
        System.out.println("Number of Days:");
        int numberOfDays2 = sc.nextInt();
        System.out.println("Enter prices:");
        int[] prices2 = new int[numberOfDays2];
        for (int i = 0; i < numberOfDays2; i++) {
            prices2[i] = sc.nextInt();
        }

        StockAnalyzer stockAnalyzer=new EquityStockAnalyzer(stockName,stockSymbol,prices);
        StockAnalyzer stockAnalyzer1=new CommodityStockAnalyzer(commodityName,commodityType,commoditySymbol,prices2);
        stockAnalyzer.displayAnalysis();
        stockAnalyzer1.displayAnalysis();
        double avg=stockAnalyzer.calculateAveragePrice();
        double avg1=stockAnalyzer1.calculateAveragePrice();
        if(avg>avg1){
            System.out.println("Highest avg price:"+avg);
        }
    }
}
