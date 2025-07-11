public class Array1_Summer
	{

		public static void main(String[] args)
			{
				//Create array of decimal
				double[] mixedDecimals = {10.4, 6.45, 4.35, 8.65, 6.8, 7.4, 5.8, 1.54, 3.25, 8.9};
				
				//Print out list of decimals and sum array
				int index = 0;
				double sum = 0;
				for (int i = 0; i < 10; i++)
					{
						System.out.println(mixedDecimals[index]);
						sum += mixedDecimals[i];
						index += 1;
					}
				
				//Average decimals and print average
				double average = sum / mixedDecimals.length;
				System.out.println("");
				System.out.println("The average of the decimals is...");
				System.out.println(average);
				
			}

	}
