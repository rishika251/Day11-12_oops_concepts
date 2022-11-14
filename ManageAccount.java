package com.bridgelabz.day11;

import java.util.Scanner;

public class ManageAccount {
	private static int accountBalance = 5000000;
	Scanner sc = new Scanner(System.in);

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		ManageAccount.accountBalance = accountBalance;
	}

	public void view() {
		System.out.println("Your account balance is " + accountBalance);

	}

	public void addbalance() {
		System.out.println("\nPlease Enter the Amount to add");
		int input = sc.nextInt();
		accountBalance += input;
		System.out.println("Amount Added Sucessfully");
		System.out.println("\nPress 1 to view account Balance");
		int acc = sc.nextInt();
		if (acc == 1) {
			System.out.println("Your account balance is " + accountBalance);
		}
	}

	public void withdraw() {
		System.out.println("Enter the amount for withdraw");
		int input = sc.nextInt();
		if (input <= 0) {
			System.out.println("Please Enter Valid Amount");
		} else if (input > accountBalance) {
			System.out.println("Insufficient Fund !!");
		} else {
			System.out.println("Please wait ");
			System.out.println(".......");
			System.out.println("Balance withdrawal sucessfully");
			accountBalance -= input;
			System.out.println("\nAvailable Balance is " + accountBalance);
		}
	}
}
