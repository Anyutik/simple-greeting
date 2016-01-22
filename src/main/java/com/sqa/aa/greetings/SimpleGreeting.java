/**
 *   File Name: SimpleGreeting.java<br>
 *
 *   Antonyan, Anna<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Jan 21, 2016
 *   
 */

package com.sqa.aa.greetings;

import java.util.Scanner;

/**
 * SimpleGreeting //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class SimpleGreeting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Declare local method variables
		String name;

		// Create local variable which contains Scanner object instance to
		// capture user input from keyboard
		Scanner scanner = new Scanner(System.in);
		// Greet the user
		System.out.println("Welcome to yhe Simple Greeting Application");
		// Requestthe user's name
		System.out.println("Could I please have your name? ");
		// Capture user's name inside lcal variable name
		name = scanner.nextLine();
		// Say farewell to user
		System.out.println("Thank you for using this application, farewell " + name + "!");
		// Close Scanner and exit
		scanner.close();

	}
}
