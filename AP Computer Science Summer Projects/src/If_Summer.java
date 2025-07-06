import java.util.Scanner;

public class If_Summer
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.println("What is your name?");
				String name = userStringInput.nextLine();
				System.out.println("Hello " + name + ".");
				System.out.println("Would you rather be able to fly or be invisible?");
				System.out.println("1) Flight");
				System.out.println("2) Invisibility");
				int choiceSelection = userIntInput.nextInt();
				
				if (choiceSelection == 1)
					{
						System.out.println("That must save you some money on airline tickets.");
					}
				else if (choiceSelection == 2)
					{
						System.out.println("That seems like a fun way to scare people.");
					}
			
			}

	}
