package cinemaProject;

import java.util.Scanner;

public class CinemaProjectStage3 {

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

		String[][] seatingArr = seatingArrangementArr(row, numberOfSeat);

		// displaySeatingArrangement
		display2DArray(seatingArr);

		// select seating
		System.out.println("Enter a row number: ");
		int rowNumber = scan.nextInt();

		System.out.println("Enter a seat number in that row: ");
		int seatNumber = scan.nextInt();

		// display ticket price
		getTicketPrice(row, numberOfSeat, rowNumber, seatNumber);

		// assign selected seat to array
		seatingArr[rowNumber][seatNumber] = "B";

		// displaySeatingArrangement
		display2DArray(seatingArr);
		
		scan.close();
	}

	public static String[][] seatingArrangementArr(int row, int numberOfSeat) {

		String[][] seatingArr = new String[row + 1][numberOfSeat + 1];

		int rowIndex = 1;
		int seatNumberIndex = 1;
		for (int i = 0; i <= row; i++) {

			for (int j = 0; j <= numberOfSeat; j++) {

				if (i == 0 || j == 0) {
					if (i == 0 && j == 0) {
						seatingArr[i][j] = " ";
					} else if (i == 0) {
						seatingArr[i][j] = "" + rowIndex++;
					} else if (j == 0) {
						seatingArr[i][j] = "" + seatNumberIndex++;
					}
				} else {
					seatingArr[i][j] = "S";
				}
			}
		}

		return seatingArr;

	}

	public static void display2DArray(String[][] seatingArr) {
		System.out.println();
		System.out.println("Cinema:");

		for (String[] rowArr : seatingArr) {

			for (String seatAvailable : rowArr) {
				System.out.print(seatAvailable + "   ");
			}
			System.out.println();
		}
		System.out.println();

	}

	public static void getTicketPrice(int row, int numberOfSeat, int rowNumber, int seatNumber) {

		int[][] seatingPriceArr = new int[row + 1][numberOfSeat + 1];

		int ticketPrice = 0;
		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= numberOfSeat; j++) {

				if (row * numberOfSeat >= 60) {

					if (i <= row / 2) {
						seatingPriceArr[i][j] = 10;
					} else {
						seatingPriceArr[i][j] = 8;
					}
					ticketPrice = seatingPriceArr[i][j];

				} else {
					seatingPriceArr[i][j] = 10;
					ticketPrice = seatingPriceArr[i][j];

				}
			}
		}

		ticketPrice = seatingPriceArr[rowNumber][seatNumber];

		System.out.println();
		System.out.println("Ticket price: $" + ticketPrice);
	}

}
