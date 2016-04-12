import javax.swing.JOptionPane;

public class Authentication 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String corUser = "CSC200";
		String corPW = "password";
		int trial = 0;
		int LIMIT = 3;
		
		do {
			String uInput = JOptionPane.showInputDialog("Enter user name");
			if (!(uInput.equalsIgnoreCase(corUser)) && (trial < LIMIT)) 
			{
				trial++;
				System.out.println("Invalid Username");
			} else {
				do {
				String pInput = JOptionPane.showInputDialog("Enter password");
					if (!(pInput.equalsIgnoreCase(corPW)) && (trial < LIMIT)) 
					{
					trial++;
					System.out.println("Invalid Password");
					} else if (trial < LIMIT) {
					String[] choices = {"Admin", "Student", "Staff"};
					String input = (String)JOptionPane.showInputDialog (null, "Choose account type...", 
							"Account Type", JOptionPane.QUESTION_MESSAGE, null, choices, choices[1]);
					System.out.println(input);
					// Demonstrate how to use switch case instead
				    	switch (input) {
				 		case "Admin":
				 			JOptionPane.showMessageDialog(null, "Welcome Admin!  You can update and read file.");
							break;
				 		case "Student": 
				 			JOptionPane.showMessageDialog(null, "Welcome Student!  You can only read file.");
							break;
						case "Staff": 
							JOptionPane.showMessageDialog(null, "Welcome Staff!  You can update, read, add, and delete file.");
							break;
				    	}
					}
				} while (trial < LIMIT);
			}
		} while(trial < LIMIT);
		System.out.println("Contact Administrator");
	}
}
