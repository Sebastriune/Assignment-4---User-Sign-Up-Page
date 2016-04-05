import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		double base = input.nextDouble();
		System.out.print("Enter the exponent number: ");
		double exponent = input.nextDouble();
		System.out.println(base + "^" + exponent + " is " + Math.pow(base, exponent) + ".\n");
		
		System.out.print("Enter your number to find its square root: ");
		double number = input.nextDouble();
		System.out.println("The positive square root of " + number + " is " + Math.sqrt(number) + ".");
		System.out.println("The absolute value of " + number + " is " + Math.abs(number) + ".\n");
		
		System.out.println("The lucky number you have for now is " + (int)(Math.random() * 10) + ".\n");
		
		System.out.print("Enter your two numbers to compare: ");
		double i = input.nextDouble();
		double j = input.nextDouble();
		System.out.println("The maxum of " + i + " and " + j + " is " + Math.max(i, j) + ".");
		System.out.println("The minimum of " + i + " and " + j + " is " + Math.min(i, j) + ".\n");
		
		System.out.print("Enter your decimal number: ");
		double num = input.nextDouble();
		System.out.println("The rounded value of " + num + " is " + Math.round(num) + ".");
		System.out.println(Math.ceil(num) + " is rounded up to its nearest integer of " + num + ".");
		System.out.println(Math.floor(num) + " is rounded down to its nearest integer of " + num + ".");
		
		input.close();
	}
}
