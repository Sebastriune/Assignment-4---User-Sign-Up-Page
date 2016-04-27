package edu.nvcc.csc200.javafx;
import javax.swing.JOptionPane;

// Regular Expression
//.

public class RegExDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String statement = JOptionPane.showInputDialog("Enter statement");
		String pattern1 = "\\w+@\\w+.\\w+";
		String pattern2 = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,64}";
		System.out.println(statement.matches(pattern1));
		
		// (?=.*[0-9])		# A digit must occur at least once.
		// (?=.*[a-z])		# A lower case letter must occur at least once.
		// (?=.*[A-Z])		# An upper case letter must occur at least once.
		// (?=/*[@#$%^&+=])	# A special character must occur at least once.
		// (?=\S+$)			# No whitespace allowed in the entire string.
		// .{8,64}			# Anything, at least eight places though and less than equals 64.
		
		System.out.println(statement.length());
		if (statement.length() < 8 && statement.matches(pattern1)) {
			System.out.println("Warning password length must be at least 8 chracters");
		}
	}
}
