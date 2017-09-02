package com.learning.java.solutions;

import java.util.Scanner;

public class G_WhatIsTodaysInsanityVideo {

	public static void main(String[] args) {
		// Creating a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompting the user
		System.out.println("What day of the week is it?");
		
		// Retrieving the user input
		String day = input.nextLine();
		
		// If the first number is bigger, print that one
		if ("Sunday" == day) {
			System.out.println("It's God's day or rest or some shit.");
		} else if ("Monday" == day) {
			System.out.println("Everything's Terrible!");
		} else if ("Tuesday" == day) {
			System.out.println("It's Taco Tuesday!");
		} else if ("Wednesday" == day) {
			System.out.println("It's Hump Day!");
		} else if ("Thursday" == day) {
			System.out.println("It's Thirsty Thirsday!");
		} else if ("Friday" == day) {
			System.out.println("It's Get Drunk at Full Price Day!");
		} else if ("Saturday" == day) {
			System.out.println("It's Saturday!");
		} else {
			System.out.println("That's not a real day of the week... So I guess do whatever you want?");
		}
		
		// Close the scanner
		input.close();
	}
}
