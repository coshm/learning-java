package com.learning.java.problems;

import java.util.Scanner;

public class F_TaxCalculator {

	/**
	 * In this exercise we are going to calculate the cost
	 *   of an item with tax. The user will supply the base
	 *   price and we will return the price of the item plus
	 *   tax at 7.5%. Don't worry about rounding.
	 * 
	 * Sample Input: 2.00
	 * Sample Output: 2.15
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("How much does the item cost?");
		
		// Retrieving the user input
		double cost = input.nextDouble();
		
		/**
		 * Put your code here
		 */
		
		// Closing the Scanner
		input.close();
	}
}
