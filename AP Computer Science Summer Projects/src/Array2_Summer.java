import java.util.Scanner;
public class Array2_Summer
	{
		static Scanner userMonthNumberInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				//Initalize and create array
				String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};         
				
				//Establish baseline rules
				System.out.println("Enter a number and I'll print the corresponding month.");
				System.out.println("For Example");
				System.out.println("1 = January, 2 = February, etc.");
				
				//Receive user input
				int monthNumber = userMonthNumberInput.nextInt();
				
				//Print month
				System.out.println(months[monthNumber - 1]);
				
				
				
				
			}

	}
