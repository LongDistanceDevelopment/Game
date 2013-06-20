import java.util.Random;
import java.util.Scanner;

/**
 * Implement gameplay here
 */
public class gameplay 
{
	/**
	 * Edit player info
	 */
	static void editplayer()
	{
		
	}
	
	/**
	 * Displays the menu && accepts commands
	 */
	static void menu()
	{
		System.out.println("Please Select an Option:");
		System.out.print("1. Play\n2. Edit User\n3. Exit Game\n");
		
		//system input
		int c;
		Scanner input = new Scanner( System.in );
		System.out.print("Enter Command: ");
		c = Integer.parseInt(input.nextLine());
		System.out.println("");
		
		switch(c)
		{
			//plays game
			case 1:
					break;
			//edits user info
			case 2:
					
					break;
			//exits game
			case 3:
					System.exit(0);
		}
	}
	
	/**
	 * Splits the desk into 4 hands which are then assigned to users
	 */
	static void deal()
	{
		
	}
	
	public static void main(String[] args) 
	{
		menu();
	}

}
