import java.util.Scanner;

public class Exercise3_5 
{
	private static Scanner keyboard;

	public static void main(String[] args) 
	{
		System.out.println("Select User Role");
		keyboard = new Scanner(System.in);
		String answer = keyboard.next();
		switch (answer.toLowerCase())
		{
		case "administrator":
			System.out.println("Welcome Administraotr!");
			break;
		case "faculty":
			System.out.println("Welcome Faculty!");
			break;
		case "student":
			System.out.println("Welcome Student!");
			break;
		case "guest":
			System.out.println("Welcome Guest!");
			break;
		case "staff":
			System.out.println("Welcome Staff!");
			break;
		}
	}
}
