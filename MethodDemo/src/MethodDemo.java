import java.util.Scanner;

public class MethodDemo {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integers
		System.out.print("Enter x: ");
		int x = input.nextInt();
		System.out.print("Enter y: ");
		int y = input.nextInt();
		System.out.print("Enter z: ");
		int z = input.nextInt();
		System.out.println("h(" + x + ") is " + h(x) + " and f(" + x + "," + y + ") is "
			+ f(x,y) + " and g(" + x + "," + y + "," + z + ") is " + g(x,y,z) + ".");
		input.close();
	}
	
	public static double h(double x) {
		return x * x * x * x * x * x * x * x * x * x;
	}
	
	public static double f(double x, double y) {
		return x + y;
	}
	
	public static double g(double x, double y, double z) {
		return sqrt(x) + absolute(y) + pow(z,y);
	}

	public static double sqrt(double num) {
	    double g1;
	    double squareRoot = num / 2;
	    do  {
	        g1=squareRoot;
	        squareRoot = (g1 + (num / g1)) / 2;
	    }
	    while((g1 - squareRoot) != 0);
		return squareRoot;
	}
	
	public static double absolute(double num) {
		return (num>=0)?num:(-1*num);
	}
	
	public static double pow(double base, double exponent) {
		int result = 1;
		for (int i = 0; i < exponent; i++) {
			result *= base;
		}
		return result;
	}
}
