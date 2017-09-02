package com.learning.java.problems;

import java.util.Scanner;

public class G_WhatIsTodaysInsanityVideo {

	/**
	 * In this exercise you will need to check what day
	 *   of the week the user input and print out whatever
	 *   is on your calendar for that day. Assume the day
	 *   of the week is capitalized.
	 *     
	 * Sample Input: Tuesday
	 * Sample Output: It's Taco Tuesday!
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("What day of the week is it?");
		
		// Retrieving the user input
		String day = input.nextLine();
		
		/**
		 * Put your code here
		 */
		
		// Close the scanner
		input.close();
	}

}
