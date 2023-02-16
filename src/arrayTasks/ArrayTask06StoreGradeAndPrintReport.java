package arrayTasks;

public class ArrayTask06StoreGradeAndPrintReport {

	public static void main(String[] args) {
		/*
		 * given the following arrays: String [] names = {"Anna", "Nancy", "Sarah"}; int
		 * [] scores = {90, 75, 80}; char [] grades = new char[names.length]; - write a
		 * program that can store the grades of the students in the array named grades -
		 * print the grade report of each student in separate lines.
		 * 
		 * Example: ``` Anna's score is 90, and grade is A
		 */

		String[] names = { "Anna", "Nancy", "Sarah" };
		int[] scores = { 90, 75, 80 };
		char[] grades = new char[names.length];

		for (int i = 0; i < names.length; i++) {
			if (scores[i] >= 90) {
				grades[i] = 'A';
			} else if (scores[i] >= 80) {
				grades[i] = 'B';
			} else if (scores[i] >= 70) {
				grades[i] = 'C';
			} else if (scores[i] >= 60) {
				grades[i] = 'D';
			} else {
				grades[i] = 'F';
			}
			System.out.println(names[i] + "'s score is " + scores[i] + " and grade is " + grades[i]);
		}

	}

}
