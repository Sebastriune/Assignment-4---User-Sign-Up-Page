/**
 * Created by Koo on 3/21/2016.
 */
import javax.swing.JOptionPane;
public class Exercise3_6 {
        public enum Month {January, February, March, April, May, June, July, August, September, October, November, December}
        
        public static void main(String[] args) {
        	
            Month[] choices = { Month.January, Month.February, Month.March, Month.April, Month.May, Month.June,
                Month.July, Month.August, Month.September, Month.October, Month.November, Month.December};
            
            Month input = (Month) JOptionPane.showInputDialog(null,"Select your month.", "Month",
                    JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
            
            while (input != null) {
            	switch (input)
        		{
         		case December: case January: case February:
        			JOptionPane.showMessageDialog(null, "Do you want to build a snow man?");
        			break;
        		case March: case April: case May:
        			JOptionPane.showMessageDialog(null, "Happy Spring days!");
        			break;
        		case June: case July: case August:
        			JOptionPane.showMessageDialog(null, "It's a summer time.");
        			break;
        		case September: case October: case November:
        			JOptionPane.showMessageDialog(null, "Welcome to the foilage season!");
        			break;
        		default:
        			JOptionPane.showMessageDialog(null, "Wrong Choice!");
                }
                input = (Month) JOptionPane.showInputDialog (null,"Select your month.", "Month",
                        JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
                }
            JOptionPane.showMessageDialog(null, "Good Bye!");
            }
}
