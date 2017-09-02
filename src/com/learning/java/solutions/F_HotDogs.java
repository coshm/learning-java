package com.learning.java.solutions;

import java.util.Scanner;

public class F_HotDogs {

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
		
		// Sum up all the hot dogs you ate this week
		int total = mon + tue + wed + thu + fri + sat + sun;
		
		// Calculate how many hot dogs you ate each day on average
		double avg = total / 7.0;
		
		// Print out the total and the daily average
		System.out.println("Week Total: " + total + " Daily Average: " + avg);

		// Closing the Scanner
		input.close();
	}
	
}
