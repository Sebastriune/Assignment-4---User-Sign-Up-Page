import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;


public class SwingBorderLayout extends JFrame {
	private JButton button1, button2, button3, button4, button5;
	public SwingBorderLayout() {
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		setLayout(new BorderLayout());
		add(button1, BorderLayout.PAGE_START);
		add(button2, BorderLayout.CENTER);
		add(button3, BorderLayout.PAGE_END);
		add(button4, BorderLayout.LINE_END);
		add(button5, BorderLayout.LINE_START);
		
		setVisible(true);
		setSize(new Dimension(500,500));
		
	}

}
