import java.util.Scanner;

public class StringClass 
{
	public static void main(String[] args) 
	{
		String message = "Welcome to Java"; // == String message = new String("Welcome to Java");
		System.out.println("The lenghth of " + message + " is " + message.length());
		
		String sentence = "Text processing is hard!";
		int position = sentence.indexOf("hard");
		System.out.println(sentence);
		System.out.println("012345678901234567890123");
		System.out.println("The word \"hard\" starts at index " + position);
		int lastPosition = sentence.lastIndexOf('s', 12);
		System.out.println("The last letter \"s\" starts at index " + lastPosition);
		sentence = sentence.toUpperCase();
		System.out.println("The changed string is:");
		System.out.println(sentence);
		
		String river = "Mississippi";
		String replaceResult;
		replaceResult = river.replace("i", "x");
		System.out.println(replaceResult);
		
		String messyString = " Hello, Space! ";
		String trimResult;
		trimResult = messyString.trim();
		System.out.println(trimResult);
		
		String smallLetters;
		smallLetters = river.toLowerCase();
		System.out.println(smallLetters);
		
		// Three strings are concatenated
		String lesson = "Welcome " + "to " + "Java";
		
		// String Cahpter is cancatenated with number 2
		String s1 = "Chapter " + 2; // s becomes Chapter2
		// String Supplement is concatenated with character B
		String s2 = "Supplement " + 'B'; // s1 becomes SupplementB
		String s3 = s1.concat(s2); // == String s3 = s1 + s2;
		System.out.println(lesson + " " + s3);
		
		String content = "Welcome to Java.";
		String subStringResult = content.substring(0, 11) + "HTML";
		System.out.println(subStringResult);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a character: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character entered is " + ch);
		input.close();
		
		String str1 = "Welcome to Java";
		String str2 = "Welcome to Java";
		String str3 = "Welcome to C++";
		String str4 = "welcome to java";
		System.out.println(str1.equals(str2)); // True
		System.out.println(str1.equals(str3)); // False
		System.out.println(str1.equalsIgnoreCase(str4));
		int compareResult;
		compareResult = str2.compareTo(str3);
		System.out.println(compareResult);
		
		String Example = new String ("Welcome to Northern Virginia Community College");
		System.out.print("Return Value :");
		System.out.println(Example.substring(10));
		System.out.print("Return Value :");
		System.out.println(Example.substring(10, 27));
	}
}
