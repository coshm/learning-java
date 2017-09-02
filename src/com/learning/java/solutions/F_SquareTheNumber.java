package com.learning.java.solutions;

import java.util.Scanner;

public class F_SquareTheNumber {

	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("Please enter a number:");
		
		// Retrieving the user input
		int number = input.nextInt();
		
		// Square the number
		int squaredNumber = number * number;
		
		// Output the result
		System.out.println(squaredNumber);
		
		// Closing the Scanner
		input.close();
	}
	
}
