package stringtasks;

import java.util.Scanner;

public class Task14NameFormat {
	
	public static void main(String[] args) {
		/*
		 * Write a program that asks user to enter first and last names, and then prints
		 * the full name in regular format (first character in upper case)
		 * 
		 * input: firstName = "tecHCIrcle" lastName = "SCHOOL";
		 * 
		 * output: Techcircle School
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter your firstname");
		String firstName = scan.nextLine();

		System.out.println("Enter your lastname");
		String lastName = scan.nextLine();

		System.out.println(firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase()
				+ " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase());

		scan.close();

	}

}
