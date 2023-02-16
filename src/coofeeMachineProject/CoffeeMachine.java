package coofeeMachineProject;

import java.util.Scanner;

public class CoffeeMachine {
	
	static Scanner scan = new Scanner(System.in);
	
	int amountOfWater, amountOfMilk, amountOfCoffeeBeans, cups, money;
	
	
	public CoffeeMachine() {
		this(400, 540, 120, 9, 550);
	}

	public CoffeeMachine(int amountOfWater, int amountOfMilk, int amountOfCoffeeBeans, int cups, int money) {
		this.amountOfWater = amountOfWater;
		this.amountOfMilk = amountOfMilk;
		this.amountOfCoffeeBeans = amountOfCoffeeBeans;
		this.cups = cups;
		this.money = money;
	}
	
	
	
	public void remaining() {
		System.out.println("\nThe coffee machine has: " + 
				"\n"  + this.amountOfWater + " ml of water" + 
				"\n"  + this.amountOfMilk + " ml of milk" + 
				"\n"  + this.amountOfCoffeeBeans + " g of coffeeBeans" + 
				"\n"  + this.cups + " disposable cups" +
				"\n$" + this.money + " of money");
	}
	
	public void buyStage5() {
		
		System.out.println("\nWhat do you want to buy? \n1 - espresso, 2 - latte, 3 - cappuccino, "
				+ "back - to main menu:");
		
		String selectCoffee = scan.next();
		
		switch(selectCoffee) {
			case "1":// making espresso (water 250, coffee 16 cost $4)
				System.out.println();
				if(this.amountOfWater < 250) {
					System.out.println("Sorry, not enough water!");
				}
				if(this.amountOfCoffeeBeans < 16) {
					System.out.println("Sorry, not enough coffee beans!");	
				}
				if(this.amountOfWater >= 250 && this.amountOfCoffeeBeans >= 16 ){
					System.out.println("I have enough resources, making you a coffee!");
					this.amountOfWater -= 250;
					this.amountOfCoffeeBeans -= 16;
					this.cups -= 1;
					this.money += 4;
				}
				break;
				
			case "2"://making latte (water 350, milk 75, coffee 20 cost $7)
				System.out.println();
				if(this.amountOfWater < 350) {
					System.out.println("Sorry, not enough water!");
				}
				if(this.amountOfMilk < 75) {
					System.out.println("Sorry, not enough milk!");
				}
				if(this.amountOfCoffeeBeans < 20) {
					System.out.println("Sorry, not enough coffee beans!");	
				}
				if(this.amountOfWater >= 350 && this.amountOfMilk >= 75 && this.amountOfCoffeeBeans >= 20) {
					System.out.println("I have enough resources, making you a coffee!");
					this.amountOfWater -= 350;
					this.amountOfMilk -= 75;
					this.amountOfCoffeeBeans -= 20;
					this.cups -= 1;
					this.money += 7;
				} 
				break;	
				
			case "3":// making cappuccino (water 200, milk 100, coffee 12, cost $6)
				System.out.println();
				if(this.amountOfWater < 200) {
					System.out.println("Sorry, not enough water!");
				}
				if(this.amountOfMilk < 100) {
					System.out.println("Sorry, not enough milk!");
				}
				if(this.amountOfCoffeeBeans < 12) {
					System.out.println("Sorry, not enough coffee beans!");
				}
				if(this.amountOfWater >= 20 && this.amountOfMilk >= 100 && this.amountOfCoffeeBeans >= 12){
					System.out.println("I have enough resources, making you a coffee!");
					this.amountOfWater -= 200;
					this.amountOfMilk -= 100;
					this.amountOfCoffeeBeans -= 12;
					this.cups -= 1;
					this.money += 6;
				} 
				break;	
				
			case "back"://return to main menu
				break;
				
		}
		
	}
	
	public void buyStage4() {
			
			System.out.println("\nWhat do you want to buy? \n1 - espresso, 2 - latte, 3 - cappuccino");
			
			String selectCoffee = scan.next();
			switch(selectCoffee) {
			
				case "1":// making espresso
					this.amountOfWater -= 250;
					this.amountOfCoffeeBeans -= 16;
					this.cups -= 1;
					this.money += 4;
					break;
					
				case "2"://making latte
					this.amountOfWater -= 350;
					this.amountOfMilk -= 75;
					this.amountOfCoffeeBeans -= 20;
					this.cups -= 1;
					this.money += 7;
					break;	
					
				case "3":// making cappuccino
					this.amountOfWater -= 200;
					this.amountOfMilk -= 100;
					this.amountOfCoffeeBeans -= 12;
					this.cups -= 1;
					this.money += 6;
					break;	
			}
			
	}
	
	public void fill() {
		System.out.println("\nWrite how many ml of water you want to add: ");
		this.amountOfWater += scan.nextInt();
		
		System.out.println("Write how many ml of milk you want to add: ");
		this.amountOfMilk += scan.nextInt();

		System.out.println("Write how many grams of coffee beans you want to add: ");
		this.amountOfCoffeeBeans += scan.nextInt();

		System.out.println("Write how many disposable cups of coffee you want to add: ");
		this.cups += scan.nextInt();
	}
	
	public void take() {
		System.out.println("\nI gave you $" + money);
		money = 0;
	}
	
	public int getTotalCupOfCoffeeAvaiable(int amountOfWater, int amountOfMilk, int amountOfCoffeeBeans) {

		int numberCupOfCoffeeAvailable = 0;
		int amountOfWaterNeed = 200;
		int amountOfmilkNeed = 50;
		int amountOfCoffeeBeansNeed = 15;

		while (amountOfWaterNeed <= amountOfWater && amountOfmilkNeed <= amountOfMilk
				&& amountOfCoffeeBeansNeed <= amountOfCoffeeBeans) {
			numberCupOfCoffeeAvailable += 1;
			amountOfWater -= 200;
			amountOfMilk -= 50;
			amountOfCoffeeBeans -= 15;
		}
		return numberCupOfCoffeeAvailable;
	}	

}
