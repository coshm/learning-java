package com.learning.java.lessons;

public class D_StringBasics {

	public static void main(String[] args) {
		// Strings are one of them most common types used in
		//   java. Personally, I use Strings every day. Strings
		//   are used to store text. A String value is surrounded
		//   by double quotes, not single quotes like the char type.
		String myString = "What up";
		System.out.println(myString);
		
		// Strings are a special type in Java. They're not actually
		//   a primitive type but they have a lot of built in functions
		//   that other types don't get. For example you can add two 
		//   Strings together using the '+' operator. This is called
		//   String concatenation.
		String greeting = myString + " Nicole?";
		System.out.println(greeting);
		
		// You can also you the '+=' shortcut to add a String to the
		//   end of a variable.
		myString += " mah ninja?";
		System.out.println(myString);
		
		// Not only can you add Strings to Strings, but you can add 
		//   primitive types to Strings as well. Java will automatically
		//   convert the primitive type to a String and add it to your 
		//   String like so.
		int myInt = 5;
		String anotherString = "myInt = " + myInt;
		System.out.println(anotherString);

		// A String is like a collection of the primitive type chars. It's a special 
		//   type which has some methods like "length()" which returns the number of 
		//   chars in the String. You can access this method adding a decimal and then 
		//   the method name and a pair of parenthesis after the String variable or value.
		//   Note, the length includes any spaces.
		int length = myString.length();
		System.out.println("Length of '" + myString + "' is " + length);

		// You can access a specific char in a String by using the the method "charAt()" which
		//   is passed the index of the character you wish to get. The first char is at index
		//   0 and the last char is at index length - 1.
		char firstLetter = myString.charAt(0);
		char lastLetter = myString.charAt(length - 1);
		System.out.println("MyString='" + myString + "', firstLetter='" + firstLetter + "', lastLetter='" + lastLetter + "'");

		// There is another method called "substring()" which is passed a starting index,
		//   an ending index, and returns the portion of the original String between those 
		//   two indices. Note, the ending index is not inclusive so the char at the ending
		//   index will not actually be included.
		String wholeString = myString.substring(0, length);
		String firstWord = myString.substring(0, 4);
		String lastWord = myString.substring(12, length);
		System.out.println("wholeString='" + wholeString + "', firstWord='" + firstWord + "', lastWord='" + lastWord + "'"); 
		
		// Notice the space char in wholeString but none in firstWord or secondWord because 
		//   the starting index is inclusive and the ending index is exclusive for "substring()"
		
		// There is a lot more you can do with Strings but we'll save 
		//   that until we've learned more about objects and methods :)

	}
	
}
