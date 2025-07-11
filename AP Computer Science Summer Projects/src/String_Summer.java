import java.util.Scanner;

public class String_Summer
	{
		static Scanner userFirstNameInput = new Scanner(System.in);
		static Scanner userLastNameInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				//Give Instructions
				System.out.println("This will make you a nickname with the first two letters of your first name and the first three letters of your last name.");
				
				//Enter and store first name
				System.out.println("Enter your first name.");
				String firstName = userFirstNameInput.nextLine();
				int firstNamePrintLength = 2;
				
				//First name less than two
				if (firstName.length() < 2)
					{
						firstNamePrintLength = 1;
					}
				
				//Enter and store last name
				System.out.println("Enter your last name");
				String lastName = userFirstNameInput.nextLine();
				int lastNamePrintLength = 3;
				
				//Last name less than three
				if (lastName.length() < 3)
					{
						lastNamePrintLength = 2;
					}
				
				//Print nickname
				System.out.println("Your nickname is " + firstName.substring(0, firstNamePrintLength) + lastName.substring(0, lastNamePrintLength));
				
				//Test variables
				//System.out.println(firstName);
				//System.out.println(lastName);
			}

	}
