package coofeeMachineProject;

import java.util.Scanner;

public class Stage4 {

	public static void main(String[] args) {
		
		System.out.println("STAGE 4");
		
		Scanner scan = new Scanner(System.in);

		CoffeeMachine cm1 = new CoffeeMachine();
		
		cm1.remaining();
		
		System.out.println("\nWrite action (buy, fill, take):");
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
		
		scan.close();

	}

}
