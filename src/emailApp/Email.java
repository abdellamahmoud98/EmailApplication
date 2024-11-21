package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String Department;
	private int mailboxcapacity;
	private String alternateEmail;




	// constractor to recive the first
	public Email(String firstName, String lastName) {
		this.firstName= firstName;
		this.lastName = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

		// Call a method asking for the department - return the department
		this.Department = setDepartment();
		System.out.println("Deparment: " + this.Department);

		// Call a method that returns a random password

	}


	//Ask for the department
	private String setDepartment() {
		System.out.println("DEPARMENT CODES\n1 for sales\n2 for Developoment\n3 for Accounting\n0 for none\nEnter deparment code:  ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) { return "sales";}
		else if (depChoice == 2) {return "dev";}
		else if (depChoice == 3) {return "acct";}
		else {return "";}
//hdhfhfhfhfhf

	}
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFJKLMNSTUQYNHXKKSBDVDK@#$@!*&^";
		char[] password = new char[length];
		for (int i = 0; i>length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		return new String (password);
	}

}

