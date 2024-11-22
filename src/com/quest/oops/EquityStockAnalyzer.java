package com.quest.oops;

public class EquityStockAnalyzer extends StockAnalyzer {
    String sector;

    public EquityStockAnalyzer(String stockName, String stockSymbol, int[] prices,String sector) {
        super(stockName, stockSymbol, prices);
        this.sector = sector;
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
        int start = 0, end = 0, maxLength = 0, currentlength = 1, temp = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                currentlength++;
                if (currentlength > maxLength) {
                    maxLength = currentlength;
                    start = temp;
                    end = i;
                }
            } else {
                temp = i;
                currentlength = 1;

            }
        }

        return new int[]{start+1,end+1, maxLength};

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
        int [] increasingTrend = findLongestIncreasingTrend();
        System.out.println("Longest Increasing Trend: Start Day " + prices[0] + ", End Day " + prices[1] + ", Length: " + prices[2] + " days");


    }
}
