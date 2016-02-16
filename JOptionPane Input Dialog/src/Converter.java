/**
 * Purpose:
 * Demonstrate how to +,-,/,*,%(modulation) returns a remainder
 *  3/2 = 1 re 1
 *  10/3 = 3 r 1 , 10%3 = 1
 *  11/3 = 3 r 2
 * Date: 2/15/2016
 * @author Bonemyong Koo
 */
import javax.swing.JOptionPane;
class  Converter  {
	public static void main( String[] args )  {
	
		// Prompt the user by using JOptionPane input dialog
		String strCm = JOptionPane.showInputDialog ("Enter a measurement in centimeters: ");
		
		// A wrapper class is a class of the primitive data types.
		double dblCm = Double.parseDouble (strCm);
		
		// Computations
		double 	dblInches 		= dblCm * 0.39;
		int 	intInches 		= (int) dblInches;
		int 	intFeet 		= intInches / 12;
		double 	remInches 		= dblInches % 12;
		String 	remInchesStr 	= String.format ("%.2f", remInches);
		
		// Display the results
		JOptionPane.showMessageDialog (null, "" + dblCm + " centimeters equals " + intFeet + " feet and " + remInchesStr + " inches.");
		}
	}