import javax.swing.JOptionPane;

public class ChangeComputer
{
     // main method begins execution of Java program
     public static void main(String[] args)
     {
          double amount; // Amount entered from the keyboard

          // Receive the amount entered from the keyboard
          String amountString = JOptionPane.showInputDialog(null,
               "Enter an amount in double, for example 23.97: ",
               "Compute Change Input", JOptionPane.QUESTION_MESSAGE);

          // Convert string to double
          amount = Double.parseDouble(amountString);
          int remainingAmount = (int)(amount * 100);

          // Find the number of one dollars
          int numOfOneDollars = remainingAmount / 100;
          remainingAmount = remainingAmount % 100;

          // Find the number of quarters in the remaining amount
          int quarters = remainingAmount / 25;
          remainingAmount = remainingAmount % 25;

          // Find the number of dimes in the remaining amount
          int dimes = remainingAmount / 10;
          remainingAmount = remainingAmount % 10;

          // Find the number of nickels in the remaining amount
          int nickels = remainingAmount / 5;
          remainingAmount = remainingAmount % 5;

          // Find the number of pennies in the remaining amount
          int pennies = remainingAmount;

          // Display results
          JOptionPane.showMessageDialog(null, "Your amount " + amount + " consists of\n"
        		  + "    " + numOfOneDollars + " dollars\n"
        		  + "    " + quarters + " quarters\n"
        		  + "    " + dimes + " dimes\n"
        		  + "    " + nickels + " nickels\n"
        		  + "    " + pennies + " pennies", 
        		  "Currency Breakdown Output", JOptionPane.INFORMATION_MESSAGE);
     } //end method main
}