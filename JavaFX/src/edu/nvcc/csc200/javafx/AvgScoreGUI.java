package edu.nvcc.csc200.javafx;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AvgScoreGUI extends JFrame implements ActionListener {
	final int SIZE = 7;
	JButton jbtCalculate = new JButton("Calculate");
	// Score text fields
	JTextField []jtxtScore = new JTextField[SIZE];
	JTextField []jtxtWeight = new JTextField[SIZE];
	// JTextField jtxtName = new JTextField(20);
	JLabel [] jlblModuleName = new JLabel[SIZE];
	// JLabel jlblOutput = new JLabel("0");
	JPanel scorePanel = new JPanel();
	JPanel buttonPanel = new JPanel();
	
	double [] scores = new double [SIZE];
	double [] weights = new double[SIZE];
	// double [] x = {9.0,10.5};
	
	/**
	 * Construct the Graphic User Interface for score calculator.
	 */
	public AvgScoreGUI() {
		// Score panel (top)
		jlblModuleName[0] = new JLabel ("Student Name");
		jlblModuleName[1] = new JLabel ("Assignments");
		jlblModuleName[2] = new JLabel ("Midterm Exam");
		jlblModuleName[3] = new JLabel ("Final Project");
		jlblModuleName[4] = new JLabel ("Final Exam");
		jlblModuleName[5] = new JLabel ("Grade Average");
		jlblModuleName[6] = new JLabel ("Letter Grade");
		
		scorePanel.setBackground (Color.CYAN);
		scorePanel.setLayout (new GridLayout(7,3));
		
		for (int i = 0; i < SIZE; i++) {
			scorePanel.add(jlblModuleName[i]);
			jtxtScore[i] = new JTextField(8);
			scorePanel.add (jtxtScore[i]);
			jtxtWeight[i] = new JTextField(8);
			scorePanel.add (jtxtWeight[i]);
		}
		
		// Button panel (bottom)
		buttonPanel.setBackground(Color.GREEN);
		jbtCalculate.addActionListener(this);
		buttonPanel.add(jbtCalculate);
		
		add(scorePanel, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		setVisible(true);
		pack();
		setLocationRelativeTo(null);
	}
	
	/**
	 * Calculate grade average scores
	 * @param score
	 * @param weight
	 * @return
	 */
	public double calculateScore (double []score, double []weight) {
		double grade = 0.0;
		// Logic to calculate
		// Need to modify the code below to support the correct logic
		// The following line of code is only for demonstration of how to access a value in an array.
		grade = score[0] * weight[0];
		return grade;
	}
	
	/**
	 * Calculate letter grade
	 * 
	 * @param score 
	 * 				grade average score
	 * @return letter grade A, B, C, D, F
	 */
	public char calculateLetterGrade (double score) {
		char letter = 'N';
		// Logic to find letter grade
		// Use if..else or switch case
		
		return letter;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		// Parse string to double for calculation
		for (int i = 0; i < scores.length; i++) {
			scores[i]  = Double.parseDouble (jtxtScore[i].getText());
			weights[i] = Double.parseDouble (jtxtWeight[i].getText());
		}
		
		jtxtScore[6].setText (calculateScore (scores,weights) + "");
	}
}
