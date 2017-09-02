package com.learning.java.problems;

import java.util.Scanner;

public class F_SquareTheNumber {

	/**
	 * In this exercise we ask the user to enter a number
	 *   and we return the square of that number.
	 *   
	 * Sample Input: 5
	 * Sample Output: 25
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("Please enter a number:");
		
		// Retrieving the user input
		int number = input.nextInt();
		
		/**
		 * Put your code here
		 */
		
		// Closing the Scanner
		input.close();
	}
}
