package stringtasks;

import java.util.Scanner;

public class Task08CheckCharacterInString {
	
	public static void main(String[] args) {
		/*
		 write a program that asks the user enter a three letter word. 
		 Check if the middle character of the given word is 'a'. 
		 In the case it is print: "Cool word", but in the case the middle 
		 letter is not 'a' print: "Okay word". - If the user does not enter 
		 a 3 letter word tell them: If the word is less than 3 letters: 
		 "Word is too short" If the word is too long: "Word is too long" 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a three letter word");
		String word = scan.nextLine();
		
		while(word.length() != 3) {
			if(word.length() > 3) {
				System.out.println("Word is too long");
				System.out.println("Enter a three letter word");
				word = scan.nextLine();
			}
			else {System.out.println("Word is too short");
				System.out.println("Enter a three letter word");
				word = scan.nextLine();
			}
		}
		
		if(word.indexOf('a') == 1) {
			System.out.println("Cool word");
		}
		else {System.out.println("Okay word");
		}
		
		scan.close();

	}

}
