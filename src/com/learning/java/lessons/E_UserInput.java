package com.learning.java.lessons;

import java.util.Scanner;

public class E_UserInput {
	
	public static void main(String[] args) {
		// Here we will look at getting user input. Don't worry too much about how
		//   everything works in this tutorial as we just need an operational knowledge
		//   of getting user input for your exercises. 
		
		// Also, the way we are gathering user input here is fairly rudimentary 
		//   and therefore not very common in most applications. This is more 
		//   of a learning or debugging kind of tool. At least I've never used 
		//   this outside of school.
		
		// First off we need to create a Scanner object. This is the thing
		//   that's going to let us accept the user's input. Don't worry about
		//   what it's doing too much right now.
		Scanner input = new Scanner(System.in);
		
		// Now we're going to print out a prompt for our user. In this case
		//   we just want them to type something.
		System.out.println("Type something:");
		
		// When the program executes this line, it will actually wait until
		//   the user presses enter in the console below. Then anything 
		//   that was typed before hitting enter is saved in this String
		//   variable.
		String text = input.nextLine();
		
		// Now we're just going to print that back out to the user to 
		//   prove that we correctly captured the input.
		System.out.println("You entered: " + text);
		
		// Now we have to tell the Scanner object that we're done.
		//   Again, don't worry too much about what this is doing.
		input.close();
	}
	
}
