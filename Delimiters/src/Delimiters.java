/**
 * @author bkoo
 * Author: Bonmyeong Koo
 * Date: 2/6/2016
 * Email:bsk2154@email.vccs.edu
 * 
 */

import java.util.Scanner;

public class Delimiters {
	public static void main(String [] args) {

		Scanner keyboard = new Scanner (System.in);
		
		// Delimiter is comma and end-of-line to read the last number
		keyboard.useDelimiter ("[,\n]");
		
		System.out.println ("Please enter a line 10 numbers delimited by commas");
		
		// Keep track of the sum as we go along
		double sum = 0; 
		
		// Assume that the user enters numbers instead of non-numeric strings such as "abc", etc.
		boolean isInputError = false;
		
		// Parse 10 numbers
		for (int i = 1; i <= 10; i++) {
			
			// Read the next token as a string, and trim whitespace such as newlines from it.
			String s = keyboard.next().trim();
			
			// Try to convert the string into a number
			double number = 0;
			try {
				number = Double.parseDouble (s);
			}
			// User entered something that was not a number.
			catch (NumberFormatException e){
				System.out.println ("One of the strings you entered is not a number! Please enter 10 numbers");
				
				// User made an entry error
				isInputError = true;
				break;
			}
			// Add the number to the sum
			sum += number;
			
			// Println statement for debugging
			// System.out.println ("n = " + number);
		}
		
		// Calculate the average only if the user has NOT made input errors
		if (!isInputError) {
			// The average is the sum divided by 10.
			double average = sum / 10;
		
			System.out.println ("The average of the 10 numbers you entered is " + average);
		}
		keyboard.close();
		
/*		String s1,s2;
		Scanner keyboard1 = new Scanner(System.in); //use space as delimiter
		Scanner keyboard2 = new Scanner(System.in); //use ** as delimiter
		keyboard2.useDelimiter("!!");
		
		System.out.println("Enter a line of text with two words:");
		s1 = keyboard1.next();
		s2 = keyboard1.next();
		System.out.println("The words are " + s1 + "\t" + s2); //escape sequence
 		
		System.out.println("Enter a line of text with two words (delimited by ##):");
		s1 = keyboard2.next();
		s2 = keyboard2.next();
		System.out.println("The words are \"" + s1 + "\"\n\"" + s2 + "\""); //escape sequence
		keyboard1.close();
		keyboard2.close();*/
	}
}
