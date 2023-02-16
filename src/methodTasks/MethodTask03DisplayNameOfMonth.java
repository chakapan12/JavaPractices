package methodTasks;

public class MethodTask03DisplayNameOfMonth {

	public static void main(String[] args) {
		// Create a method that can display the name of the month based on the given
		// number to the method

		System.out.println(getMonthNameBaseOnNumber(12));

	}

	public static String getMonthNameBaseOnNumber(int numberOfMonth) {

		String month = "";

		switch (numberOfMonth) {
		case 1:
			month = "January";
			break;
		case 2:
			month = "Feburary";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;

		default:
			System.out.println("Number must be 1 - 12");
			break;

		}
		return month;

	}

}
