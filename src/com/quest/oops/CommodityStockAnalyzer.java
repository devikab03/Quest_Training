package com.quest.oops;

public class CommodityStockAnalyzer extends StockAnalyzer{
    String commodityType;

    public CommodityStockAnalyzer(String CommodityName,String commodityType, String commoditySymbol, int[] prices2) {
        super(CommodityName,commoditySymbol,prices2);
        this.commodityType = commodityType;
    }


    @Override
    public int findMaxPrice() {
       int maxPrice = prices[0];
       for (int i = 1; i < prices.length; i++) {
           if (prices[i] > maxPrice) {
               maxPrice = prices[i];
           }
       }
       return maxPrice;
    }

    @Override
    public int findMinPrice() {
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
        }
        return min;
    }

    @Override
    public double calculateAveragePrice() {
       int sum=0;
       for(int i=0;i<prices.length;i++){
           sum+=prices[i];
       }
       return (double) sum /prices.length;
    }


    @Override
    public int[] findLongestIncreasingTrend() {
        return new int[0];
    }

    @Override
    public void displayAnalysis() {
        System.out.println("Equity Stock Analysis");
        System.out.println("Stock Name: "+stockName);
        System.out.println("Stock Symbol: "+stockSymbol);
        System.out.println("Commodity Type: "+commodityType);
        System.out.println("Highest Price:"+findMaxPrice());
        System.out.println("Lowest Price:"+findMinPrice());
        System.out.println("Average Price:"+calculateAveragePrice());
        System.out.println("Longest Increasing Trend:");

    }
}
