package methodTasks;

public class MethodTask02displayDomainEmail {

	public static void main(String[] args) {
		// Create a method that can display the domain of the email

		String email = "chakapan.top@gmail.com";

		System.out.println(getDomainName(email));

	}

	public static String getDomainName(String email) {

		String domain = email.substring(email.indexOf('@') + 1, email.lastIndexOf('.'));

		return domain;

	}

}
