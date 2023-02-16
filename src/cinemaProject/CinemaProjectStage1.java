package cinemaProject;

import java.util.Scanner;

public class CinemaProjectStage1 {

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

}
