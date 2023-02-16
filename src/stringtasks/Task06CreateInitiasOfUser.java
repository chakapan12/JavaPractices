package stringtasks;

import java.util.Scanner;

public class Task06CreateInitiasOfUser {
	
	public static void main(String[] args) {

		/*
		 * write a program that can return the initials of the user
		 * 
		 * ex: techcircle school
		 * 
		 * output: T.S
		 * 
		 * Note: Pay attention to the example output
		 * 
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter you lastname");
		String lastName = scan.nextLine();

		System.out.println("Enter you firstname");
		String firstName = scan.nextLine();

		String initial = lastName.toUpperCase().charAt(0) + "." + firstName.toUpperCase().charAt(0);

		System.out.println(initial);

		scan.close();

	}

}
