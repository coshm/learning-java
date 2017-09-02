package com.learning.java.problems;

import java.util.Scanner;

public class I_ReversingWords {

	/**
	 * This program will prompt the user for a word and return the 
	 *   reverse of it. If the word is a palindrome, return a message
	 *   notifying the user instead.
	 *   
	 *   Sample Input: Godzirra
	 *   Sample Output: arrizdoG
	 *   
	 *   Sample Input: racecar
	 *   Sample Output: You entered a palindrome.
	 */
	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user for a word
		System.out.println("Please enter the word you want reversed:");
		
		// Retrieving the user input
		String word = input.nextLine();

		/*
		 * Your code here
		 */
		
		// Closing the Scanner
		input.close();
	}

	/**
	 * Checks to see if the given word is a palindrome, meaning it is
	 *   spelled the same way forwards and backwards. 
	 * @param word The word we are checking
	 * returns boolean indicating if the word is a palindrome.
	 */
	public static boolean isPalindrome(String word) {
		// Your code here
	}

	/**
	 * Returns the reverse of given String.
	 * @param string The String to be reversed
	 * @return The reverse of string
	 */
	public static String reverseString(String string) {
		// Your code here
	}

}