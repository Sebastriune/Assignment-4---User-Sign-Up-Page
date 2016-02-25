/**
 * 
 * @author Bonmyeong Koo
 * Copy right 2016 by Bonmeyong Koo
 * 
 * This program is for demonstration purpose.  There is no guarantee that the program will be function.
 * You may reuse the part of this program for education purpose only.  
 * Please email me at augustus1004@gmail.com to ask for permission to use any part of the program that being used for any other purpose.
 * 
 * 1. printf (p.102) - format print out to console
 * %s: String
 * %c: Character
 * %d: Decimal Integer number
 * %e: Exponential floating-point number
 * %f: Floating-point number
 * 2. comments // single line comment (ctrl or command+shift+c)
 * multiple-line comments + javadoc
 */

/*
 * multiple-line comments
 * 3. if else
 * 		if(true)
 * 			printout(true) // printf
 * 		else
 * 			printout(false) // System.out.println
 * 4. Javadoc
 * 
 * c:\Program Files\Java\jdk1.8.31\bin\javadoc
 */

import java.util.Scanner;

public class DisplayDemo
	/**
	 * This is a main method.
	 * @param args arguments for user input during run java command
	 */
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		// Prompt
		System.out.println("Select an option: \n Option1: Use Println\n Option2: User Printf\n Enter 1 for Option1 2 for Option2");
		int option = input.nextInt();
		/*
		 * The following logic to evaluate an option
		 * using if..else java statement
		 * If the statement is true, then then the program will printout with format. (printf)
		 * Otherwise, the program will printout without using format. (System.out.println)
		 */
		double price = 19.5;
		int quantity = 2;
		String item = "Widgets";
		double investAmount = 12618.98;
		double interestRate = 0.0013;
		double interest = investAmount * interestRate;
		int count = 5;
		double amount = 45.56;
		if (option==1) {
				// True
				System.out.println("Price using println: " + price);
				System.out.println("Interest is $" + interest);
				System.out.println("Interest is $" + (int)(interest * 100) / 100.0);
		} else {
				// False
				System.out.printf("Price using printf formatting:%6.2f\n", price);
				System.out.printf("%10s sold:%4d at $%1.2f\n", item, quantity, price, quantity * price);
				System.out.printf("Interest is $%4.2f\n", interest);
				System.out.printf("count is %d and amount is %f\n", count, amount);
				System.out.printf("%3d#%2s#%4.2f\n", 1234, "Java", 51.6653);
				System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.63);
				System.out.printf("%-8d%-8s%-8.1f \n",  1234, "Java", 5.63);
				
				// Display the header of the table
				System.out.printf("%-10s%-10s%-10s%-10s%-10s\n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");
				
				// Display values for 30 degrees
				int degrees = 30;
				double radians = Math.toRadians(degrees);
				System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
				
				// Display values for 60 degrees
				degrees = 60;
				radians = Math.toRadians(degrees);
				System.out.printf("%-10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees, radians, Math.sin(radians), Math.cos(radians), Math.tan(radians));
			
				System.out.printf("amount is %f %e\n", 32.327, 32.32);
				
				String s = String.format("%7.2f%6d%-4s", 45.556, 14, "AB");
				System.out.println(s);
				
				System.out.printf("Hello %c, %c\n",  'a', 65);
				System.out.printf("Some different radices: %d %x %o %#x %#o\n", 100, 100, 100, 100, 100);
				System.out.printf("%+.0e, %E", 3.141414, 314.1414);
		input.close();
		}
	}
}
