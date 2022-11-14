package com.bridgelabz.day11;

import java.util.Scanner;

public class StockAccount {

	private static int noOfStocks;
	private static String shareName;
	private static int noOfShare;
	private static int sharePrice;
	static int StockPrice;
	static int TotalValue;

	public static int getNoOfStocks() {
		return noOfStocks;
	}

	public static void setNoOfStocks(int noOfStocks) {
		StockAccount.noOfStocks = noOfStocks;
	}

	public static String getShareName() {
		return shareName;
	}

	public static void setShareName(String shareName) {
		StockAccount.shareName = shareName;
	}

	public static int getNoOfShare() {
		return noOfShare;
	}

	public static void setNoOfShare(int noOfShare) {
		StockAccount.noOfShare = noOfShare;
	}

	public static int getSharePrice() {
		return sharePrice;
	}

	public static void setSharePrice(int sharePrice) {
		StockAccount.sharePrice = sharePrice;
	}

	public static int getStockPrice() {
		return StockPrice;
	}

	public static void setStockPrice(int stockPrice) {
		StockPrice = stockPrice;
	}

	public static int getTotalValue() {
		return TotalValue;
	}

	public static void setTotalValue(int totalValue) {
		TotalValue = totalValue;
	}

	public void addShare() {

		// user input for Share details

		Scanner input = new Scanner(System.in);
		System.out.println("\nEnter the Name of Share");
		shareName = input.nextLine();
		System.out.println("Enter the number of Share");
		noOfShare = input.nextInt();
		System.out.println("Enter the price for Share");
		sharePrice = input.nextInt();
		StockPrice = noOfShare * sharePrice;
		System.out.println("\nValue of Stock " + shareName + " is = " + StockPrice);
		input.close();
	

}
}
