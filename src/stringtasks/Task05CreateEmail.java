package stringtasks;

import java.util.Scanner;

public class Task05CreateEmail {
	
	public static void main(String[] args) {
		/*
		 * Your team has created a new bank website that requires email address to be
		 * validated. The email string must contain an '@' character. The email string
		 * must contain an '.' character. The '@' must contain at least one character in
		 * front of it. e.g. "a@example.com" is valid while "@example.com" is invalid.
		 * The '.' and '@' must be in the appropriate places. e.g. "mike.smith@com" is
		 * invalid while "mike.smith@example.com" is valid. For a given string, find a
		 * solution that writes true on the console if an email is valid and false if it
		 * is invalid. Examples: str = "test@example.com" --> true str =
		 * "test@example.co.in --> true str = "@example.com" --> false
		 */

		Scanner scan = new Scanner(System.in);

		// Ask user to enter email
		System.out.println("Enter your email");
		String email = scan.nextLine();

		// check if email contain '@', '.' and at least one character in front of it.
		int index1 = email.indexOf('@');
		int index2 = email.indexOf('.');
		int index3 = email.lastIndexOf('.');

		System.out.println(index1 > 0 && index2 > -1 && index1 < index3);

		scan.close();

	}

}
