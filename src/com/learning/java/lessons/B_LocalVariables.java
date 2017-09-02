package com.learning.java.lessons;

public class B_LocalVariables {
	
	public static void main(String[] args) {
		// Declaring a new variable requires the type of the
		//   variable and the name of the variable. This variable
		//   does not yet contain a value, we've merely claimed the
		//   name (myFirstVariable) and decided what type of value (int)
		//   the variable can hold.
		int myFirstVariable;
		
		// Note, this is a local variable meaning its scope is the method 
		//   in which its declared, in this case the main method. Variable 
		//   names must be unique within their scope so we cannot declare 
		//   a second variable named myFirstVariable within the main method.
		
		// Here we are initializing the variable, which means 
		//   we are assigning it a value for the first time.
		myFirstVariable = 5;
		
		// We can also do both of these at the same time.
		int anotherVariable = 10;
		
		// We can check our work by printing the variables
		//   to the console
		System.out.println(myFirstVariable);
		System.out.println(anotherVariable);
		
		// Once you have instantiated a variable, you can assign
		//   it a new value which will overwrite the old value.
		anotherVariable = 3;
		
		// Print out the value to see it has changed
		System.out.println(anotherVariable);
		
		// You can change the value assigned to a variable as
		//   many times as you wish but you cannot change the type
		//   or name of a variable after it has been declared.
	}
	
}
