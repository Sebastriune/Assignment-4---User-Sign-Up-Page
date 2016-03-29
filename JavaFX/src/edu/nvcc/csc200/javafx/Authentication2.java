package edu.nvcc.csc200.javafx;

import javax.swing.JOptionPane;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Authentication2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		String correctUserName = "CSC200";
		String correctPassword = "password";
		primaryStage.setTitle("Authentication");
		Label userNameLbl = new Label("User Name");
		Label passwordLbl = new Label("Password");
		TextField userNameTxtFld = new TextField();
		TextField pwTxtFld = new PasswordField();
		
		Button submitBtn = new Button("Submit");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			String inputUserName = "";
			String inputPw = "";
			
			@Override
			public void handle(ActionEvent arg0) {
				int failureCount = 0;
				do {
					JOptionPane.showMessageDialog(null, "Failed Authentication!");
					inputUserName = userNameTxtFld.getText();
					inputPw = pwTxtFld.getText();
					failureCount += 1;
				} while (failureCount < 3); 
				if (correctUserName.equals(inputUserName) && correctPassword.equals(inputPw)) {
				JOptionPane.showMessageDialog(null, "Welcome " + inputUserName + "!");
				} else {
					JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");
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
		
		Scene scene = new Scene(grid, 500, 500);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	public static void main(String[] args) {
	Application.launch(args);
	}
}
			
		
	
