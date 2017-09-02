package com.learning.java.solutions;

import java.util.Scanner;

public class E_LetterSwap {

	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user for the first word
		System.out.println("Please enter a word with at least 4 letters:");
		
		// Retrieving the user input
		String word = input.nextLine();
		int lastIndex = word.length() - 1;
		int midIndex = lastIndex / 2;
		
		// Prompting the user for an index within the length of the word
		System.out.println("Please enter a number from the range [0," + midIndex + "):");
		
		// Retrieving the user input
		int firstIndex = input.nextInt();
		
		// Prompting the user for another index within the length of the word
		System.out.println("Please enter another number from the range [" + (midIndex + 1) + ", " + lastIndex + "):");
		
		// Retrieving the user input
		int secondIndex = input.nextInt();

		// Get the chars at the index for each word
		char firstLetter = word.charAt(firstIndex);
		char secondLetter = word.charAt(secondIndex);
		
		// Split the word into sections
		String beginningSubstring = word.substring(0, firstIndex);
		String middleSubstring = word.substring(firstIndex + 1, secondIndex);
		String endingSubstring = word.substring(secondIndex + 1, lastIndex + 1);

		// Assemble the new word
		String updatedWord = beginningSubstring + secondLetter + middleSubstring + firstLetter + endingSubstring;

		// Print the words
		System.out.println("OriginalWord='" + word + "', UpdatedWord='" + updatedWord + "'");
		
		// Closing the Scanner
		input.close();
	}

}