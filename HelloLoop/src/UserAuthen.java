/**
 * This program uses a driver class ValidatePassword to get user input from the screen using the scanner class. 
 * The ValidatePassword calls the PassCheck method that checks to see if the entered
 * password is valid. The requirement for a valid passwords are as follows:
 * 1) Password must be at least 8 characters long.
 * 2) Password must contain two capital letters.
 * 3) Password must contain at least two numbers
 * 4) Password contains only letters and number
 * If the password is valid the result will display "Valid Password." 
 * If not the result will display an appropriate error message.
 * 
 * @author Bonmyeong Koo
 * Copy right 2016 by Bonmeyong Koo
 * 
 * This program is for demonstration purpose.  There is no guarantee that the program will be function.
 * You may reuse the part of this program for education purpose only.  
 * Please email me at augustus1004@gmail.com to ask for permission to use any part of the program that being used for any other purpose.
 */

import java.util.Scanner;								// Imports the Scanner class to get Keyboard Inputs

public class UserAuthen {

	public static void main (String [] args) {
		String username;								// Creates the userName variable
		System.out.println("Enter your username: ");
		Scanner keyboard = new Scanner(System.in);		// Creates a new Scanner
		username = keyboard.nextLine();					// Get the user input for the userName
		
		String password;								// Creates the Password variable
		System.out.println("Enter your password: ");
		Scanner keybaord = new Scanner(System.in);		// Creates a new Scanner
		password = keyboard.nextLine();					// Get the user input for the password

		if(username.equals("Computer Science") && password.equals("awesome")) {
			System.out.println("Welcome, another aspiring Computer Scientist!");
		} else {
			System.out.println("Wrong Username or Password!");
		}
		keyboard.close();
	} // Ends the PassCheck method
} // Ends the ValidatePassword class

