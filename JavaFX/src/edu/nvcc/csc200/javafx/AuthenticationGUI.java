package edu.nvcc.csc200.javafx;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AuthenticationGUI extends Application {
	public enum AccountType {Administrator, Student, Staff, Guest};
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Hello World!");

		
		Text sceneTitle = new Text("Welcome");
		sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
		
		String correctUserName = "CSC200";
		String correctPassword = "password";

		primaryStage.setTitle("Authentication");
		Label userNameLbl = new Label("User Name");
		
		TextField userNameTxtFld = new TextField();
		
		Label passwordLbl = new Label("Password");
		
		PasswordField pwTxtFld = new PasswordField();
		
		Button submitBtn = new Button("Log in");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			String inputUserName = "";
			String inputPw = "";
			
			@Override
			public void handle(ActionEvent arg0) {
				// System.out.println("Hello" + userTextField.getText());
				inputUserName = userNameTxtFld.getText();
				inputPw = pwTxtFld.getText();
				if(correctUserName.equals(inputUserName) && correctPassword.equals(inputPw)) {
					AccountType [] choices = { AccountType.Administrator, AccountType.Student, AccountType.Staff, AccountType.Guest};
					AccountType input = (AccountType) JOptionPane.showInputDialog(null, "Select your account type.", "Account Type",
							JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
	            	switch (input)
	        		{
	         		case Administrator: case Staff: case Guest:
	        			JOptionPane.showMessageDialog(null, "Failed Authentication!");
	        			break;
	        		case Student:
	        			JOptionPane.showMessageDialog(null, "Hello CSC200!");
	        			break;
	        		}
				} else {
					JOptionPane.showMessageDialog(null, "Faield Authentication!");
				}
				
			}
		});
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		grid.add(userNameLbl, 0, 0);
		grid.add(passwordLbl, 0, 1);	
		grid.add(userNameTxtFld, 1, 0);
		grid.add(pwTxtFld, 1, 1);
		grid.add(submitBtn, 1, 2);
		grid.setPadding(new Insets(25, 25, 25, 25));
		// TextField text = new TextField();
		
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
	Application.launch(args);
	}
}
			
		
	
