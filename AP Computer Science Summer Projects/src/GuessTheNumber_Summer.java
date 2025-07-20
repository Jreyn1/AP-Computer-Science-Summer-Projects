import java.util.Scanner;

public class GuessTheNumber_Summer
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);

		public static void main(String[] args)
			{
				// See Random Number
				int randomNumber = (int) (Math.random() * 10) + 1;
				//System.out.println(randomNumber);

				// Start of Real Code
				

				boolean stillGuessing = true;

				while (stillGuessing = true)
					{
						System.out.println("Pick a number between 1 and 10");
						int userNumber = userIntInput.nextInt();
						
						if (userNumber == randomNumber)
							{
								System.out.println("You Guessed It Right!!!");
								stillGuessing = false;
								break;
							}
						else
							{
								if (userNumber < 0 || userNumber > 10)
									{
										System.out.println("This number isn't between 1-10 you buffoon");
									}
								else if (userNumber > randomNumber)
									{
										System.out.println("Too High");
									}
								else if (userNumber < randomNumber )
									{
										System.out.println("Too Low");
									}
								
							}
					}

			}

	}
