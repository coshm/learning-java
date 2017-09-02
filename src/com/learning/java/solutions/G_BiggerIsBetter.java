package com.learning.java.solutions;

import java.util.Scanner;

public class G_BiggerIsBetter {

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
		
		// If the first number is bigger, print that one
		if (firstNumber >= secondNumber) {
			System.out.println(firstNumber);
		} else {
			// Otherwise the second number must be bigger so print that one
			System.out.println(secondNumber);
		}
		
		// Close the scanner
		input.close();
	}
	
}
