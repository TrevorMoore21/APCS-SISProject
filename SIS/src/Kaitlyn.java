import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Kaitlyn
	{
		public static int mainMenu()
		{
			//display menu
			
			System.out.println("Main Menu: ");
			System.out.println("What would you like to do?");
			System.out.println("	(1) add or delete a student");
			//addDeleteStudent();
			System.out.println("	(2) change students grades/schedule");
			//changeStudentinfo();
			System.out.println("	(3) sort students");
			//sortStudents();
			
			// Input checks
			Scanner string1 = new Scanner(System.in);
			return inputChecks(string1);
			
		}
		
		public static int inputChecks(Scanner s) {
			boolean enteringInput = true;
			do {
				String userChoice = s.nextLine();
				if (userChoice.length() != 1 || !(userChoice.charAt(0) >= 49 && userChoice.charAt(0)<=51)) {
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
