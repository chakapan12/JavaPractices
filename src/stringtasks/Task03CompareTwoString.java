package stringtasks;

import java.util.Scanner;

public class Task03CompareTwoString {
	
	public static void main(String[] args) {
		// write a program that asks user to enter two strings, and print out the longest string
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 2 String");
		
		System.out.println("First");
		String firstStr = scan.nextLine();
		
		System.out.println("Second");
		String secondStr = scan.nextLine();
		
		if(firstStr.length() > secondStr.length()) {
			System.out.println(firstStr);
		}
		else {System.out.println(secondStr);
		}

		scan.close();

	}

}
