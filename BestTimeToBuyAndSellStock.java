package edu.missouri.java;

public class BestTimeToBuyAndSellStock {
	public static int maxProfit(int[] prices) {
		if(prices.length==0){
			return 0;
		}
		int diff = Integer.MIN_VALUE;
		int minVal=prices[0];
		int temp=0;
		for (int i = 0; i < prices.length; i++) {
			temp=prices[i]-minVal;
			if(temp>diff){
				diff=temp;
			}
			if(prices[i]<minVal){
				minVal=prices[i];
			}
			
		}
		return diff;

	}

	public static void main(String[] args) {
		int[] prices = {  };
		System.out.println(maxProfit(prices));
	}
}
