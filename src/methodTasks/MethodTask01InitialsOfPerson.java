package methodTasks;

public class MethodTask01InitialsOfPerson {

	public static void main(String[] args) {
		// Create a method that can display the initials of the person

		String fullName = "Chakapan Kanchana";

		System.out.println(initialsOfPerson(fullName));

	}

	public static String initialsOfPerson(String fullName) {

		String[] names = fullName.split(" ");

		String initial = "";

		for (int i = 0; i < names.length; i++) {

			initial += names[i].toUpperCase().charAt(0) + ".";
		}

		return initial;

	}

}
