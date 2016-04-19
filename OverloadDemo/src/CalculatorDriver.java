
public class CalculatorDriver {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print ("Enter the number of items: ");
		int n = input.nextInt();
		double [] numbers = new double [n];

		System.out.print ("Enter the numbers: ");
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
		}
		
		System.out.println ("Sum is " 		+ Calculator.getSum 	(numbers));
		System.out.println ("Average is " 	+ Calculator.getAverage (numbers));
		System.out.println ("Product is " 	+ Calculator.getProduct (numbers));
		
		System.out.println ("Enter a nonnegative integer to find its factorial");
		int k = input.nextInt();
		System.out.println ("Factorial of " + k + " is " + Calculator.getFactorial (k));
		
		input.close();
	}
}
