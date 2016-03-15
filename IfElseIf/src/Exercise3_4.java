import javax.swing.JOptionPane;

public class Exercise3_4 {

	public static void main(String[] args) {
		String numPeople = JOptionPane.showInputDialog("Enter the number of people");
		String numPlayers = JOptionPane.showInputDialog("Enter the number of players");
		Short ShortNumPeople = Short.parseShort(numPeople);
		Short ShortNumPlayers = Short.parseShort(numPlayers);
		int groupSize=0;
		int teamSize=0;
		// &&, ||, !, ==, >, <, >=, <=
		if(ShortNumPeople>10) {
				groupSize = ShortNumPeople/2;
		}	else if (ShortNumPeople>=3 && ShortNumPeople<=10) {
					groupSize = ShortNumPeople/3;
		} else {
				System.out.println ("The number of people has to be at least 3.");
		}

		if(ShortNumPlayers>=11 && ShortNumPlayers<=55) {
				teamSize = ShortNumPlayers/11;
		}	else {
				teamSize = 1;
		}
		JOptionPane.showMessageDialog(null, "The number of people is " + numPeople + ".\n"
				+ "Group size is " + groupSize + ".\n"
				+ "The number of player is " + numPlayers + ".\n"
				+ "Team size is " + teamSize + ".");
	}
}
