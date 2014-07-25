package edu.missouri.java;

public class BestTimeToBuyAndSellStockII {
	public static int maxProfit(int[] prices) {
		if (prices == null) {
			return 0;
		}
		int diff = 0;
		int total = 0;
		for (int i = 1; i < prices.length; i++) {
			diff = prices[i] - prices[i - 1];
			if (diff > 0) {
				total = total + diff;
			}
		}
		return total;

	}

	public static void main(String[] args) {
		int[] prices = { 1, 4, 2, 5, 3, 9 };
		System.out.println(maxProfit(prices));
	}
}
