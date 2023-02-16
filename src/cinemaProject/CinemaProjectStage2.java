package cinemaProject;

import java.util.Scanner;

public class CinemaProjectStage2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of rows: ");
		int row = scan.nextInt();

		while (row < 1 || row > 9) {
			System.out.println("Enter the number of rows: (1 - 9)" );
			row = scan.nextInt();
		}

		System.out.println("Enter the number of seats in each row: ");
		int numberOfSeat = scan.nextInt();
		
		while (numberOfSeat < 1 || numberOfSeat > 9) {
			System.out.println("Enter the number of seats in each row: (1 - 9)" );
			numberOfSeat = scan.nextInt();
		}

		//displaySeatingArrangement(row, numberOfSeat);
		
		System.out.println("Total income: " + "\n$" +getTotalIncome(row, numberOfSeat) );
		
		scan.close();

	}
	
	public static int getTotalIncome(int row, int numberOfSeat ) {
		
		int[][] seatingPriceArr = new int[row + 1][numberOfSeat + 1];
		
		int totalIncome = 0;

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= numberOfSeat; j++) {

				if (row * numberOfSeat >= 60) {

					if (i <= row / 2) {
						seatingPriceArr[i][j] = 10;
					} else {
						seatingPriceArr[i][j] = 8;
					}
					totalIncome += seatingPriceArr[i][j];

				} else {
					seatingPriceArr[i][j] = 10;
					totalIncome += seatingPriceArr[i][j];
				}
			}
		}
		
		return totalIncome;
		
	}

}
