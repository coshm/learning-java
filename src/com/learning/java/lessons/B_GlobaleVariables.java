package com.learning.java.lessons;

public class B_GlobaleVariables {

	// A global variable is one which is declared within a class
	//   but outside any methods. Generally, these are all put at
	//   the top of the file before all of the methods so they are
	//   easier to find. Ignore the static keyword for now.
	public static int myGlobalVariable = 5;
	public static int myOtherGlobalVariable = 10;
	
	public static void main(String[] args) {
		// Since global variables are declared at the class level, outside
		//   any methods, their scope spans the entire class. This means
		//   we can reference these variables from any method. 
		System.out.println("MyGlobalVariable=" + myGlobalVariable);
		
		// Just like a local variable, we can assign a new value to a 
		//   global variable.
		myGlobalVariable = 2 * myOtherGlobalVariable;
		
	}
}
