package stringtasks;

import java.util.Scanner;

public class TipCalculator {
	
	public static void main(String[] arge) {

		/*
		 * challenge1
		 * 
		 * `Create a class called TipCalculator, write a program for a tip calculator.
		 * There will be different service quality benchmarks that will determine the
		 * tip given. There will also the ability to calculate based on the number of
		 * people in the party and if there is a split of the bill or not.
		 * 
		 * Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%
		 * 
		 * The program should display the following information based on the user input:
		 * 
		 * Split or No split (Yes or No), Number of people entered: (number) (each
		 * person = & in output) Check amount: (number) Service Quality: (String) Total
		 * to pay: Total tip: Total per person: Tip per person:
		 * 
		 * Ex: Split or No split (Yes or No)? Yes Enter the number of people 4 Enter the
		 * check amount: 476 How was the srvice quality?
		 * (Excellent/Great/Good/Fair/Poor) Excellent
		 * 
		 * output: Number of people entered: 4 Total to pay: 595.0 Total tip: 119.0
		 * Total per person: 148.75 Tip per person: 29.75
		 * 
		 * HINT: you will need to use .equals() method
		 */

		Scanner scan = new Scanner(System.in);

		// Ask if want to split or not
		System.out.println("Would you like to split your check? (Yes or No)");
		String checkSplit = scan.nextLine();

		// Ask for how many people
		System.out.println("Enter number of people");
		int numberOfPeople = scan.nextInt();

		System.out.println("Enter the check amount");
		double checkAmount = scan.nextDouble();

		scan.nextLine();

		System.out.println("How was the service quality?");
		System.out.println("(Excellent/Great/Good/Fair/Poor)");
		String serviceQuality = scan.nextLine();
		
		double tipAmount = 0;
		double totalPerPerson = 0;
		double tipPerPerson = 0;

		if (serviceQuality.equalsIgnoreCase("Excellent")) {
			tipAmount = checkAmount * 0.25;
		} else if (serviceQuality.equalsIgnoreCase("Great")) {
			tipAmount = checkAmount * 0.20;
		} else if (serviceQuality.equalsIgnoreCase("Good")) {
			tipAmount = checkAmount * 0.15;
		} else if (serviceQuality.equalsIgnoreCase("Fair")) {
			tipAmount = checkAmount * 0.10;
		} else if (serviceQuality.equalsIgnoreCase("Poor")) {
			tipAmount = checkAmount * 0.05;
		}

		double totalToPay = checkAmount + tipAmount;

		if (checkSplit.equalsIgnoreCase("Yes")) {
			totalPerPerson = totalToPay / numberOfPeople;
			tipPerPerson = tipAmount / numberOfPeople;
			System.out.println("Number of people entered: " + numberOfPeople);
			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tip: " + tipAmount);
			System.out.println("Total per person: " + totalPerPerson);
			System.out.println("Tip per person: " + tipPerPerson);
		} else {
			totalPerPerson = totalToPay;
			tipPerPerson = tipAmount;
			System.out.println("Number of people entered: " + numberOfPeople);
			System.out.println("Total to pay: " + totalToPay);
			System.out.println("Total tip: " + tipAmount);
		}

		scan.close();

	}

}
