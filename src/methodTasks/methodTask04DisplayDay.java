package methodTasks;

public class methodTask04DisplayDay {

	public static void main(String[] args) {
		//Create a method that can print the name of the day based on the given number to the method
		
		System.out.println(getDayBaseOnNumber(4));

	}
	
	public static String getDayBaseOnNumber(int numberOfDay) {

		String day = "";

		switch (numberOfDay) {
		case 1:
			day = "Sunday";
			break;
		case 2:
			day = "Monday";
			break;
		case 3:
			day = "Tuesday";
			break;
		case 4:
			day = "Wednesday";
			break;
		case 5:
			day = "Thursday";
			break;
		case 6:
			day = "Friday";
			break;
		case 7:
			day = "Saturday";
			break;

		default:
			System.out.println("Number must be 1 - 7");
			break;

		}
		return day;
	}

}
