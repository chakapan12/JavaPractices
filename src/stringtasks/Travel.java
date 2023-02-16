package stringtasks;

import java.util.Scanner;

public class Travel {
	
	public static void main(String[] arge) {

		/*
		 * challenge2
		 * 
		 * `Create a class called Travel. Make a cost variable to calculate how much the
		 * person will owe after everything. Ask the user if they have a valid passport
		 * (yes or no) If the user enters yes: The base cost of the ticket should be set
		 * to: 1000 Ask the user the country they to travel to (String, multiple word)
		 * Ask the user how many bags they will take with them (byte) > Each bag will
		 * add 50 to the cost Ask the user how many people they will travel with (short)
		 * > For each person the cost is reduced by 100. Up to a limit of 300. Ask the
		 * user to Enter the name of the people they will travel with in one line,
		 * separating each name with a comma (String, multiple word)
		 * 
		 * Print: "Your ticket is booked to $countryName. We have charged extra for the
		 * $numberOfBags bags but you are traveling with $peopleYouTravelWith so we are
		 * giving a discount. Your total cost is $costAmount"
		 * 
		 * 
		 * If the user enters no: The base cost of the passport renewal is: 200 Ask the
		 * user when their passport expired(int) > Each year it was expired adds 75 to
		 * the cost Ask the user which country they plan to travel Ask the user if they
		 * will be traveling in the next year (String - yes or no) > If yes: add 100 to
		 * the cost > If no: subtract 50 from the cost
		 * 
		 * Print: "Looks like your password has been expired for $years, but not to
		 * worry we will get it ready for you to travel to $allCountries. Your total
		 * cost has come out to $costAmount."
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Do you have valid passport? (Yes or No)");
		String validPassport = scan.nextLine();

		if (validPassport.equalsIgnoreCase("Yes")) {
			double baseCost = 1000;
			System.out.println("Which country will you travel to?");
			String countryName = scan.nextLine();

			System.out.println("How many bags do you have?");
			byte numberOfBag = scan.nextByte();
			double bagCost = numberOfBag * 50;

			System.out.println("How many people will you travel with?");
			short numberOfPeople = scan.nextShort();

			double discount = numberOfPeople * 100;
			double totalDiscount;
			if (discount < 300) {
				totalDiscount = discount;
			} else {
				totalDiscount = 300;

			}

			double totalCost = baseCost + bagCost - totalDiscount;

			System.out.println("Your ticket is booked to " + countryName + ". " + "We have charged extra for the "
					+ numberOfBag + " bags, \nbut you are traveling with " + numberOfPeople + " people"
					+ ", so we are giving a discount. your total cost is $" + totalCost);

		}

		else {
			int baseCostOfRenewal = 200;
			System.out.println("When did your passport expire?");
			int yearExpire = scan.nextInt();
			int yearPresent = 2022;
			int totalYearExpire = yearPresent - yearExpire;
			int costPerYear = totalYearExpire * 75;
			
			scan.nextLine();

			System.out.println("Which country do you plan to travel?");
			String countryName = scan.nextLine();

			System.out.println("Will you be traveling next year? (yes or no)");
			String nextYearTravel = scan.nextLine();

			int urgentCost;
			if (nextYearTravel.equalsIgnoreCase("Yes")) {
				urgentCost = 100;
			} else {
				urgentCost = -50;
			}

			int totalCost = baseCostOfRenewal + costPerYear + urgentCost;

			System.out.println("Looks like your password has been expired for " + totalYearExpire + " years"
					+ " , but not to worry \nwe will get it ready for you to travel to " + countryName
					+ ". Your total cost has come out to $" + totalCost);

		}

		scan.close();

	}

}
