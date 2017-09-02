package com.learning.java.problems;

import java.util.Scanner;

public class F_HotDogs {

	/**
	 * In this exercise we will ask the user how many hot dogs
	 *   they ate each day this week. We will then calculate the
	 *   total number of hot dogs they ate that week and the 
	 *   average number of hot dogs they ate per day.
	 *   
	 * Sample Input: 2
	 * 				 3
	 * 				 2
	 * 				 0
	 * 				 1
	 * 				 7
	 * 				 3
	 * Sample Output: Total: 18, Average: 2.57142
	 * 
	 * HINT: Review the bottom of BasicNumberOperations.java
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Monday?");
		
		// Retrieving the user input
		int mon = input.nextInt();
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Tuesday?");
		
		// Retrieving the user input
		int tue = input.nextInt();
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Wednesday?");
		
		// Retrieving the user input
		int wed = input.nextInt();
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Thursday?");
		
		// Retrieving the user input
		int thu = input.nextInt();
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Friday?");
		
		// Retrieving the user input
		int fri = input.nextInt();
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Saturday?");
		
		// Retrieving the user input
		int sat = input.nextInt();
		
		// Prompting the user
		System.out.println("How many hot dogs did you eat on Sunday?");
		
		// Retrieving the user input
		int sun = input.nextInt();
		
		/**
		 * Put your code here
		 */

		// Closing the Scanner
		input.close();
	}

}
