package methodTasks;

public class MethodTask12PasswordRequirment {

	public static void main(String[] args) {
		/*
		 * Write a function that can verify if a password is valid or not. requirements:
		 * 1. Password MUST be at least have 6 characters and should not contain space
		 * 2. PassWord should at least contain one upper case letter 
		 * 3. PassWord should at least contain one lowercase letter 
		 * 4. Password should at least contain one special characters
		 * 5. Password should at least contain a digit if all
		 * requirements above are met, the method returns true, otherwise returns false
		 */
		
		String password = "Aabc1234!";
		System.out.println(passwordRequirment(password));

	}

	public static boolean passwordRequirment(String password) {
		
		boolean isValidePassword = false;
		boolean hasDigit = false;
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasSpeciaCharacter = false;
		
		// 8-20 characters8-20 characters success

		if (password.length() >= 6 && password.indexOf(' ') == -1) {

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

			isValidePassword = hasDigit && hasUpperCase && hasLowerCase && hasSpeciaCharacter;

		}
		
		return isValidePassword;

	}

}
