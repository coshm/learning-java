package com.learning.java.problems;

import java.util.Scanner;

public class H_CountingIsFun {

	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("Enter a number between 1 and 10");
		
		// Retrieving the user input
		int number = input.nextInt();
		
		// Loop from 1 to the given number
		for (int i = 1; i <= number; i++) {
			System.out.println(i);
		}
		
		// Close the scanner
		input.close();
	}

}
