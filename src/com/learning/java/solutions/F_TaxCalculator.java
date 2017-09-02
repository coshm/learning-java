package com.learning.java.solutions;

import java.util.Scanner;

public class F_TaxCalculator {

	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("How much does the item cost?");
		
		// Retrieving the user input
		double cost = input.nextDouble();
		
		// Tax is 7.5%
		double costWithTax = cost * 1.075;
		
		// Output the result
		System.out.println("The cost of the item with tax is $" + costWithTax);
		
		// Closing the Scanner
		input.close();
	}
}
