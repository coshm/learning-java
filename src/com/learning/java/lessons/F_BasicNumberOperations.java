package com.learning.java.lessons;

public class F_BasicNumberOperations {

	public static void main(String[] args) {
		
		// Now that you know how to make a variable and
		//   assign it a number, what can you do with it?

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~ ADDING ~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// Let's start with adding numbers. First, we can 
		//   add two numbers using the '+' operator and assign
		//   the result to a variable.
		int a = 2 + 3;
		System.out.println("#1. " + a);
		
		// We can also add numbers to variables and assign the 
		//   result to another variable.
		int b = a + 5;
		System.out.println("#2. " + b);
		
		// Or we can even add a number to a variable and assign
		//   the result back to that variable.
		a = a + 4;
		System.out.println("#3. " + a);
		
		// If you want to add a number to a variable and store
		//   the result in the same variable, you can use the 
		//   shortcut '+='
		b += 3;
		System.out.println("#4. " + b);
		
		// You can also add one to a number simply by proceeding
		//   the variable with '++'
		a++;
		System.out.println("#5. " + a);
		
		// Also you can add as many numbers together as you like.
		int c = 1 + 2 + b + 4 + a;
		System.out.println("#6. " + c);
		
		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~ SUBTRACTING ~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// Subtracting numbers works much the same way as adding
		int d = 10 - 4;
		System.out.println("#7. " + d);
		
		// You can subtract from variables just like adding
		int e = d - 3;
		System.out.println("#8. " + e);
		
		// There is a similar shortcut for subtracting a value
		//   from a variable, '-='
		e -= 5;
		System.out.println("#10. " + e);
		
		// Just like you can add one to a number, you can easily
		//   subtract one from any number by using '--'
		d--;
		System.out.println("#11. " + d);
		
		// And you can subtract as many numbers as you want.
		int f = 34 - d - 11 - 3 - e;
		System.out.println("#12. " + f);


		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~ MULTIPLYING ~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// Multiplying is pretty similar to adding and subtracting
		int g = 2 * 10;
		System.out.println("#13. " + g);
		
		// Multiply a number and a variable
		int h = g * 6;
		System.out.println("#14. " + h);
		
		// Shortcut for multiplying a variable by a number and
		//   storing the result in the same variable.
		h *= 3;
		System.out.println("#16. " + h);
		
		// You can multiply as many numbers and variables as you'd like
		int i = 1 * g * 3 * 4 * h;
		System.out.println("#17. " + i);


		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~ DIVIDING ~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// Dividing is pretty similar to all the above with some
		//   exceptions. We now have to be wary of decimals, especially
		//   when dividing with types that can only hold whole numbers
		//   such as int.
		int j = 16 / 2;
		System.out.println("#18. " + j);
		
		int k = j / 2;
		System.out.println("#19. " + k);
		
		j /= 4;
		System.out.println("#20. " + j);
		
		int l = 126 / 7 / 3 / 2;
		System.out.println("#21. " + l);
		
		// But what happens when the result isn't a whole number?
		//   For example, 9 divided by 2 is really 4.5 however an 
		//   int can only hold whole numbers. When the value is
		//   assigned, the numbers after the decimal are truncated,
		//   meaning they are discarded. Essentially, int division 
		//   will always round down to the nearest whole number.
		int m = 9 / 2;
		System.out.println("#22. " + m);

		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~ MODULUS ~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// The modulus operator, '%', is related to division. If you
		//   recall your middle school math, long division has 4
		//   parts. The dividend, divisor, quotient, and remainder.
		//   Lets take 13 / 5 for example, in this case 13 is the
		//   dividend and 5 is the divisor. The quotient would be
		//   2 since 5 can go into 13 twice, and the remainder is
		//   3. Similarly for 12 / 4, the dividend is 12, the divisor
		//   is 4, the quotient would be 3, and the remainder 0
		//   since 12 is a multiple of 4. The modulus operator simply
		//   returns the remainder instead of the quotient like the '/'
		//   operator would. In the examples above, 13 % 5 would return
		//   3 and 12 % 4 would return 0. Many times the modulus
		//   operator is used to see if a number is an exact multiple
		//   of another. For example, if number % 2 returns 0 then we
		//   know that number must be even since it is a multiple of 2.
		//   Or say we are running a loop hundreds of times but we may
		//   want to execute some code, like a print statement, every
		//   10 loops or so, then we can use the modulus operator to 
		//   check if the loop counter is a multiple of 10, i % 10 == 0
		
		int n = 17 % 3;
		int o = 10 % 5;
		int p = 8 % 3;

		System.out.println("#23. " + n);
		System.out.println("#24. " + o);
		System.out.println("#25. " + p);

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~ MIX N MATCH ~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// You can chain as many of any kind of operand together 
		//   as you want. Just be mindful of the order of operations.
		//   Please Excuse My Dear Aunt Sally.
		//   Parenthesis Exponent Multiplication Division Addition Subtraction
		int q = (10 * 2 - 4) / 8 + 10;
		System.out.println("#26. " + q);
		

		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		// ~~~~~~~~~~~ WHOLE NUMBERS AND DECIMALS ~~~~~~~~~~~ //
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //
		
		// In the DIVIDING section we saw what happens when we tried to store
		//   a decimal number resulting from a division operation in an int
		//   variable. The number is simply rounded down to the nearest whole
		//   number. Sometimes you have an int and you want to keep any decimal
		//   that may result from its division. We can easily do this by dividing
		//   by a decimal rather than a whole number and storing the result in a
		//   double rather than an int.
		double r = 9 / 2.0;	
		System.out.println("#27. " + r);
		
		// There are two parts to this. First, we are storing the result in a double 
		//   instead of an int. Only a double or a float can store fractions of a 
		//   number. Second, when one of the two numbers we use is a decimal (even if
		//   it only has a zero after the decimal) and the other is a whole number, Java
		//   automatically treats the whole number like a decimal. Thus the result is left
		//   as a decimal instead of rounded down like it is when both numbers are whole
		//   numbers. Also, since every whole number can be represented with a decimal but
		//   obviously not every decimal is a whole number, we can store int values in a 
		//   double variable but not a double value in an int container.

		// Here the 9 and the 2 are both whole numbers so the result of the operation will
		//   be a whole number (rounded down). This is then stored in an int variable.
		int s = 9 / 2;
		System.out.println("#28. " + s);
		
		// Here the 9 is a whole number but the 2.0 is a decimal. This means Java will
		//   implicitly treat 9 like a decimal and the result of the operation is a
		//   decimal. That causes a problem though because we are trying to store a 
		//   decimal number in an int variable which isn't allowed. If you uncomment this line
		//   by deleting the two // in front, you will see it's underlined in red, meaning
		//   it's causing an error.
		//int t = 9 / 2.0;
		
		// Here the 9 and the 2 are both whole numbers so the result of the operation will
		//   be a whole number (rounded down). This is then stored in a double variable
		//   which is ok since whole numbers can be stored in double and floats.
		double u = 9 / 2;
		System.out.println("#29. " + u);
		
		// Here the 9 is a whole number but the 2.0 is a decimal. This means Java will
		//   implicitly treat 9 like a decimal and the result of the operation is a
		//   decimal. This is ok because we are storing this result in a double variable
		//   which can hold decimal values. 
		double v = 9 / 2.0;
		System.out.println("#30. " + v);
	}
	
}
