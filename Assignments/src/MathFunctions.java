import java.util.Scanner;

public class MathFunctions {
	// Main method begins execution of Java application
	public static void main(String[] args) {
		// Create a Scanner to obtain input from command window
		Scanner input = new Scanner (System.in);
		// Five numbers to use in computations
		double n1; // 1st number to use in computations
		double n2; // 2nd number to use in computations
		double n3; // 3rd number to use in computations
		double n4; // 4th number to use in computations
		double n5; // 5th number to use in computations
		double sum; // The summation of the five numbers
		double avg; // The average of the five numbers
		double max; // The largest number of the five numbers
		double min; // The smallest number of the five numbers
		
		System.out.print("Enter first number: "); // Prompt
		n1 = input.nextDouble(); // Read first number from user
		System.out.print("Enter second number: "); // Prompt
		n2 = input.nextDouble(); // Read second number from user
		System.out.print("Enter third number: "); // Prompt
		n3 = input.nextDouble(); // Read third number from user
		System.out.print("Enter fourth number: "); // Prompt
		n4 = input.nextDouble(); // Read fourth number from user
		System.out.print("Enter fifth number: "); // Prompt
		n5 = input.nextDouble(); // Read fifth number from user
		
		sum = n1 + n2 + n3 + n4 + n5; // add the five numbers and store total in sum
		avg = sum / 5; // divide sum of five numbers by 5 for average and store result in avg
	
		min = n1; // Declare the 1st number as the smallest
		if (n2 < min) // Compare 2nd number to the smallest
			min = n2; // Replace the smallest with 2nd number if applicable
		if (n3 < min) // Compare 3rd number to the smallest
			min = n3; // Replace the smallest with 3rd number if applicable
		if (n4 < min) // Compare 4th number to the smallest
			min = n4; // Replace the smallest with 4th number if applicable
		if (n5 < min) // Compare 5th number to the smallest
			min = n5; // Replace the smallest with 5th number if applicable
		
		max = n1; // Declare 1st number as largest
		if (n2 > max) // Compare 2nd number to the largest
			max = n2; // Replace the largest with 2nd number if applicable
		if (n3 > max) // Compare 3rd number to the largest
			max = n3; // Replace the largest with 3rd number if applicable
		if (n4 > max) // Compare 4th number to the largest
			max = n4; // Replace the largest with 4th number if applicable
		if (n5 > max) // Compare 5th number to the largest
			max = n5; // Replace the largest with 5th number if applicable
	
		System.out.printf("The sum is %d\n", sum); // Display summation
		System.out.printf("The average is %d\n", avg); // Display average
		System.out.printf("The smallest is &d\n", min); // Display smallest
		System.out.printf("The largest is %d\n", max); // Display largest
	} // End method main

	@Override
	public String toString() {
		return "MathFunctions [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
} // End class MathFunctions
