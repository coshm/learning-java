package com.learning.java.solutions;

import java.util.Scanner;

public class E_Greeting {

	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("Please enter your name:");
		
		// Retrieving the user input
		String usersName = input.nextLine();
		
		// Form the greeting
		String greeting = "Hello " + usersName;
		
		// Output the greeting
		System.out.println(greeting);
		
		// Closing the Scanner
		input.close();
	}
	
}
