import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Kaitlyn
	{
		public static int mainMenu()
		{
			//display menu
			
			System.out.println("Main Menu: "
					+ "\n\t(1) Add or delete a student"
					+ "\n\t(2) Change students grades/schedule"
					+ "\n\t(3) Sort students");
			
			// Input checks
			Scanner string1 = new Scanner(System.in);
			return inputChecks(string1,3,1);
			
		}
		
		public static int inputChecks(Scanner s, int l, int length) {
			int l2=l;
			if (l>10) l2=10;
			boolean enteringInput = true;
			do {
				String userChoice = s.nextLine();
				if ((userChoice.length() != length && userChoice.length() != 1) || !(userChoice.charAt(0) >= 49 && userChoice.charAt(0)<=49+l2-1)) {
					System.out.println("Please enter a valid option.");
				}
				else {
					enteringInput = false;
					return Integer.parseInt(userChoice);
				}
			} while (enteringInput);
			return -1;
		}
		
	}
