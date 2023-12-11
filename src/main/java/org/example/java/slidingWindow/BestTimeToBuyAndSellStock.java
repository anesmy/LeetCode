package org.example.java.slidingWindow;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = prices[0],
                profit = 0;

        for (int price : prices) {
            if (price < buy) {
                buy = price;
            } else if (price - buy > profit){
                profit = price - buy;
            }
        }

        return profit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/