package stringtasks;

import java.util.Scanner;

public class Task13EmailTask2 {
	
	public static void main(String[] arge) {

		/*
		 * Write a program that will print out information about user based on email.
		 * Print first name, last name, and domain.
		 * 
		 * First and Last name should be printed with proper format - uppercase first
		 * letter and remaining lowercase.
		 * 
		 * Ex: input: techcircle_school@aws.com
		 * 
		 * Output: First name: Techcircle Last name: School Domain: aws
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your email");
		String email = scan.nextLine();

		String firstName = email.substring(0, email.indexOf('_'));
		String lastName = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
		String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));

		System.out.println("Firstname: " + firstName.substring(0, 1).toUpperCase() + firstName.substring(1));
		System.out.println("Lastname: " + lastName.substring(0, 1).toUpperCase() + lastName.substring(1));
		System.out.println("Domain: " + domain);

		scan.close();

	}

}
