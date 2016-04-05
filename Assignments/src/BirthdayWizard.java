import java.util.Scanner;
public class BirthdayWizard
{
  public static void main(String[]args)
  {
      Scanner keyboard = new Scanner( System.in);
      
      short n1, n2;
      
      System.out.println("What is your brith year?");
      n1 = keyboard.nextShort();
      
      System.out.println("Enter your past or future age to know what year that was or will be in: ");
      n2 = keyboard.nextShort();
      
      System.out.print("Your " + n2 +"th birthday will occur or has occurred in ");
      System.out.println(n1 + n2 + ".");
      keyboard.close();
  }
}