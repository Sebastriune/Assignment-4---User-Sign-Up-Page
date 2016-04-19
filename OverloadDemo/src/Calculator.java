/* The calculator class has no state; only behavior (only methods)
 */
public class Calculator {
	
	// Constructor is empty because Calculator does not have state.
	public Calculator() {}
	
	//----------------------------------------------------------
	// Sum of an Array of doubles
	public static double getSum (double[] nums) {
		
		double sum = 0.0;
		for (double num: nums) {
		 sum += num;
		}
		return sum;
		
	} // getSum
	
	//----------------------------------------------------------
	// Sum of an Array of ints
	public static int getSum (int[] nums) {
		
		int sum = 0;
		for (double num: nums) {
		 sum += num;
		}
		return sum;
		
	} // getSum
	
	//----------------------------------------------------------
	// Average of an Array of doubles
	public static double getAverage (double[] nums) {
		return getSum (nums) / nums.length;
	}
	
	//----------------------------------------------------------
	// Average of an Array of ints
	public static double getAverage (int[] nums) {
		return (getSum (nums) + 0.0) / nums.length;
	}
	
	//----------------------------------------------------------
	// Product of an Array of doubles
	public static double getProduct (double[] nums) {
		
		double product = 1.0;
		for (double num: nums) {
		 product *= num;
		}
		return product;
		
	} // getProduct
	
	//----------------------------------------------------------
	// Product of an Array of integers
	public static int getProduct (int[] nums) {
		
		int product = 1;
		for (double num: nums) {
		 product *= num;
		}
		return product;
		
	} // getProduct
	
	//----------------------------------------------------------
	public static int getFactorial (int n) {
		
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	//----------------------------------------------------------
}
