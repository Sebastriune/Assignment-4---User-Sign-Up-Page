import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingDemo extends JFrame {
	private JButton button1, button2, button3, button4, button5;
	public SwingDemo() {
		JTextField[] textFields = new JTextField[2];
		for (int i = 0; i < 2; i++) {
			JTextField textField  = new JTextField();
			textField.setSize(50, 50);
			add (textField);
			textFields [i] = textField;
		}
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		setLayout(new GridLayout(3,2));
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		setVisible(true);
		setSize(new Dimension(500,500));
	}
}
