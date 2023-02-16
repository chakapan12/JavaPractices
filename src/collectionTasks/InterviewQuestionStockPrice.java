package collectionTasks;

public class InterviewQuestionStockPrice {

	public static void main(String[] args) {
		/*
Interview Question - Stock price

You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock. We are only permitted to complete only one transaction(buy one or sell one share of the stock) per day.

Write a Java function to find the maximum profit.

Note:

A stock can't be sold before buying

		 */
		
		int[] input = {15, 3, 3, 1, 8, 11, 12, 11, 1};	
		System.out.println("Max Profit = " + maxProfit(input));
		findDateBuySell(input);
		
		int[] input1 = {100, 20, 35, 37, 59, 30, 58};
		System.out.println("Max Profit = " + maxProfit(input1));
		findDateBuySell(input1);

		

	}
	
	public static int maxProfit(int[] input) {
		int maxProfit = 0;
		int profit = 0;
		for(int i = 0; i < input.length; i++) {		
			for(int j = i + 1; j < input.length - 1; j++) {		
				profit = input[j] - input[i];
				if(maxProfit < profit) {
					maxProfit = profit;
				}
			}
		}
		return maxProfit;
	}
	
	public static void findDateBuySell(int[] input) {
		int profit = 0;
		for(int i = 0; i < input.length; i++) {		
			for(int j = i + 1; j < input.length - 1; j++) {	
				profit = input[j] - input[i];
				if(profit == maxProfit(input)) {
					System.out.println("Buy on day " + (i + 1) + " (price = " + input[i] + ")" +
				" and sell on day " + (j + 1) + " (price = " + input[j] + ")" + " profit = " + 
				input[j] + " - " + input[i] + " = " + maxProfit(input));
				}
			}
		}
	}

}
