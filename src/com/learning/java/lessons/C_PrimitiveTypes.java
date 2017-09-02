package com.learning.java.lessons;

public class C_PrimitiveTypes {
	
	public static void main(String[] args) {
		// There are two main categories of variables, primitive 
		//   types and objects. As you might expect, primitive 
		//   types are the most basic types.
		
		// Many of the primitive types are different kinds of 
		//   numbers. The difference is how much memory is allotted
		//   to each type. In other words, each type has a different 
		//   range of numbers it can hold.
		
		// The smallest numeric type is the byte. It can hold values
		//   from -128 up to 127.
		byte myByte = 100;
		
		// The the short type can hold values from -32,768 to 32,767.
		short myShort = 12580;
		
		// The int type can hold values from -2^31 to 2^31 - 1.
		int myInt = 123456789;
		
		// The long type can hold values from -2^63 to 2^63 - 1.
		//   When assigning a value to a long that is greater than
		//   an int, you must proceed the value with an 'L' as shown
		//   below.
		long myLong = 112233445566778899L;
		
		// All the types above are whole numbers. To represent decimals
		//   there are the types float and double. These types aren't 
		//   actually used that often and can have some odd results when 
		//   trying to simple operations like adding or multiplying with 
		//   high precision, meaning lots of numbers after the decimal.
		
		// The float type's limits are described by some fancy equation
		//   but it's a lot but not as big as a double. To distinguish
		//   the value from a double when assigning it to a variable, you 
		//   must proceed the value with an 'f' as shown below.
		float myFloat = 12345.67890f;
		
		// The double type's limits are described by a similar equation
		//   but it's a lot bigger than a float.
		double myDouble = 123456789.1243456789;
		
		// Note, both floats and doubles can also hold whole numbers.
		//   However, they are still represented with a decimal followed
		//   by a 0, such as 1.0 instead of 1. You will see this when these
		//   values are printed at the end.
		float myWholeNumberFloat = 5f;
		double myWholeNumberDouble = 682;
		
		// The boolean type only has two possible values, true or false.
		//   These values are case sensitive btw.
		boolean myBoolean = true;
		
		// The char type is a single letter. It's kinda like a String
		//   except it's always just one letter and it's enclosed in
		//   single quotes, not double quotes.
		char myChar = 'a';
		
		// Now we can print these all to the console to check their
		//   values.
		System.out.println(myByte);
		System.out.println(myShort);
		System.out.println(myInt);
		System.out.println(myLong);
		System.out.println(myFloat);
		System.out.println(myDouble);
		System.out.println(myWholeNumberFloat);
		System.out.println(myWholeNumberDouble);
		System.out.println(myBoolean);
		System.out.println(myChar);
		
		// Try assigning different values to the types. See what
		//   happens when you attempt to assign a value that is
		//   outside a types limits.
		
		/* Personal Note: I almost only use ints, longs, floats, and booleans 
		 *   in my day to day work.
		 */
	}
	
}
