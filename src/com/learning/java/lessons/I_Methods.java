package com.learning.java.lessons;

public class I_Methods {

	public static void main(String[] args) {
		// Once you start combining conditional statements, loops, and other basic operations,
		//   your code can start to get quite complicated and hard to read. Ideally, your code
		//   will have high cohesion and low coupling. Basically this means each class and 
		//   each method should have a single and distinct responsibility (high cohesion)
		//   and should be as independent of other classes and methods as possible (low coupling).
		//   Another way of framing this is with the one-responsibility rule. Each class and 
		//   method should have a single responsibility. If you find you have a method that is doing
		//   many things, then you should separate the code into multiple methods.
		
	    int myNumber = 5;
	    
	    // In this scenario, we've created a new method which will raise some number to the power of some exponent.
	    //   Now we can use it whenever we want that functionality instead of having to duplicate the code each time.
	    
	    // To invoke a method, write the method name followed by a pair of parenthesis surrounding all the arguments 
	    //   of the correct types that are required (order of the arguments matters). Here, we are invoking the "exponentialFunction"
	    //   while passing in the myNumber variable (which is an int) and the number 2 (which is an int value). The result is 
	    //   then returned by the method and here it is stored in the myNumberSquared variable. Again, note the return type 
	    //   of the method is int and the myNumberSquared variable is of the type int.
	    int myNumberSquared = exponentialFunction(myNumber, 2);
	    
	    // Now we invoke the same method again but with different arguments, thus producing a different result.
	    int myNumberCubed = exponentialFunction(myNumber, 3);

	    // Finally, we invoke our second method and pass in our three variables. This time, the method has a return
	    //   type of "void" meaning it doesn't return a value and therefore cannot be assigned to a variable like above.
	    printNumbers(myNumber, myNumberSquared, myNumberCubed);
	}

	/**
	 * Raises the first number to the power of the exponent and returns the result
	 * @param number The number to raise to the exponent.
	 * @param exponent The exponent to raise the number to. 
	 * return The result of the calculation.
	 */
	public static int exponentialFunction(int number, int exponent) {
	    // Do stuff...
	    int result = 1;
	    for (int i = 0; i < exponent; i++) {
	        result = result * number;
	    }

	    // A return statement immediately ends a method and passes back the given value, which here it's "result,"
	    //    to where the method was originally called, which here it's line # in the main method.
	    return result;
	}
	
	/**
	 * Prints a String with the given numbers to the console.
	 * @param num A number
	 * @param numSqr The square of the original number
	 * @param numCube The cube of the original number
	 */
	public static void printNumbers(int num, int numSqr, int numCube) {
		// This is another method call we've already been using. This method is part of the code Java provides for you
		//   in an attempt to make your life easier (Spoiler: most times it doesn't).
	    System.out.println("MyNumber: " + num + ", MyNumberSquared: " + numSqr + ", MyNumberCubed: " + numCube);
	}
}
