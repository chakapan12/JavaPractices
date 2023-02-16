package methodTasks;

public class methodTask05DisplayNumbersOfDayInmonth {

	public static void main(String[] args) {
		// Create a method that can print how many days a month has
		
		System.out.println(getNumberOfDayFromMonthName("January"));

	}
	
	public static int getNumberOfDayFromMonthName(String month) {

		int numberOfDay = 0;

		switch (month) {
		case "January":
			numberOfDay = 31;
			break;
		case "Feburary":
			numberOfDay = 28;
			break;
		case "March":
			numberOfDay = 31;
			break;
		case "April":
			numberOfDay = 30;
			break;
		case "May":
			numberOfDay = 31;
			break;
		case "June":
			numberOfDay = 30;
			break;
		case "July":
			numberOfDay = 31;
			break;
		case "August":
			numberOfDay = 31;
			break;
		case "September":
			numberOfDay = 30;
			break;
		case "October":
			numberOfDay = 31;
			break;
		case "November":
			numberOfDay = 30;
			break;
		case "December":
			numberOfDay = 31;
			break;

		default:
			System.out.println("Month must be January - December");
			break;

		}
		return numberOfDay;
	}

}
