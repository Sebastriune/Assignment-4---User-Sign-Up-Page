package edu.nvcc.csc200.javafx;

import java.util.Collections;

import edu.nvcc.csc200.javafx.AuthenticationGUI.AccountType;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class UserDriver extends Application {
	private static final int SIZE = 10;
	private static User[] users = new User[SIZE];
	private int count = 0;

	public static void main(String[] args) {
		launch(args);
		int i = 0;
		while (i < SIZE) {
			System.out.println(users[i]);
			i++;
		}
	}

	public void start(Stage primaryStage) {
		primaryStage.setTitle ("Sign Up Page");
		

		
		Label firstNameLbl = new Label ("First Name");
		Label lastNameLbl = new Label ("Last Name");
		Label userNameLbl = new Label ("User Name");
		Label passwordLbl = new Label ("Password");
		Label emailLbl = new Label ("Email");
		Label confirmPasswordLbl = new Label ("Confirm Passwrod");
		Label accountLbl = new Label ("Account Type");
		TextField firstNameTxtFld = new TextField();
		TextField lastNameTxtFld = new TextField();
		TextField userNameTxtFld = new TextField();
		TextField emailTxtFld = new TextField();
		PasswordField pwTxtFld = new PasswordField();
		PasswordField confirmPwTxtFld = new PasswordField();
		ComboBox acTypeCmbBox = new ComboBox();
		Label errorLbl = new Label("Error");
		errorLbl.setTextFill(Color.web("#FF0000"));
		errorLbl.setVisible(false);
		// errorLbl.setStyle ("-fx-foreground-color: red;");
		acTypeCmbBox.getItems().addAll(AccountType.values());
		
		Button submitBtn = new Button ("Sign Up");
		submitBtn.setOnAction(new EventHandler<ActionEvent>() {
			String inputFirstName = "";
			String inputLastName = "";
			String inputEmail = "";
			String inputUserName = "";
			String inputPw = "";
			String inputConfirmPw = "";
			AccountType inputAccountType;
			
			boolean uNameStatus = false;
			boolean firstNameStatus = false;
			boolean lastNameStatus = false;
			boolean emailStatus = false;
			boolean pwStatus = false;
			boolean confirmPwStatus = false;
			String errorText = "";
			@Override
			public void handle(ActionEvent arg0) {
				uNameStatus = validate (userNameTxtFld);
				firstNameStatus = validate (firstNameTxtFld);
				lastNameStatus = validate (lastNameTxtFld); 
				emailStatus = validate (emailTxtFld); 
				pwStatus = validate (pwTxtFld);
				confirmPwStatus = validate (confirmPwTxtFld);
				if (!firstNameStatus) {
					errorText += Configuration.FIRSTNAME_ERROR + "\n";
				}
				if (!uNameStatus) {
					errorText += Configuration.USERNAME_ERROR + "\n";
				}
				if (!lastNameStatus) {
					errorText += Configuration.LASTNAME_ERROR + "\n";
				}
				if (!emailStatus) {
					errorText += Configuration.EMAIL_ERROR + "\n";
				}
				if (!pwStatus) {
					errorText += Configuration.PASSWORD_ERROR + "\n";
				}
				if (!confirmPwStatus) {
					errorText += Configuration.CONFIRMATION_PW_ERROR + "\n";
				}
				if (uNameStatus && firstNameStatus && lastNameStatus && emailStatus && pwStatus && confirmPwStatus) { // No errors create account
					inputFirstName = firstNameTxtFld.getText();
					inputLastName = lastNameTxtFld.getText();
					inputEmail = emailTxtFld.getText();
					inputUserName = userNameTxtFld.getText();
					inputPw = pwTxtFld.getText();
					inputAccountType = AccountType.valueOf(acTypeCmbBox.getPromptText());
					//users[count] = new User(inputFirstName, inputLastName, inputEmail, inputUserName, inputPw, inputAccountType);
					users[count] =	new User (inputFirstName, inputLastName, inputEmail, inputUserName, inputPw, inputAccountType);
					count++;
				}
			}
		});
		
		GridPane grid = new GridPane();
		grid.setAlignment(Pos.CENTER);
		grid.setVgap(10);
		grid.setHgap(10);
		
		grid.add(firstNameLbl, 0, 0);
		grid.add(lastNameLbl, 0, 1);
		grid.add(emailLbl, 0, 2);
		grid.add(userNameLbl, 0, 3);
		grid.add(passwordLbl, 0, 4);
		grid.add(confirmPasswordLbl, 0, 5);
		grid.add(accountLbl, 0, 6);
		grid.add(firstNameTxtFld, 1, 0);
		grid.add(lastNameTxtFld, 1, 1);
		grid.add(emailTxtFld, 1, 2);
		grid.add(userNameTxtFld, 1, 3);
		grid.add(pwTxtFld, 1, 4);
		grid.add(pwTxtFld, 1, 5);
		grid.add(acTypeCmbBox, 1, 6);
		grid.add(submitBtn, 1, 7);
		grid.add(errorLbl, 1, 9);
		
		Scene scene = new Scene (grid, 500, 500);
		scene.getStylesheets().add("JavaFx.css");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	private boolean validate(TextField tf) {
		boolean pass = false;
		ObservableList<String> styleClass = tf.getStyleClass();
		if (tf.getText().trim().length() == 0) {
			if (!styleClass.contains("error")) {
				styleClass.add("error");
			}
		} else {
			// Remove all occurrences:
			styleClass.removeAll(Collections.singleton("error"));
			pass = true;
		}
		return pass;
	}
	
	private boolean validate(PasswordField tf) {
		boolean pass = false;
		ObservableList<String> styleClass = tf.getStyleClass();
		if (tf.getText().trim().length() == 0) {
			if (!styleClass.contains("error")) {
				styleClass.add("error");
			}
		} else {
			// Remove all occurrences:
			styleClass.removeAll(Collections.singleton("error"));
			pass = true;
		}
		return pass;
	}
}

