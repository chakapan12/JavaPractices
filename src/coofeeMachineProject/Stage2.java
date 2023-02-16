package coofeeMachineProject;

import java.util.Scanner;

public class Stage2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("STAGE 2");
		System.out.println();

		System.out.println("Write how many cups of coffee you will need: ");
		int cupOfCoffee = scan.nextInt();

		System.out.println("\nFor " + cupOfCoffee + " cups of coffee you will need: ");

		System.out.println((cupOfCoffee * 200) + " ml of water");
		System.out.println((cupOfCoffee * 50) + " ml of milk");
		System.out.println((cupOfCoffee * 15) + " g of coffee beans");

		scan.close();

	}

}
