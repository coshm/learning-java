// The very first line in a class is the package declaration.
// A java project is made of 'packages' which is just a way to organize code.
package com.learning.java.lessons;

/**
 * This is called the class declaration. The format is,
 * {scope} class  {class name}
 * public  class  A_HelloWorld
 *   - Scope, always assume this is 'public' for now.
 *   - Class, because this is a class.
 *   - Class Name, the name of the class. The name of the files has to match this.
 */
public class A_HelloWorld {

	/**
	 * This is a method. A method can be passed some values called parameters,
	 *  it does some work, and can return a value. The format of a method declaration is...
	 * 
	 * {scope} {optionally static} {return type} {method name}({parameter type} {parameter name})
	 *  public       static            void          main          String[]           args
	 *   - Scope, same as before. Assume it's always public for now.
	 *   - Static, this is an optional keyword. We'll talk about what it means later.
	 *   - Return Type, the type of the value being returned by the method. A special
	 *      type 'void' is used when the method doesn't return anything.
	 *   - Method Name, the name of the method.
	 *   - Parameter Type, the type of the parameter.
	 *   - Parameter Name, the name of the parameter.
	 * 
	 * This is a special method in Java. You need one of these
	 *  methods to be able to actually run your Java program.
	 */
	public static void main(String[] args) {
		
		// This line will display the text "Hello World!" in the console.
		System.out.println("Hellow World!");
		
		// To test this out, right click on this file in the Package Explorer, select Run As->Java Application.
	}
	
}
