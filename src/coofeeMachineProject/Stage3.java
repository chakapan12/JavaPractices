package coofeeMachineProject;

import java.util.Scanner;

public class Stage3 {

	public static void main(String[] args) {
		
		System.out.println("STAGE 3");
		System.out.println();
		
		CoffeeMachine cm = new CoffeeMachine();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Write how many ml of water the coffee machine has: ");
		cm.amountOfWater = scan.nextInt();
	
		System.out.println("Write how many ml of milk the coffee machine has: ");
		cm.amountOfMilk = scan.nextInt();
	
		System.out.println("Write how many grams of coffee beans the coffee machine has: ");
		cm.amountOfCoffeeBeans = scan.nextInt();
	
		System.out.println("Write how many cups of coffee you will need: ");
		int cupOfCoffee = scan.nextInt();
		
		int numberCupOfCoffeeAvailable = cm.getTotalCupOfCoffeeAvaiable(cm.amountOfWater, cm.amountOfMilk, cm.amountOfCoffeeBeans);
		
		if (numberCupOfCoffeeAvailable == cupOfCoffee) {
			System.out.println("Yes I can make that amount of coffee");
			
		} else if (numberCupOfCoffeeAvailable > cupOfCoffee) {
			System.out.println("Yes I can make that amount of coffee (and even " + (numberCupOfCoffeeAvailable - cupOfCoffee)
					+ " more than that)");
			
		} else {
			System.out.println("No, I can make only " + numberCupOfCoffeeAvailable + " cup(s) of coffee");
		}
		
		scan.close();

	}

}
