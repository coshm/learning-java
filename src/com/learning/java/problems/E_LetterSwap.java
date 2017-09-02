package com.learning.java.problems;

import java.util.Scanner;

public class E_LetterSwap {

	/**
	 * In this exercise, the user is asked for a word at least 4 letters
	 *   long. Then the user is asked to enter an index within the first
	 *   half of the word and another index within the second half of
	 *   the word. The program will then swap the two letters at the given 
	 *   indices and print both the original and updated words to the console.
	 *   
	 * Sample Input: Cheeseburger
	 *               0
	 *               9
	 * Sample Output: OriginalWord='Cheeseburger', UpdatedWord='gheeseburCer'
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user for the first word
		System.out.println("Please enter a word with at least 4 letters:");
		
		// Retrieving the user input
		String word = input.nextLine();
		
		// TODO: These variables should not be 0. Assign the correct values to them.
		int lastIndex = 0;
		int midIndex = 0;
		
		// Prompting the user for an index within the length of the word
		System.out.println("Please enter a number from the range [0," + midIndex + "):");
		
		// Retrieving the user input
		int firstIndex = input.nextInt();
		
		// Prompting the user for another index within the length of the word
		System.out.println("Please enter another number from the range [" + (midIndex + 1) + ", " + lastIndex + "):");
		
		// Retrieving the user input
		int secondIndex = input.nextInt();
		
		/**
		 * Put your code here
		 */
		
		// Closing the Scanner
		input.close();
	}

}