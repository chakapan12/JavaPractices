package coofeeMachineProject;

import java.util.Scanner;

public class CoffeeMaker{
	
	public static void main(String[] args) {
		
		CoffeeMachine cm = new CoffeeMachine();
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("STAGE 2");
		System.out.println();
		
		System.out.println("Write how many cups of coffee you will need: ");
		int cupOfCoffee = scan.nextInt();
		
		System.out.println("\nFor " + cupOfCoffee + " cups of coffee you will need: ");
		
		System.out.println((cupOfCoffee * 200) + " ml of water");
		System.out.println((cupOfCoffee * 50)+ " ml of milk");
		System.out.println((cupOfCoffee * 15)+ " g of coffee beans");
		
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		
		System.out.println("STAGE 3");
		System.out.println();
		
		System.out.println("Write how many ml of water the coffee machine has: ");
		cm.amountOfWater = scan.nextInt();
	
		System.out.println("Write how many ml of milk the coffee machine has: ");
		cm.amountOfMilk = scan.nextInt();
	
		System.out.println("Write how many grams of coffee beans the coffee machine has: ");
		cm.amountOfCoffeeBeans = scan.nextInt();
	
		System.out.println("Write how many cups of coffee you will need: ");
		cupOfCoffee = scan.nextInt();
		
		int numberCupOfCoffeeAvailable = cm.getTotalCupOfCoffeeAvaiable(cm.amountOfWater, cm.amountOfMilk, cm.amountOfCoffeeBeans);
		
		if (numberCupOfCoffeeAvailable == cupOfCoffee) {
			System.out.println("Yes I can make that amount of coffee");
			
		} else if (numberCupOfCoffeeAvailable > cupOfCoffee) {
			System.out.println("Yes I can make that amount of coffee (and even " + (numberCupOfCoffeeAvailable - cupOfCoffee)
					+ " more than that)");
			
		} else {
			System.out.println("No, I can make only " + numberCupOfCoffeeAvailable + " cup(s) of coffee");
		}
		
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		
		System.out.println("STAGE 4");
		System.out.println();
		
		CoffeeMachine cm1 = new CoffeeMachine(400, 540, 120, 9, 550);
		
		cm1.remaining();
		
		System.out.println("Write action (buy, fill, take):");
		String action = scan.next();
		
		switch(action) {
		case "buy":
			cm1.buyStage4();
			break;
				
		case "fill":
			cm1.fill();
			break;
			
		case "take":
			cm1.take();
			break;
		}	

		cm1.remaining();
		
		System.out.println();
		System.out.println("====================================================================================");
		System.out.println();
		
		System.out.println("STAGE 5 & 6");
		System.out.println();
	
		CoffeeMachine cm2 = new CoffeeMachine(400, 540, 120, 9, 550);
		
		boolean t = true;
		
		while(t) {
			System.out.println("Write action (buy, fill, take, remaining, exit):");
			String actionStage5 = scan.next();
			
			switch(actionStage5) {
			case "buy":
				cm2.buyStage5();
				break;
				
			case "fill":
				cm2.fill();
				break;
			
			case "take":
				cm2.take();
				break;
	
			case "remaining":
				cm2.remaining();
				break;	
				
			case "exit":
				t = false;
				break;	
			}
		}
		
		scan.close();
	}
	

}
