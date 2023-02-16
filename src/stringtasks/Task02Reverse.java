package stringtasks;

import java.util.Scanner;

public class Task02Reverse {
	
	public static void main(String[] args) {
		/* 
		 Create a class called Reverse, write a program that will reverse a string. 
		 Your program should reverse a string only 5 characters long. If word is shorter, 
		 display message: "Too short!". If word is longer, display message: "Too long!". 
		 Otherwise, reverse this word and print out result into the console. 
		 	input: pizza
			output: azzip
			input:TechCircle
			output: too long
			input: car
			output: too short 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word = scan.nextLine();
		
		int length = word.length();
		
		String revStr = "";
		for(int i = length - 1; i >= 0; i--) {
			revStr += word.charAt(i);
		}
		
		System.out.println("Reverse String is " + revStr);
		
		if(word.equals(revStr)) {
			System.out.println("Word is palindome");
		}else {
			System.out.println("NO");
		}
//			System.out.print(word.charAt(i));
//		}
		
		
		
		
		
		
//		if(length == 5) {
//			for(int i = length - 1; i >= 0; i--) {
//				System.out.print(word.charAt(i));
//			}
//		}	
//		else if(length > 5) {
//			System.out.println("Too long!");
//		}
//		else {System.out.println("Too short!");
//		}
		
		scan.close();

	}

}
