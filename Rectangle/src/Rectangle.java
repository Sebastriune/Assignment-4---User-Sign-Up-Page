import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length of a rectangle: ");
		double length = input.nextDouble();
		System.out.print("Enter the width of a rectangle: ");
		double width = input.nextDouble();
		double area = (length * width);
		double perimeter = 2 * (length + width);
		System.out.println("The area of the rectangle is " + (int)(area * 100) / 100.0 + ".");
		System.out.println("The perimeter of the rectangle is " + (int)(perimeter * 100) / 100.0 + ".");	
		input.close();
	}
}
