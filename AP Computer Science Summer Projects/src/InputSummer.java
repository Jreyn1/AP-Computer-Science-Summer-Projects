import java.util.Scanner;

public class InputSummer
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				System.out.println("Input Degrees Fahrenheit");
				double inputFahrenheit;
				inputFahrenheit = userIntInput.nextInt();
				double celsius = ((inputFahrenheit - 32.0) * (5.0 / 9.0));
				System.out.println(inputFahrenheit + " is equal to " + celsius + " degrees celsius.");

			}

	}
