package com.learning.java.lessons;

public class H_Loops {

	public static void main(String[] args) {
		// Another fundamental concept in any programming language
		//   is a loop. In Java, and many other languages, there are
		//   several kinds of loops. Here we will talk about the 
		//   For loop, the while loop, and the do-while loop.
		
		// A loop is generally used when we need to execute some 
		//   code multiple times or when you need to iterate
		//   over the elements in a list or an array. For example, 
		//   say you had a list of ints that represented the costs 
		//   of each item on the CocoaCinnamon menu and you wanted
		//   to figure out how much it would cost to buy one of everything,
		//   you could loop through each cost and add it to a variable.
		//   When the loop is finished, the variable would equal the sum
		//   of all the items on the menu.
		
		// The For loop is by far the most common loop. The loop has 
		//   three main parts. First is the 'for' keyword, then a pair of
		//   parentheses that contain information for the loop, and then
		//   a pair of curly brackets in which we will put the code we 
		//   want to execute. The code within the parentheses is broken up
		//   into 3 sections separated by ';'. The first section is executed
		//   only once before the loop begins. The second section is evaluated
		//   every loop before the code inside the loop is executed. If it
		//   evaluates to true, the code inside is executed. If it is false,
		//   the loop ends. The third section is run after every loop.
		
		// In this loop, we initialize an int variable to 0 in the beginning, 
		//   check to see if the variable is less than 5, run the code inside
		//   the loop, then increment the variable. This repeats, excuding the 
		//   initialization of 'i' which only happens once, until the condition
		//   in the second section of the parentheses fails. This results in the
		//   code inside the loop being run 5 times.
		for (int i = 0; i < 5; i++) {
			System.out.println("i = " + i);
		}
		
		// The three sections inside the parentheses of the for loop are
		//   optional. You could use a variable that is already initialized
		//   instead of creating your own.
		int a = 5;
		for (; a < 10; a++) {
			System.out.println("a = " + a);
		}
		// You could increment or otherwise set the value of the variable 
		//   to whatever you want within your loop.
		//   You could omit the second section, however this will always result 
		//   in an infinite loop.
		for (int b = 0; b < 3;) {
			System.out.println("b = " + b);
			b++;
		}

		// You could omit the second section, however this will always result 
		//   in an infinite loop.
		
		// The while loop is the next most common loop. It's similar to the
		//   for loop in that it has the while keyword, then a pair of 
		//   parentheses, then a pair of curly brackets. The difference
		//   being inside the parentheses, the while loop only has the 
		//   boolean expression. As long as that expression evaluates to true,
		//   the code inside the loop will be executed. Typically this is used
		//   when you don't know the exact number of times you need to execute
		//   the loop. For example, there is kind of object that will iterate
		//   over a list of values. The iterator doesn't know how many values
		//   exist, but it knows if there is a next value or now. It has a method
		//   called hasNext that will return true if there is another value
		//   and false if it's at the end of the list. You could loop over that list
		//   by saying while (iterator.hasNext()), which will cause the loop
		//   to continue until it reaches the end of the list. 
		
		// For now, lets just emulate the same loop as we did with the for loop.
		int c = 0;
		while (c < 5) {
			System.out.println("c = " + c);
			c++;
		}
		
		// Finally, the do-while loop is very similar to the while loop.
		//   If you didn't notice with the while loop, the boolean expression
		//   inside the parenthesis is evaluated BEFORE the code in the loop
		//   was executed. Sometimes, we want to execute the code and THEN 
		//   evaluate the boolean expression to see if we should run the loop
		//   again. This is exactly what a do-while loop is for. The do-while
		//   loop first has the keyword 'do' followed by a pair of curly brackets
		//   that encloses the code we want to execute. Then, on the same line as
		//   the closing curly bracket, we have the 'while' keyword followed by the 
		//   pair of parentheses containing the boolean expression. Also, this is
		//   ended with a ';' unlike the other loops.
		int d = 0;
		do {
			System.out.println("d = " + d);
			d++;
		} while (d < 5);
		
		// The differences aren't immediately apparent between the while
		//   and the do-while loop. The main difference is the do-while 
		//   loop will ALWAYS be executed at least one time, even if the 
		//   boolean expression is false the first time it's evaluated.
		int e = 10;
		while (e < 5) {
			System.out.println("This won't be printed since 10 is greater than 5");
		}
		
		do {
			System.out.println("This will be printed once because the loop is executed before the boolean expression is evaluated.");
		} while (e < 5);
		
		// There are not too many actual uses for the do-while loop so
		//   it is fairly uncommon.
		//   *Personal Note* I've never actually used it outside a class
	}
	
}
