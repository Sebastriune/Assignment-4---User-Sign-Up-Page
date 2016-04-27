package edu.nvcc.csc200.javafx;

import edu.nvcc.csc200.javafx.AuthenticationGUI.AccountType;

public class User {
	private String firstName;
	private String LastName;
	private String email;
	private String username;
	private String password;
	private AccountType accountType;
	
	public User() {
		username = "root";
		password = "password";
		accountType = AccountType.Student;
	}
	
	public User (String username) {
		this.username = username;
		password = "password";
		accountType = AccountType.Student;
	}
	
	public User (String username, String password) {
		this.username = username;
		this.password = password;
		accountType = AccountType.Student;
	}
	
	public User (String firstName, String lastName, String email,
			String username, String password, AccountType AccountType) {
		super();
		this.firstName = firstName;
		this.LastName = lastName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.accountType = AccountType;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName (String lastName) {
		LastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail (String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername (String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	
	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType (AccountType accountType) {
		this.accountType = accountType;
	}
	
	public String toString() {
		return this.username + "\t" + this.password + "\t" + this.accountType;
	}



}
