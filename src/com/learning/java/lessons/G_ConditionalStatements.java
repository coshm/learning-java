package com.learning.java.lessons;

public class G_ConditionalStatements {

	public static void main(String[] args) {
		// A boolean expression is any statement that
		//   evaluates to a boolean, i.e true or false. Let's 
		//   look at a few basic ways of doing this.
		
		// First we can compare numbers to each other. Such
		//   as checking if two numbers are equal by using
		//   the '==' operator.
		int a = 1;
		boolean equal = a == 1;		// true

		int b = 5;
		boolean notEqual = b == 3;	// false
		
		// We can also you the less than operator, '<'
		//   and the greater than operator, '>'
		boolean lessThan = a < 10;		// true
		boolean greaterThan = b > 5;	// false
		
		// We also have less than or equal to, '<=' and
		//   greater than or equal to, '>='
		boolean lessThanOrEqualTo = a <= 2;		// false
		boolean greaterThanOrEqualTo = 5 >= b;	// true
		
		// And finally, we have not equal to '!='
		boolean areNotEqual = a != b;	// true
		boolean areEqual = a != 1;		// false
		
		// Lets print these out just to be sure
		System.out.println("equal = " + equal);
		System.out.println("notEqual = " + notEqual);
		System.out.println("lessThan = " + lessThan);
		System.out.println("greaterThan = " + greaterThan);
		System.out.println("lessThanOrEqualTo = " + lessThanOrEqualTo);
		System.out.println("greaterThanOrEqualTo = " + greaterThanOrEqualTo);
		System.out.println("areNotEqual = " + areNotEqual);
		System.out.println("areEqual = " + areEqual);
		
		// You can also use the '==' operator on Strings. For two 
		//   Strings to be equal, they need to be exactly the same.
		String fluffy = "fluffy";
		String alsoFluffly = "fluffy";
		String capitalizedFluffy = "Fluffy";
		String fluffyWithSpace = "fluffy  ";
		System.out.println("barnacle == alsoFluffly = " + (fluffy == alsoFluffly));
		System.out.println("barnacle == capitalizedFluffy = " + (fluffy == capitalizedFluffy));
		System.out.println("barnacle == fluffyWithSpace = " + (fluffy == fluffyWithSpace));
		
		// As you can see, all of the above result in a boolean type.
		//   Sometimes you have multiple boolean values and you want 
		//   to combine them into a single value. For example, lets 
		//   say I have a variable called age and I want to know 
		//   if that age is greater than 21 but also less than 65.
		//   We can do that by "ANDing" the two booleans together 
		//   by using the "&&" operator.
		int age = 34;
		boolean greaterThan21 = age > 21;	// true
		boolean lessThan65 = age < 65;		// true
		boolean livingThat9To5Life = greaterThan21 && lessThan65;	// true
		System.out.println("greaterThan21 = " + greaterThan21 + ", lessThan65 = " + lessThan65 + ", livingThat9To5Life = " + livingThat9To5Life);
		
		// The "AND" operator returns true if and only if both sides
		//   are true. If either one or both are false, then the result
		//   is false.
		//   true && true = true
		//   true && false = false
		//   false && true = false
		//   false && false = false
		
		// Conversely there is the "OR" operator, '||" which will
		//   return true if either of the two booleans are true.
		int numberOfDrinks = 3;
		boolean noDrinks = numberOfDrinks == 0;				// false
		boolean tooManyDrinks = numberOfDrinks > 5;			// false
		boolean livingASadLife = noDrinks || tooManyDrinks;	// false
		System.out.println("noDrinks = " + noDrinks + ", tooManyDrinks = " + tooManyDrinks + ", livingASadLife = " + livingASadLife);
		
		// A quick run down on the possible "OR" combinations
		//   true || true = true
		//   true || false = true
		//   false || true = true
		//   false || false = false
		
		// You can also negate a boolean or a boolean expression. This
		//   simply turns a true value into a false value and vice versa.
		//   This can be done by preceding the boolean with the '!' symbol.
		boolean isTrue = true;				// true, obviously
		boolean isFalse = !isTrue;			// false
		boolean isAlsoFalse = !(a < 10); 	// false
		System.out.println("isTrue = " + isTrue + ", isFalse = " + isFalse + ", isAlsoFalse = " + isAlsoFalse);
		
		// If statements are fundamental to any programming 
		//   language. They allow you to execute or not 
		//   execute code based on whatever conditions you specify. 
		//   For example, I'm sure somewhere in Spotify's code 
		//   there is an if statement that say if the current 
		//   user is a Premium user then don't play any ads. 
		//   Otherwise, if they are not a Premium user, then 
		//   play ads every couple of songs.
		
		
		// The structure of an 'if' statement is pretty simple.
		//   It always begins with 'if', which is a reserved 
		//   keyword in Java meaning you can't name a variable
		//   or a function 'if'. Then there is a pair of parenthesis
		//   which contains a boolean expression. Then there is an
		//   an open curly bracket '{' followed by the code you want to
		//   run if the condition is true and finally the closing 
		//   curly bracket '}'
		int dayOfTheMonth = 15;
		if (dayOfTheMonth == 15 || dayOfTheMonth == 30) {
			System.out.println("It's payday bitches!!!");
		}
		
		int numberOfGramsOfWeed = 14;
		if (numberOfGramsOfWeed < 7) {
			System.out.print("Need moar weed!");
		}
		
		// The 'if' statement can also be followed by an optional 'else' 
		//   statement. The 'else' statement consists of the 'else'
		//   keyword, which is placed on the same line as the closing 
		//   curly bracket of the 'if' statement, and its own set of open
		//   and closing curly brackets. The code in the 'else' statement 
		//   will be run if the condition evaluates to false. You cannot 
		//   have an 'else' statement without a corresponding 'if' statement.
		//   When you have an 'if' and an 'else' together, you are guaranteed 
		//   one of them will be executed since a boolean can only be true 
		//   or false.
		int hourOfTheDay = 15;
		if (hourOfTheDay >= 17) {
			System.out.println("Time to chillax to some sick beatz");
		} else {
			System.out.println("Everything is terrible");
		}
		
		// Finally, there is the 'else if' statement. An 'else if' statement
		//   is like an additional 'if' statement that is only evaluated if the
		//   preceding 'if' or 'else if' statements evaluate to false. The 'else if'
		//   statement is optional and there can be any number of them, but they 
		//   must always come after the 'if' and before the 'else' if one exists.
		int testScore = 88;
		if (testScore > 90) {
			System.out.print("Congratulations you got an A you overachiever.");
		} else if (testScore > 80) {
			System.out.print("Yay, you got a B. Thats pretty good I guess");
		} else if (testScore > 70) {
			System.out.print("You got a C. Way to be average.");
		} else if (testScore > 60) {
			System.out.print("You got a D, which is basically failing.");
		} else {
			System.out.print("Why are you even here?");
		}
		
		// As you can see when you run this, only one of the lines above 
		//   are executed. The code will evaluate the 'if'/'else if'
		//   statements sequentially until one of them is true. If none
		//   are true, it will resort to the 'else' statement at the end
		//   if there is one. Also note that knowing testScore > 70 by 
		//   itself doesn't necessarily tell us that the score is a C.
		//   However, since we know all the previous statements had to
		//   be false to get to that testScare > 70 check, meaning 
		//   testScore > 90 was false and testScore > 80 was false, we know
		//   that the testScore is really somewhere between 70 and 80
		//   which is a C.
	}
	
}
