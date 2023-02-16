package arrayTasks;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * 2. Create string array, and store the names of your class mates (10) reverse
		 * each students names and print them in separate lines ex: arr = {java, python,
		 * c#}
		 * 
		 * output: avaJ nohtyp #c
		 */

		String[] name = { "Syed", "Themmada", "Pradthana", "Anthony", "Abhijay", "Bilguun", "Alin", "Malisa",
				"Sirirat", "Sarita" };

		for (String reverseName : name) {
			for (int i = reverseName.length() - 1; i >= 0; i--) {
				System.out.print(reverseName.charAt(i));
			}
			System.out.println();
		}

	}

}
