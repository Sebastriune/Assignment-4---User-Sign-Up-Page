import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CalculatorGUI implements ActionListener {
	// JFrame: windows frame
	private JFrame frame; 
	// JPanel: separate sections in a frame
	private JPanel panel;
	// JLabel: text
	private JLabel label;
	private JLabel output;
	// JTextField: for user input
	private JTextField textField1;
	private JTextField textField2;
	// JButton: user can click
	private JButton button;
	
	// Constructor: to initialize the instance variables.
	public CalculatorGUI() {
		frame = new JFrame("Calculator");
		frame.setVisible(true);
		frame.setSize(350, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setBackground(Color.GREEN);
		
		label = new JLabel();
		label.setText("Enter numer");
		output = new JLabel();
		output.setText("--------");
		
		textField1 = new JTextField(5);
		textField2 = new JTextField(5);
		
		button = new JButton("Find the total of two numbers.");
		button.addActionListener(this);
		
		panel.add(label);
		panel.add(textField1);
		panel.add(textField2);
		panel.add(button);
		panel.add(output);
		
		frame.add(panel);
	}
	
	public void actionPerformed(ActionEvent e) {
		// System.out.println(textField1.getText() + textField2.getText());
		double num1 = Double.parseDouble(textField1.getText());
		double num2 = Double.parseDouble(textField2.getText());
		double product = num1 + num2;
		output.setText(String.valueOf(product));
	}
}
