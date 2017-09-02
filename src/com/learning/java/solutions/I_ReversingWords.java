package com.learning.java.solutions;

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

		// Use one of our methods to determine if the word that was entered
		//   is a palindrome or not. If it is, the method will return true
		//   which will then satisfy the if statement and the first block will
		//   be executed. If it's not a palindrome, the method will return false
		//   which will fail to satisfy the if statement and the else block will
		//   be executed instead. No point in reversing a word if it's spelled the 
		//   same both ways.
		if (isPalindrome(word)) {
			System.out.println("The word you entered is a palindrome you fucking idiot...");
		} else {
			// Use our other method to actually do the work to reverse our word.
			String reversedWord = reverseString(word);
			System.out.println("OriginalWord='" + word + "', ReversedWord='" + reversedWord + "'");
		}
		
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
		int end = word.length() - 1;
		int middle = word.length() / 2;

		for (int i = 0; i < middle; i++) {
			if (word.charAt(i) != word.charAt(end - i)) {
				return false;
			}
		}

		return true;
	}

	/**
	 * Returns the reverse of given String.
	 * @param string The String to be reversed
	 * @return The reverse of string
	 */
	public static String reverseString(String string) {
		String reversedString = "";

		for (int i = string.length() - 1; i >= 0; i--) {
			reversedString += string.charAt(i);
		}

		return reversedString;
	}

}