package com.learning.java.problems;

import java.util.Scanner;

public class E_Greeting {

	/**
	 * In this exercise, use the user's name to print out
	 *   a personalized greeting.
	 *   
	 * Sample Input: "Kyle"
	 * Sample Output: "Whatup Kyle"
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("Please enter your name:");
		
		// Retrieving the user input
		String usersName = input.nextLine();
		
		/**
		 * Put your code here
		 */
		
		// Closing the Scanner
		input.close();
	}
}
