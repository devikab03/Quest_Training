package com.quest.oops;

public class EquityStockAnalyzer extends StockAnalyzer {
    String sector;

    public EquityStockAnalyzer(String stockName, String stockSymbol, int[] prices) {
        super(stockName, stockSymbol, prices);
    }

    @Override
    public int findMaxPrice() {
        int max = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > max) {
                max = prices[i];
            }
        }
        return max;
    }

    @Override
    public int findMinPrice() {
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
        }
        return min;
    }

    @Override
    public double calculateAveragePrice() {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum += prices[i];
        }
        return (double) sum / prices.length;
    }

    @Override
    public int[] findLongestIncreasingTrend() {
        int start = 0;
        int end = 0;
        int maxlen = 1;
        int temp_start = 0;
        int currentLength = 0;

        for (int i = 0; i < prices.length; i++) {


    }


    @Override
    public void displayAnalysis() {
        System.out.println("Equity Stock Analysis");
        System.out.println("Stock Name: " + stockName);
        System.out.println("Stock Symbol: " + stockSymbol);
        System.out.println("Stock sector: " + sector);
        System.out.println("Highest Price:" + findMaxPrice());
        System.out.println("Lowest Price:" + findMinPrice());
        System.out.println("Average Price:" + calculateAveragePrice());
        System.out.println("Longest Increasing Trend:");


    }
}
