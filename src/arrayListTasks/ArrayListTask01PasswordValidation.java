package arrayListTasks;

public class ArrayListTask01PasswordValidation {

	public static void main(String[] args) {
		/*
		 Write a program that can verify if a password is a strong password.
		 * Characteristics of strong passwords are: 
		 * 1.1 Password must be at least have 8 characters long, and should not contain space 
		 * 1.2 PassWord should at least contain one upper case letter 
		 * 1.3 PassWord should at least contain one lower case letter 
		 * 1.4 Password should at least contain one special characters 
		 * 1.5 Password should at least contain a digit
		 */
		
		String password = "Aabc1234!";
		boolean isAStrongPassword = false;
		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpeciaCharacter = false;
		boolean hasAngularBraket = false;

		if (password.length() >= 8 && password.indexOf(' ') == -1) {

			for (char letter : password.toCharArray()) {
				// System.out.println(letter);

				if (Character.isLowerCase(letter)) {
					hasLowerCase = true;
				}

				if (Character.isUpperCase(letter)) {
					hasUpperCase = true;
				}

				if (Character.isDigit(letter)) {
					hasDigit = true;
				}

				if (!Character.isDigit(letter) && !Character.isLetter(letter)) {
					hasSpeciaCharacter = true;
				}

			}

			isAStrongPassword = hasDigit && hasUpperCase && hasLowerCase && hasSpeciaCharacter && !hasAngularBraket;

			if (isAStrongPassword) {
				System.out.println(password + " is a strong password");
			} else {
				System.out.println(password + " is not a strong password");
			}
		}

	}

}
