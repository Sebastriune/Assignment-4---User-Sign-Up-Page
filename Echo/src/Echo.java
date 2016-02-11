/**
 * Author: Bonmyeong Koo
 * Date: 2/10/2016
 * Email: bsk2154@email.nvcc.edu
 * 
 * Purpose: 
 * 1. Basic Java Primitive Data Types
 * Integer
 * byte - 1 byte
 * short - 2 bytes
 * int - 4 bytes
 * long - 8 bytes
 * 
 * Decimals
 * float - 4 bytes
 * double - 8 bytes
 * 
 * Characters
 * char - 2 bytes
 * 
 * True / False
 * boolean - 1 byte
 * 
 * 2. Declare a variables
 * 3. Declare a constant
 * 4. Output GUI (Graphic User Interface) - JOptionPane
 * 5. Expressions: sum = num1 + num2
 * 6. Mathematics operations
 * Add +
 * Subtract -
 * Multiply *
 * Divide / i.e. 5 / 2 = 2
 * Remainder (Modulator)% i.e. 5 % 2 = 1
 * () 
 */

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Echo {

	public static void main(String[] args) throws IOException {
				
		// Instantiation
		// Declare the variables
		// Get the values from the user
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a byte value: ");
		byte byteValue = input.nextByte();
		
		System.out.println("Enter a short value: ");
		short shortValue = input.nextShort();
		
		System.out.println("Enter a int value: ");
		int intValue = input.nextInt();
		
		System.out.println("Enter a long value: ");
		long longValue = input.nextLong();
		
		System.out.println("Enter a float value: ");
		float floatValue = input.nextFloat();
		
		System.out.println("Enter a double value: ");
		double doubleValue = input.nextDouble();
		
		System.out.println("Enter a char value: ");
		char charValue = (char) System.in.read();
		
		System.out.println("Enter a boolean value: ");
		boolean booleanValue = input.nextBoolean();
		
		final JOptionPane pane = new JOptionPane();
		final JDialog MessageDialog = pane.createDialog("Chapter 2.2 JOptionPane Extra Credit");
		MessageDialog.setAlwaysOnTop(true);
		MessageDialog.setLocation(10, 10);
		MessageDialog.setVisible(true);
		JOptionPane.showMessageDialog(null, "The byte is \"" + byteValue + "\""
				+ "\n" + "The short is \"" + shortValue + "\""
				+ "\n" + "The int is \"" + intValue + "\""
				+ "\n" + "The long is \"" + longValue + "\""
				+ "\n" + "The float is \"" + floatValue + "\""
				+ "\n" + "The double is \"" + doubleValue + "\""
				+ "\n" + "The char is \"" + charValue + "\""
				+ "\n" + "The boolean is \"" + booleanValue + "\"");
		
		input.close();
	}
}
