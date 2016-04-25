import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingFlowLayout extends JFrame {
	private JButton button1, button2, button3, button4, button5;
	public SwingFlowLayout() {
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		setLayout(new FlowLayout());
		add(button1);
		add(button2);
		add(button3);
		add(button4);
		add(button5);
		setVisible(true);
		setSize(new Dimension(500,500));
	}
}
