import java.util.Scanner;

public class IfElseIfElse_Strings
	{
		// static Scanner newIntInput= new Scanner(System.in);
		static Scanner newStringInput= new Scanner(System.in);
		static boolean looping = true;
		static String foodAnswer;
		public static void main(String[] args)
			{
				System.out.println("Welcome to the Survey");
				System.out.println("What is your favorite food out of these three choices...");
				System.out.println("1. Pizza");
				System.out.println("2. Hamburgers");
				System.out.println("3. Pasta");
				System.out.println("Note...make sure the word is typed in properly with the first letter being capitalized.");
				foodAnswer = newStringInput.nextLine();
				
				while (looping == true)
				{
					if (foodAnswer.equals("Pizza"))
						{
							System.out.println(foodAnswer);
							System.out.println("Pretty standard answer. You can never go wrong with pizza.");
							looping = false;
						}
					else if (foodAnswer.equals("Hamburgers"))
						{
							System.out.println("Solid choice. Hamburgers are a staple of Summer vacation.");
							looping = false;
						}
					else if (foodAnswer.equals("Pasta"))
						{
							System.out.println("Very tasty choice. There are a very broad range of options here.");
							looping = false;
						}
					else if (!foodAnswer.equals("Pizza") || !foodAnswer.equals("Hamburgers") || !foodAnswer.equals("Pasta"))
						{
							System.out.println("You gave an incorrect answer format. Please answer again.");
							looping = true;
							foodAnswer = newStringInput.nextLine();
						}	
					
				}
				
				
				

			}

	}
