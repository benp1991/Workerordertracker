package WOT;
import java.util.Scanner;

public class Menu 
{
	
	public static void startmenu()
	{
		int read;
		boolean valid = false;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Welcome to the Warehouse Order Tracking System");
		System.out.println("Please select option from the menu below:");
		System.out.println("1. View list of current unprocessed orders");
		System.out.println("2. View current active orders");
		System.out.println("9. Exit Application");
		while(!valid)
		{
			try 
			{
				read = reader.nextInt();
			}
			catch(java.util.InputMismatchException e)
			{
				System.err.println("Invalid input please only use integer values");
				reader.next();
				read = 0;
			}
			
			switch(read)
			{
				case 1: /*unprocordmenu();*/
					System.out.println("unpocessed order menu");
					break;
					
				case 2: /*activeordmenu();*/
					System.out.println("active order menu");
					break;
				
				case 9: valid = true;
					System.out.println("Exiting Application");
						break;
					
				default: 
				
			}
			
			

		}
		reader.close();
	}
	
	
	public static void unprocordmenu()
	{
		
	}
	
	public static void activeordmenu()
	{
		
	}
	
	

}
