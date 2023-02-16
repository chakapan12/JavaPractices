package coofeeMachineProject;

import java.util.Scanner;

public class Stage5And6 {

	public static void main(String[] args) {
		
		System.out.println("STAGE 5 & 6");
		
		Scanner scan = new Scanner(System.in);
	
		CoffeeMachine cm2 = new CoffeeMachine();
		
		boolean t = true;
		
		while(t) {
			System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
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
