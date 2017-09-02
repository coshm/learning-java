package com.learning.java.problems;

import java.util.Scanner;

public class G_BiggerIsBetter {

	/**
	 * In this exercise you simply need to print whichever number
	 *   is bigger. If both numbers are equal then it doesn't matter
	 *   which number you print.
	 *   
	 * Sample Input: 27
	 *				 18
	 * Sample Output: 27
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("Please enter a whole number:");
		
		// Retrieving the user input
		int firstNumber = input.nextInt();
		
		// Prompting the user
		System.out.println("Please enter another whole number:");
		
		// Retrieving the user input
		int secondNumber = input.nextInt();
		
		/**
		 * Put your code here
		 */
		
		// Close the scanner
		input.close();
	}

}
