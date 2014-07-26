package edu.missouri.java;

public class BestTimeToBuyAndSellStockIII {
	public static void main(String[] args) {
		int[] prices = { 1,2};
		System.out.println(maxProfit(prices));
	}

	public static int maxProfit(int[] prices) {
		if (prices.length==0) {
			return 0;
		}
		int minA = prices[0];
		int[] profitA = new int[prices.length];
		profitA[0] = 0;
		for (int i = 1; i < prices.length; i++) {
			minA = Math.min(minA, prices[i]);
			profitA[i] = Math.max(profitA[i - 1], prices[i] - minA);
		}

		int maxB = prices[prices.length-1];
		int[] profitB = new int[prices.length];
		profitB[prices.length - 1] = 0;
		for (int i = prices.length - 2; i >= 0; i--) {
			maxB = Math.max(maxB, prices[i]);
			profitB[i] = Math.max(profitB[i + 1], maxB - prices[i]);
		}

		int sum = 0;
		for (int i = 0; i < prices.length; i++) {
			sum = Math.max(sum, profitA[i] + profitB[i]);
		}
		return sum;
	}
}
